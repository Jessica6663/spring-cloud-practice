package com.jessica.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jessica.springcloud.pojo.Group;

@RestController
@RequestMapping("consumer/group")
public class GroupConsumerController {

    /**
     * RestTemplate 提供了多種方法可以遠程調用其他 http 服務
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 遠端 http 服務的 url
     */
    @Value("${provider.rest-url.group: http://localhost:8001/group}")
    private String restUrlPrefix;

    @RequestMapping("list")
    public List list() {
        return restTemplate.getForObject(restUrlPrefix + "/list", List.class);
    }

    @RequestMapping("get/{id}")
    public Group getById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(restUrlPrefix + "/get/" + id, Group.class);
    }

    @RequestMapping("add")
    public Boolean addGroup(Group group) {
        return restTemplate.postForObject(restUrlPrefix + "/add", group, Boolean.class);
    }

}
