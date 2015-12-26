package cn.fbi.solrj.pojo;

import org.apache.solr.client.solrj.beans.Field;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// 未知字段忽略即可
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item implements java.io.Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    // 自增id
    @Field("id")
    private Long id;

    /**
     * 作品名称
     */
    @Field("name")
    private String name;

    /**
     * 作品code
     */
    @Field("asset_code")
    private String assetCode;

    /**
     * 别名
     */
    @Field("as_name")
    private String asName;

    /**
     * 英文名称
     */
    @Field("foreign_name")
    private String foreignName;

    /**
     * 歌手
     */
    @Field("singer")
    private String singer;

    /**
     * 作者
     */
    @Field("author")
    private String author;

    /**
     * 演播
     */
    @Field("actor")
    private String actor;

    /**
     * 集数
     */
    @Field("story_sets")
    private Long storySets;

    /**
     * 导演
     */
    @Field("direcctors")
    private String directors;

    /**
     * 角色
     */
    @Field("role")
    private String role;

    /**
     * 配音
     */
    @Field("dub")
    private String dub;

    /**
     * 出版社
     */
    @Field("publisher")
    private String publisher;

    /**
     * 作曲
     */
    @Field("composer")
    private String composer;

    /**
     * 出版时间
     */
    @Field("productionDateString")
    private String productionDateString;

    /**
     * 出版公司
     */
    @Field("productionCompany")
    private String productionCompany;

    /**
     * 公映许可证号
     */
    @Field("permitCode")
    private String permitCode;

    /**
     * 编剧
     */
    @Field("screenwriter")
    private String screenwriter;

    /**
     * 制片人
     */
    @Field("producer")
    private String producer;

    /**
     * 集数
     */
    @Field("mov_sets")
    private Long movSets;

    /**
     * 网络播出平台
     */
    @Field("playOnline")
    private String playOnline;

    /**
     * 发行时间
     */
    @Field("publishTime")
    private String publishTime;

    /**
     * 歌词
     */
    @Field("lyric")
    private String lyric;

    /**
     * 唱片
     */
    @Field("album")
    private String album;

    /**
     * 标签
     */
    @Field("tags")
    private String tags;

    /**
     * 类型
     */
    @Field("types")
    private String types;

    /**
     * asisrc 编码
     * 
     */
    @Field("as_isrc")
    private String asIsrc;

    /**
     * 来源
     * 
     */
    @Field("source")
    private String source;

    /**
     * 操作人
     */
    @Field("operate")
    private String operate;

    /**
     * 标记是 什么类型 ,是 asong astory vmovie ...
     */
    @Field("worktype")
    private String worktype;

    /**
     * 图片
     */
    @Field("images")
    private String images;

    public String getImages()
    {
        return images;
    }

    public void setImages(String images)
    {
        this.images = images;
    }

    public String getWorktype()
    {
        return worktype;
    }

    public void setWorktype(String worktype)
    {
        this.worktype = worktype;
    }

    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAssetCode()
    {
        return assetCode;
    }

    public void setAssetCode(String assetCode)
    {
        this.assetCode = assetCode;
    }

    public String getAsName()
    {
        return asName;
    }

    public void setAsName(String asName)
    {
        this.asName = asName;
    }

    public String getForeignName()
    {
        return foreignName;
    }

    public void setForeignName(String foreignName)
    {
        this.foreignName = foreignName;
    }

    public String getSinger()
    {
        return singer;
    }

    public void setSinger(String singer)
    {
        this.singer = singer;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getActor()
    {
        return actor;
    }

    public void setActor(String actor)
    {
        this.actor = actor;
    }

    public Long getStorySets()
    {
        return storySets;
    }

    public void setStorySets(Long storySets)
    {
        this.storySets = storySets;
    }

    public String getDirectors()
    {
        return directors;
    }

    public void setDirectors(String directors)
    {
        this.directors = directors;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public String getDub()
    {
        return dub;
    }

    public void setDub(String dub)
    {
        this.dub = dub;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String getComposer()
    {
        return composer;
    }

    public void setComposer(String composer)
    {
        this.composer = composer;
    }

    public String getProductionDateString()
    {
        return productionDateString;
    }

    public void setProductionDateString(String productionDateString)
    {
        this.productionDateString = productionDateString;
    }

    public String getProductionCompany()
    {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany)
    {
        this.productionCompany = productionCompany;
    }

    public String getPermitCode()
    {
        return permitCode;
    }

    public void setPermitCode(String permitCode)
    {
        this.permitCode = permitCode;
    }

    public String getScreenwriter()
    {
        return screenwriter;
    }

    public void setScreenwriter(String screenwriter)
    {
        this.screenwriter = screenwriter;
    }

    public String getProducer()
    {
        return producer;
    }

    public void setProducer(String producer)
    {
        this.producer = producer;
    }

    public Long getMovSets()
    {
        return movSets;
    }

    public void setMovSets(Long movSets)
    {
        this.movSets = movSets;
    }

    public String getPlayOnline()
    {
        return playOnline;
    }

    public void setPlayOnline(String playOnline)
    {
        this.playOnline = playOnline;
    }

    public String getPublishTime()
    {
        return publishTime;
    }

    public void setPublishTime(String publishTime)
    {
        this.publishTime = publishTime;
    }

    public String getLyric()
    {
        return lyric;
    }

    public void setLyric(String lyric)
    {
        this.lyric = lyric;
    }

    public String getAlbum()
    {
        return album;
    }

    public void setAlbum(String album)
    {
        this.album = album;
    }

    public String getTags()
    {
        return tags;
    }

    public void setTags(String tags)
    {
        this.tags = tags;
    }

    public String getTypes()
    {
        return types;
    }

    public void setTypes(String types)
    {
        this.types = types;
    }

    public String getAsIsrc()
    {
        return asIsrc;
    }

    public void setAsIsrc(String asIsrc)
    {
        this.asIsrc = asIsrc;
    }

    public String getSource()
    {
        return source;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public String getOperate()
    {
        return operate;
    }

    public void setOperate(String operate)
    {
        this.operate = operate;
    }

    @Override
    public String toString()
    {
        return "Item [id=" + id + ", name=" + name + ", assetCode=" + assetCode
                + ", asName=" + asName + ", foreignName=" + foreignName
                + ", singer=" + singer + ", author=" + author + ", actor="
                + actor + ", storySets=" + storySets + ", directors="
                + directors + ", role=" + role + ", dub=" + dub
                + ", publisher=" + publisher + ", composer=" + composer
                + ", productionDateString=" + productionDateString
                + ", productionCompany=" + productionCompany + ", permitCode="
                + permitCode + ", screenwriter=" + screenwriter + ", producer="
                + producer + ", movSets=" + movSets + ", playOnline="
                + playOnline + ", publishTime=" + publishTime + ", lyric="
                + lyric + ", album=" + album + ", tags=" + tags + ", types="
                + types + ", asIsrc=" + asIsrc + ", source=" + source
                + ", operate=" + operate + "]";
    }

}
