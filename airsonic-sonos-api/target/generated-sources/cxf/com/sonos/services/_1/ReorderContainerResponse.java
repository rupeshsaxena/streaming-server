
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
 *         &lt;element name="reorderContainerResult" type="{http://www.sonos.com/Services/1.1}reorderContainerResult"/&gt;
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
    "reorderContainerResult"
})
@XmlRootElement(name = "reorderContainerResponse")
public class ReorderContainerResponse {

    @XmlElement(required = true)
    protected ReorderContainerResult reorderContainerResult;

    /**
     * Gets the value of the reorderContainerResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReorderContainerResult }
     *     
     */
    public ReorderContainerResult getReorderContainerResult() {
        return reorderContainerResult;
    }

    /**
     * Sets the value of the reorderContainerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorderContainerResult }
     *     
     */
    public void setReorderContainerResult(ReorderContainerResult value) {
        this.reorderContainerResult = value;
    }

}
