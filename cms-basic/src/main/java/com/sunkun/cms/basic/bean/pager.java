package com.sunkun.cms.basic.bean;

import java.util.List;

/**
 * 
 * @ClassName: pager
 * @Description: 分页工具类
 * @author sunkun
 * @date 2017年1月15日 下午1:29:28
 * @param <T>
 */
public class pager<T>
{
    /**
     * 一页显示多少页
     */
    private Integer size;
    
    /**
     * 当前页
     */
    private Integer offset;
    
    /**
     * 总记录数
     */
    private Integer total;
    
    /**
     * 列表数据
     */
    private List<T> list;
    
    /**
     * 状态(0失败,1成功)
     */
    private Integer status;
    
    /**
     * 描述
     */
    private String msg;
    
    public Integer getSize()
    {
        return size;
    }
    
    public void setSize(Integer size)
    {
        this.size = size;
    }
    
    public Integer getOffset()
    {
        return offset;
    }
    
    public void setOffset(Integer offset)
    {
        this.offset = offset;
    }
    
    public Integer getTotal()
    {
        return total;
    }
    
    public void setTotal(Integer total)
    {
        this.total = total;
    }
    
    public List<T> getList()
    {
        return list;
    }
    
    public void setList(List<T> list)
    {
        this.list = list;
    }
    
    public Integer getStatus()
    {
        return status;
    }
    
    public void setStatus(Integer status)
    {
        this.status = status;
    }
    
    public String getMsg()
    {
        return msg;
    }
    
    public void setMsg(String msg)
    {
        this.msg = msg;
    }
    
}
