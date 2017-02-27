
package com.transglobalexpress.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuoteId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChargeableWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransitTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalPackageSurcharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CollectionCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarriageCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResidentialSurcharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxApplicable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteAreaSurcharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteOption", propOrder = {
    "quoteId",
    "serviceId",
    "serviceName",
    "carrierName",
    "chargeableWeight",
    "transitTime",
    "totalPackageSurcharges",
    "collectionCost",
    "carriageCost",
    "residentialSurcharge",
    "taxApplicable",
    "insuranceCost",
    "remoteAreaSurcharge"
})
public class QuoteOption {

    @XmlElement(name = "QuoteId")
    protected int quoteId;
    @XmlElement(name = "ServiceId")
    protected int serviceId;
    @XmlElement(name = "ServiceName")
    protected String serviceName;
    @XmlElement(name = "CarrierName")
    protected String carrierName;
    @XmlElement(name = "ChargeableWeight")
    protected String chargeableWeight;
    @XmlElement(name = "TransitTime")
    protected String transitTime;
    @XmlElement(name = "TotalPackageSurcharges")
    protected String totalPackageSurcharges;
    @XmlElement(name = "CollectionCost")
    protected String collectionCost;
    @XmlElement(name = "CarriageCost")
    protected String carriageCost;
    @XmlElement(name = "ResidentialSurcharge")
    protected String residentialSurcharge;
    @XmlElement(name = "TaxApplicable")
    protected String taxApplicable;
    @XmlElement(name = "InsuranceCost")
    protected String insuranceCost;
    @XmlElement(name = "RemoteAreaSurcharge")
    protected String remoteAreaSurcharge;

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
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the chargeableWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeableWeight() {
        return chargeableWeight;
    }

    /**
     * Sets the value of the chargeableWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeableWeight(String value) {
        this.chargeableWeight = value;
    }

    /**
     * Gets the value of the transitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitTime() {
        return transitTime;
    }

    /**
     * Sets the value of the transitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitTime(String value) {
        this.transitTime = value;
    }

    /**
     * Gets the value of the totalPackageSurcharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPackageSurcharges() {
        return totalPackageSurcharges;
    }

    /**
     * Sets the value of the totalPackageSurcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPackageSurcharges(String value) {
        this.totalPackageSurcharges = value;
    }

    /**
     * Gets the value of the collectionCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionCost() {
        return collectionCost;
    }

    /**
     * Sets the value of the collectionCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionCost(String value) {
        this.collectionCost = value;
    }

    /**
     * Gets the value of the carriageCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarriageCost() {
        return carriageCost;
    }

    /**
     * Sets the value of the carriageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarriageCost(String value) {
        this.carriageCost = value;
    }

    /**
     * Gets the value of the residentialSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialSurcharge() {
        return residentialSurcharge;
    }

    /**
     * Sets the value of the residentialSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialSurcharge(String value) {
        this.residentialSurcharge = value;
    }

    /**
     * Gets the value of the taxApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxApplicable() {
        return taxApplicable;
    }

    /**
     * Sets the value of the taxApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxApplicable(String value) {
        this.taxApplicable = value;
    }

    /**
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCost(String value) {
        this.insuranceCost = value;
    }

    /**
     * Gets the value of the remoteAreaSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteAreaSurcharge() {
        return remoteAreaSurcharge;
    }

    /**
     * Sets the value of the remoteAreaSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteAreaSurcharge(String value) {
        this.remoteAreaSurcharge = value;
    }

}
