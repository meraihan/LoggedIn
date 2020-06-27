package com.aziz.LoggedIn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	                .csrf().disable()
	                .authorizeRequests()
	                .antMatchers("/").permitAll()
	                .anyRequest().authenticated()
	                .and()
	                .formLogin()
	                .loginPage("/login")
	                .defaultSuccessUrl("/home")
	                .permitAll()
	                .and()
	                .logout()
	                .permitAll();
	    }

	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.inMemoryAuthentication()
	                .withUser("user").password("{noop}123").roles("USER")
	                .and()
	                .withUser("admin").password("{noop}123").roles("ADMIN");

	    }
	    
	    @Override
	    public void configure(WebSecurity web) throws Exception {
	        web
	                .ignoring()
	                .antMatchers("/css/style.css");
	    }
}
