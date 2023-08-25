package mk.ukim.finki.wpeshop.bootstrap;

import mk.ukim.finki.wpeshop.model.Category;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();

    @PostConstruct
    public void init(){
        categories.add(new Category("Books", "Books Category"));
        categories.add(new Category("Movies", "Movies Category"));
    }
}
