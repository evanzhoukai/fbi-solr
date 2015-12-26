package cn.fbi.solrj.pojo;

import org.apache.solr.client.solrj.beans.Field;

public class Foo
{

    @Field("id")
    // 指定solr中doc的字段名
    private Long id;

    @Field("name")
    private String name;

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

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Foo [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append("]");
        return builder.toString();
    }

}
