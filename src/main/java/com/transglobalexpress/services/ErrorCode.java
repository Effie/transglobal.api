
package com.transglobalexpress.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Generic"/&gt;
 *     &lt;enumeration value="InvalidApiKey"/&gt;
 *     &lt;enumeration value="UnknownAccount"/&gt;
 *     &lt;enumeration value="CreditLimitReached"/&gt;
 *     &lt;enumeration value="CollectionAddressError"/&gt;
 *     &lt;enumeration value="DestinationAddressError"/&gt;
 *     &lt;enumeration value="PackingListError"/&gt;
 *     &lt;enumeration value="CollectionDateError"/&gt;
 *     &lt;enumeration value="DestinationDateError"/&gt;
 *     &lt;enumeration value="UnknownCollectionCountryIso"/&gt;
 *     &lt;enumeration value="UnknownDestinationCountryIso"/&gt;
 *     &lt;enumeration value="UnknownOrderReference"/&gt;
 *     &lt;enumeration value="UnknownService"/&gt;
 *     &lt;enumeration value="InvalidAccountForOrder"/&gt;
 *     &lt;enumeration value="CarrierError"/&gt;
 *     &lt;enumeration value="AccountBlockedOrSuspended"/&gt;
 *     &lt;enumeration value="CalculateInsurance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorCode")
@XmlEnum
public enum ErrorCode {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Generic")
    GENERIC("Generic"),
    @XmlEnumValue("InvalidApiKey")
    INVALID_API_KEY("InvalidApiKey"),
    @XmlEnumValue("UnknownAccount")
    UNKNOWN_ACCOUNT("UnknownAccount"),
    @XmlEnumValue("CreditLimitReached")
    CREDIT_LIMIT_REACHED("CreditLimitReached"),
    @XmlEnumValue("CollectionAddressError")
    COLLECTION_ADDRESS_ERROR("CollectionAddressError"),
    @XmlEnumValue("DestinationAddressError")
    DESTINATION_ADDRESS_ERROR("DestinationAddressError"),
    @XmlEnumValue("PackingListError")
    PACKING_LIST_ERROR("PackingListError"),
    @XmlEnumValue("CollectionDateError")
    COLLECTION_DATE_ERROR("CollectionDateError"),
    @XmlEnumValue("DestinationDateError")
    DESTINATION_DATE_ERROR("DestinationDateError"),
    @XmlEnumValue("UnknownCollectionCountryIso")
    UNKNOWN_COLLECTION_COUNTRY_ISO("UnknownCollectionCountryIso"),
    @XmlEnumValue("UnknownDestinationCountryIso")
    UNKNOWN_DESTINATION_COUNTRY_ISO("UnknownDestinationCountryIso"),
    @XmlEnumValue("UnknownOrderReference")
    UNKNOWN_ORDER_REFERENCE("UnknownOrderReference"),
    @XmlEnumValue("UnknownService")
    UNKNOWN_SERVICE("UnknownService"),
    @XmlEnumValue("InvalidAccountForOrder")
    INVALID_ACCOUNT_FOR_ORDER("InvalidAccountForOrder"),
    @XmlEnumValue("CarrierError")
    CARRIER_ERROR("CarrierError"),
    @XmlEnumValue("AccountBlockedOrSuspended")
    ACCOUNT_BLOCKED_OR_SUSPENDED("AccountBlockedOrSuspended"),
    @XmlEnumValue("CalculateInsurance")
    CALCULATE_INSURANCE("CalculateInsurance");
    private final String value;

    ErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCode fromValue(String v) {
        for (ErrorCode c: ErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
