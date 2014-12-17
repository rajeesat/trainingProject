

/**
 * IdentitySAMLSSOConfigService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Dec 06, 2014 (05:07:02 IST)
 */

    package org.wso2.carbon.identity.sso.saml.stub;

    /*
     *  IdentitySAMLSSOConfigService java interface
     */

    public interface IdentitySAMLSSOConfigService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getClaimURIs8
                
             * @throws org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException : 
         */

         
                     public java.lang.String[] getClaimURIs(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getClaimURIs8
            
          */
        public void startgetClaimURIs(

            

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param removeServiceProvider11
                
             * @throws org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException : 
         */

         
                     public boolean removeServiceProvider(

                        java.lang.String issuer12)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param removeServiceProvider11
            
          */
        public void startremoveServiceProvider(

            java.lang.String issuer12,

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addMetadataServiceProvider15
                
             * @throws org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException : 
         */

         
                     public org.wso2.carbon.identity.core.model.xsd.SAMLSSOServiceProviderDO addMetadataServiceProvider(

                        java.lang.String fileContent16)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addMetadataServiceProvider15
            
          */
        public void startaddMetadataServiceProvider(

            java.lang.String fileContent16,

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param isMetadataFileSAMLObjectAdded19
                
             * @throws org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException : 
         */

         
                     public boolean isMetadataFileSAMLObjectAdded(

                        org.wso2.carbon.identity.core.model.xsd.SAMLSSOServiceProviderDO samlssoServiceProviderDO20)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param isMetadataFileSAMLObjectAdded19
            
          */
        public void startisMetadataFileSAMLObjectAdded(

            org.wso2.carbon.identity.core.model.xsd.SAMLSSOServiceProviderDO samlssoServiceProviderDO20,

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getServiceProviders23
                
             * @throws org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException : 
         */

         
                     public org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSOServiceProviderInfoDTO getServiceProviders(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getServiceProviders23
            
          */
        public void startgetServiceProviders(

            

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getCertAliasOfPrimaryKeyStore26
                
             * @throws org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException : 
         */

         
                     public java.lang.String[] getCertAliasOfPrimaryKeyStore(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getCertAliasOfPrimaryKeyStore26
            
          */
        public void startgetCertAliasOfPrimaryKeyStore(

            

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param isMetadataFileAdded29
                
             * @throws org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException : 
         */

         
                     public boolean isMetadataFileAdded(

                        java.lang.String fileContent30)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param isMetadataFileAdded29
            
          */
        public void startisMetadataFileAdded(

            java.lang.String fileContent30,

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addRPServiceProvider33
                
             * @throws org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException : 
         */

         
                     public boolean addRPServiceProvider(

                        org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSOServiceProviderDTO spDto34)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceIdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addRPServiceProvider33
            
          */
        public void startaddRPServiceProvider(

            org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSOServiceProviderDTO spDto34,

            final org.wso2.carbon.identity.sso.saml.stub.IdentitySAMLSSOConfigServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    