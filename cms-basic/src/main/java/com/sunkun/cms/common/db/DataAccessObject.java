package com.sunkun.cms.common.db;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: DataAccessObject
 * @Description: db操作基础模块
 * @author sunkun
 * @date 2017年1月15日 下午6:07:28
 */
public abstract class DataAccessObject extends SqlSessionDaoSupport
{
    
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
    {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    
}
