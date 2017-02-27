
package com.transglobalexpress.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQuotePackingListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQuotePackingListItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuotePackingListItem" type="{http://services.transglobalexpress.co.uk/}QuotePackingListItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuotePackingListItem", propOrder = {
    "quotePackingListItem"
})
public class ArrayOfQuotePackingListItem {

    @XmlElement(name = "QuotePackingListItem", nillable = true)
    protected List<QuotePackingListItem> quotePackingListItem;

    /**
     * Gets the value of the quotePackingListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotePackingListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotePackingListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotePackingListItem }
     * 
     * 
     */
    public List<QuotePackingListItem> getQuotePackingListItem() {
        if (quotePackingListItem == null) {
            quotePackingListItem = new ArrayList<QuotePackingListItem>();
        }
        return this.quotePackingListItem;
    }

}
