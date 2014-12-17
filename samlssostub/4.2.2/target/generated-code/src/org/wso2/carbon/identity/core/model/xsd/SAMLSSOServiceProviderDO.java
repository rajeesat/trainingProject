
/**
 * SAMLSSOServiceProviderDO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Dec 06, 2014 (05:07:07 IST)
 */

            
                package org.wso2.carbon.identity.core.model.xsd;
            

            /**
            *  SAMLSSOServiceProviderDO bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SAMLSSOServiceProviderDO
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SAMLSSOServiceProviderDO
                Namespace URI = http://model.core.identity.carbon.wso2.org/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AssertionConsumerUrl
                        */

                        
                                    protected java.lang.String localAssertionConsumerUrl ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssertionConsumerUrlTracker = false ;

                           public boolean isAssertionConsumerUrlSpecified(){
                               return localAssertionConsumerUrlTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAssertionConsumerUrl(){
                               return localAssertionConsumerUrl;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AssertionConsumerUrl
                               */
                               public void setAssertionConsumerUrl(java.lang.String param){
                            localAssertionConsumerUrlTracker = true;
                                   
                                            this.localAssertionConsumerUrl=param;
                                    

                               }
                            

                        /**
                        * field for AttributeConsumingServiceIndex
                        */

                        
                                    protected java.lang.String localAttributeConsumingServiceIndex ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttributeConsumingServiceIndexTracker = false ;

                           public boolean isAttributeConsumingServiceIndexSpecified(){
                               return localAttributeConsumingServiceIndexTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAttributeConsumingServiceIndex(){
                               return localAttributeConsumingServiceIndex;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AttributeConsumingServiceIndex
                               */
                               public void setAttributeConsumingServiceIndex(java.lang.String param){
                            localAttributeConsumingServiceIndexTracker = true;
                                   
                                            this.localAttributeConsumingServiceIndex=param;
                                    

                               }
                            

                        /**
                        * field for CertAlias
                        */

                        
                                    protected java.lang.String localCertAlias ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertAliasTracker = false ;

                           public boolean isCertAliasSpecified(){
                               return localCertAliasTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCertAlias(){
                               return localCertAlias;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertAlias
                               */
                               public void setCertAlias(java.lang.String param){
                            localCertAliasTracker = true;
                                   
                                            this.localCertAlias=param;
                                    

                               }
                            

                        /**
                        * field for DoEnableEncryptedAssertion
                        */

                        
                                    protected boolean localDoEnableEncryptedAssertion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDoEnableEncryptedAssertionTracker = false ;

                           public boolean isDoEnableEncryptedAssertionSpecified(){
                               return localDoEnableEncryptedAssertionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDoEnableEncryptedAssertion(){
                               return localDoEnableEncryptedAssertion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DoEnableEncryptedAssertion
                               */
                               public void setDoEnableEncryptedAssertion(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDoEnableEncryptedAssertionTracker =
                                       true;
                                   
                                            this.localDoEnableEncryptedAssertion=param;
                                    

                               }
                            

                        /**
                        * field for DoSignAssertions
                        */

                        
                                    protected boolean localDoSignAssertions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDoSignAssertionsTracker = false ;

                           public boolean isDoSignAssertionsSpecified(){
                               return localDoSignAssertionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDoSignAssertions(){
                               return localDoSignAssertions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DoSignAssertions
                               */
                               public void setDoSignAssertions(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDoSignAssertionsTracker =
                                       true;
                                   
                                            this.localDoSignAssertions=param;
                                    

                               }
                            

                        /**
                        * field for DoSignResponse
                        */

                        
                                    protected boolean localDoSignResponse ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDoSignResponseTracker = false ;

                           public boolean isDoSignResponseSpecified(){
                               return localDoSignResponseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDoSignResponse(){
                               return localDoSignResponse;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DoSignResponse
                               */
                               public void setDoSignResponse(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDoSignResponseTracker =
                                       true;
                                   
                                            this.localDoSignResponse=param;
                                    

                               }
                            

                        /**
                        * field for DoSingleLogout
                        */

                        
                                    protected boolean localDoSingleLogout ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDoSingleLogoutTracker = false ;

                           public boolean isDoSingleLogoutSpecified(){
                               return localDoSingleLogoutTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDoSingleLogout(){
                               return localDoSingleLogout;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DoSingleLogout
                               */
                               public void setDoSingleLogout(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDoSingleLogoutTracker =
                                       true;
                                   
                                            this.localDoSingleLogout=param;
                                    

                               }
                            

                        /**
                        * field for DoValidateSignatureInRequests
                        */

                        
                                    protected boolean localDoValidateSignatureInRequests ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDoValidateSignatureInRequestsTracker = false ;

                           public boolean isDoValidateSignatureInRequestsSpecified(){
                               return localDoValidateSignatureInRequestsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDoValidateSignatureInRequests(){
                               return localDoValidateSignatureInRequests;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DoValidateSignatureInRequests
                               */
                               public void setDoValidateSignatureInRequests(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDoValidateSignatureInRequestsTracker =
                                       true;
                                   
                                            this.localDoValidateSignatureInRequests=param;
                                    

                               }
                            

                        /**
                        * field for EnableAttributesByDefault
                        */

                        
                                    protected boolean localEnableAttributesByDefault ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEnableAttributesByDefaultTracker = false ;

                           public boolean isEnableAttributesByDefaultSpecified(){
                               return localEnableAttributesByDefaultTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnableAttributesByDefault(){
                               return localEnableAttributesByDefault;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnableAttributesByDefault
                               */
                               public void setEnableAttributesByDefault(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localEnableAttributesByDefaultTracker =
                                       true;
                                   
                                            this.localEnableAttributesByDefault=param;
                                    

                               }
                            

                        /**
                        * field for IdPInitSSOEnabled
                        */

                        
                                    protected boolean localIdPInitSSOEnabled ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdPInitSSOEnabledTracker = false ;

                           public boolean isIdPInitSSOEnabledSpecified(){
                               return localIdPInitSSOEnabledTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIdPInitSSOEnabled(){
                               return localIdPInitSSOEnabled;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IdPInitSSOEnabled
                               */
                               public void setIdPInitSSOEnabled(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localIdPInitSSOEnabledTracker =
                                       true;
                                   
                                            this.localIdPInitSSOEnabled=param;
                                    

                               }
                            

                        /**
                        * field for Issuer
                        */

                        
                                    protected java.lang.String localIssuer ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIssuerTracker = false ;

                           public boolean isIssuerSpecified(){
                               return localIssuerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIssuer(){
                               return localIssuer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Issuer
                               */
                               public void setIssuer(java.lang.String param){
                            localIssuerTracker = true;
                                   
                                            this.localIssuer=param;
                                    

                               }
                            

                        /**
                        * field for LoginPageURL
                        */

                        
                                    protected java.lang.String localLoginPageURL ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLoginPageURLTracker = false ;

                           public boolean isLoginPageURLSpecified(){
                               return localLoginPageURLTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLoginPageURL(){
                               return localLoginPageURL;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LoginPageURL
                               */
                               public void setLoginPageURL(java.lang.String param){
                            localLoginPageURLTracker = true;
                                   
                                            this.localLoginPageURL=param;
                                    

                               }
                            

                        /**
                        * field for LogoutURL
                        */

                        
                                    protected java.lang.String localLogoutURL ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLogoutURLTracker = false ;

                           public boolean isLogoutURLSpecified(){
                               return localLogoutURLTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLogoutURL(){
                               return localLogoutURL;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LogoutURL
                               */
                               public void setLogoutURL(java.lang.String param){
                            localLogoutURLTracker = true;
                                   
                                            this.localLogoutURL=param;
                                    

                               }
                            

                        /**
                        * field for NameIDFormat
                        */

                        
                                    protected java.lang.String localNameIDFormat ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameIDFormatTracker = false ;

                           public boolean isNameIDFormatSpecified(){
                               return localNameIDFormatTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNameIDFormat(){
                               return localNameIDFormat;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameIDFormat
                               */
                               public void setNameIDFormat(java.lang.String param){
                            localNameIDFormatTracker = true;
                                   
                                            this.localNameIDFormat=param;
                                    

                               }
                            

                        /**
                        * field for NameIdClaimUri
                        */

                        
                                    protected java.lang.String localNameIdClaimUri ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameIdClaimUriTracker = false ;

                           public boolean isNameIdClaimUriSpecified(){
                               return localNameIdClaimUriTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNameIdClaimUri(){
                               return localNameIdClaimUri;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameIdClaimUri
                               */
                               public void setNameIdClaimUri(java.lang.String param){
                            localNameIdClaimUriTracker = true;
                                   
                                            this.localNameIdClaimUri=param;
                                    

                               }
                            

                        /**
                        * field for RequestedAudiences
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRequestedAudiences ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedAudiencesTracker = false ;

                           public boolean isRequestedAudiencesSpecified(){
                               return localRequestedAudiencesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRequestedAudiences(){
                               return localRequestedAudiences;
                           }

                           
                        


                               
                              /**
                               * validate the array for RequestedAudiences
                               */
                              protected void validateRequestedAudiences(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RequestedAudiences
                              */
                              public void setRequestedAudiences(java.lang.String[] param){
                              
                                   validateRequestedAudiences(param);

                               localRequestedAudiencesTracker = true;
                                      
                                      this.localRequestedAudiences=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRequestedAudiences(java.lang.String param){
                                   if (localRequestedAudiences == null){
                                   localRequestedAudiences = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localRequestedAudiencesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRequestedAudiences);
                               list.add(param);
                               this.localRequestedAudiences =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for RequestedAudiencesList
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRequestedAudiencesList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedAudiencesListTracker = false ;

                           public boolean isRequestedAudiencesListSpecified(){
                               return localRequestedAudiencesListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRequestedAudiencesList(){
                               return localRequestedAudiencesList;
                           }

                           
                        


                               
                              /**
                               * validate the array for RequestedAudiencesList
                               */
                              protected void validateRequestedAudiencesList(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RequestedAudiencesList
                              */
                              public void setRequestedAudiencesList(java.lang.String[] param){
                              
                                   validateRequestedAudiencesList(param);

                               localRequestedAudiencesListTracker = true;
                                      
                                      this.localRequestedAudiencesList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRequestedAudiencesList(java.lang.String param){
                                   if (localRequestedAudiencesList == null){
                                   localRequestedAudiencesList = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localRequestedAudiencesListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRequestedAudiencesList);
                               list.add(param);
                               this.localRequestedAudiencesList =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for RequestedClaims
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRequestedClaims ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedClaimsTracker = false ;

                           public boolean isRequestedClaimsSpecified(){
                               return localRequestedClaimsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRequestedClaims(){
                               return localRequestedClaims;
                           }

                           
                        


                               
                              /**
                               * validate the array for RequestedClaims
                               */
                              protected void validateRequestedClaims(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RequestedClaims
                              */
                              public void setRequestedClaims(java.lang.String[] param){
                              
                                   validateRequestedClaims(param);

                               localRequestedClaimsTracker = true;
                                      
                                      this.localRequestedClaims=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRequestedClaims(java.lang.String param){
                                   if (localRequestedClaims == null){
                                   localRequestedClaims = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localRequestedClaimsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRequestedClaims);
                               list.add(param);
                               this.localRequestedClaims =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for RequestedClaimsList
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRequestedClaimsList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedClaimsListTracker = false ;

                           public boolean isRequestedClaimsListSpecified(){
                               return localRequestedClaimsListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRequestedClaimsList(){
                               return localRequestedClaimsList;
                           }

                           
                        


                               
                              /**
                               * validate the array for RequestedClaimsList
                               */
                              protected void validateRequestedClaimsList(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RequestedClaimsList
                              */
                              public void setRequestedClaimsList(java.lang.String[] param){
                              
                                   validateRequestedClaimsList(param);

                               localRequestedClaimsListTracker = true;
                                      
                                      this.localRequestedClaimsList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRequestedClaimsList(java.lang.String param){
                                   if (localRequestedClaimsList == null){
                                   localRequestedClaimsList = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localRequestedClaimsListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRequestedClaimsList);
                               list.add(param);
                               this.localRequestedClaimsList =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for RequestedRecipients
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRequestedRecipients ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedRecipientsTracker = false ;

                           public boolean isRequestedRecipientsSpecified(){
                               return localRequestedRecipientsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRequestedRecipients(){
                               return localRequestedRecipients;
                           }

                           
                        


                               
                              /**
                               * validate the array for RequestedRecipients
                               */
                              protected void validateRequestedRecipients(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RequestedRecipients
                              */
                              public void setRequestedRecipients(java.lang.String[] param){
                              
                                   validateRequestedRecipients(param);

                               localRequestedRecipientsTracker = true;
                                      
                                      this.localRequestedRecipients=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRequestedRecipients(java.lang.String param){
                                   if (localRequestedRecipients == null){
                                   localRequestedRecipients = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localRequestedRecipientsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRequestedRecipients);
                               list.add(param);
                               this.localRequestedRecipients =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for RequestedRecipientsList
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRequestedRecipientsList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedRecipientsListTracker = false ;

                           public boolean isRequestedRecipientsListSpecified(){
                               return localRequestedRecipientsListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRequestedRecipientsList(){
                               return localRequestedRecipientsList;
                           }

                           
                        


                               
                              /**
                               * validate the array for RequestedRecipientsList
                               */
                              protected void validateRequestedRecipientsList(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RequestedRecipientsList
                              */
                              public void setRequestedRecipientsList(java.lang.String[] param){
                              
                                   validateRequestedRecipientsList(param);

                               localRequestedRecipientsListTracker = true;
                                      
                                      this.localRequestedRecipientsList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRequestedRecipientsList(java.lang.String param){
                                   if (localRequestedRecipientsList == null){
                                   localRequestedRecipientsList = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localRequestedRecipientsListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRequestedRecipientsList);
                               list.add(param);
                               this.localRequestedRecipientsList =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for UseFullyQualifiedUsername
                        */

                        
                                    protected boolean localUseFullyQualifiedUsername ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUseFullyQualifiedUsernameTracker = false ;

                           public boolean isUseFullyQualifiedUsernameSpecified(){
                               return localUseFullyQualifiedUsernameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUseFullyQualifiedUsername(){
                               return localUseFullyQualifiedUsername;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UseFullyQualifiedUsername
                               */
                               public void setUseFullyQualifiedUsername(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localUseFullyQualifiedUsernameTracker =
                                       true;
                                   
                                            this.localUseFullyQualifiedUsername=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://model.core.identity.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SAMLSSOServiceProviderDO",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SAMLSSOServiceProviderDO",
                           xmlWriter);
                   }

               
                   }
                if (localAssertionConsumerUrlTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "assertionConsumerUrl", xmlWriter);
                             

                                          if (localAssertionConsumerUrl==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAssertionConsumerUrl);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttributeConsumingServiceIndexTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "attributeConsumingServiceIndex", xmlWriter);
                             

                                          if (localAttributeConsumingServiceIndex==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAttributeConsumingServiceIndex);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertAliasTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "certAlias", xmlWriter);
                             

                                          if (localCertAlias==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCertAlias);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDoEnableEncryptedAssertionTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "doEnableEncryptedAssertion", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("doEnableEncryptedAssertion cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoEnableEncryptedAssertion));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDoSignAssertionsTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "doSignAssertions", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("doSignAssertions cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSignAssertions));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDoSignResponseTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "doSignResponse", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("doSignResponse cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSignResponse));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDoSingleLogoutTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "doSingleLogout", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("doSingleLogout cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSingleLogout));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDoValidateSignatureInRequestsTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "doValidateSignatureInRequests", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("doValidateSignatureInRequests cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoValidateSignatureInRequests));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEnableAttributesByDefaultTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "enableAttributesByDefault", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("enableAttributesByDefault cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableAttributesByDefault));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIdPInitSSOEnabledTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "idPInitSSOEnabled", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("idPInitSSOEnabled cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdPInitSSOEnabled));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIssuerTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "issuer", xmlWriter);
                             

                                          if (localIssuer==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIssuer);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLoginPageURLTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "loginPageURL", xmlWriter);
                             

                                          if (localLoginPageURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLoginPageURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLogoutURLTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "logoutURL", xmlWriter);
                             

                                          if (localLogoutURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLogoutURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameIDFormatTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nameIDFormat", xmlWriter);
                             

                                          if (localNameIDFormat==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNameIDFormat);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameIdClaimUriTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nameIdClaimUri", xmlWriter);
                             

                                          if (localNameIdClaimUri==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNameIdClaimUri);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestedAudiencesTracker){
                             if (localRequestedAudiences!=null) {
                                   namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localRequestedAudiences.length;i++){
                                        
                                            if (localRequestedAudiences[i] != null){
                                        
                                                writeStartElement(null, namespace, "requestedAudiences", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedAudiences[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "requestedAudiences", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://model.core.identity.carbon.wso2.org/xsd", "requestedAudiences", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localRequestedAudiencesListTracker){
                             if (localRequestedAudiencesList!=null) {
                                   namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localRequestedAudiencesList.length;i++){
                                        
                                            if (localRequestedAudiencesList[i] != null){
                                        
                                                writeStartElement(null, namespace, "requestedAudiencesList", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedAudiencesList[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "requestedAudiencesList", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://model.core.identity.carbon.wso2.org/xsd", "requestedAudiencesList", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localRequestedClaimsTracker){
                             if (localRequestedClaims!=null) {
                                   namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localRequestedClaims.length;i++){
                                        
                                            if (localRequestedClaims[i] != null){
                                        
                                                writeStartElement(null, namespace, "requestedClaims", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedClaims[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "requestedClaims", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://model.core.identity.carbon.wso2.org/xsd", "requestedClaims", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localRequestedClaimsListTracker){
                             if (localRequestedClaimsList!=null) {
                                   namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localRequestedClaimsList.length;i++){
                                        
                                            if (localRequestedClaimsList[i] != null){
                                        
                                                writeStartElement(null, namespace, "requestedClaimsList", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedClaimsList[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "requestedClaimsList", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://model.core.identity.carbon.wso2.org/xsd", "requestedClaimsList", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localRequestedRecipientsTracker){
                             if (localRequestedRecipients!=null) {
                                   namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localRequestedRecipients.length;i++){
                                        
                                            if (localRequestedRecipients[i] != null){
                                        
                                                writeStartElement(null, namespace, "requestedRecipients", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedRecipients[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "requestedRecipients", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://model.core.identity.carbon.wso2.org/xsd", "requestedRecipients", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localRequestedRecipientsListTracker){
                             if (localRequestedRecipientsList!=null) {
                                   namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localRequestedRecipientsList.length;i++){
                                        
                                            if (localRequestedRecipientsList[i] != null){
                                        
                                                writeStartElement(null, namespace, "requestedRecipientsList", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedRecipientsList[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "requestedRecipientsList", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://model.core.identity.carbon.wso2.org/xsd", "requestedRecipientsList", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localUseFullyQualifiedUsernameTracker){
                                    namespace = "http://model.core.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "useFullyQualifiedUsername", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("useFullyQualifiedUsername cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUseFullyQualifiedUsername));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://model.core.identity.carbon.wso2.org/xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAssertionConsumerUrlTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "assertionConsumerUrl"));
                                 
                                         elementList.add(localAssertionConsumerUrl==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAssertionConsumerUrl));
                                    } if (localAttributeConsumingServiceIndexTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "attributeConsumingServiceIndex"));
                                 
                                         elementList.add(localAttributeConsumingServiceIndex==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttributeConsumingServiceIndex));
                                    } if (localCertAliasTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "certAlias"));
                                 
                                         elementList.add(localCertAlias==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertAlias));
                                    } if (localDoEnableEncryptedAssertionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "doEnableEncryptedAssertion"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoEnableEncryptedAssertion));
                            } if (localDoSignAssertionsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "doSignAssertions"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSignAssertions));
                            } if (localDoSignResponseTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "doSignResponse"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSignResponse));
                            } if (localDoSingleLogoutTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "doSingleLogout"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSingleLogout));
                            } if (localDoValidateSignatureInRequestsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "doValidateSignatureInRequests"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoValidateSignatureInRequests));
                            } if (localEnableAttributesByDefaultTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "enableAttributesByDefault"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableAttributesByDefault));
                            } if (localIdPInitSSOEnabledTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "idPInitSSOEnabled"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdPInitSSOEnabled));
                            } if (localIssuerTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "issuer"));
                                 
                                         elementList.add(localIssuer==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssuer));
                                    } if (localLoginPageURLTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "loginPageURL"));
                                 
                                         elementList.add(localLoginPageURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoginPageURL));
                                    } if (localLogoutURLTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "logoutURL"));
                                 
                                         elementList.add(localLogoutURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogoutURL));
                                    } if (localNameIDFormatTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "nameIDFormat"));
                                 
                                         elementList.add(localNameIDFormat==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameIDFormat));
                                    } if (localNameIdClaimUriTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "nameIdClaimUri"));
                                 
                                         elementList.add(localNameIdClaimUri==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameIdClaimUri));
                                    } if (localRequestedAudiencesTracker){
                            if (localRequestedAudiences!=null){
                                  for (int i = 0;i < localRequestedAudiences.length;i++){
                                      
                                         if (localRequestedAudiences[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedAudiences"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedAudiences[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedAudiences"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedAudiences"));
                                    elementList.add(null);
                                
                            }

                        } if (localRequestedAudiencesListTracker){
                            if (localRequestedAudiencesList!=null){
                                  for (int i = 0;i < localRequestedAudiencesList.length;i++){
                                      
                                         if (localRequestedAudiencesList[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedAudiencesList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedAudiencesList[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedAudiencesList"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedAudiencesList"));
                                    elementList.add(null);
                                
                            }

                        } if (localRequestedClaimsTracker){
                            if (localRequestedClaims!=null){
                                  for (int i = 0;i < localRequestedClaims.length;i++){
                                      
                                         if (localRequestedClaims[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedClaims"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedClaims[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedClaims"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedClaims"));
                                    elementList.add(null);
                                
                            }

                        } if (localRequestedClaimsListTracker){
                            if (localRequestedClaimsList!=null){
                                  for (int i = 0;i < localRequestedClaimsList.length;i++){
                                      
                                         if (localRequestedClaimsList[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedClaimsList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedClaimsList[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedClaimsList"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedClaimsList"));
                                    elementList.add(null);
                                
                            }

                        } if (localRequestedRecipientsTracker){
                            if (localRequestedRecipients!=null){
                                  for (int i = 0;i < localRequestedRecipients.length;i++){
                                      
                                         if (localRequestedRecipients[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedRecipients"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedRecipients[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedRecipients"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedRecipients"));
                                    elementList.add(null);
                                
                            }

                        } if (localRequestedRecipientsListTracker){
                            if (localRequestedRecipientsList!=null){
                                  for (int i = 0;i < localRequestedRecipientsList.length;i++){
                                      
                                         if (localRequestedRecipientsList[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedRecipientsList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedRecipientsList[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedRecipientsList"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                              "requestedRecipientsList"));
                                    elementList.add(null);
                                
                            }

                        } if (localUseFullyQualifiedUsernameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd",
                                                                      "useFullyQualifiedUsername"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUseFullyQualifiedUsername));
                            }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static SAMLSSOServiceProviderDO parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SAMLSSOServiceProviderDO object =
                new SAMLSSOServiceProviderDO();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"SAMLSSOServiceProviderDO".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SAMLSSOServiceProviderDO)org.wso2.carbon.identity.sso.saml.stub.types.axis2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list16 = new java.util.ArrayList();
                    
                        java.util.ArrayList list17 = new java.util.ArrayList();
                    
                        java.util.ArrayList list18 = new java.util.ArrayList();
                    
                        java.util.ArrayList list19 = new java.util.ArrayList();
                    
                        java.util.ArrayList list20 = new java.util.ArrayList();
                    
                        java.util.ArrayList list21 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","assertionConsumerUrl").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAssertionConsumerUrl(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","attributeConsumingServiceIndex").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAttributeConsumingServiceIndex(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","certAlias").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertAlias(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","doEnableEncryptedAssertion").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"doEnableEncryptedAssertion" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDoEnableEncryptedAssertion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","doSignAssertions").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"doSignAssertions" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDoSignAssertions(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","doSignResponse").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"doSignResponse" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDoSignResponse(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","doSingleLogout").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"doSingleLogout" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDoSingleLogout(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","doValidateSignatureInRequests").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"doValidateSignatureInRequests" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDoValidateSignatureInRequests(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","enableAttributesByDefault").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"enableAttributesByDefault" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnableAttributesByDefault(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","idPInitSSOEnabled").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"idPInitSSOEnabled" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIdPInitSSOEnabled(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","issuer").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIssuer(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","loginPageURL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLoginPageURL(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","logoutURL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLogoutURL(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","nameIDFormat").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNameIDFormat(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","nameIdClaimUri").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNameIdClaimUri(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","requestedAudiences").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list16.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list16.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone16 = false;
                                            while(!loopDone16){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone16 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","requestedAudiences").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list16.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list16.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone16 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setRequestedAudiences((java.lang.String[])
                                                        list16.toArray(new java.lang.String[list16.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","requestedAudiencesList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list17.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list17.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone17 = false;
                                            while(!loopDone17){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone17 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","requestedAudiencesList").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list17.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list17.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone17 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setRequestedAudiencesList((java.lang.String[])
                                                        list17.toArray(new java.lang.String[list17.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","requestedClaims").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list18.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list18.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone18 = false;
                                            while(!loopDone18){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone18 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","requestedClaims").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list18.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list18.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone18 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setRequestedClaims((java.lang.String[])
                                                        list18.toArray(new java.lang.String[list18.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","requestedClaimsList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list19.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list19.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone19 = false;
                                            while(!loopDone19){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone19 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","requestedClaimsList").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list19.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list19.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone19 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setRequestedClaimsList((java.lang.String[])
                                                        list19.toArray(new java.lang.String[list19.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","requestedRecipients").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list20.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list20.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone20 = false;
                                            while(!loopDone20){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone20 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","requestedRecipients").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list20.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list20.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone20 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setRequestedRecipients((java.lang.String[])
                                                        list20.toArray(new java.lang.String[list20.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","requestedRecipientsList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list21.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list21.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone21 = false;
                                            while(!loopDone21){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone21 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","requestedRecipientsList").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list21.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list21.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone21 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setRequestedRecipientsList((java.lang.String[])
                                                        list21.toArray(new java.lang.String[list21.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.core.identity.carbon.wso2.org/xsd","useFullyQualifiedUsername").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"useFullyQualifiedUsername" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUseFullyQualifiedUsername(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    