
package com.sonos.services._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateItemAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateItemAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sonos.com/Services/1.1}rateItem"/&gt;
 *         &lt;element name="shouldSkip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateItemAction", propOrder = {
    "rateItem",
    "shouldSkip"
})
public class RateItemAction {

    @XmlElement(required = true)
    protected RateItem rateItem;
    protected Boolean shouldSkip;

    /**
     * Gets the value of the rateItem property.
     * 
     * @return
     *     possible object is
     *     {@link RateItem }
     *     
     */
    public RateItem getRateItem() {
        return rateItem;
    }

    /**
     * Sets the value of the rateItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateItem }
     *     
     */
    public void setRateItem(RateItem value) {
        this.rateItem = value;
    }

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

}
