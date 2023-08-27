package mk.ukim.finki.wpeshop.repository.jpa;

import mk.ukim.finki.wpeshop.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {



}
