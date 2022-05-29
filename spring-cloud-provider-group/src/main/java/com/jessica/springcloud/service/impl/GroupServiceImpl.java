package com.jessica.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jessica.springcloud.dao.GroupDao;
import com.jessica.springcloud.pojo.Group;
import com.jessica.springcloud.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupDao groupDao;

    @Override
    public List<Group> queryAll() {
        return groupDao.queryAll();
    }

    @Override
    public Group queryById(Long gNo) {
        return groupDao.queryById(gNo);
    }

    @Override
    public boolean addGroup(Group group) {
        return groupDao.addGroup(group);
    }

}
