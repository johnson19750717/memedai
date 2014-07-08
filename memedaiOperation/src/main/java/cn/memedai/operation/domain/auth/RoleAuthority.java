package cn.memedai.operation.domain.auth;

import javax.persistence.*;

/**
 * Created by dell on 14-6-20.
 */
@Entity
@Table(name = "ROLE_AUTHORITY")
public class RoleAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role;
    @ManyToOne
    @JoinColumn(name = "AUTHORITY_ID")
    private Authority authority;
    @Column(name = "ACTION_TYPE")
    private ActionTypeEnum actionType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public ActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
    }
}
