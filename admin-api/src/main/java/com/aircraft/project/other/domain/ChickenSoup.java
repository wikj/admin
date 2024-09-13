package com.aircraft.project.other.domain;

import com.aircraft.framework.web.domain.BaseEntity;

/**
 * 每日一言
 */
public class ChickenSoup extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Long id;

    /** 内容 */
    private String content;

    /** 类型 */
    private String type;

    /** 出处 */
    private String from;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "ChickenSoup{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}