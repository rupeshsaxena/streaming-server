
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
 *         &lt;element name="favorite" type="{http://www.sonos.com/Services/1.1}id"/&gt;
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
    "favorite"
})
@XmlRootElement(name = "createItem")
public class CreateItem {

    @XmlElement(required = true)
    protected String favorite;

    /**
     * Gets the value of the favorite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavorite() {
        return favorite;
    }

    /**
     * Sets the value of the favorite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavorite(String value) {
        this.favorite = value;
    }

}
