package mk.ukim.finki.wpeshop.service;

import mk.ukim.finki.wpeshop.model.User;

public interface AuthService {

    User login(String username, String password);
    User register(String username, String password, String repeatPassword, String name, String surname);
}
