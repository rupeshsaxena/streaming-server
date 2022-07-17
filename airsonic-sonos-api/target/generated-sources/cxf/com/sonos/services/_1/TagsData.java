
package com.sonos.services._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tagsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tagsData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="explicit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="premium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tagsData", propOrder = {
    "explicit",
    "premium"
})
public class TagsData {

    protected Integer explicit;
    protected Integer premium;

    /**
     * Gets the value of the explicit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExplicit() {
        return explicit;
    }

    /**
     * Sets the value of the explicit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExplicit(Integer value) {
        this.explicit = value;
    }

    /**
     * Gets the value of the premium property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPremium() {
        return premium;
    }

    /**
     * Sets the value of the premium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPremium(Integer value) {
        this.premium = value;
    }

}
