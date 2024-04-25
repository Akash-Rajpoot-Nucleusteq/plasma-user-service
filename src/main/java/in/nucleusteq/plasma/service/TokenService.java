package in.nucleusteq.plasma.service;

import in.nucleusteq.plasma.dto.common.TokenResponce;
import in.nucleusteq.plasma.dto.in.InvalidateTokenInDto;
import in.nucleusteq.plasma.dto.in.InvalidateTokenOutDTO;
import in.nucleusteq.plasma.exception.ResourceNotFoundException;
import in.nucleusteq.plasma.exception.TokenServiceException;

import java.io.IOException;

public interface TokenService {
    TokenResponce getGenerateCustomToken(final String email) throws IOException, TokenServiceException;

    InvalidateTokenOutDTO invalidateToken(InvalidateTokenInDto invalidateTokenInDto) throws ResourceNotFoundException;
}
