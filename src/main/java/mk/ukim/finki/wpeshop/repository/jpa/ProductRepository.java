package mk.ukim.finki.wpeshop.repository.jpa;

import mk.ukim.finki.wpeshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByName(String name);
    void deleteByName(String name);
}
