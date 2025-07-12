package projeto1.demo.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import projeto1.demo.entities.LogIn;

import java.util.Collection;
import java.util.List;

public class SecurityUsuario implements UserDetails {

    private final LogIn logIn;

    public SecurityUsuario(LogIn logIn) {
        this.logIn = logIn;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
            String role = logIn.getRole();
            String prefixedRole = role.startsWith("ROLE_") ? role : "ROLE_" + role;
            return List.of(new SimpleGrantedAuthority(prefixedRole));
    }

    @Override
    public String getPassword() {
        return logIn.getPassCode();
    }

    @Override
    public String getUsername() {
        return logIn.getUserName();
    }
}
