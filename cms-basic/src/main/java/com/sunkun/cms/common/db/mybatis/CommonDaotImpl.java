package com.sunkun.cms.common.db.mybatis;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;

import com.sunkun.cms.basic.bean.StandardBean;
import com.sunkun.cms.common.db.DataAccessObject;
import com.sunkun.cms.common.db.ICommonDao;

public class CommonDaotImpl extends DataAccessObject implements ICommonDao
{
    
    /**
     * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）
     */
    
    private static final long serialVersionUID = -319350058216196355L;
    
    @Resource
    public SqlSessionTemplate template;
    
    private final static String POINT = ".";
    
    private final static String ID = "id";
    
    private final static String GET = "get";
    
    protected String statment(Class<? extends StandardBean> clz)
    {
        StackTraceElement element = new Throwable().getStackTrace()[1];
        return new StringBuffer().append(clz.getSimpleName()).append(POINT).append(element.getMethodName()).toString();
    }
    
    private String primary(String filed)
    {
        return new StringBuffer(GET).append(filed.substring(0, 1).toUpperCase()).append(filed.substring(1)).toString();
    }
    
    public int deleteById(Object id, Class<? extends StandardBean> clz)
    {
        return this.template.delete(this.statment(clz), id);
    }
    
    public int deleteByIdList(List<? extends Object> idList, Class<? extends StandardBean> clz)
    {
        return this.template.delete(this.statment(clz), idList);
    }
    
    public int deleteByMulitiCondition(Map<String, Object> params, Class<? extends StandardBean> clz)
    {
        return this.template.delete(this.statment(clz), params);
    }
    
    public <T> List<T> queryListByMultiCondition(Map<String, Object> params, Class<? extends StandardBean> clz)
    {
        return this.template.selectList(this.statment(clz), params);
    }
    
    public <T> T queryObjectById(Object id, Class<? extends StandardBean> clz)
    {
        System.out.println("==========33333333333333333333333333=");
        return this.template.selectOne(this.statment(clz), id);
    }
    
    public <T> T queryObjectByObject(Object params, Class<? extends StandardBean> clz)
    {
        return this.template.selectOne(this.statment(clz), params);
    }
    
    public <T> T queryObjectByMulitiCondition(Map<String, Object> params, Class<? extends StandardBean> clz)
    {
        return this.template.selectOne(this.statment(clz), params);
    }
    
    public <T> List<T> queryObjectByMulitiIdList(List<? extends Object> idList, Class<? extends StandardBean> clz)
    {
        return this.template.selectList(this.statment(clz), idList);
    }
    
    public int saveOrUpdate(List<StandardBean> list)
    {
        int rslt = 0;
        if (null != list && !list.isEmpty())
        {
            Iterator<StandardBean> iterator = list.iterator();
            while (iterator.hasNext())
            {
                StandardBean bean = iterator.next();
                String name = this.primary(ID);
                Object obj = null;
                try
                {
                    obj = bean.getClass().getMethod(name).invoke(bean);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                if (null == obj)
                {
                    rslt += this.template.insert(this.statment(bean.getClass()), bean);
                }
                else
                {
                    rslt += this.template.update(this.statment(bean.getClass()), bean);
                }
            }
        }
        return rslt;
    }
    
    public Object saveOrUpdate(StandardBean bean)
    {
        String name = this.primary(ID);
        Object obj = null;
        try
        {
            obj = bean.getClass().getMethod(name).invoke(bean);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null == obj ? this.template.insert(this.statment(bean.getClass()), bean)
            : this.template.update(this.statment(bean.getClass()), bean);
    }
    
    public <T> List<T> queryListByPage(Map<String, Object> params, Class<? extends StandardBean> clz)
    {
        return this.template.selectList(this.statment(clz), params);
    }
    
    public Integer queryCountByPage(Map<String, Object> params, Class<? extends StandardBean> clz)
    {
        return this.template.selectOne(this.statment(clz), params);
    }

    @Override
    public <T> T queryObjectById(int id)
    {
        // TODO Auto-generated method stub
        return null;
    }
}
