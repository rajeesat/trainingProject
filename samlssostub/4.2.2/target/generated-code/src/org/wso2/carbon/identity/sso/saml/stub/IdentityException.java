
/**
 * IdentityException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Dec 06, 2014 (05:07:02 IST)
 */

package org.wso2.carbon.identity.sso.saml.stub;

public class IdentityException extends java.lang.Exception{

    private static final long serialVersionUID = 1418793426131L;
    
    private org.wso2.carbon.identity.sso.saml.stub.types.axis2.IdentityExceptionE faultMessage;

    
        public IdentityException() {
            super("IdentityException");
        }

        public IdentityException(java.lang.String s) {
           super(s);
        }

        public IdentityException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public IdentityException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.identity.sso.saml.stub.types.axis2.IdentityExceptionE msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.identity.sso.saml.stub.types.axis2.IdentityExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    