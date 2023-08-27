package mk.ukim.finki.wpeshop.bootstrap;

import lombok.Getter;
import mk.ukim.finki.wpeshop.model.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    public static List<ShoppingCart> shoppingCarts = new ArrayList<>();

    @PostConstruct
    public void init(){
        categories.add(new Category("Books", "Books Category"));
        categories.add(new Category("Movies", "Movies Category"));
        categories.add(new Category("Software", "Software Category"));

        users.add(new User("viktorija.trenceska", "vt", "Viktorija", "Trenceska"));
        users.add(new User("martin.paskoski", "mp", "Martin", "Paskoski"));

        Manufacturer manufacturer = new Manufacturer("Nike", "NY NY");
        manufacturers.add(manufacturer);
        manufacturers.add(new Manufacturer("Apple", "LA LA"));

        Category category = new Category("Sport", "Sport Category");
        categories.add(category);

        products.add(new Product("Ball 1", 235.6, 7, category, manufacturer));
        products.add(new Product("Ball 2", 144.4, 4, category, manufacturer));
        products.add(new Product("Ball 3", 675.3, 2, category, manufacturer));
    }
}
