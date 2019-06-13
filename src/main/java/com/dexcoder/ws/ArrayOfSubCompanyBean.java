//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.06.13 时间 06:22:30 PM CST 
//


package com.dexcoder.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSubCompanyBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSubCompanyBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubCompanyBean" type="{http://webservice.hrm.weaver}SubCompanyBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSubCompanyBean", namespace = "http://webservice.hrm.weaver", propOrder = {
    "subCompanyBean"
})
public class ArrayOfSubCompanyBean {

    @XmlElement(name = "SubCompanyBean", nillable = true)
    protected List<SubCompanyBean> subCompanyBean;

    /**
     * Gets the value of the subCompanyBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subCompanyBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubCompanyBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubCompanyBean }
     * 
     * 
     */
    public List<SubCompanyBean> getSubCompanyBean() {
        if (subCompanyBean == null) {
            subCompanyBean = new ArrayList<SubCompanyBean>();
        }
        return this.subCompanyBean;
    }

}
