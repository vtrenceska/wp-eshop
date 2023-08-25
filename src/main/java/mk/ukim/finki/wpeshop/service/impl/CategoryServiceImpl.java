package mk.ukim.finki.wpeshop.service.impl;

import mk.ukim.finki.wpeshop.model.Category;
import mk.ukim.finki.wpeshop.repository.InMemoryCategoryRepository;
import mk.ukim.finki.wpeshop.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final InMemoryCategoryRepository categoryRepository;

    public CategoryServiceImpl(InMemoryCategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category create(String name, String description) {
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        Category c = new Category(name,description);
        categoryRepository.save(c);
        return c;
    }

    @Override
    public Category update(String name, String description) {
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        Category c = new Category(name,description);
        categoryRepository.save(c);
        return c;
    }

    @Override
    public void delete(String name) {
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        categoryRepository.delete(name);
    }

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> searchCategories(String searchText) {
        return categoryRepository.search(searchText);
    }
}
