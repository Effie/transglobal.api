
package com.transglobalexpress.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="apiKeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quoteId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="deliveryAddress" type="{http://services.transglobalexpress.co.uk/}QuoteAddress" minOccurs="0"/&gt;
 *         &lt;element name="collectionAddress" type="{http://services.transglobalexpress.co.uk/}QuoteAddress" minOccurs="0"/&gt;
 *         &lt;element name="packingList" type="{http://services.transglobalexpress.co.uk/}ArrayOfQuotePackingListItem" minOccurs="0"/&gt;
 *         &lt;element name="consignmentSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consignmentValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="vatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eoriNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="skippingPackingList" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="collectionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="collectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="requiredCover" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="failOnCarrierError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "apiKeyId",
    "quoteId",
    "serviceId",
    "deliveryAddress",
    "collectionAddress",
    "packingList",
    "consignmentSummary",
    "consignmentValue",
    "vatNumber",
    "eoriNumber",
    "purchaseOrderNumber",
    "skippingPackingList",
    "collectionRequired",
    "collectionDate",
    "requiredCover",
    "failOnCarrierError"
})
@XmlRootElement(name = "BookQuote")
public class BookQuote {

    protected String apiKeyId;
    protected int quoteId;
    protected int serviceId;
    protected QuoteAddress deliveryAddress;
    protected QuoteAddress collectionAddress;
    protected ArrayOfQuotePackingListItem packingList;
    protected String consignmentSummary;
    @XmlElement(required = true)
    protected BigDecimal consignmentValue;
    protected String vatNumber;
    protected String eoriNumber;
    protected String purchaseOrderNumber;
    protected boolean skippingPackingList;
    protected boolean collectionRequired;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectionDate;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal requiredCover;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean failOnCarrierError;

    /**
     * Gets the value of the apiKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKeyId() {
        return apiKeyId;
    }

    /**
     * Sets the value of the apiKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKeyId(String value) {
        this.apiKeyId = value;
    }

    /**
     * Gets the value of the quoteId property.
     * 
     */
    public int getQuoteId() {
        return quoteId;
    }

    /**
     * Sets the value of the quoteId property.
     * 
     */
    public void setQuoteId(int value) {
        this.quoteId = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     */
    public void setServiceId(int value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteAddress }
     *     
     */
    public QuoteAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteAddress }
     *     
     */
    public void setDeliveryAddress(QuoteAddress value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the collectionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteAddress }
     *     
     */
    public QuoteAddress getCollectionAddress() {
        return collectionAddress;
    }

    /**
     * Sets the value of the collectionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteAddress }
     *     
     */
    public void setCollectionAddress(QuoteAddress value) {
        this.collectionAddress = value;
    }

    /**
     * Gets the value of the packingList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuotePackingListItem }
     *     
     */
    public ArrayOfQuotePackingListItem getPackingList() {
        return packingList;
    }

    /**
     * Sets the value of the packingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuotePackingListItem }
     *     
     */
    public void setPackingList(ArrayOfQuotePackingListItem value) {
        this.packingList = value;
    }

    /**
     * Gets the value of the consignmentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignmentSummary() {
        return consignmentSummary;
    }

    /**
     * Sets the value of the consignmentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignmentSummary(String value) {
        this.consignmentSummary = value;
    }

    /**
     * Gets the value of the consignmentValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsignmentValue() {
        return consignmentValue;
    }

    /**
     * Sets the value of the consignmentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsignmentValue(BigDecimal value) {
        this.consignmentValue = value;
    }

    /**
     * Gets the value of the vatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * Sets the value of the vatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
    }

    /**
     * Gets the value of the eoriNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEoriNumber() {
        return eoriNumber;
    }

    /**
     * Sets the value of the eoriNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEoriNumber(String value) {
        this.eoriNumber = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNumber(String value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the skippingPackingList property.
     * 
     */
    public boolean isSkippingPackingList() {
        return skippingPackingList;
    }

    /**
     * Sets the value of the skippingPackingList property.
     * 
     */
    public void setSkippingPackingList(boolean value) {
        this.skippingPackingList = value;
    }

    /**
     * Gets the value of the collectionRequired property.
     * 
     */
    public boolean isCollectionRequired() {
        return collectionRequired;
    }

    /**
     * Sets the value of the collectionRequired property.
     * 
     */
    public void setCollectionRequired(boolean value) {
        this.collectionRequired = value;
    }

    /**
     * Gets the value of the collectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectionDate() {
        return collectionDate;
    }

    /**
     * Sets the value of the collectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectionDate(XMLGregorianCalendar value) {
        this.collectionDate = value;
    }

    /**
     * Gets the value of the requiredCover property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequiredCover() {
        return requiredCover;
    }

    /**
     * Sets the value of the requiredCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequiredCover(BigDecimal value) {
        this.requiredCover = value;
    }

    /**
     * Gets the value of the failOnCarrierError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailOnCarrierError() {
        return failOnCarrierError;
    }

    /**
     * Sets the value of the failOnCarrierError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailOnCarrierError(Boolean value) {
        this.failOnCarrierError = value;
    }

}
