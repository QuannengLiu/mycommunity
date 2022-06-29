package com.nowcoder.mycommunity.dao;

import com.nowcoder.mycommunity.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
@Primary
public class AlphaHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "hello hiberate";
    }
}
