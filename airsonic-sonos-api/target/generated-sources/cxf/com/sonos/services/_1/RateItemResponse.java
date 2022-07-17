
package com.sonos.services._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rateItemResult" type="{http://www.sonos.com/Services/1.1}itemRating"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rateItemResult"
})
@XmlRootElement(name = "rateItemResponse")
public class RateItemResponse {

    @XmlElement(required = true)
    protected ItemRating rateItemResult;

    /**
     * Gets the value of the rateItemResult property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRating }
     *     
     */
    public ItemRating getRateItemResult() {
        return rateItemResult;
    }

    /**
     * Sets the value of the rateItemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRating }
     *     
     */
    public void setRateItemResult(ItemRating value) {
        this.rateItemResult = value;
    }

}
