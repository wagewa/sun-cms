package com.sunkun.cms.basic.bean;

import java.util.Date;

/**
 * @ClassName: UserBean
 * @Description: 用户实体类
 * @author sunkun
 * @date 2017年1月15日 下午2:00:28
 */
public class UserBean implements StandardBean
{
    /**
     * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）
     */
    
    private static final long serialVersionUID = -7062855332204588782L;
    
    private Integer id;
    
    /**
     * 用户登陆名
     */
    private String userName;
    
    /**
     * 用户密码
     */
    private String password;
    
    /**
     * 用户邮箱
     */
    private String email;
    
    /**
     * 性别(0保密,1男,2女)
     */
    private Integer sex;
    
    /**
     * 出生日期
     */
    private String birthday;
    
    /**
     * 会员积分等级
     */
    private Integer rankPoints;
    
    /**
     * 最后一次登陆时间
     */
    private Date lastTime;
    
    /**
     * 最后一次登陆ip
     */
    private String lastIp;
    
    /**
     * 昵称
     */
    private String alias;
    
    /**
     * 办公电话
     */
    private String officePhone;
    
    /**
     * 是否生效
     */
    private Integer isValidated;
    
    /**
     * 注册时间
     */
    private Date createTime;
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(Integer id)
    {
        this.id = id;
    }
    
    public String getUserName()
    {
        return userName;
    }
    
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public Integer getSex()
    {
        return sex;
    }
    
    public void setSex(Integer sex)
    {
        this.sex = sex;
    }
    
    public String getBirthday()
    {
        return birthday;
    }
    
    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }
    
    public Integer getRankPoints()
    {
        return rankPoints;
    }
    
    public void setRankPoints(Integer rankPoints)
    {
        this.rankPoints = rankPoints;
    }
    
    public Date getLastTime()
    {
        return lastTime;
    }
    
    public void setLastTime(Date lastTime)
    {
        this.lastTime = lastTime;
    }
    
    public String getLastIp()
    {
        return lastIp;
    }
    
    public void setLastIp(String lastIp)
    {
        this.lastIp = lastIp;
    }
    
    public String getAlias()
    {
        return alias;
    }
    
    public void setAlias(String alias)
    {
        this.alias = alias;
    }
    
    public String getOfficePhone()
    {
        return officePhone;
    }
    
    public void setOfficePhone(String officePhone)
    {
        this.officePhone = officePhone;
    }
    
    public Integer getIsValidated()
    {
        return isValidated;
    }
    
    public void setIsValidated(Integer isValidated)
    {
        this.isValidated = isValidated;
    }
    
    public Date getCreateTime()
    {
        return createTime;
    }
    
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }
    
}
