package fr.ynov.marketpeace.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * User request for authentication
 */
@Getter
@Setter
@Data
public class LoginRequest {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}