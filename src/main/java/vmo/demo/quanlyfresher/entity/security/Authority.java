package vmo.demo.quanlyfresher.entity.security;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Authority implements GrantedAuthority{

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }

}
