package com.gmessiasc.SpringWebService.repositories;

import com.gmessiasc.SpringWebService.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
