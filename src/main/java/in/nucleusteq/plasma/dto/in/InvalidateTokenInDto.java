package in.nucleusteq.plasma.dto.in;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InvalidateTokenInDto {
    private String email;
}
