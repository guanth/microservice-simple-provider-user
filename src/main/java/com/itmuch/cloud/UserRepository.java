package com.itmuch.cloud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 高尚
 * @version 1.0
 * @date 2019/1/2714:59
 * @desc
 * @update update by @author on @date
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
