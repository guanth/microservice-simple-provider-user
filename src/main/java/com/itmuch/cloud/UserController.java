package com.itmuch.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 高尚
 * @version 1.0
 * @date 2019/1/2715:00
 * @desc
 * @update update by @author on @date
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = userRepository.findOne(id);
        return findOne;
    }
}
