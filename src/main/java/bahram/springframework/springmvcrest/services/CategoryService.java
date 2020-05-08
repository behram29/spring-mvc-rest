package bahram.springframework.springmvcrest.services;

import bahram.springframework.springmvcrest.api.v1.model.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
