//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für DocumentQualifierEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentQualifierEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SaleReceipt"/>
 *     &lt;enumeration value="CashierReceipt"/>
 *     &lt;enumeration value="CustomerReceipt"/>
 *     &lt;enumeration value="Document"/>
 *     &lt;enumeration value="Voucher"/>
 *     &lt;enumeration value="Journal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum DocumentQualifierEnumeration {
    /**
     * Where the POI system print the Sale receipt when requested by
     * 						the Sale Terminal.
     *
     */
    
    SALE_RECEIPT("SaleReceipt"),
    /**
     * Where the Sale system print the Cashier copy of the Payment
     * 						receipt when requested by the POI Terminal.
     *
     */
    
    CASHIER_RECEIPT("CashierReceipt"),
    /**
     * Where you print the Customer Payment receipt that could be
     * 						located on the Sale Terminal or in some cases a restricted Customer Sale
     * 						ticket on the POI Terminal.
     *
     */
    
    CUSTOMER_RECEIPT("CustomerReceipt"),
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
    
    VOUCHER("Voucher"),
    /**
     * When the POI or the Sale System wants to store a message on
     * 						the journal printer or electronic journal of the Sale Terminal (it is
     * 						sometimes a Sale
     *
     */
    
    JOURNAL("Journal");
    private final String value;
    DocumentQualifierEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static DocumentQualifierEnumeration fromValue(String v) {
        for (DocumentQualifierEnumeration c: DocumentQualifierEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
