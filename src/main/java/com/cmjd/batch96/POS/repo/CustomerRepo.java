package com.cmjd.batch96.POS.repo;

import com.cmjd.batch96.POS.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CustomerRepo extends JpaRepository<Customer,String> {
    @Query(value = "SELECT * FROM Customer WHERE name LIKE ?1%",
            nativeQuery = true)
    Page<Customer> getAll(String searchText, PageRequest of);

    @Query(value = "SELECT COUNT(*) FROM Customer WHERE name LIKE ?1%",
            nativeQuery = true)
    Long getAllCount(String searchText);
}
