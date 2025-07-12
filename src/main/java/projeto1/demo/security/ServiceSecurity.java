package projeto1.demo.security;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import projeto1.demo.repository.LogInRepository;

@Service
public class ServiceSecurity implements UserDetailsService {

    private final LogInRepository repository;

    public ServiceSecurity(LogInRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUserName(username)
                .map(SecurityUsuario::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
