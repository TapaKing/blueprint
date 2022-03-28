package com.cyrandote.blueprint.repository;

import com.cyrandote.blueprint.domain.Design;
import org.springframework.data.repository.CrudRepository;

public interface DesignRepository extends CrudRepository<Design, Long> {

    Design findByName(String name);
}
