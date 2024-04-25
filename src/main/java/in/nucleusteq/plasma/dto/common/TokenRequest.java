package in.nucleusteq.plasma.dto.common;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class TokenRequest {
    /**
     * Employee email.
     */
    private String email;
}
