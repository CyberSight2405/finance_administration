package com.hakaton.financ_administration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hakaton.financ_administration.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDto {

    private Long id;

    private String username;

    private String name;

    private String surname;

    private String email;

    private String phone;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private Role role;
}
