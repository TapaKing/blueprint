package com.cyrandote.blueprint.repository;

import com.cyrandote.blueprint.domain.Category;
import com.cyrandote.blueprint.domain.Text;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TextRepository extends CrudRepository<Text, Long> {

    Optional<Category> findByText(String text);

}
