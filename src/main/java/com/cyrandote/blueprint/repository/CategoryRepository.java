package com.cyrandote.blueprint.repository;

import com.cyrandote.blueprint.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByCategory(String category);

}
