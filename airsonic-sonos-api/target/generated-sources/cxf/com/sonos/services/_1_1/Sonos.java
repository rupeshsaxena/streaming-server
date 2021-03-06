package com.sonos.services._1_1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2022-07-17T13:58:24.829+05:30
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "Sonos",
                  wsdlLocation = "file:/Users/rupeshsaxena/Downloads/airsonic-master/airsonic-sonos-api/src/main/resources/sonos-1.1.wsdl",
                  targetNamespace = "http://www.sonos.com/Services/1.1")
public class Sonos extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.sonos.com/Services/1.1", "Sonos");
    public final static QName SonosSoap = new QName("http://www.sonos.com/Services/1.1", "SonosSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/rupeshsaxena/Downloads/airsonic-master/airsonic-sonos-api/src/main/resources/sonos-1.1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Sonos.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/rupeshsaxena/Downloads/airsonic-master/airsonic-sonos-api/src/main/resources/sonos-1.1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Sonos(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Sonos(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Sonos() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Sonos(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Sonos(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Sonos(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SonosSoap
     */
    @WebEndpoint(name = "SonosSoap")
    public SonosSoap getSonosSoap() {
        return super.getPort(SonosSoap, SonosSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SonosSoap
     */
    @WebEndpoint(name = "SonosSoap")
    public SonosSoap getSonosSoap(WebServiceFeature... features) {
        return super.getPort(SonosSoap, SonosSoap.class, features);
    }

}
