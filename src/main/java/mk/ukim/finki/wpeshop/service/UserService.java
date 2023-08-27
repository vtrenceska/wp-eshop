package mk.ukim.finki.wpeshop.service;

import mk.ukim.finki.wpeshop.model.Role;
import mk.ukim.finki.wpeshop.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User register(String username, String password, String repeatPassword, String name, String surname, Role role);

}
