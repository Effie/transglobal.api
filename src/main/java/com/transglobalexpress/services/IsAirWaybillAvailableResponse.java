
package com.transglobalexpress.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsAirWaybillAvailableResult" type="{http://services.transglobalexpress.co.uk/}AirWaybillAvailableResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isAirWaybillAvailableResult"
})
@XmlRootElement(name = "IsAirWaybillAvailableResponse")
public class IsAirWaybillAvailableResponse {

    @XmlElement(name = "IsAirWaybillAvailableResult")
    protected AirWaybillAvailableResponse isAirWaybillAvailableResult;

    /**
     * Gets the value of the isAirWaybillAvailableResult property.
     * 
     * @return
     *     possible object is
     *     {@link AirWaybillAvailableResponse }
     *     
     */
    public AirWaybillAvailableResponse getIsAirWaybillAvailableResult() {
        return isAirWaybillAvailableResult;
    }

    /**
     * Sets the value of the isAirWaybillAvailableResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirWaybillAvailableResponse }
     *     
     */
    public void setIsAirWaybillAvailableResult(AirWaybillAvailableResponse value) {
        this.isAirWaybillAvailableResult = value;
    }

}
