
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
 *         &lt;element name="QuoteSinglePieceResult" type="{http://services.transglobalexpress.co.uk/}QuoteResponse" minOccurs="0"/&gt;
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
    "quoteSinglePieceResult"
})
@XmlRootElement(name = "QuoteSinglePieceResponse")
public class QuoteSinglePieceResponse {

    @XmlElement(name = "QuoteSinglePieceResult")
    protected QuoteResponse quoteSinglePieceResult;

    /**
     * Gets the value of the quoteSinglePieceResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteResponse }
     *     
     */
    public QuoteResponse getQuoteSinglePieceResult() {
        return quoteSinglePieceResult;
    }

    /**
     * Sets the value of the quoteSinglePieceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteResponse }
     *     
     */
    public void setQuoteSinglePieceResult(QuoteResponse value) {
        this.quoteSinglePieceResult = value;
    }

}
