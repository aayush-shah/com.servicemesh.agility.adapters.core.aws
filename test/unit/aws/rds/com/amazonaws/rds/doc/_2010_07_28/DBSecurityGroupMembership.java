//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 01:23:02 PM CST 
//


package com.amazonaws.rds.doc._2010_07_28;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 <p>
 *                 This data type is used as a response element in the following actions:
 *                 </p>
 *                 <ul>
 *                     <li><a>ModifyDBInstance</a></li>
 *                     <li><a>RebootDBInstance</a></li>
 *                     <li><a>RestoreDBInstanceFromDBSnapshot</a></li>
 *                     <li><a>RestoreDBInstanceToPointInTime</a></li>
 *                 </ul>
 *             
 * 
 * <p>Java class for DBSecurityGroupMembership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DBSecurityGroupMembership">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBSecurityGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBSecurityGroupMembership", propOrder = {
    "dbSecurityGroupName",
    "status"
})
public class DBSecurityGroupMembership {

    @XmlElement(name = "DBSecurityGroupName")
    protected String dbSecurityGroupName;
    @XmlElement(name = "Status")
    protected String status;

    /**
     * Gets the value of the dbSecurityGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBSecurityGroupName() {
        return dbSecurityGroupName;
    }

    /**
     * Sets the value of the dbSecurityGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBSecurityGroupName(String value) {
        this.dbSecurityGroupName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
