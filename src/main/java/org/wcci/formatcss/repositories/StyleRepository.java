package org.wcci.formatcss.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.formatcss.entities.Style;

public interface StyleRepository extends CrudRepository<Style, Long> {
}
