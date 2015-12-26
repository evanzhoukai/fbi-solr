package cn.fbi.solrj.pojo;

import java.beans.Transient;

import org.apache.solr.client.solrj.beans.Field;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 简介：
 *
 * 描述：
 * @author jemond
 * @date 2015年9月2日 上午10:49:53
 * @see
 * @since 1.0
 */
// 指定表名
@JsonIgnoreProperties(ignoreUnknown = true)
// 未知字段忽略即可
public class Person implements java.io.Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Field("id")
    private Long id;

    private String perCode;

    @Field("name")
    private String name;

    @Field("en_name")
    private String enName;

    private String asName;

    private String namePy;

    private String nameSpy;

    private String img;

    private String birthday;

    private Long sex;

    private String area;

    private String constellation;

    private String height;

    private String blood;

    private String tags;

    private Long status;

    private String perDesc;

    private String reserve;

    private String startTime;

    private String endTime;

    @Transient
    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    @Transient
    public String getEndTime()
    {
        return endTime;
    }

    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getPerCode()
    {
        return perCode;
    }

    public void setPerCode(String perCode)
    {
        this.perCode = perCode;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEnName()
    {
        return enName;
    }

    public void setEnName(String enName)
    {
        this.enName = enName;
    }

    public String getAsName()
    {
        return asName;
    }

    public void setAsName(String asName)
    {
        this.asName = asName;
    }

    public String getNamePy()
    {
        return namePy;
    }

    public void setNamePy(String namePy)
    {
        this.namePy = namePy;
    }

    public String getNameSpy()
    {
        return nameSpy;
    }

    public void setNameSpy(String nameSpy)
    {
        this.nameSpy = nameSpy;
    }

    public String getImg()
    {
        return img;
    }

    public void setImg(String img)
    {
        this.img = img;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    public Long getSex()
    {
        return sex;
    }

    public void setSex(Long sex)
    {
        this.sex = sex;
    }

    public String getArea()
    {
        return area;
    }

    public void setArea(String area)
    {
        this.area = area;
    }

    public String getConstellation()
    {
        return constellation;
    }

    public void setConstellation(String constellation)
    {
        this.constellation = constellation;
    }

    public String getHeight()
    {
        return height;
    }

    public void setHeight(String height)
    {
        this.height = height;
    }

    public String getBlood()
    {
        return blood;
    }

    public void setBlood(String blood)
    {
        this.blood = blood;
    }

    public String getTags()
    {
        return tags;
    }

    public void setTags(String tags)
    {
        this.tags = tags;
    }

    public Long getStatus()
    {
        return status;
    }

    public void setStatus(Long status)
    {
        this.status = status;
    }

    public String getPerDesc()
    {
        return perDesc;
    }

    public void setPerDesc(String perDesc)
    {
        this.perDesc = perDesc;
    }

    public String getReserve()
    {
        return reserve;
    }

    public void setReserve(String reserve)
    {
        this.reserve = reserve;
    }

    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }

    @Override
    public String toString()
    {
        return "Person [id=" + id + ", perCode=" + perCode + ", name=" + name
                + ", enName=" + enName + ", asName=" + asName + ", namePy="
                + namePy + ", nameSpy=" + nameSpy + ", img=" + img
                + ", birthday=" + birthday + ", sex=" + sex + ", area=" + area
                + ", constellation=" + constellation + ", height=" + height
                + ", blood=" + blood + ", tags=" + tags + ", status=" + status
                + ", perDesc=" + perDesc + ", reserve=" + reserve + "]";
    }

}