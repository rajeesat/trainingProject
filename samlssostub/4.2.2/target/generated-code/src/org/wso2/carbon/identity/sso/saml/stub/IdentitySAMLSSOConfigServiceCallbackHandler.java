
/**
 * IdentitySAMLSSOConfigServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Dec 06, 2014 (05:07:02 IST)
 */

    package org.wso2.carbon.identity.sso.saml.stub;

    /**
     *  IdentitySAMLSSOConfigServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class IdentitySAMLSSOConfigServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public IdentitySAMLSSOConfigServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public IdentitySAMLSSOConfigServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getClaimURIs method
            * override this method for handling normal response from getClaimURIs operation
            */
           public void receiveResultgetClaimURIs(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getClaimURIs operation
           */
            public void receiveErrorgetClaimURIs(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeServiceProvider method
            * override this method for handling normal response from removeServiceProvider operation
            */
           public void receiveResultremoveServiceProvider(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeServiceProvider operation
           */
            public void receiveErrorremoveServiceProvider(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addMetadataServiceProvider method
            * override this method for handling normal response from addMetadataServiceProvider operation
            */
           public void receiveResultaddMetadataServiceProvider(
                    org.wso2.carbon.identity.core.model.xsd.SAMLSSOServiceProviderDO result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addMetadataServiceProvider operation
           */
            public void receiveErroraddMetadataServiceProvider(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for isMetadataFileSAMLObjectAdded method
            * override this method for handling normal response from isMetadataFileSAMLObjectAdded operation
            */
           public void receiveResultisMetadataFileSAMLObjectAdded(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isMetadataFileSAMLObjectAdded operation
           */
            public void receiveErrorisMetadataFileSAMLObjectAdded(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServiceProviders method
            * override this method for handling normal response from getServiceProviders operation
            */
           public void receiveResultgetServiceProviders(
                    org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSOServiceProviderInfoDTO result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServiceProviders operation
           */
            public void receiveErrorgetServiceProviders(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCertAliasOfPrimaryKeyStore method
            * override this method for handling normal response from getCertAliasOfPrimaryKeyStore operation
            */
           public void receiveResultgetCertAliasOfPrimaryKeyStore(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCertAliasOfPrimaryKeyStore operation
           */
            public void receiveErrorgetCertAliasOfPrimaryKeyStore(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for isMetadataFileAdded method
            * override this method for handling normal response from isMetadataFileAdded operation
            */
           public void receiveResultisMetadataFileAdded(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isMetadataFileAdded operation
           */
            public void receiveErrorisMetadataFileAdded(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addRPServiceProvider method
            * override this method for handling normal response from addRPServiceProvider operation
            */
           public void receiveResultaddRPServiceProvider(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addRPServiceProvider operation
           */
            public void receiveErroraddRPServiceProvider(java.lang.Exception e) {
            }
                


    }
    