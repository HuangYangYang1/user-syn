package com.oce.testsync.domain;


/**
 *  部门关系bean
 *
 * @author yang.huang
 * @since 2019/6/12 11:44
 */
public class DeptRelation {
    /**
     * 子部门的id
     */
    private String child;
    /**
     * 父部门的id
     */
    private String parent;
    /**
     * 是否是直系，1为直系
     */
    private int is_sub;

    /**
     * 构造方法
     *
     * @param [child, parent, is_sub]
     * @return
     */
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
