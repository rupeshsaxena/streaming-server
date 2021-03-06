
package com.sonos.services._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemRating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemRating"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shouldSkip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="messageStringId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemRating", propOrder = {
    "shouldSkip",
    "messageStringId"
})
public class ItemRating {

    protected Boolean shouldSkip;
    protected String messageStringId;

    /**
     * Gets the value of the shouldSkip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldSkip() {
        return shouldSkip;
    }

    /**
     * Sets the value of the shouldSkip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldSkip(Boolean value) {
        this.shouldSkip = value;
    }

    /**
     * Gets the value of the messageStringId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageStringId() {
        return messageStringId;
    }

    /**
     * Sets the value of the messageStringId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageStringId(String value) {
        this.messageStringId = value;
    }

}
