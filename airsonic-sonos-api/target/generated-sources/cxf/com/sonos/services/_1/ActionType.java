
package com.sonos.services._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="openUrl"/&gt;
 *     &lt;enumeration value="simpleHttpRequest"/&gt;
 *     &lt;enumeration value="rateItem"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "actionType")
@XmlEnum
public enum ActionType {

    @XmlEnumValue("openUrl")
    OPEN_URL("openUrl"),
    @XmlEnumValue("simpleHttpRequest")
    SIMPLE_HTTP_REQUEST("simpleHttpRequest"),
    @XmlEnumValue("rateItem")
    RATE_ITEM("rateItem");
    private final String value;

    ActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionType fromValue(String v) {
        for (ActionType c: ActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
