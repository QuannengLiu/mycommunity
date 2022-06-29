package com.nowcoder.mycommunity.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaMybatis")
public class AlphaMybatisImpl implements AlphaDao {
    @Override
    public String select() {
        return "hello mybatisImpl";
    }
}
