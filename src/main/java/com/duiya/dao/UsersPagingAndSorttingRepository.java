package com.duiya.dao;

import com.duiya.pojo.Users;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * PagingAndSortingRepository 继承CrubRespository
 */
public interface UsersPagingAndSorttingRepository extends PagingAndSortingRepository<Users, Integer> {
}
