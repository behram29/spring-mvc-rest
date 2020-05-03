package bahram.springframework.springmvcrest.repositories;

import bahram.springframework.springmvcrest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
