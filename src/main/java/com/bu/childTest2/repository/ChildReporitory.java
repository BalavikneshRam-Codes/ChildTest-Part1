package com.bu.childTest2.repository;

import com.bu.childTest2.model.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildReporitory extends JpaRepository<Child,Integer> {
}
