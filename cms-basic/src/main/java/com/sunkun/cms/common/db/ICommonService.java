package com.sunkun.cms.common.db;

import java.util.List;
import java.util.Map;

import com.sunkun.cms.basic.bean.StandardBean;

public interface ICommonService
{
    <T> T queryObjectById(Object id, Class<? extends StandardBean> clz);
    
    <T> List<T> queryObjectByMulitiIdList(List<?> idList, Class<? extends StandardBean> clz);
    
    <T> T queryObjectByMulitiCondition(Map<String, Object> params, Class<? extends StandardBean> clz);
    
    <T> List<T> queryListByMultiCondition(Map<String, Object> params, Class<? extends StandardBean> clz);
    
    boolean deleteById(Object id, Class<? extends StandardBean> clz);
    
    boolean deleteByIdList(List<? extends Object> idList, Class<? extends StandardBean> clz);
    
    boolean deleteByMulitiCondition(Map<String, Object> params, Class<? extends StandardBean> clz);
    
    Object saveOrUpdate(StandardBean bean);
    
    boolean saveOrUpdate(List<StandardBean> list);
    
    <T> List<T> queryListByPage(Map<String, Object> params, Class<? extends StandardBean> clz);
    
    int queryCountByPage(Map<String, Object> params, Class<? extends StandardBean> clz);
}
