package in.nucleusteq.plasma.service.impl;

import com.google.gson.Gson;
import feign.Response;
import feign.form.util.CharsetUtil;
import in.nucleusteq.plasma.constants.ResponceConstants;
import in.nucleusteq.plasma.dto.common.TokenResponce;
import in.nucleusteq.plasma.dto.in.InvalidateTokenInDto;
import in.nucleusteq.plasma.dto.in.InvalidateTokenOutDTO;
import in.nucleusteq.plasma.exception.ResourceNotFoundException;
import in.nucleusteq.plasma.exception.TokenServiceException;
import in.nucleusteq.plasma.exception.UnauthorizedAccessException;
import in.nucleusteq.plasma.feignservice.TokenClientService;
import in.nucleusteq.plasma.feignservice.model.TokenRequest;
import in.nucleusteq.plasma.service.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TokenServiceImpl implements TokenService {
    /**
     * Gson object.
     */
    private static final Gson GSON = new Gson();

    @Autowired
    private TokenClientService tokenClientService;
    /**
     * This is used for get the message from logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TokenService.class);

    @Override
    public TokenResponce getGenerateCustomToken(String email) throws UnauthorizedAccessException, IOException, TokenServiceException {
        Response tokenResponce = tokenClientService.getToken(new TokenRequest(email));
        if(tokenResponce.status() == HttpStatus.UNAUTHORIZED.value()){
            LOGGER.error("Email id {} does not have a valid status {}. Please contact Plasma team"
                    + "support for more information.", email, tokenResponce.status());
            throw new UnauthorizedAccessException(String.format(ResponceConstants.INVALID_ACCOUNT_STATUS,email));
        }
        TokenResponce responce = GSON.fromJson(tokenResponce.body().asReader(CharsetUtil.UTF_8), TokenResponce.class);
        return responce;
    }


}
