
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
 *         &lt;element name="getExtendedMetadataResult" type="{http://www.sonos.com/Services/1.1}extendedMetadata"/&gt;
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
    "getExtendedMetadataResult"
})
@XmlRootElement(name = "getExtendedMetadataResponse")
public class GetExtendedMetadataResponse {

    @XmlElement(required = true)
    protected ExtendedMetadata getExtendedMetadataResult;

    /**
     * Gets the value of the getExtendedMetadataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedMetadata }
     *     
     */
    public ExtendedMetadata getGetExtendedMetadataResult() {
        return getExtendedMetadataResult;
    }

    /**
     * Sets the value of the getExtendedMetadataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedMetadata }
     *     
     */
    public void setGetExtendedMetadataResult(ExtendedMetadata value) {
        this.getExtendedMetadataResult = value;
    }

}
