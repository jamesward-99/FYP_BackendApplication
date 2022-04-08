package com.fyp.systembackend;

//import java.util.ArrayList;
//import java.util.List;

//import javax.annotation.PostConstruct;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.password.PasswordEncoder;

//import com.fyp.systembackend.entities.Authority;
//import com.fyp.systembackend.entities.User;
//import com.fyp.systembackend.repository.UserDetailsRepository;

@SpringBootApplication
public class SystembackendApplication {
/*
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;
*/
	public static void main(String[] args) {
		SpringApplication.run(SystembackendApplication.class, args);
	}
/*
	@PostConstruct
	protected void init() {
		
		List<Authority> authorityList = new ArrayList<>();
		
		authorityList.add(createAuthority("USER", "User Role"));
		authorityList.add(createAuthority("ADMIN", "Admin Role"));
		
		User user = new User();
		
		user.setUserName("jamesward_99");
		user.setFirstName("James");
		user.setLastName("Ward");
		
		user.setPassword(passwordEncoder.encode("test@1234"));
		user.setEnabled(true);
		user.setAuthorities(authorityList);
		
		userDetailsRepository.save(user);		
	}
	
	private Authority createAuthority(String roleCode,String roleDescription) {
		Authority authority=new Authority();
		authority.setRoleCode(roleCode);
		authority.setRoleDescription(roleDescription);
		return authority;
	} 
*/
}