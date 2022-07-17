
package com.sonos.services._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for encryptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="encryptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="AES-ECB"/&gt;
 *     &lt;enumeration value="AES-CBC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "encryptionType")
@XmlEnum
public enum EncryptionType {

    NONE("NONE"),
    @XmlEnumValue("AES-ECB")
    AES_ECB("AES-ECB"),
    @XmlEnumValue("AES-CBC")
    AES_CBC("AES-CBC");
    private final String value;

    EncryptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncryptionType fromValue(String v) {
        for (EncryptionType c: EncryptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
