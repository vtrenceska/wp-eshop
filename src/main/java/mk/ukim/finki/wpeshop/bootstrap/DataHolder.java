package mk.ukim.finki.wpeshop.bootstrap;

import lombok.Getter;
import mk.ukim.finki.wpeshop.model.Category;
import mk.ukim.finki.wpeshop.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();
    public static List<User> users = new ArrayList<>();

    @PostConstruct
    public void init(){
        categories.add(new Category("Books", "Books Category"));
        categories.add(new Category("Movies", "Movies Category"));
        categories.add(new Category("Software", "Software Category"));

        users.add(new User("viktorija.trenceska", "vt", "Viktorija", "Trenceska"));
        users.add(new User("martin.paskoski", "mp", "Martin", "Paskoski"));

    }
}
