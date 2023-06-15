package com.ecommerce.demo.dao;

import com.ecommerce.demo.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

//@Repository
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);


//    @Query("select p from Product p where lower(p.name) like lower(concat('%', :searchText, '%'))" +
//    "or lower(p.description) like lower(concat('%', :searchText, '%'))")
//    Page<Product> doMyCustomStuff (@Param("searchText") String searchText, Pageable pageable);







}
