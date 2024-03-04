package com.gls.ppldv.developer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gls.ppldv.developer.entity.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long>{

}