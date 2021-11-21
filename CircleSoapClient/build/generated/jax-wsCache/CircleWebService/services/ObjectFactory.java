
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Calcirclearea_QNAME = new QName("http://Services/", "calcirclearea");
    private final static QName _CalcircleareaResponse_QNAME = new QName("http://Services/", "calcircleareaResponse");
    private final static QName _Calcircumference_QNAME = new QName("http://Services/", "calcircumference");
    private final static QName _CalcircumferenceResponse_QNAME = new QName("http://Services/", "calcircumferenceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Calcirclearea }
     * 
     */
    public Calcirclearea createCalcirclearea() {
        return new Calcirclearea();
    }

    /**
     * Create an instance of {@link CalcircleareaResponse }
     * 
     */
    public CalcircleareaResponse createCalcircleareaResponse() {
        return new CalcircleareaResponse();
    }

    /**
     * Create an instance of {@link Calcircumference }
     * 
     */
    public Calcircumference createCalcircumference() {
        return new Calcircumference();
    }

    /**
     * Create an instance of {@link CalcircumferenceResponse }
     * 
     */
    public CalcircumferenceResponse createCalcircumferenceResponse() {
        return new CalcircumferenceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calcirclearea }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Calcirclearea }{@code >}
     */
    @XmlElementDecl(namespace = "http://Services/", name = "calcirclearea")
    public JAXBElement<Calcirclearea> createCalcirclearea(Calcirclearea value) {
        return new JAXBElement<Calcirclearea>(_Calcirclearea_QNAME, Calcirclearea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcircleareaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcircleareaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Services/", name = "calcircleareaResponse")
    public JAXBElement<CalcircleareaResponse> createCalcircleareaResponse(CalcircleareaResponse value) {
        return new JAXBElement<CalcircleareaResponse>(_CalcircleareaResponse_QNAME, CalcircleareaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calcircumference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Calcircumference }{@code >}
     */
    @XmlElementDecl(namespace = "http://Services/", name = "calcircumference")
    public JAXBElement<Calcircumference> createCalcircumference(Calcircumference value) {
        return new JAXBElement<Calcircumference>(_Calcircumference_QNAME, Calcircumference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcircumferenceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcircumferenceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Services/", name = "calcircumferenceResponse")
    public JAXBElement<CalcircumferenceResponse> createCalcircumferenceResponse(CalcircumferenceResponse value) {
        return new JAXBElement<CalcircumferenceResponse>(_CalcircumferenceResponse_QNAME, CalcircumferenceResponse.class, null, value);
    }

}
