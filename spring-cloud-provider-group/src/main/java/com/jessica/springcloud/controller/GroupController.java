package com.jessica.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jessica.springcloud.pojo.Group;
import com.jessica.springcloud.service.GroupService;

@RestController
@RequestMapping("group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("list")
    public List<Group> getAll() {
        return groupService.queryAll();
    }

    @GetMapping("get/{id}")
    public Group getById(@PathVariable("id") Long id) {
        return groupService.queryById(id);
    }

    @PostMapping("add")
    public boolean addGroup(@RequestBody Group group) {
        return groupService.addGroup(group);
    }

}
