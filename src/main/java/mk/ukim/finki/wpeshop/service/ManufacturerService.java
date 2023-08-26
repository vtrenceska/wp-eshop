package mk.ukim.finki.wpeshop.service;

import mk.ukim.finki.wpeshop.model.Manufacturer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ManufacturerService {

    List<Manufacturer> findAll();
    Optional<Manufacturer> findById(Long id);
}
