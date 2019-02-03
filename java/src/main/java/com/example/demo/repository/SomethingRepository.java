package com.example.demo.repository;

import com.example.demo.model.Something;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SomethingRepository extends JpaRepository<Something, String> {
    List<Something> findBySomeText(String someText);
}
