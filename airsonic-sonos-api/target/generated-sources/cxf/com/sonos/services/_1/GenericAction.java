
package com.sonos.services._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genericAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genericAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sonos.com/Services/1.1}id"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actionType" type="{http://www.sonos.com/Services/1.1}actionType"/&gt;
 *         &lt;element name="showInBrowse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="openUrlAction" type="{http://www.sonos.com/Services/1.1}openUrlAction"/&gt;
 *           &lt;element name="simpleHttpRequestAction" type="{http://www.sonos.com/Services/1.1}simpleHttpRequestAction"/&gt;
 *           &lt;element name="rateItemAction" type="{http://www.sonos.com/Services/1.1}rateItemAction"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="successMessageStringId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="failureMessageStringId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericAction", propOrder = {
    "id",
    "title",
    "actionType",
    "showInBrowse",
    "openUrlAction",
    "simpleHttpRequestAction",
    "rateItemAction",
    "successMessageStringId",
    "failureMessageStringId"
})
public class GenericAction {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ActionType actionType;
    protected Boolean showInBrowse;
    protected OpenUrlAction openUrlAction;
    protected SimpleHttpRequestAction simpleHttpRequestAction;
    protected RateItemAction rateItemAction;
    protected String successMessageStringId;
    protected String failureMessageStringId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setActionType(ActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the showInBrowse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowInBrowse() {
        return showInBrowse;
    }

    /**
     * Sets the value of the showInBrowse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInBrowse(Boolean value) {
        this.showInBrowse = value;
    }

    /**
     * Gets the value of the openUrlAction property.
     * 
     * @return
     *     possible object is
     *     {@link OpenUrlAction }
     *     
     */
    public OpenUrlAction getOpenUrlAction() {
        return openUrlAction;
    }

    /**
     * Sets the value of the openUrlAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenUrlAction }
     *     
     */
    public void setOpenUrlAction(OpenUrlAction value) {
        this.openUrlAction = value;
    }

    /**
     * Gets the value of the simpleHttpRequestAction property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleHttpRequestAction }
     *     
     */
    public SimpleHttpRequestAction getSimpleHttpRequestAction() {
        return simpleHttpRequestAction;
    }

    /**
     * Sets the value of the simpleHttpRequestAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleHttpRequestAction }
     *     
     */
    public void setSimpleHttpRequestAction(SimpleHttpRequestAction value) {
        this.simpleHttpRequestAction = value;
    }

    /**
     * Gets the value of the rateItemAction property.
     * 
     * @return
     *     possible object is
     *     {@link RateItemAction }
     *     
     */
    public RateItemAction getRateItemAction() {
        return rateItemAction;
    }

    /**
     * Sets the value of the rateItemAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateItemAction }
     *     
     */
    public void setRateItemAction(RateItemAction value) {
        this.rateItemAction = value;
    }

    /**
     * Gets the value of the successMessageStringId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessMessageStringId() {
        return successMessageStringId;
    }

    /**
     * Sets the value of the successMessageStringId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessMessageStringId(String value) {
        this.successMessageStringId = value;
    }

    /**
     * Gets the value of the failureMessageStringId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureMessageStringId() {
        return failureMessageStringId;
    }

    /**
     * Sets the value of the failureMessageStringId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureMessageStringId(String value) {
        this.failureMessageStringId = value;
    }

}
