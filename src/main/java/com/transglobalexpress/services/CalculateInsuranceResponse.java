
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
 *         &lt;element name="CalculateInsuranceResult" type="{http://services.transglobalexpress.co.uk/}QuoteInsuranceResponse" minOccurs="0"/&gt;
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
    "calculateInsuranceResult"
})
@XmlRootElement(name = "CalculateInsuranceResponse")
public class CalculateInsuranceResponse {

    @XmlElement(name = "CalculateInsuranceResult")
    protected QuoteInsuranceResponse calculateInsuranceResult;

    /**
     * Gets the value of the calculateInsuranceResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteInsuranceResponse }
     *     
     */
    public QuoteInsuranceResponse getCalculateInsuranceResult() {
        return calculateInsuranceResult;
    }

    /**
     * Sets the value of the calculateInsuranceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteInsuranceResponse }
     *     
     */
    public void setCalculateInsuranceResult(QuoteInsuranceResponse value) {
        this.calculateInsuranceResult = value;
    }

}
