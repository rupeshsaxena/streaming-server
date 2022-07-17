
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
 *         &lt;element name="removeFromContainerResult" type="{http://www.sonos.com/Services/1.1}removeFromContainerResult"/&gt;
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
    "removeFromContainerResult"
})
@XmlRootElement(name = "removeFromContainerResponse")
public class RemoveFromContainerResponse {

    @XmlElement(required = true)
    protected RemoveFromContainerResult removeFromContainerResult;

    /**
     * Gets the value of the removeFromContainerResult property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveFromContainerResult }
     *     
     */
    public RemoveFromContainerResult getRemoveFromContainerResult() {
        return removeFromContainerResult;
    }

    /**
     * Sets the value of the removeFromContainerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveFromContainerResult }
     *     
     */
    public void setRemoveFromContainerResult(RemoveFromContainerResult value) {
        this.removeFromContainerResult = value;
    }

}
