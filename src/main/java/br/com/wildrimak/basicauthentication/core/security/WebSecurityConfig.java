package br.com.wildrimak.basicauthentication.core.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

	
	
	auth.inMemoryAuthentication()
		.withUser("agnaldo")
			.password(passwordEncoder().encode("odlanga"))
			.roles("ADMIN")
		.and()
		.withUser("barbara")
			.password(passwordEncoder().encode("arabrab"))
			.roles("ADMIN")
	;
	
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

	http.httpBasic()
		.and()
			.authorizeRequests().antMatchers("/produtos/**").permitAll()
			.anyRequest().authenticated()
		.and()
			.sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
			.csrf().disable();

    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
    }
}
