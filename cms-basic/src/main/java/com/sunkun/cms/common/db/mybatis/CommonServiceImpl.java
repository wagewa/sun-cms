package com.sunkun.cms.common.db.mybatis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.sunkun.cms.basic.bean.StandardBean;
import com.sunkun.cms.common.db.ICommonDao;
import com.sunkun.cms.common.db.ICommonService;

public class CommonServiceImpl implements Serializable, ICommonService
{
    private static final long serialVersionUID = -3405131722921613459L;
    
    @Resource
    protected ICommonDao commonDao;
    
    public <T> T queryObjectById(Object id, Class<? extends StandardBean> clz)
    {
        return this.commonDao.queryObjectById(id, clz);
    }
    
    public <T> List<T> queryObjectByMulitiIdList(List<? extends Object> idList, Class<? extends StandardBean> clz)
    {
        return this.commonDao.queryObjectByMulitiIdList(idList, clz);
    }
    
    public <T> T queryObjectByMulitiCondition(Map<String, Object> params, Class<? extends StandardBean> clz)
    {
        return this.commonDao.queryObjectByMulitiCondition(params, clz);
    }
    
    public <T> List<T> queryListByMultiCondition(Map<String, Object> params, Class<? extends StandardBean> clz)
    {
        return this.commonDao.queryListByMultiCondition(params, clz);
    }
    
    public boolean deleteById(Object id, Class<? extends StandardBean> clz)
    {
        return this.commonDao.deleteById(id, clz) > 0;
    }
    
    public boolean deleteByIdList(List<? extends Object> idList, Class<? extends StandardBean> clz)
    {
        if (null == idList || !idList.isEmpty())
        {
            return this.commonDao.deleteByIdList(idList, clz) == idList.size();
        }
        else
        {
            return false;
        }
    }
    
    public boolean deleteByMulitiCondition(Map<String, Object> params, Class<? extends StandardBean> clz)
    {
        return this.commonDao.deleteByMulitiCondition(params, clz) > 0;
    }
    
    public Object saveOrUpdate(StandardBean bean)
    {
        return this.commonDao.saveOrUpdate(bean);
    }
    
    public boolean saveOrUpdate(List<StandardBean> list)
    {
        if (list != null && list.size() > 0)
        {
            return this.commonDao.saveOrUpdate(list) == list.size();
        }
        else
        {
            return false;
        }
    }
    
    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }
    
    protected List<Integer> stringToIntArray(String str)
    {
        if ("null".equals(str))
        {
            str = "";
        }
        List<Integer> list = null;
        if (str != null && !str.isEmpty())
        {
            String[] ary = str.split(",");
            list = new ArrayList<Integer>();
            for (int i = 0; i < ary.length; i++)
            {
                list.add(Integer.valueOf(ary[i]));
            }
        }
        return list;
    }
    
    public <T> List<T> queryListByPage(Map<String, Object> params, Class<? extends StandardBean> clz)
    {
        return this.commonDao.queryListByPage(params, clz);
    }
    
    public int queryCountByPage(Map<String, Object> params, Class<? extends StandardBean> clz)
    {
        return this.commonDao.queryCountByPage(params, clz);
    }
    
}
