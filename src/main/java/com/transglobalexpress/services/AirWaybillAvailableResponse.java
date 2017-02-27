
package com.transglobalexpress.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirWaybillAvailableResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirWaybillAvailableResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessingError" type="{http://services.transglobalexpress.co.uk/}ErrorDocument" minOccurs="0"/&gt;
 *         &lt;element name="IsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirWaybillAvailableResponse", propOrder = {
    "processingError",
    "isAvailable"
})
public class AirWaybillAvailableResponse {

    @XmlElement(name = "ProcessingError")
    protected ErrorDocument processingError;
    @XmlElement(name = "IsAvailable")
    protected boolean isAvailable;

    /**
     * Gets the value of the processingError property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorDocument }
     *     
     */
    public ErrorDocument getProcessingError() {
        return processingError;
    }

    /**
     * Sets the value of the processingError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDocument }
     *     
     */
    public void setProcessingError(ErrorDocument value) {
        this.processingError = value;
    }

    /**
     * Gets the value of the isAvailable property.
     * 
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     */
    public void setIsAvailable(boolean value) {
        this.isAvailable = value;
    }

}
