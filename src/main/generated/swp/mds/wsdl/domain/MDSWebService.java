package swp.mds.wsdl.domain;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-08-24T12:46:03.409-04:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "MDSWebService", 
                  wsdlLocation = "file:/Users/hnt5/Development/workspaces/cdsi/swp-mds-client/src/main/resources/mds.xml",
                  targetNamespace = "http://swpartners.com") 
public class MDSWebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://swpartners.com", "MDSWebService");
    public final static QName MDSWebServicePort = new QName("http://swpartners.com", "MDSWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/hnt5/Development/workspaces/cdsi/swp-mds-client/src/main/resources/mds.xml");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MDSWebService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/hnt5/Development/workspaces/cdsi/swp-mds-client/src/main/resources/mds.xml");
        }
        WSDL_LOCATION = url;
    }

    public MDSWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MDSWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MDSWebService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MDSWebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MDSWebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MDSWebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns MDSWebServicePort
     */
    @WebEndpoint(name = "MDSWebServicePort")
    public MDSWebServicePort getMDSWebServicePort() {
        return super.getPort(MDSWebServicePort, MDSWebServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MDSWebServicePort
     */
    @WebEndpoint(name = "MDSWebServicePort")
    public MDSWebServicePort getMDSWebServicePort(WebServiceFeature... features) {
        return super.getPort(MDSWebServicePort, MDSWebServicePort.class, features);
    }

}