
/**
 * IdentitySAMLSSOServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Dec 06, 2014 (05:07:02 IST)
 */

    package org.wso2.carbon.identity.sso.saml.stub;

    /**
     *  IdentitySAMLSSOServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class IdentitySAMLSSOServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public IdentitySAMLSSOServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public IdentitySAMLSSOServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for validateSPInitSSORequest method
            * override this method for handling normal response from validateSPInitSSORequest operation
            */
           public void receiveResultvalidateSPInitSSORequest(
                    org.apache.axiom.om.OMElement result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from validateSPInitSSORequest operation
           */
            public void receiveErrorvalidateSPInitSSORequest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for isSAMLSSOLoginAccepted method
            * override this method for handling normal response from isSAMLSSOLoginAccepted operation
            */
           public void receiveResultisSAMLSSOLoginAccepted(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isSAMLSSOLoginAccepted operation
           */
            public void receiveErrorisSAMLSSOLoginAccepted(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for doSingleLogout method
            * override this method for handling normal response from doSingleLogout operation
            */
           public void receiveResultdoSingleLogout(
                    org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSOReqValidationResponseDTO result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from doSingleLogout operation
           */
            public void receiveErrordoSingleLogout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for validateIdPInitSSORequest method
            * override this method for handling normal response from validateIdPInitSSORequest operation
            */
           public void receiveResultvalidateIdPInitSSORequest(
                    org.apache.axiom.om.OMElement result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from validateIdPInitSSORequest operation
           */
            public void receiveErrorvalidateIdPInitSSORequest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSSOSessionTimeout method
            * override this method for handling normal response from getSSOSessionTimeout operation
            */
           public void receiveResultgetSSOSessionTimeout(
                    int result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSSOSessionTimeout operation
           */
            public void receiveErrorgetSSOSessionTimeout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for authenticate method
            * override this method for handling normal response from authenticate operation
            */
           public void receiveResultauthenticate(
                    org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSORespDTO result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from authenticate operation
           */
            public void receiveErrorauthenticate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for isOpenIDLoginAccepted method
            * override this method for handling normal response from isOpenIDLoginAccepted operation
            */
           public void receiveResultisOpenIDLoginAccepted(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isOpenIDLoginAccepted operation
           */
            public void receiveErrorisOpenIDLoginAccepted(java.lang.Exception e) {
            }
                


    }
    