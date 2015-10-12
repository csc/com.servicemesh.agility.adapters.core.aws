//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.14 at 10:25:25 AM EDT 
//


package com.amazonaws.ec2.doc._2013_10_15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VpcType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VpcType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vpcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidrBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dhcpOptionsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagSet" type="{http://ec2.amazonaws.com/doc/2013-10-15/}ResourceTagSetType" minOccurs="0"/>
 *         &lt;element name="instanceTenancy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VpcType", propOrder = {
    "vpcId",
    "state",
    "cidrBlock",
    "dhcpOptionsId",
    "tagSet",
    "instanceTenancy",
    "isDefault"
})
@XmlRootElement(name = "VpcType")
public class VpcType {

    @XmlElement(required = true)
    protected String vpcId;
    protected String state;
    protected String cidrBlock;
    protected String dhcpOptionsId;
    protected ResourceTagSetType tagSet;
    protected String instanceTenancy;
    protected Boolean isDefault;

    /**
     * Gets the value of the vpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * Sets the value of the vpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpcId(String value) {
        this.vpcId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the cidrBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * Sets the value of the cidrBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidrBlock(String value) {
        this.cidrBlock = value;
    }

    /**
     * Gets the value of the dhcpOptionsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }

    /**
     * Sets the value of the dhcpOptionsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhcpOptionsId(String value) {
        this.dhcpOptionsId = value;
    }

    /**
     * Gets the value of the tagSet property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceTagSetType }
     *     
     */
    public ResourceTagSetType getTagSet() {
        return tagSet;
    }

    /**
     * Sets the value of the tagSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceTagSetType }
     *     
     */
    public void setTagSet(ResourceTagSetType value) {
        this.tagSet = value;
    }

    /**
     * Gets the value of the instanceTenancy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }

    /**
     * Sets the value of the instanceTenancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceTenancy(String value) {
        this.instanceTenancy = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

}
