
package com.example;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _GetFacilityResponse_QNAME = new QName("http://example.com/", "getFacilityResponse");
    private final static QName _Facility_QNAME = new QName("http://example.com/", "facility");
    private final static QName _GetFacility_QNAME = new QName("http://example.com/", "getFacility");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFacility }
     * 
     */
    public GetFacility createGetFacility() {
        return new GetFacility();
    }

    /**
     * Create an instance of {@link Facility }
     * 
     */
    public Facility createFacility() {
        return new Facility();
    }

    /**
     * Create an instance of {@link GetFacilityResponse }
     * 
     */
    public GetFacilityResponse createGetFacilityResponse() {
        return new GetFacilityResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "getFacilityResponse")
    public JAXBElement<GetFacilityResponse> createGetFacilityResponse(GetFacilityResponse value) {
        return new JAXBElement<GetFacilityResponse>(_GetFacilityResponse_QNAME, GetFacilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "facility")
    public JAXBElement<Facility> createFacility(Facility value) {
        return new JAXBElement<Facility>(_Facility_QNAME, Facility.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "getFacility")
    public JAXBElement<GetFacility> createGetFacility(GetFacility value) {
        return new JAXBElement<GetFacility>(_GetFacility_QNAME, GetFacility.class, null, value);
    }

}
