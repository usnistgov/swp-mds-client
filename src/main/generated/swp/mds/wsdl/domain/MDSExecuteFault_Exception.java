
package swp.mds.wsdl.domain;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-08-24T12:46:03.378-04:00
 * Generated source version: 3.1.10
 */

@WebFault(name = "MDSExecuteFault", targetNamespace = "http://swpartners.com")
public class MDSExecuteFault_Exception extends Exception {
    
    private swp.mds.wsdl.domain.MDSExecuteFault mdsExecuteFault;

    public MDSExecuteFault_Exception() {
        super();
    }
    
    public MDSExecuteFault_Exception(String message) {
        super(message);
    }
    
    public MDSExecuteFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public MDSExecuteFault_Exception(String message, swp.mds.wsdl.domain.MDSExecuteFault mdsExecuteFault) {
        super(message);
        this.mdsExecuteFault = mdsExecuteFault;
    }

    public MDSExecuteFault_Exception(String message, swp.mds.wsdl.domain.MDSExecuteFault mdsExecuteFault, Throwable cause) {
        super(message, cause);
        this.mdsExecuteFault = mdsExecuteFault;
    }

    public swp.mds.wsdl.domain.MDSExecuteFault getFaultInfo() {
        return this.mdsExecuteFault;
    }
}