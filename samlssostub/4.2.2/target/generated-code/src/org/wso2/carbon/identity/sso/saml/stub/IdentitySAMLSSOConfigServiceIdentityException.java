
/**
 * IdentitySAMLSSOConfigServiceIdentityException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Dec 06, 2014 (05:07:02 IST)
 */

package org.wso2.carbon.identity.sso.saml.stub;

public class IdentitySAMLSSOConfigServiceIdentityException extends java.lang.Exception{

    private static final long serialVersionUID = 1418793424477L;
    
    private org.wso2.carbon.identity.sso.saml.stub.types.axis2.IdentitySAMLSSOConfigServiceIdentityException faultMessage;

    
        public IdentitySAMLSSOConfigServiceIdentityException() {
            super("IdentitySAMLSSOConfigServiceIdentityException");
        }

        public IdentitySAMLSSOConfigServiceIdentityException(java.lang.String s) {
           super(s);
        }

        public IdentitySAMLSSOConfigServiceIdentityException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public IdentitySAMLSSOConfigServiceIdentityException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.identity.sso.saml.stub.types.axis2.IdentitySAMLSSOConfigServiceIdentityException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.identity.sso.saml.stub.types.axis2.IdentitySAMLSSOConfigServiceIdentityException getFaultMessage(){
       return faultMessage;
    }
}
    