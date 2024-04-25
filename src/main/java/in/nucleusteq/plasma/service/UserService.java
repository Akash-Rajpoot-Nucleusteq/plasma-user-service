package in.nucleusteq.plasma.service;

import in.nucleusteq.plasma.dto.common.TokenResponce;
import in.nucleusteq.plasma.dto.in.InvalidateTokenInDto;
import in.nucleusteq.plasma.dto.in.LoginInDTO;
import in.nucleusteq.plasma.dto.out.LoginOutDTO;
import in.nucleusteq.plasma.dto.out.LogoutOutDTO;
import in.nucleusteq.plasma.exception.InvalidCredentialsException;
import in.nucleusteq.plasma.exception.ResourceNotFoundException;
import in.nucleusteq.plasma.model.Role;

import org.springframework.http.HttpHeaders;
import java.util.Set;

public interface UserService {
    LoginOutDTO login(LoginInDTO loginInDTO)
            throws InvalidCredentialsException, ResourceNotFoundException;
    HttpHeaders addAuthHeaders(TokenResponce tokenResponce);
    String getHighestWeightRole(Set<Role> set);

}
