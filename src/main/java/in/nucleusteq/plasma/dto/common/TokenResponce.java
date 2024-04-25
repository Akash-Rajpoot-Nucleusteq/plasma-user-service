package in.nucleusteq.plasma.dto.common;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class TokenResponce {
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
