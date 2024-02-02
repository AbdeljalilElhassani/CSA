package entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class userRoleId implements Serializable {
    @Column(name = "idUser")
    private Long userId;

    @Column(name = "idRole")
    private Long roleId;

    public userRoleId(Long userId, Long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
