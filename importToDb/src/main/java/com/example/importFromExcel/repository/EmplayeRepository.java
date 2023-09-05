package com.example.importFromExcel.repository;

import com.example.importFromExcel.entity.EmplayeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplayeRepository extends JpaRepository<EmplayeEntity, Long> {

}
