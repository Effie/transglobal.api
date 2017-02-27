
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
 *         &lt;element name="BookQuoteResult" type="{http://services.transglobalexpress.co.uk/}OrderResponse" minOccurs="0"/&gt;
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
    "bookQuoteResult"
})
@XmlRootElement(name = "BookQuoteResponse")
public class BookQuoteResponse {

    @XmlElement(name = "BookQuoteResult")
    protected OrderResponse bookQuoteResult;

    /**
     * Gets the value of the bookQuoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponse }
     *     
     */
    public OrderResponse getBookQuoteResult() {
        return bookQuoteResult;
    }

    /**
     * Sets the value of the bookQuoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponse }
     *     
     */
    public void setBookQuoteResult(OrderResponse value) {
        this.bookQuoteResult = value;
    }

}
