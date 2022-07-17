
package com.sonos.services._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simpleHttpRequestAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simpleHttpRequestAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="httpHeaders" type="{http://www.sonos.com/Services/1.1}httpHeaders" minOccurs="0"/&gt;
 *         &lt;element name="refreshOnSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleHttpRequestAction", propOrder = {
    "url",
    "method",
    "httpHeaders",
    "refreshOnSuccess"
})
public class SimpleHttpRequestAction {

    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected String method;
    protected HttpHeaders httpHeaders;
    protected Boolean refreshOnSuccess;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the httpHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link HttpHeaders }
     *     
     */
    public HttpHeaders getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * Sets the value of the httpHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpHeaders }
     *     
     */
    public void setHttpHeaders(HttpHeaders value) {
        this.httpHeaders = value;
    }

    /**
     * Gets the value of the refreshOnSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefreshOnSuccess() {
        return refreshOnSuccess;
    }

    /**
     * Sets the value of the refreshOnSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefreshOnSuccess(Boolean value) {
        this.refreshOnSuccess = value;
    }

}
