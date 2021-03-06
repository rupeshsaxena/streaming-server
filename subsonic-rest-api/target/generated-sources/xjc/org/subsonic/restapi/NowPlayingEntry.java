//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.17 at 01:58:35 PM IST 
//


package org.subsonic.restapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NowPlayingEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NowPlayingEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://subsonic.org/restapi}Child"&gt;
 *       &lt;attribute name="username" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="minutesAgo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="playerId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="playerName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NowPlayingEntry")
public class NowPlayingEntry
    extends Child
{

    @XmlAttribute(name = "username", required = true)
    protected String username;
    @XmlAttribute(name = "minutesAgo", required = true)
    protected int minutesAgo;
    @XmlAttribute(name = "playerId", required = true)
    protected int playerId;
    @XmlAttribute(name = "playerName")
    protected String playerName;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the minutesAgo property.
     * 
     */
    public int getMinutesAgo() {
        return minutesAgo;
    }

    /**
     * Sets the value of the minutesAgo property.
     * 
     */
    public void setMinutesAgo(int value) {
        this.minutesAgo = value;
    }

    /**
     * Gets the value of the playerId property.
     * 
     */
    public int getPlayerId() {
        return playerId;
    }

    /**
     * Sets the value of the playerId property.
     * 
     */
    public void setPlayerId(int value) {
        this.playerId = value;
    }

    /**
     * Gets the value of the playerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Sets the value of the playerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerName(String value) {
        this.playerName = value;
    }

}
