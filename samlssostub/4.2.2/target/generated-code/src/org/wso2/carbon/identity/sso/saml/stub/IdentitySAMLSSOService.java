

/**
 * IdentitySAMLSSOService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Dec 06, 2014 (05:07:02 IST)
 */

    package org.wso2.carbon.identity.sso.saml.stub;

    /*
     *  IdentitySAMLSSOService java interface
     */

    public interface IdentitySAMLSSOService {
          

        /**
          * Auto generated method signature
          * 
                    * @param validateSPInitSSORequest12
                
             * @throws org.wso2.carbon.identity.sso.saml.stub.IdentityException : 
         */

         
                     public org.apache.axiom.om.OMElement validateSPInitSSORequest(

                        java.lang.String samlReq13,java.lang.String queryString14,java.lang.String sessionId15,java.lang.String rpSessionId16,java.lang.String authnMode17,boolean isPost18)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.sso.saml.stub.IdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param validateSPInitSSORequest12
            
          */
        public void startvalidateSPInitSSORequest(

            java.lang.String samlReq13,java.lang.String queryString14,java.lang.String sessionId15,java.lang.String rpSessionId16,java.lang.String authnMode17,boolean isPost18,

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param isSAMLSSOLoginAccepted21
                
         */

         
                     public boolean isSAMLSSOLoginAccepted(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param isSAMLSSOLoginAccepted21
            
          */
        public void startisSAMLSSOLoginAccepted(

            

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param doSingleLogout24
                
             * @throws org.wso2.carbon.identity.sso.saml.stub.IdentityException : 
         */

         
                     public org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSOReqValidationResponseDTO doSingleLogout(

                        java.lang.String sessionId25)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.sso.saml.stub.IdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param doSingleLogout24
            
          */
        public void startdoSingleLogout(

            java.lang.String sessionId25,

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param validateIdPInitSSORequest28
                
             * @throws org.wso2.carbon.identity.sso.saml.stub.IdentityException : 
         */

         
                     public org.apache.axiom.om.OMElement validateIdPInitSSORequest(

                        java.lang.Object httpServletRequest29,java.lang.Object httpServletResponse30,java.lang.String spEntityID31,java.lang.String relayState32,java.lang.String queryString33,java.lang.String sessionId34,java.lang.String rpSessionId35,java.lang.String authnMode36)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.sso.saml.stub.IdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param validateIdPInitSSORequest28
            
          */
        public void startvalidateIdPInitSSORequest(

            java.lang.Object httpServletRequest29,java.lang.Object httpServletResponse30,java.lang.String spEntityID31,java.lang.String relayState32,java.lang.String queryString33,java.lang.String sessionId34,java.lang.String rpSessionId35,java.lang.String authnMode36,

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getSSOSessionTimeout39
                
         */

         
                     public int getSSOSessionTimeout(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getSSOSessionTimeout39
            
          */
        public void startgetSSOSessionTimeout(

            

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param authenticate42
                
             * @throws org.wso2.carbon.identity.sso.saml.stub.IdentityException : 
         */

         
                     public org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSORespDTO authenticate(

                        org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSOAuthnReqDTO authReqDTO43,java.lang.String sessionId44)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.sso.saml.stub.IdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param authenticate42
            
          */
        public void startauthenticate(

            org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSOAuthnReqDTO authReqDTO43,java.lang.String sessionId44,

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param isOpenIDLoginAccepted47
                
         */

         
                     public boolean isOpenIDLoginAccepted(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param isOpenIDLoginAccepted47
            
          */
        public void startisOpenIDLoginAccepted(

            

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    