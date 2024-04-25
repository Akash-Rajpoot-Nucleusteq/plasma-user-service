package in.nucleusteq.plasma.feignservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import feign.Response;
import in.nucleusteq.plasma.exception.TokenServiceException;
import in.nucleusteq.plasma.feignservice.model.TokenRequest;


/**
* This class is used for give the response when the token microservice is
* unable to give the token related to a particular user.
* @author abhis
*
*/
@Component
public class FallbackTokenClientServiceClient implements TokenClientService {

    /**
     * this is the logger for the message.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(FallbackTokenClientServiceClient.class);

 
	@Override
	public Response getToken(TokenRequest tokenRequest) throws TokenServiceException {
	    LOGGER.info("Unable to connect to service");
        throw new TokenServiceException("Unable to connect to service");
		
	}

}