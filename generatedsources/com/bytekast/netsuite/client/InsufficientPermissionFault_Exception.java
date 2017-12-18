
package com.bytekast.netsuite.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-18T08:45:21.291-07:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "insufficientPermissionFault", targetNamespace = "urn:faults_2017_1.platform.webservices.netsuite.com")
public class InsufficientPermissionFault_Exception extends Exception {
    
    private com.bytekast.netsuite.client.InsufficientPermissionFault insufficientPermissionFault;

    public InsufficientPermissionFault_Exception() {
        super();
    }
    
    public InsufficientPermissionFault_Exception(String message) {
        super(message);
    }
    
    public InsufficientPermissionFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InsufficientPermissionFault_Exception(String message, com.bytekast.netsuite.client.InsufficientPermissionFault insufficientPermissionFault) {
        super(message);
        this.insufficientPermissionFault = insufficientPermissionFault;
    }

    public InsufficientPermissionFault_Exception(String message, com.bytekast.netsuite.client.InsufficientPermissionFault insufficientPermissionFault, Throwable cause) {
        super(message, cause);
        this.insufficientPermissionFault = insufficientPermissionFault;
    }

    public com.bytekast.netsuite.client.InsufficientPermissionFault getFaultInfo() {
        return this.insufficientPermissionFault;
    }
}