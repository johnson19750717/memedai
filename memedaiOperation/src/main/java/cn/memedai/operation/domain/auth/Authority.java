package cn.memedai.operation.domain.auth;

import javax.persistence.*;

/**
 * Created by dell on 14-6-20.
 */
@Entity
@Table(name = "AUTHORITY")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "AUTHORITY_NAME")
    private String authorityName;
    @Column(name = "MODULE_NAME")
    private String module;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
