package cn.memedai.operation.domain.auth;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 14-6-20.
 */
@Entity
@Table(name = "ROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ROLE_NAME")
    private String roleName;
    @Column(name = "ROLE_DESC")
    private String roleDesc;
    @Column(name = "GROUP_NAME")
    private String group;

    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "role")
    private List<RoleAuthority> authorities = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<RoleAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<RoleAuthority> authorities) {
        this.authorities = authorities;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
