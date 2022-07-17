
package com.sonos.services._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userAccountStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userAccountStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="restricted"/&gt;
 *     &lt;enumeration value="expired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "userAccountStatus")
@XmlEnum
public enum UserAccountStatus {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("restricted")
    RESTRICTED("restricted"),
    @XmlEnumValue("expired")
    EXPIRED("expired");
    private final String value;

    UserAccountStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserAccountStatus fromValue(String v) {
        for (UserAccountStatus c: UserAccountStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
