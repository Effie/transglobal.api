
package com.transglobalexpress.services;

import java.math.BigDecimal;
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
 *         &lt;element name="accountKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="heights" type="{http://services.transglobalexpress.co.uk/}ArrayOfDecimal" minOccurs="0"/&gt;
 *         &lt;element name="widths" type="{http://services.transglobalexpress.co.uk/}ArrayOfDecimal" minOccurs="0"/&gt;
 *         &lt;element name="lengths" type="{http://services.transglobalexpress.co.uk/}ArrayOfDecimal" minOccurs="0"/&gt;
 *         &lt;element name="statedWeights" type="{http://services.transglobalexpress.co.uk/}ArrayOfDecimal" minOccurs="0"/&gt;
 *         &lt;element name="dimensionUnits" type="{http://services.transglobalexpress.co.uk/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="weightUnits" type="{http://services.transglobalexpress.co.uk/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="fromCountryIso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toCountryIso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requiredCover" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
    "accountKey",
    "heights",
    "widths",
    "lengths",
    "statedWeights",
    "dimensionUnits",
    "weightUnits",
    "fromCountryIso",
    "fromCity",
    "fromPostcode",
    "toCountryIso",
    "toCity",
    "toPostcode",
    "itemType",
    "requiredCover"
})
@XmlRootElement(name = "QuoteConsignment")
public class QuoteConsignment {

    protected String accountKey;
    protected ArrayOfDecimal heights;
    protected ArrayOfDecimal widths;
    protected ArrayOfDecimal lengths;
    protected ArrayOfDecimal statedWeights;
    protected ArrayOfString dimensionUnits;
    protected ArrayOfString weightUnits;
    protected String fromCountryIso;
    protected String fromCity;
    protected String fromPostcode;
    protected String toCountryIso;
    protected String toCity;
    protected String toPostcode;
    protected String itemType;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal requiredCover;

    /**
     * Gets the value of the accountKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountKey() {
        return accountKey;
    }

    /**
     * Sets the value of the accountKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountKey(String value) {
        this.accountKey = value;
    }

    /**
     * Gets the value of the heights property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public ArrayOfDecimal getHeights() {
        return heights;
    }

    /**
     * Sets the value of the heights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public void setHeights(ArrayOfDecimal value) {
        this.heights = value;
    }

    /**
     * Gets the value of the widths property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public ArrayOfDecimal getWidths() {
        return widths;
    }

    /**
     * Sets the value of the widths property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public void setWidths(ArrayOfDecimal value) {
        this.widths = value;
    }

    /**
     * Gets the value of the lengths property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public ArrayOfDecimal getLengths() {
        return lengths;
    }

    /**
     * Sets the value of the lengths property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public void setLengths(ArrayOfDecimal value) {
        this.lengths = value;
    }

    /**
     * Gets the value of the statedWeights property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public ArrayOfDecimal getStatedWeights() {
        return statedWeights;
    }

    /**
     * Sets the value of the statedWeights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public void setStatedWeights(ArrayOfDecimal value) {
        this.statedWeights = value;
    }

    /**
     * Gets the value of the dimensionUnits property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDimensionUnits() {
        return dimensionUnits;
    }

    /**
     * Sets the value of the dimensionUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDimensionUnits(ArrayOfString value) {
        this.dimensionUnits = value;
    }

    /**
     * Gets the value of the weightUnits property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getWeightUnits() {
        return weightUnits;
    }

    /**
     * Sets the value of the weightUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setWeightUnits(ArrayOfString value) {
        this.weightUnits = value;
    }

    /**
     * Gets the value of the fromCountryIso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCountryIso() {
        return fromCountryIso;
    }

    /**
     * Sets the value of the fromCountryIso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCountryIso(String value) {
        this.fromCountryIso = value;
    }

    /**
     * Gets the value of the fromCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCity() {
        return fromCity;
    }

    /**
     * Sets the value of the fromCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCity(String value) {
        this.fromCity = value;
    }

    /**
     * Gets the value of the fromPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPostcode() {
        return fromPostcode;
    }

    /**
     * Sets the value of the fromPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPostcode(String value) {
        this.fromPostcode = value;
    }

    /**
     * Gets the value of the toCountryIso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountryIso() {
        return toCountryIso;
    }

    /**
     * Sets the value of the toCountryIso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountryIso(String value) {
        this.toCountryIso = value;
    }

    /**
     * Gets the value of the toCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCity() {
        return toCity;
    }

    /**
     * Sets the value of the toCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCity(String value) {
        this.toCity = value;
    }

    /**
     * Gets the value of the toPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPostcode() {
        return toPostcode;
    }

    /**
     * Sets the value of the toPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPostcode(String value) {
        this.toPostcode = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
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

}
