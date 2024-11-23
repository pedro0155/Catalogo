package com.tads.catalogo.catalogo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tads.catalogo.catalogo.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}