package com.project.NexusIQ.user.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserRequest {
    @NotBlank
    private String firstName;
    private String lastName;
    @Email
    private String email;
    @Size(min=8)
    private String password;
}
