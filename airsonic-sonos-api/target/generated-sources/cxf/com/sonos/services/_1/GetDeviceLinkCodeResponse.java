
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
 *         &lt;element name="getDeviceLinkCodeResult" type="{http://www.sonos.com/Services/1.1}deviceLinkCodeResult"/&gt;
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
    "getDeviceLinkCodeResult"
})
@XmlRootElement(name = "getDeviceLinkCodeResponse")
public class GetDeviceLinkCodeResponse {

    @XmlElement(required = true)
    protected DeviceLinkCodeResult getDeviceLinkCodeResult;

    /**
     * Gets the value of the getDeviceLinkCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceLinkCodeResult }
     *     
     */
    public DeviceLinkCodeResult getGetDeviceLinkCodeResult() {
        return getDeviceLinkCodeResult;
    }

    /**
     * Sets the value of the getDeviceLinkCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceLinkCodeResult }
     *     
     */
    public void setGetDeviceLinkCodeResult(DeviceLinkCodeResult value) {
        this.getDeviceLinkCodeResult = value;
    }

}
