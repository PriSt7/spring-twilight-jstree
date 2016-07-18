package com.prist.util;

import java.util.List;

/**
 * @author xiaofeng.huang
 * @date 16/7/13
 * @time 23:23
 */
public class SearchTree {
    private Long ogId;
    private String text;
    private String data;
    private List<SearchTreeNode> children;

    public SearchTree(Long ogId, String text) {
        this.ogId = ogId;
        this.text = text;
    }

    public SearchTree() {
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

    public List<SearchTreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<SearchTreeNode> children) {
        this.children = children;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
