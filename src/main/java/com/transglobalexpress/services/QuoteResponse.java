
package com.transglobalexpress.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Preamble" type="{http://services.transglobalexpress.co.uk/}CallPreamble" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingError" type="{http://services.transglobalexpress.co.uk/}ErrorDocument" minOccurs="0"/&gt;
 *         &lt;element name="QuoteOptions" type="{http://services.transglobalexpress.co.uk/}ArrayOfQuoteOption" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteResponse", propOrder = {
    "preamble",
    "processingError",
    "quoteOptions"
})
public class QuoteResponse {

    @XmlElement(name = "Preamble")
    protected CallPreamble preamble;
    @XmlElement(name = "ProcessingError")
    protected ErrorDocument processingError;
    @XmlElement(name = "QuoteOptions")
    protected ArrayOfQuoteOption quoteOptions;

    /**
     * Gets the value of the preamble property.
     * 
     * @return
     *     possible object is
     *     {@link CallPreamble }
     *     
     */
    public CallPreamble getPreamble() {
        return preamble;
    }

    /**
     * Sets the value of the preamble property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallPreamble }
     *     
     */
    public void setPreamble(CallPreamble value) {
        this.preamble = value;
    }

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
     * Gets the value of the quoteOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuoteOption }
     *     
     */
    public ArrayOfQuoteOption getQuoteOptions() {
        return quoteOptions;
    }

    /**
     * Sets the value of the quoteOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuoteOption }
     *     
     */
    public void setQuoteOptions(ArrayOfQuoteOption value) {
        this.quoteOptions = value;
    }

}
