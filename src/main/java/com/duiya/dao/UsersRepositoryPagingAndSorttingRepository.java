package com.duiya.dao;

import com.duiya.pojo.Users;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * PagingAndSortingRepository 继承CrubRespository
 */
public interface UsersRepositoryPagingAndSorttingRepository extends PagingAndSortingRepository<Users, Integer> {
}
