package com.oce.testsync.domain;

/*
* 部门关系，
* 二叉树关系结构
* */
public class DeptRelation {

    private String child;
    private String parent;
    private int is_sub;

    public DeptRelation(String child, String parent,int is_sub) {
        this.child = child;
        this.parent = parent;
        this.is_sub = is_sub;
    }

    public int getIs_sub() {
        return is_sub;
    }

    public void setIs_sub(int is_sub) {
        this.is_sub = is_sub;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "DeptRelation{" +
                "child='" + child + '\'' +
                ", parent='" + parent + '\'' +
                ", is_sub=" + is_sub +
                '}';
    }
}
