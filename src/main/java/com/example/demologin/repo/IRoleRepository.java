package com.example.demologin.repo;

import com.example.demologin.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<AppRole,Long> {
}
