
package com.bytekast.netsuite.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-18T08:45:21.332-07:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "exceededRequestSizeFault", targetNamespace = "urn:faults_2017_1.platform.webservices.netsuite.com")
public class ExceededRequestSizeFault_Exception extends Exception {
    
    private com.bytekast.netsuite.client.ExceededRequestSizeFault exceededRequestSizeFault;

    public ExceededRequestSizeFault_Exception() {
        super();
    }
    
    public ExceededRequestSizeFault_Exception(String message) {
        super(message);
    }
    
    public ExceededRequestSizeFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceededRequestSizeFault_Exception(String message, com.bytekast.netsuite.client.ExceededRequestSizeFault exceededRequestSizeFault) {
        super(message);
        this.exceededRequestSizeFault = exceededRequestSizeFault;
    }

    public ExceededRequestSizeFault_Exception(String message, com.bytekast.netsuite.client.ExceededRequestSizeFault exceededRequestSizeFault, Throwable cause) {
        super(message, cause);
        this.exceededRequestSizeFault = exceededRequestSizeFault;
    }

    public com.bytekast.netsuite.client.ExceededRequestSizeFault getFaultInfo() {
        return this.exceededRequestSizeFault;
    }
}