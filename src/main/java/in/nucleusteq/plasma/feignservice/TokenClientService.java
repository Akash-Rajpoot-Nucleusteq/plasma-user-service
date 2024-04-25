package in.nucleusteq.plasma.feignservice;

import feign.Headers;
import in.nucleusteq.plasma.dto.in.InvalidateTokenInDto;
import in.nucleusteq.plasma.exception.ResourceNotFoundException;
import in.nucleusteq.plasma.exception.UnauthorizedAccessException;
import org.apache.coyote.BadRequestException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import feign.RequestLine;
import feign.Response;
import in.nucleusteq.plasma.exception.TokenServiceException;
import in.nucleusteq.plasma.feignservice.model.TokenRequest;

import java.io.IOException;
import java.util.Map;

@FeignClient(name = "tokenClient", url = "http://localhost:9099", fallback = FallbackTokenClientServiceClient.class, configuration = TokenClientConfiguration.class)
@Component
public interface TokenClientService {
	
	@RequestLine("POST /plasma/token/generate-custom-token")
    Response getToken(TokenRequest tokenRequest)throws TokenServiceException;

    @RequestLine("POST /invalidate")
    @Headers("Content-Type: application/json")
    Response invalidateToken(InvalidateTokenInDto invalidateTokenInDto, Map<String, String> headers) throws
            ResourceNotFoundException, UnauthorizedAccessException, BadRequestException, IOException;
}