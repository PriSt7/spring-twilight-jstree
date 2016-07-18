package com.prist.util;

/**
 * @author xiaofeng.huang
 * @date 16/7/13
 * @time 23:24
 */
public class SearchTreeNode {
    private Long ogId;
    private String text;
    private String data;

    public SearchTreeNode(Long ogId, String text, String data) {
        this.ogId = ogId;
        this.text = text;
        this.data = data;
    }

    public SearchTreeNode() {
    }

    public Long getOgId() {
        return ogId;
    }

    public void setOgId(Long ogId) {
        this.ogId = ogId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
