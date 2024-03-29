//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für InfoQualifyEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InfoQualifyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Display"/>
 *     &lt;enumeration value="Sound"/>
 *     &lt;enumeration value="Input"/>
 *     &lt;enumeration value="POIReplication"/>
 *     &lt;enumeration value="CustomerAssistance"/>
 *     &lt;enumeration value="Receipt"/>
 *     &lt;enumeration value="Document"/>
 *     &lt;enumeration value="Voucher"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum InfoQualifyEnumeration {
    /**
     * The information is a new state on which the message sender is
     * 						entering. For instance, during a payment, the POI could display to the
     * 						Cashier that POI request
     *
     */
    
    STATUS("Status"),
    /**
     * The information is related to an error situation occurring on
     * 						the message sender.
     *
     */
    
    ERROR("Error"),
    /**
     * Standard display interface.
     *
     */
    
    DISPLAY("Display"),
    /**
     * Standard sound interface.
     *
     */
    
    SOUND("Sound"),
    /**
     * Answer to a question or information to be entered by the
     * 						Cashier or the Customer, at the request of the POI Terminal or the Sale
     * 						Terminal.
     *
     */
    
    INPUT("Input"),
    /**
     * Information displayed on the Cardholder POI interface,
     * 						replicated on the Cashier interface.
     *
     */
    
    POI_REPLICATION("POIReplication"),
    /**
     * Input of the Cardholder POI interface which can be entered by
     * 						the Cashier to assist the Customer.
     *
     */
    
    CUSTOMER_ASSISTANCE("CustomerAssistance"),
    /**
     * Where you print the Payment receipt that could be located on
     * 						the Sale Terminal or in some cases a restricted Sale ticket on the POI
     * 						Terminal.
     *
     */
    
    RECEIPT("Receipt"),
    /**
     * When the POI System wants to print specific document (check,
     * 						dynamic currency conversion ...). Used by the Sale System when the printer
     * 						is not located on the
     *
     */
    
    DOCUMENT("Document"),
    /**
     * Coupons, voucher or special ticket generated by the POI or the
     * 						Sale System and to be printed.
     *
     */
    
    VOUCHER("Voucher");
    private final String value;
    InfoQualifyEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static InfoQualifyEnumeration fromValue(String v) {
        for (InfoQualifyEnumeration c: InfoQualifyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
