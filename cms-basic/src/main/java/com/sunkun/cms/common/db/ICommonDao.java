package com.sunkun.cms.common.db;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.sunkun.cms.basic.bean.StandardBean;

public interface ICommonDao extends Serializable
{
    <T> T queryObjectById(Object id, Class<? extends StandardBean> clz);
    
    <T> T queryObjectById(int id);
    
    <T> T queryObjectByObject(Object params, Class<? extends StandardBean> clz);
    
    <T> List<T> queryObjectByMulitiIdList(List<? extends Object> idList, Class<? extends StandardBean> clz);
    
    <T> T queryObjectByMulitiCondition(Map<String, Object> params, Class<? extends StandardBean> clz);
    
    <T> List<T> queryListByMultiCondition(Map<String, Object> params, Class<? extends StandardBean> clz);
    
    int deleteById(Object id, Class<? extends StandardBean> clz);
    
    int deleteByIdList(List<? extends Object> idList, Class<? extends StandardBean> clz);
    
    int deleteByMulitiCondition(Map<String, Object> params, Class<? extends StandardBean> clz);
    
    Object saveOrUpdate(StandardBean bean);
    
    int saveOrUpdate(List<StandardBean> list);
    
    <T> List<T> queryListByPage(Map<String, Object> params, Class<? extends StandardBean> clz);
    
    Integer queryCountByPage(Map<String, Object> params, Class<? extends StandardBean> clz);
}
