
package com.sonos.services._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="itemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="artist"/&gt;
 *     &lt;enumeration value="album"/&gt;
 *     &lt;enumeration value="genre"/&gt;
 *     &lt;enumeration value="playlist"/&gt;
 *     &lt;enumeration value="track"/&gt;
 *     &lt;enumeration value="search"/&gt;
 *     &lt;enumeration value="stream"/&gt;
 *     &lt;enumeration value="show"/&gt;
 *     &lt;enumeration value="program"/&gt;
 *     &lt;enumeration value="favorites"/&gt;
 *     &lt;enumeration value="favorite"/&gt;
 *     &lt;enumeration value="collection"/&gt;
 *     &lt;enumeration value="container"/&gt;
 *     &lt;enumeration value="albumList"/&gt;
 *     &lt;enumeration value="trackList"/&gt;
 *     &lt;enumeration value="streamList"/&gt;
 *     &lt;enumeration value="artistTrackList"/&gt;
 *     &lt;enumeration value="audiobook"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "itemType")
@XmlEnum
public enum ItemType {

    @XmlEnumValue("artist")
    ARTIST("artist"),
    @XmlEnumValue("album")
    ALBUM("album"),
    @XmlEnumValue("genre")
    GENRE("genre"),
    @XmlEnumValue("playlist")
    PLAYLIST("playlist"),
    @XmlEnumValue("track")
    TRACK("track"),
    @XmlEnumValue("search")
    SEARCH("search"),
    @XmlEnumValue("stream")
    STREAM("stream"),
    @XmlEnumValue("show")
    SHOW("show"),
    @XmlEnumValue("program")
    PROGRAM("program"),
    @XmlEnumValue("favorites")
    FAVORITES("favorites"),
    @XmlEnumValue("favorite")
    FAVORITE("favorite"),
    @XmlEnumValue("collection")
    COLLECTION("collection"),
    @XmlEnumValue("container")
    CONTAINER("container"),
    @XmlEnumValue("albumList")
    ALBUM_LIST("albumList"),
    @XmlEnumValue("trackList")
    TRACK_LIST("trackList"),
    @XmlEnumValue("streamList")
    STREAM_LIST("streamList"),
    @XmlEnumValue("artistTrackList")
    ARTIST_TRACK_LIST("artistTrackList"),
    @XmlEnumValue("audiobook")
    AUDIOBOOK("audiobook"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemType fromValue(String v) {
        for (ItemType c: ItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
