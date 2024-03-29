//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für POICapabilitiesEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="POICapabilitiesEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CashierDisplay"/>
 *     &lt;enumeration value="CashierError"/>
 *     &lt;enumeration value="CashierInput"/>
 *     &lt;enumeration value="CustomerDisplay"/>
 *     &lt;enumeration value="CustomerError"/>
 *     &lt;enumeration value="CustomerInput"/>
 *     &lt;enumeration value="PrinterReceipt"/>
 *     &lt;enumeration value="PrinterDocument"/>
 *     &lt;enumeration value="PrinterVoucher"/>
 *     &lt;enumeration value="MagStripe"/>
 *     &lt;enumeration value="ICC"/>
 *     &lt;enumeration value="EMVContactless"/>
 *     &lt;enumeration value="CashHandling"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum POICapabilitiesEnumeration {
    /**
     * Used by the Sale System when the device is managed by the POI
     * 						Terminal, to ask question or display some information to the
     * 						Cashier.
     *
     */
    
    CASHIER_DISPLAY("CashierDisplay"),
    /**
     * To display to the Cashier information is related to an error
     * 						situation occurring on the Sale Terminal when the device is managed by the
     * 						POI Terminal.
     *
     */
    
    CASHIER_ERROR("CashierError"),
    /**
     * Any kind of keyboard allowing all or part of the commands of
     * 						the Input message request from the POI System to the Sale System
     * 						(InputCommand data element). The
     *
     */
    
    CASHIER_INPUT("CashierInput"),
    /**
     * Standard Customer display interface used by the Sale System to
     * 						ask question, or to show information to the Customer outside a Service
     * 						dialogue.
     *
     */
    
    CUSTOMER_DISPLAY("CustomerDisplay"),
    /**
     * To display to the Customer information is related to an error
     * 						situation occurring on the Sale Terminal during a Sale
     * 						transaction.
     *
     */
    
    CUSTOMER_ERROR("CustomerError"),
    /**
     * Any kind of keyboard allowing all or part of the commands of
     * 						the Input message request from the POI System to the Sale System
     * 						(InputCommand data element). The
     *
     */
    
    CUSTOMER_INPUT("CustomerInput"),
    /**
     * Printer for the Sale receipt.
     *
     */
    
    PRINTER_RECEIPT("PrinterReceipt"),
    /**
     * When the Sale System wants to print specific document (check,
     * 						dynamic currency conversion ...).
     *
     */
    
    PRINTER_DOCUMENT("PrinterDocument"),
    /**
     * Coupons, voucher or special ticket generated by the Sale
     * 						System and to be printed.
     *
     */
    
    PRINTER_VOUCHER("PrinterVoucher"),
    /**
     * Magnetic stripe card reader
     *
     */
    
    MAG_STRIPE("MagStripe"),
    /**
     * Contact ICC card reader
     *
     */
    ICC("ICC"),
    /**
     * Contactless card reader with EMV
     * 						applications
     *
     */
    
    EMV_CONTACTLESS("EMVContactless"),
    /**
     * Device which performs cash change, cash dispense or cash
     * 						acceptance.
     *
     */
    
    CASH_HANDLING("CashHandling");
    private final String value;
    POICapabilitiesEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static POICapabilitiesEnumeration fromValue(String v) {
        for (POICapabilitiesEnumeration c: POICapabilitiesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
