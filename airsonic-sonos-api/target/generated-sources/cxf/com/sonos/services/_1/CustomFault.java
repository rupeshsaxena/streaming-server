
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
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="SonosError" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *           &lt;element name="ExceptionInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="refreshAuthTokenResult" type="{http://www.sonos.com/Services/1.1}deviceAuthTokenResult"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sonosError",
    "exceptionInfo",
    "refreshAuthTokenResult"
})
@XmlRootElement(name = "customFault")
public class CustomFault {

    @XmlElement(name = "SonosError")
    protected Integer sonosError;
    @XmlElement(name = "ExceptionInfo")
    protected String exceptionInfo;
    protected DeviceAuthTokenResult refreshAuthTokenResult;

    /**
     * Gets the value of the sonosError property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSonosError() {
        return sonosError;
    }

    /**
     * Sets the value of the sonosError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSonosError(Integer value) {
        this.sonosError = value;
    }

    /**
     * Gets the value of the exceptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionInfo() {
        return exceptionInfo;
    }

    /**
     * Sets the value of the exceptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionInfo(String value) {
        this.exceptionInfo = value;
    }

    /**
     * Gets the value of the refreshAuthTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceAuthTokenResult }
     *     
     */
    public DeviceAuthTokenResult getRefreshAuthTokenResult() {
        return refreshAuthTokenResult;
    }

    /**
     * Sets the value of the refreshAuthTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAuthTokenResult }
     *     
     */
    public void setRefreshAuthTokenResult(DeviceAuthTokenResult value) {
        this.refreshAuthTokenResult = value;
    }

}
