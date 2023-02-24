package org.wcci.entities.repositories.restControllers.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.entities.repositories.restControllers.entities.Style;

public interface StyleRepository extends CrudRepository<Style, Long> {
}
