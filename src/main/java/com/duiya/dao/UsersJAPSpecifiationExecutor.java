package com.duiya.dao;

import com.duiya.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UsersJAPSpecifiationExecutor extends JpaSpecificationExecutor<Users>, JpaRepository<Users, Integer> {
}
