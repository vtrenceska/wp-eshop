package mk.ukim.finki.wpeshop.repository.jpa;

import mk.ukim.finki.wpeshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUsernameAndPassword (String username, String password);
    Optional<User> findByUsername (String username);


}
