package in.nucleusteq.plasma.dto.in;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InvalidateTokenOutDTO {
    String message;
}
