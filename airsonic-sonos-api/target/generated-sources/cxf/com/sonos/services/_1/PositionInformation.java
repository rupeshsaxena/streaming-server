
package com.sonos.services._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for positionInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sonos.com/Services/1.1}id"/&gt;
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="offsetMillis" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionInformation", propOrder = {
    "id",
    "index",
    "offsetMillis"
})
public class PositionInformation {

    @XmlElement(required = true)
    protected String id;
    protected int index;
    protected int offsetMillis;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the offsetMillis property.
     * 
     */
    public int getOffsetMillis() {
        return offsetMillis;
    }

    /**
     * Sets the value of the offsetMillis property.
     * 
     */
    public void setOffsetMillis(int value) {
        this.offsetMillis = value;
    }

}
