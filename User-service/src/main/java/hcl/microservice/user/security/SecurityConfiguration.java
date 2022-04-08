package hcl.microservice.user.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;




@Configuration
@EnableWebFluxSecurity
public class SecurityConfiguration  {
	
	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
	http
	.authorizeExchange()
	.anyExchange().authenticated()
	.and()
	.httpBasic().and()
	.formLogin()
	.and().csrf().disable();
	return http.build();
	}

	

	@Bean
	MapReactiveUserDetailsService userDetailsService() {
	UserDetails user = User
	.withUsername("user")
	.password("$2a$12$Grmxq6bC7.PKAVOsgn.U1OGg6stjttTyWkAt06yR0QN/M9xMef2fa") 
	.roles("USER")
	.build();



	UserDetails admin = User
	.withUsername("admin")
	.password("$2a$12$VuPMB8xE3axJQ6argMmIGeUXlBBC1TPB0RcOPYgN9V0GBhB3G0BDW")
	.roles("ADMIN")
	.build();



	return new MapReactiveUserDetailsService(user, admin);
	}



	@Bean
	public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
	}
}
    
    
    
    

