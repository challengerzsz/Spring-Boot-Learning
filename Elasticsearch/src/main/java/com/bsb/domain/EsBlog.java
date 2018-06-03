package com.bsb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Document(indexName = "blog", type = "blog", shards = 1, replicas = 0, refreshInterval = "-1")
public class EsBlog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id //主键
    private String id;
    private String title;
    private String content;

    public EsBlog() {
    }

    public EsBlog(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
