package in.nucleusteq.plasma.feignservice.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * This class is use for giving the response of token related details.
 * @author abhis
 *
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class TokenResponse {

    /**
     * The access token.
     */
    private String accessCode;

    /**
     * The access token expiry.
     */
    private Long accessCodeExpiry;

    /**
     * The email id.
     */
    private String email;

    /**
     * The refresh token.
     */
    private String refreshToken;

}
