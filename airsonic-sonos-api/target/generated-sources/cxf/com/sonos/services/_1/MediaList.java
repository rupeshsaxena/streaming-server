
package com.sonos.services._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mediaList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="positionInformation" type="{http://www.sonos.com/Services/1.1}positionInformation" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="mediaCollection" type="{http://www.sonos.com/Services/1.1}mediaCollection"/&gt;
 *           &lt;element name="mediaMetadata" type="{http://www.sonos.com/Services/1.1}mediaMetadata"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mediaList", propOrder = {
    "index",
    "count",
    "total",
    "positionInformation",
    "mediaCollectionOrMediaMetadata"
})
public class MediaList {

    protected int index;
    protected int count;
    protected int total;
    protected PositionInformation positionInformation;
    @XmlElements({
        @XmlElement(name = "mediaCollection", type = MediaCollection.class),
        @XmlElement(name = "mediaMetadata", type = MediaMetadata.class)
    })
    protected List<AbstractMedia> mediaCollectionOrMediaMetadata;

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Gets the value of the positionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PositionInformation }
     *     
     */
    public PositionInformation getPositionInformation() {
        return positionInformation;
    }

    /**
     * Sets the value of the positionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionInformation }
     *     
     */
    public void setPositionInformation(PositionInformation value) {
        this.positionInformation = value;
    }

    /**
     * Gets the value of the mediaCollectionOrMediaMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaCollectionOrMediaMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaCollectionOrMediaMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaCollection }
     * {@link MediaMetadata }
     * 
     * 
     */
    public List<AbstractMedia> getMediaCollectionOrMediaMetadata() {
        if (mediaCollectionOrMediaMetadata == null) {
            mediaCollectionOrMediaMetadata = new ArrayList<AbstractMedia>();
        }
        return this.mediaCollectionOrMediaMetadata;
    }

}
