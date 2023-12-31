
package com.sbc.mycalculator;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MyCalculatorService", targetNamespace = "http://MyCalculator.sbc.com/", wsdlLocation = "http://localhost:8080/calculator?wsdl")
public class MyCalculatorService
    extends Service
{

    private final static URL MYCALCULATORSERVICE_WSDL_LOCATION;
    private final static WebServiceException MYCALCULATORSERVICE_EXCEPTION;
    private final static QName MYCALCULATORSERVICE_QNAME = new QName("http://MyCalculator.sbc.com/", "MyCalculatorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/calculator?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MYCALCULATORSERVICE_WSDL_LOCATION = url;
        MYCALCULATORSERVICE_EXCEPTION = e;
    }

    public MyCalculatorService() {
        super(__getWsdlLocation(), MYCALCULATORSERVICE_QNAME);
    }

    public MyCalculatorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MYCALCULATORSERVICE_QNAME, features);
    }

    public MyCalculatorService(URL wsdlLocation) {
        super(wsdlLocation, MYCALCULATORSERVICE_QNAME);
    }

    public MyCalculatorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MYCALCULATORSERVICE_QNAME, features);
    }

    public MyCalculatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyCalculatorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MyCalculator
     */
    @WebEndpoint(name = "MyCalculatorPort")
    public MyCalculator getMyCalculatorPort() {
        return super.getPort(new QName("http://MyCalculator.sbc.com/", "MyCalculatorPort"), MyCalculator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyCalculator
     */
    @WebEndpoint(name = "MyCalculatorPort")
    public MyCalculator getMyCalculatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://MyCalculator.sbc.com/", "MyCalculatorPort"), MyCalculator.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MYCALCULATORSERVICE_EXCEPTION!= null) {
            throw MYCALCULATORSERVICE_EXCEPTION;
        }
        return MYCALCULATORSERVICE_WSDL_LOCATION;
    }

}
