
package com.sonos.services._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userAccountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="premium"/&gt;
 *     &lt;enumeration value="trial"/&gt;
 *     &lt;enumeration value="free"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "userAccountType")
@XmlEnum
public enum UserAccountType {

    @XmlEnumValue("premium")
    PREMIUM("premium"),
    @XmlEnumValue("trial")
    TRIAL("trial"),
    @XmlEnumValue("free")
    FREE("free");
    private final String value;

    UserAccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserAccountType fromValue(String v) {
        for (UserAccountType c: UserAccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
