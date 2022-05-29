package com.jessica.springcloud.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jessica.springcloud.pojo.Group;

public interface GroupService {

    List<Group> queryAll();

    Group queryById(Long gNo);

    boolean addGroup(Group group);

}
