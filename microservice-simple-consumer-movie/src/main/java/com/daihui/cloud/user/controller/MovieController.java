package com.daihui.cloud.user.controller;

import com.daihui.cloud.user.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/5.
 */
@RestController
public class MovieController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${user.userServiceUrl}")
    private String userServiceUrl;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
       return this.restTemplate.getForObject(this.userServiceUrl+id,User.class);
    }
}
