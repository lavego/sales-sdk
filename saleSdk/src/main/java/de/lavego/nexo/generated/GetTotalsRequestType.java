//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition: Content of the Get Totals Request message. -- Usage: It
 * 				conveys information from the Sale System related to the scope and the format of the
 * 				totals to be computed by the POI System.
 *
 * <p>Java-Klasse für GetTotalsRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GetTotalsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalDetails" type="{}TotalDetailsType" minOccurs="0"/>
 *         &lt;element name="TotalFilter" type="{}TotalFilterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class GetTotalsRequestType {
    @ElementList(name = "TotalDetails", required = false)
    protected List<String> totalDetails;
    @Element(name = "TotalFilter", required = false)
    protected TotalFilterType totalFilter;
    /**
     * Gets the value of the totalDetails property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalDetails property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalDetails().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getTotalDetails() {
        if (totalDetails == null) {
            totalDetails = new ArrayList<String>();
        }
        return this.totalDetails;
    }
    /**
     * Ruft den Wert der totalFilter-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TotalFilterType }
     *
     */
    public TotalFilterType getTotalFilter() {
        return totalFilter;
    }
    /**
     * Legt den Wert der totalFilter-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TotalFilterType }
     *
     */
    public void setTotalFilter(TotalFilterType value) {
        this.totalFilter = value;
    }
}
