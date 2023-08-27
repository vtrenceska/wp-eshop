package mk.ukim.finki.wpeshop.service;

import mk.ukim.finki.wpeshop.model.User;

public interface AuthService {

    User login(String username, String password);
}
