
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
 *         &lt;element name="deleteContainerResult" type="{http://www.sonos.com/Services/1.1}deleteContainerResult"/&gt;
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
    "deleteContainerResult"
})
@XmlRootElement(name = "deleteContainerResponse")
public class DeleteContainerResponse {

    @XmlElement(required = true)
    protected DeleteContainerResult deleteContainerResult;

    /**
     * Gets the value of the deleteContainerResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteContainerResult }
     *     
     */
    public DeleteContainerResult getDeleteContainerResult() {
        return deleteContainerResult;
    }

    /**
     * Sets the value of the deleteContainerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteContainerResult }
     *     
     */
    public void setDeleteContainerResult(DeleteContainerResult value) {
        this.deleteContainerResult = value;
    }

}
