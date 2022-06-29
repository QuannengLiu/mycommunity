package com.nowcoder.mycommunity.service;

import com.nowcoder.mycommunity.dao.AlphaDao;
import com.nowcoder.mycommunity.dao.AlphaMybatisImpl;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class AlphaService {
    public AlphaService() {
        System.out.println("构造器");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁");
    }

    @Autowired
    private AlphaDao alphaDao;
    public String find() {
        return alphaDao.select();
    }
}
