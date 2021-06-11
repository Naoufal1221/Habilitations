package org.telio.portail_societe.common;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.telio.portail_societe.dto.entities.RoleDTO;

import java.util.List;

@Data
@NoArgsConstructor
public class UserAuthenticated {

    private String login;
    private List<String> roles;
    private String profilName;
    private String email;
    private String token;
}
