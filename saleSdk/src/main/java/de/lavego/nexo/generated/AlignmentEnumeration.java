//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
/**
 * <p>Java-Klasse für AlignmentEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AlignmentEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Left"/>
 *     &lt;enumeration value="Right"/>
 *     &lt;enumeration value="Centred"/>
 *     &lt;enumeration value="Justified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum AlignmentEnumeration {
    
    LEFT("Left"),
    RIGHT("Right"),
    CENTRED("Centred"),
    JUSTIFIED("Justified");
    private final String value;
    AlignmentEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static AlignmentEnumeration fromValue(String v) {
        for (AlignmentEnumeration c: AlignmentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
