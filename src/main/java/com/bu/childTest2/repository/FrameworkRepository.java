package com.bu.childTest2.repository;

import com.bu.childTest2.model.Framework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrameworkRepository extends JpaRepository<Framework,Integer> {

}
