package com.daihui.cloud.dao;

import com.daihui.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * 用户dao
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017-09-05 1:27
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}
