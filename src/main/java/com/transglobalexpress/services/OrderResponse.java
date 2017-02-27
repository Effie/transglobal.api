
package com.transglobalexpress.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessingError" type="{http://services.transglobalexpress.co.uk/}ErrorDocument" minOccurs="0"/&gt;
 *         &lt;element name="BookingReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CollectionAirWaybill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CollectionAirWaybillUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CollectionThermalLabelAirWaybillUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCollectionAirwayBillAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AirwayBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AirwayBillUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThermalLabelAirwayBillUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackingListUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAirwayBillAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OrderLog" type="{http://services.transglobalexpress.co.uk/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="P3TrackingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P3CollectionTrackingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderResponse", propOrder = {
    "processingError",
    "bookingReference",
    "collectionAirWaybill",
    "collectionAirWaybillUrl",
    "collectionThermalLabelAirWaybillUrl",
    "isCollectionAirwayBillAvailable",
    "airwayBill",
    "airwayBillUrl",
    "thermalLabelAirwayBillUrl",
    "packingListUrl",
    "isAirwayBillAvailable",
    "orderLog",
    "p3TrackingUrl",
    "p3CollectionTrackingUrl"
})
public class OrderResponse {

    @XmlElement(name = "ProcessingError")
    protected ErrorDocument processingError;
    @XmlElement(name = "BookingReference")
    protected String bookingReference;
    @XmlElement(name = "CollectionAirWaybill")
    protected String collectionAirWaybill;
    @XmlElement(name = "CollectionAirWaybillUrl")
    protected String collectionAirWaybillUrl;
    @XmlElement(name = "CollectionThermalLabelAirWaybillUrl")
    protected String collectionThermalLabelAirWaybillUrl;
    @XmlElement(name = "IsCollectionAirwayBillAvailable", required = true, type = Boolean.class, nillable = true)
    protected Boolean isCollectionAirwayBillAvailable;
    @XmlElement(name = "AirwayBill")
    protected String airwayBill;
    @XmlElement(name = "AirwayBillUrl")
    protected String airwayBillUrl;
    @XmlElement(name = "ThermalLabelAirwayBillUrl")
    protected String thermalLabelAirwayBillUrl;
    @XmlElement(name = "PackingListUrl")
    protected String packingListUrl;
    @XmlElement(name = "IsAirwayBillAvailable")
    protected boolean isAirwayBillAvailable;
    @XmlElement(name = "OrderLog")
    protected ArrayOfString orderLog;
    @XmlElement(name = "P3TrackingUrl")
    protected String p3TrackingUrl;
    @XmlElement(name = "P3CollectionTrackingUrl")
    protected String p3CollectionTrackingUrl;

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
     * Gets the value of the bookingReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingReference() {
        return bookingReference;
    }

    /**
     * Sets the value of the bookingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingReference(String value) {
        this.bookingReference = value;
    }

    /**
     * Gets the value of the collectionAirWaybill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionAirWaybill() {
        return collectionAirWaybill;
    }

    /**
     * Sets the value of the collectionAirWaybill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionAirWaybill(String value) {
        this.collectionAirWaybill = value;
    }

    /**
     * Gets the value of the collectionAirWaybillUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionAirWaybillUrl() {
        return collectionAirWaybillUrl;
    }

    /**
     * Sets the value of the collectionAirWaybillUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionAirWaybillUrl(String value) {
        this.collectionAirWaybillUrl = value;
    }

    /**
     * Gets the value of the collectionThermalLabelAirWaybillUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionThermalLabelAirWaybillUrl() {
        return collectionThermalLabelAirWaybillUrl;
    }

    /**
     * Sets the value of the collectionThermalLabelAirWaybillUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionThermalLabelAirWaybillUrl(String value) {
        this.collectionThermalLabelAirWaybillUrl = value;
    }

    /**
     * Gets the value of the isCollectionAirwayBillAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCollectionAirwayBillAvailable() {
        return isCollectionAirwayBillAvailable;
    }

    /**
     * Sets the value of the isCollectionAirwayBillAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCollectionAirwayBillAvailable(Boolean value) {
        this.isCollectionAirwayBillAvailable = value;
    }

    /**
     * Gets the value of the airwayBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirwayBill() {
        return airwayBill;
    }

    /**
     * Sets the value of the airwayBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirwayBill(String value) {
        this.airwayBill = value;
    }

    /**
     * Gets the value of the airwayBillUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirwayBillUrl() {
        return airwayBillUrl;
    }

    /**
     * Sets the value of the airwayBillUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirwayBillUrl(String value) {
        this.airwayBillUrl = value;
    }

    /**
     * Gets the value of the thermalLabelAirwayBillUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThermalLabelAirwayBillUrl() {
        return thermalLabelAirwayBillUrl;
    }

    /**
     * Sets the value of the thermalLabelAirwayBillUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThermalLabelAirwayBillUrl(String value) {
        this.thermalLabelAirwayBillUrl = value;
    }

    /**
     * Gets the value of the packingListUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingListUrl() {
        return packingListUrl;
    }

    /**
     * Sets the value of the packingListUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingListUrl(String value) {
        this.packingListUrl = value;
    }

    /**
     * Gets the value of the isAirwayBillAvailable property.
     * 
     */
    public boolean isIsAirwayBillAvailable() {
        return isAirwayBillAvailable;
    }

    /**
     * Sets the value of the isAirwayBillAvailable property.
     * 
     */
    public void setIsAirwayBillAvailable(boolean value) {
        this.isAirwayBillAvailable = value;
    }

    /**
     * Gets the value of the orderLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getOrderLog() {
        return orderLog;
    }

    /**
     * Sets the value of the orderLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setOrderLog(ArrayOfString value) {
        this.orderLog = value;
    }

    /**
     * Gets the value of the p3TrackingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP3TrackingUrl() {
        return p3TrackingUrl;
    }

    /**
     * Sets the value of the p3TrackingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP3TrackingUrl(String value) {
        this.p3TrackingUrl = value;
    }

    /**
     * Gets the value of the p3CollectionTrackingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP3CollectionTrackingUrl() {
        return p3CollectionTrackingUrl;
    }

    /**
     * Sets the value of the p3CollectionTrackingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP3CollectionTrackingUrl(String value) {
        this.p3CollectionTrackingUrl = value;
    }

}
