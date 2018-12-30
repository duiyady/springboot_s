package com.duiya.dao;

import com.duiya.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository继承了PagingAndSortingRepository QueryByExampleExecutor
 */
public interface UsersRepositoryJpaRepository extends JpaRepository<Users, Integer> {
}
