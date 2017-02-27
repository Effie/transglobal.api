
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
 *         &lt;element name="QuoteConsignmentResult" type="{http://services.transglobalexpress.co.uk/}QuoteResponse" minOccurs="0"/&gt;
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
    "quoteConsignmentResult"
})
@XmlRootElement(name = "QuoteConsignmentResponse")
public class QuoteConsignmentResponse {

    @XmlElement(name = "QuoteConsignmentResult")
    protected QuoteResponse quoteConsignmentResult;

    /**
     * Gets the value of the quoteConsignmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteResponse }
     *     
     */
    public QuoteResponse getQuoteConsignmentResult() {
        return quoteConsignmentResult;
    }

    /**
     * Sets the value of the quoteConsignmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteResponse }
     *     
     */
    public void setQuoteConsignmentResult(QuoteResponse value) {
        this.quoteConsignmentResult = value;
    }

}
