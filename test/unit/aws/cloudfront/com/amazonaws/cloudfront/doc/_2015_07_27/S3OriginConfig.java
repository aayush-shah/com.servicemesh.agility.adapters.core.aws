//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.23 at 03:48:19 PM CDT 
//


package com.amazonaws.cloudfront.doc._2015_07_27;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S3OriginConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S3OriginConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginAccessIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S3OriginConfigType", propOrder = {
    "originAccessIdentity"
})
public class S3OriginConfig
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OriginAccessIdentity", required = true)
    protected String originAccessIdentity;

    /**
     * Gets the value of the originAccessIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAccessIdentity() {
        return originAccessIdentity;
    }

    /**
     * Sets the value of the originAccessIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAccessIdentity(String value) {
        this.originAccessIdentity = value;
    }

}