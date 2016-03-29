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

    /***
     * 自增id
     * 
     */
    @Field("id")
    private Long id;

    /**
     * 作品code
     */
    @Field("asset_code")
    private String assetCode;

    /**
     * 作品名称
     */
    @Field("name")
    private String name;

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
     * 作曲
     */
    @Field("composer")
    private String composer;

    /**
     * 演播
     */
    @Field("actor")
    private String actor;

    /**
     * 导演
     */
    @Field("directors")
    private String directors;

    /**
     * 演员
     */
    @Field("actors")
    private String actors;

    /**
     * 制片人
     */
    @Field("producer")
    private String producer;

    /**
     * 监制
     */
    @Field("director")
    private String director;

    /**
     * 编剧
     */
    @Field("screenwriter")
    private String screenwriter;

    /**
     * 配音
     */
    @Field("dub")
    private String dub;

    /**
     * 角色
     */
    @Field("role")
    private String role;

    /**
     * 主持人
     */
    @Field("compere")
    private String compere;

    /***
     * 嘉宾
     */
    @Field("guest")
    private String guest;

    /**
     * 出版社
     */
    @Field("publisher")
    private String publisher;

    /**
     * 网络播出平台
     */
    @Field("play_online")
    private String playOnline;

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
     * 操作人
     */
    @Field("operate")
    private String operate;

    /**
     * 标记是 什么类型 ,是 asong astory vmovie ...
     */
    @Field("worktype")
    private String worktype;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getAssetCode()
    {
        return assetCode;
    }

    public void setAssetCode(String assetCode)
    {
        this.assetCode = assetCode;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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

    public String getComposer()
    {
        return composer;
    }

    public void setComposer(String composer)
    {
        this.composer = composer;
    }

    public String getActor()
    {
        return actor;
    }

    public void setActor(String actor)
    {
        this.actor = actor;
    }

    public String getDirectors()
    {
        return directors;
    }

    public void setDirectors(String directors)
    {
        this.directors = directors;
    }

    public String getActors()
    {
        return actors;
    }

    public void setActors(String actors)
    {
        this.actors = actors;
    }

    public String getProducer()
    {
        return producer;
    }

    public void setProducer(String producer)
    {
        this.producer = producer;
    }

    public String getDirector()
    {
        return director;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public String getScreenwriter()
    {
        return screenwriter;
    }

    public void setScreenwriter(String screenwriter)
    {
        this.screenwriter = screenwriter;
    }

    public String getDub()
    {
        return dub;
    }

    public void setDub(String dub)
    {
        this.dub = dub;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public String getCompere()
    {
        return compere;
    }

    public void setCompere(String compere)
    {
        this.compere = compere;
    }

    public String getGuest()
    {
        return guest;
    }

    public void setGuest(String guest)
    {
        this.guest = guest;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String getPlayOnline()
    {
        return playOnline;
    }

    public void setPlayOnline(String playOnline)
    {
        this.playOnline = playOnline;
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

    public String getOperate()
    {
        return operate;
    }

    public void setOperate(String operate)
    {
        this.operate = operate;
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

    @Override
    public String toString()
    {
        return "Item [id=" + id + ", assetCode=" + assetCode + ", name=" + name
                + ", asName=" + asName + ", foreignName=" + foreignName
                + ", singer=" + singer + ", author=" + author + ", composer="
                + composer + ", actor=" + actor + ", directors=" + directors
                + ", actors=" + actors + ", producer=" + producer
                + ", director=" + director + ", screenwriter=" + screenwriter
                + ", dub=" + dub + ", role=" + role + ", compere=" + compere
                + ", guest=" + guest + ", publisher=" + publisher
                + ", playOnline=" + playOnline + ", album=" + album + ", tags="
                + tags + ", types=" + types + ", asIsrc=" + asIsrc
                + ", operate=" + operate + ", worktype=" + worktype + "]";
    }

}
