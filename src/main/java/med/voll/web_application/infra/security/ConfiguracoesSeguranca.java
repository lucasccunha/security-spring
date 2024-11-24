package med.voll.web_application.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ConfiguracoesSeguranca {
    @Bean
    public UserDetailsService dadosUsuariosCadastrados() {
        UserDetails usuario1 = User.builder()
                .username("lucas@email.com")
                .password("{noop}lucas123")
                .build();
        UserDetails usuario2 = User.builder()
                .username("maria@email.com")
                .password("{noop}maria123")
                .build();
        return new InMemoryUserDetailsManager(usuario1, usuario2);

    }
}
