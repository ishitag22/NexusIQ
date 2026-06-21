package com.project.NexusIQ.user.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserResponse{
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}