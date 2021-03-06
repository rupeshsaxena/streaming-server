
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
 *         &lt;element name="addToContainerResult" type="{http://www.sonos.com/Services/1.1}addToContainerResult"/&gt;
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
    "addToContainerResult"
})
@XmlRootElement(name = "addToContainerResponse")
public class AddToContainerResponse {

    @XmlElement(required = true)
    protected AddToContainerResult addToContainerResult;

    /**
     * Gets the value of the addToContainerResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddToContainerResult }
     *     
     */
    public AddToContainerResult getAddToContainerResult() {
        return addToContainerResult;
    }

    /**
     * Sets the value of the addToContainerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddToContainerResult }
     *     
     */
    public void setAddToContainerResult(AddToContainerResult value) {
        this.addToContainerResult = value;
    }

}
