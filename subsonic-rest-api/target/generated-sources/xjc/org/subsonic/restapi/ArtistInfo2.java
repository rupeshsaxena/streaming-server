//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.17 at 01:58:35 PM IST 
//


package org.subsonic.restapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArtistInfo2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArtistInfo2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://subsonic.org/restapi}ArtistInfoBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="similarArtist" type="{http://subsonic.org/restapi}ArtistID3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArtistInfo2", propOrder = {
    "similarArtist"
})
public class ArtistInfo2
    extends ArtistInfoBase
{

    protected List<ArtistID3> similarArtist;

    /**
     * Gets the value of the similarArtist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the similarArtist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimilarArtist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtistID3 }
     * 
     * 
     */
    public List<ArtistID3> getSimilarArtist() {
        if (similarArtist == null) {
            similarArtist = new ArrayList<ArtistID3>();
        }
        return this.similarArtist;
    }

}
