
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
 *         &lt;element name="renameContainerResult" type="{http://www.sonos.com/Services/1.1}renameContainerResult"/&gt;
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
    "renameContainerResult"
})
@XmlRootElement(name = "renameContainerResponse")
public class RenameContainerResponse {

    @XmlElement(required = true)
    protected RenameContainerResult renameContainerResult;

    /**
     * Gets the value of the renameContainerResult property.
     * 
     * @return
     *     possible object is
     *     {@link RenameContainerResult }
     *     
     */
    public RenameContainerResult getRenameContainerResult() {
        return renameContainerResult;
    }

    /**
     * Sets the value of the renameContainerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenameContainerResult }
     *     
     */
    public void setRenameContainerResult(RenameContainerResult value) {
        this.renameContainerResult = value;
    }

}
