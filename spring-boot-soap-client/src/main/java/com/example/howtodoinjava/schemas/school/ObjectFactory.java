//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.03 at 05:56:47 PM IST 
//


package com.example.howtodoinjava.schemas.school;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.howtodoinjava.schemas.school package. 
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

    private final static QName _GetMCMPStatus_QNAME = new QName("http://xmlns3.bayer.com/ProcessedMCMPService", "getMCMPStatus");
    private final static QName _GetMCMPStatusResponse_QNAME = new QName("http://xmlns3.bayer.com/ProcessedMCMPService", "getMCMPStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.howtodoinjava.schemas.school
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMCMPStatus }
     * 
     */
    public GetMCMPStatus createGetMCMPStatus() {
        return new GetMCMPStatus();
    }

    /**
     * Create an instance of {@link GetMCMPStatusResponse }
     * 
     */
    public GetMCMPStatusResponse createGetMCMPStatusResponse() {
        return new GetMCMPStatusResponse();
    }

    /**
     * Create an instance of {@link SynapseResponseMessage }
     * 
     */
    public SynapseResponseMessage createSynapseResponseMessage() {
        return new SynapseResponseMessage();
    }

    /**
     * Create an instance of {@link ControlArea }
     * 
     */
    public ControlArea createControlArea() {
        return new ControlArea();
    }

    /**
     * Create an instance of {@link DataArea }
     * 
     */
    public DataArea createDataArea() {
        return new DataArea();
    }

    /**
     * Create an instance of {@link McmpRecord }
     * 
     */
    public McmpRecord createMcmpRecord() {
        return new McmpRecord();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMCMPStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns3.bayer.com/ProcessedMCMPService", name = "getMCMPStatus")
    public JAXBElement<GetMCMPStatus> createGetMCMPStatus(GetMCMPStatus value) {
        return new JAXBElement<GetMCMPStatus>(_GetMCMPStatus_QNAME, GetMCMPStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMCMPStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns3.bayer.com/ProcessedMCMPService", name = "getMCMPStatusResponse")
    public JAXBElement<GetMCMPStatusResponse> createGetMCMPStatusResponse(GetMCMPStatusResponse value) {
        return new JAXBElement<GetMCMPStatusResponse>(_GetMCMPStatusResponse_QNAME, GetMCMPStatusResponse.class, null, value);
    }

}
