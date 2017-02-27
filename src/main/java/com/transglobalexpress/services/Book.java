package com.transglobalexpress.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-02-25T20:46:25.174+02:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "Book", 
                  wsdlLocation = "http://staging.services.transglobalexpress.co.uk/Book.asmx?WSDL",
                  targetNamespace = "http://services.transglobalexpress.co.uk/") 
public class Book extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.transglobalexpress.co.uk/", "Book");
    public final static QName BookSoap12 = new QName("http://services.transglobalexpress.co.uk/", "BookSoap12");
    public final static QName BookSoap = new QName("http://services.transglobalexpress.co.uk/", "BookSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://staging.services.transglobalexpress.co.uk/Book.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Book.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://staging.services.transglobalexpress.co.uk/Book.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public Book(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Book(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Book() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Book(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Book(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Book(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns BookSoap
     */
    @WebEndpoint(name = "BookSoap12")
    public BookSoap getBookSoap12() {
        return super.getPort(BookSoap12, BookSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookSoap
     */
    @WebEndpoint(name = "BookSoap12")
    public BookSoap getBookSoap12(WebServiceFeature... features) {
        return super.getPort(BookSoap12, BookSoap.class, features);
    }


    /**
     *
     * @return
     *     returns BookSoap
     */
    @WebEndpoint(name = "BookSoap")
    public BookSoap getBookSoap() {
        return super.getPort(BookSoap, BookSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookSoap
     */
    @WebEndpoint(name = "BookSoap")
    public BookSoap getBookSoap(WebServiceFeature... features) {
        return super.getPort(BookSoap, BookSoap.class, features);
    }

}