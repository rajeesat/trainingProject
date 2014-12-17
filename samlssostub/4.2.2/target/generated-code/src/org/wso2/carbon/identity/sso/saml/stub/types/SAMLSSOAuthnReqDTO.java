
/**
 * SAMLSSOAuthnReqDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Dec 06, 2014 (05:07:07 IST)
 */

            
                package org.wso2.carbon.identity.sso.saml.stub.types;
            

            /**
            *  SAMLSSOAuthnReqDTO bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SAMLSSOAuthnReqDTO
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SAMLSSOAuthnReqDTO
                Namespace URI = http://dto.saml.sso.identity.carbon.wso2.org/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AssertionConsumerURL
                        */

                        
                                    protected java.lang.String localAssertionConsumerURL ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssertionConsumerURLTracker = false ;

                           public boolean isAssertionConsumerURLSpecified(){
                               return localAssertionConsumerURLTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAssertionConsumerURL(){
                               return localAssertionConsumerURL;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AssertionConsumerURL
                               */
                               public void setAssertionConsumerURL(java.lang.String param){
                            localAssertionConsumerURLTracker = true;
                                   
                                            this.localAssertionConsumerURL=param;
                                    

                               }
                            

                        /**
                        * field for AttributeConsumingServiceIndex
                        */

                        
                                    protected int localAttributeConsumingServiceIndex ;
                                
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
                           * @return int
                           */
                           public  int getAttributeConsumingServiceIndex(){
                               return localAttributeConsumingServiceIndex;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AttributeConsumingServiceIndex
                               */
                               public void setAttributeConsumingServiceIndex(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localAttributeConsumingServiceIndexTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localAttributeConsumingServiceIndex=param;
                                    

                               }
                            

                        /**
                        * field for Audience
                        */

                        
                                    protected java.lang.String localAudience ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAudienceTracker = false ;

                           public boolean isAudienceSpecified(){
                               return localAudienceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAudience(){
                               return localAudience;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Audience
                               */
                               public void setAudience(java.lang.String param){
                            localAudienceTracker = true;
                                   
                                            this.localAudience=param;
                                    

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
                        * field for Claim
                        */

                        
                                    protected java.lang.String localClaim ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClaimTracker = false ;

                           public boolean isClaimSpecified(){
                               return localClaimTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClaim(){
                               return localClaim;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Claim
                               */
                               public void setClaim(java.lang.String param){
                            localClaimTracker = true;
                                   
                                            this.localClaim=param;
                                    

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
                        * field for Id
                        */

                        
                                    protected java.lang.String localId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdTracker = false ;

                           public boolean isIdSpecified(){
                               return localIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(java.lang.String param){
                            localIdTracker = true;
                                   
                                            this.localId=param;
                                    

                               }
                            

                        /**
                        * field for IdPInitSSO
                        */

                        
                                    protected boolean localIdPInitSSO ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdPInitSSOTracker = false ;

                           public boolean isIdPInitSSOSpecified(){
                               return localIdPInitSSOTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIdPInitSSO(){
                               return localIdPInitSSO;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IdPInitSSO
                               */
                               public void setIdPInitSSO(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localIdPInitSSOTracker =
                                       true;
                                   
                                            this.localIdPInitSSO=param;
                                    

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
                        * field for Password
                        */

                        
                                    protected java.lang.String localPassword ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordTracker = false ;

                           public boolean isPasswordSpecified(){
                               return localPasswordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPassword(){
                               return localPassword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Password
                               */
                               public void setPassword(java.lang.String param){
                            localPasswordTracker = true;
                                   
                                            this.localPassword=param;
                                    

                               }
                            

                        /**
                        * field for QueryString
                        */

                        
                                    protected java.lang.String localQueryString ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryStringTracker = false ;

                           public boolean isQueryStringSpecified(){
                               return localQueryStringTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQueryString(){
                               return localQueryString;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryString
                               */
                               public void setQueryString(java.lang.String param){
                            localQueryStringTracker = true;
                                   
                                            this.localQueryString=param;
                                    

                               }
                            

                        /**
                        * field for RequestMessageString
                        */

                        
                                    protected java.lang.String localRequestMessageString ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestMessageStringTracker = false ;

                           public boolean isRequestMessageStringSpecified(){
                               return localRequestMessageStringTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRequestMessageString(){
                               return localRequestMessageString;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestMessageString
                               */
                               public void setRequestMessageString(java.lang.String param){
                            localRequestMessageStringTracker = true;
                                   
                                            this.localRequestMessageString=param;
                                    

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
                        * field for RpSessionId
                        */

                        
                                    protected java.lang.String localRpSessionId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRpSessionIdTracker = false ;

                           public boolean isRpSessionIdSpecified(){
                               return localRpSessionIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRpSessionId(){
                               return localRpSessionId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RpSessionId
                               */
                               public void setRpSessionId(java.lang.String param){
                            localRpSessionIdTracker = true;
                                   
                                            this.localRpSessionId=param;
                                    

                               }
                            

                        /**
                        * field for StratosDeployment
                        */

                        
                                    protected boolean localStratosDeployment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStratosDeploymentTracker = false ;

                           public boolean isStratosDeploymentSpecified(){
                               return localStratosDeploymentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getStratosDeployment(){
                               return localStratosDeployment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StratosDeployment
                               */
                               public void setStratosDeployment(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localStratosDeploymentTracker =
                                       true;
                                   
                                            this.localStratosDeployment=param;
                                    

                               }
                            

                        /**
                        * field for Subject
                        */

                        
                                    protected java.lang.String localSubject ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubjectTracker = false ;

                           public boolean isSubjectSpecified(){
                               return localSubjectTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSubject(){
                               return localSubject;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Subject
                               */
                               public void setSubject(java.lang.String param){
                            localSubjectTracker = true;
                                   
                                            this.localSubject=param;
                                    

                               }
                            

                        /**
                        * field for UseFullyQualifiedUsernameAsSubject
                        */

                        
                                    protected boolean localUseFullyQualifiedUsernameAsSubject ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUseFullyQualifiedUsernameAsSubjectTracker = false ;

                           public boolean isUseFullyQualifiedUsernameAsSubjectSpecified(){
                               return localUseFullyQualifiedUsernameAsSubjectTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUseFullyQualifiedUsernameAsSubject(){
                               return localUseFullyQualifiedUsernameAsSubject;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UseFullyQualifiedUsernameAsSubject
                               */
                               public void setUseFullyQualifiedUsernameAsSubject(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localUseFullyQualifiedUsernameAsSubjectTracker =
                                       true;
                                   
                                            this.localUseFullyQualifiedUsernameAsSubject=param;
                                    

                               }
                            

                        /**
                        * field for Username
                        */

                        
                                    protected java.lang.String localUsername ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsernameTracker = false ;

                           public boolean isUsernameSpecified(){
                               return localUsernameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsername(){
                               return localUsername;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Username
                               */
                               public void setUsername(java.lang.String param){
                            localUsernameTracker = true;
                                   
                                            this.localUsername=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://dto.saml.sso.identity.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SAMLSSOAuthnReqDTO",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SAMLSSOAuthnReqDTO",
                           xmlWriter);
                   }

               
                   }
                if (localAssertionConsumerURLTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "assertionConsumerURL", xmlWriter);
                             

                                          if (localAssertionConsumerURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAssertionConsumerURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttributeConsumingServiceIndexTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "attributeConsumingServiceIndex", xmlWriter);
                             
                                               if (localAttributeConsumingServiceIndex==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("attributeConsumingServiceIndex cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttributeConsumingServiceIndex));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAudienceTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "audience", xmlWriter);
                             

                                          if (localAudience==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAudience);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertAliasTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "certAlias", xmlWriter);
                             

                                          if (localCertAlias==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCertAlias);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClaimTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "claim", xmlWriter);
                             

                                          if (localClaim==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClaim);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDoSignAssertionsTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "doSignAssertions", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("doSignAssertions cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSignAssertions));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDoSignResponseTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "doSignResponse", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("doSignResponse cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSignResponse));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDoSingleLogoutTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "doSingleLogout", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("doSingleLogout cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSingleLogout));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIdTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "id", xmlWriter);
                             

                                          if (localId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIdPInitSSOTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "idPInitSSO", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("idPInitSSO cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdPInitSSO));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIssuerTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "issuer", xmlWriter);
                             

                                          if (localIssuer==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIssuer);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLoginPageURLTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "loginPageURL", xmlWriter);
                             

                                          if (localLoginPageURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLoginPageURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLogoutURLTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "logoutURL", xmlWriter);
                             

                                          if (localLogoutURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLogoutURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameIDFormatTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nameIDFormat", xmlWriter);
                             

                                          if (localNameIDFormat==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNameIDFormat);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameIdClaimUriTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nameIdClaimUri", xmlWriter);
                             

                                          if (localNameIdClaimUri==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNameIdClaimUri);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "password", xmlWriter);
                             

                                          if (localPassword==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPassword);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQueryStringTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "queryString", xmlWriter);
                             

                                          if (localQueryString==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQueryString);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestMessageStringTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "requestMessageString", xmlWriter);
                             

                                          if (localRequestMessageString==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequestMessageString);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestedAudiencesTracker){
                             if (localRequestedAudiences!=null) {
                                   namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localRequestedAudiences.length;i++){
                                        
                                            if (localRequestedAudiences[i] != null){
                                        
                                                writeStartElement(null, namespace, "requestedAudiences", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedAudiences[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "requestedAudiences", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://dto.saml.sso.identity.carbon.wso2.org/xsd", "requestedAudiences", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localRequestedClaimsTracker){
                             if (localRequestedClaims!=null) {
                                   namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localRequestedClaims.length;i++){
                                        
                                            if (localRequestedClaims[i] != null){
                                        
                                                writeStartElement(null, namespace, "requestedClaims", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedClaims[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "requestedClaims", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://dto.saml.sso.identity.carbon.wso2.org/xsd", "requestedClaims", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localRpSessionIdTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "rpSessionId", xmlWriter);
                             

                                          if (localRpSessionId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRpSessionId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStratosDeploymentTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "stratosDeployment", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("stratosDeployment cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStratosDeployment));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSubjectTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "subject", xmlWriter);
                             

                                          if (localSubject==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSubject);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUseFullyQualifiedUsernameAsSubjectTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "useFullyQualifiedUsernameAsSubject", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("useFullyQualifiedUsernameAsSubject cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUseFullyQualifiedUsernameAsSubject));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsernameTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "username", xmlWriter);
                             

                                          if (localUsername==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsername);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://dto.saml.sso.identity.carbon.wso2.org/xsd")){
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

                 if (localAssertionConsumerURLTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "assertionConsumerURL"));
                                 
                                         elementList.add(localAssertionConsumerURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAssertionConsumerURL));
                                    } if (localAttributeConsumingServiceIndexTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "attributeConsumingServiceIndex"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttributeConsumingServiceIndex));
                            } if (localAudienceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "audience"));
                                 
                                         elementList.add(localAudience==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAudience));
                                    } if (localCertAliasTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "certAlias"));
                                 
                                         elementList.add(localCertAlias==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertAlias));
                                    } if (localClaimTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "claim"));
                                 
                                         elementList.add(localClaim==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClaim));
                                    } if (localDoSignAssertionsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "doSignAssertions"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSignAssertions));
                            } if (localDoSignResponseTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "doSignResponse"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSignResponse));
                            } if (localDoSingleLogoutTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "doSingleLogout"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSingleLogout));
                            } if (localIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "id"));
                                 
                                         elementList.add(localId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                                    } if (localIdPInitSSOTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "idPInitSSO"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdPInitSSO));
                            } if (localIssuerTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "issuer"));
                                 
                                         elementList.add(localIssuer==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssuer));
                                    } if (localLoginPageURLTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "loginPageURL"));
                                 
                                         elementList.add(localLoginPageURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoginPageURL));
                                    } if (localLogoutURLTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "logoutURL"));
                                 
                                         elementList.add(localLogoutURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogoutURL));
                                    } if (localNameIDFormatTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "nameIDFormat"));
                                 
                                         elementList.add(localNameIDFormat==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameIDFormat));
                                    } if (localNameIdClaimUriTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "nameIdClaimUri"));
                                 
                                         elementList.add(localNameIdClaimUri==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameIdClaimUri));
                                    } if (localPasswordTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "password"));
                                 
                                         elementList.add(localPassword==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
                                    } if (localQueryStringTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "queryString"));
                                 
                                         elementList.add(localQueryString==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueryString));
                                    } if (localRequestMessageStringTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "requestMessageString"));
                                 
                                         elementList.add(localRequestMessageString==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestMessageString));
                                    } if (localRequestedAudiencesTracker){
                            if (localRequestedAudiences!=null){
                                  for (int i = 0;i < localRequestedAudiences.length;i++){
                                      
                                         if (localRequestedAudiences[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                              "requestedAudiences"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedAudiences[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                              "requestedAudiences"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                              "requestedAudiences"));
                                    elementList.add(null);
                                
                            }

                        } if (localRequestedClaimsTracker){
                            if (localRequestedClaims!=null){
                                  for (int i = 0;i < localRequestedClaims.length;i++){
                                      
                                         if (localRequestedClaims[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                              "requestedClaims"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedClaims[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                              "requestedClaims"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                              "requestedClaims"));
                                    elementList.add(null);
                                
                            }

                        } if (localRpSessionIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "rpSessionId"));
                                 
                                         elementList.add(localRpSessionId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRpSessionId));
                                    } if (localStratosDeploymentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "stratosDeployment"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStratosDeployment));
                            } if (localSubjectTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "subject"));
                                 
                                         elementList.add(localSubject==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubject));
                                    } if (localUseFullyQualifiedUsernameAsSubjectTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "useFullyQualifiedUsernameAsSubject"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUseFullyQualifiedUsernameAsSubject));
                            } if (localUsernameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "username"));
                                 
                                         elementList.add(localUsername==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsername));
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
        public static SAMLSSOAuthnReqDTO parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SAMLSSOAuthnReqDTO object =
                new SAMLSSOAuthnReqDTO();

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
                    
                            if (!"SAMLSSOAuthnReqDTO".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SAMLSSOAuthnReqDTO)org.wso2.carbon.identity.sso.saml.stub.types.axis2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list19 = new java.util.ArrayList();
                    
                        java.util.ArrayList list20 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","assertionConsumerURL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAssertionConsumerURL(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","attributeConsumingServiceIndex").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attributeConsumingServiceIndex" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAttributeConsumingServiceIndex(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAttributeConsumingServiceIndex(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","audience").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAudience(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","certAlias").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","claim").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClaim(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","doSignAssertions").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","doSignResponse").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","doSingleLogout").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","id").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","idPInitSSO").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"idPInitSSO" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIdPInitSSO(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","issuer").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","loginPageURL").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","logoutURL").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","nameIDFormat").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","nameIdClaimUri").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","password").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPassword(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","queryString").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQueryString(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","requestMessageString").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRequestMessageString(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","requestedAudiences").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","requestedAudiences").equals(reader.getName())){
                                                         
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
                                            
                                                    object.setRequestedAudiences((java.lang.String[])
                                                        list19.toArray(new java.lang.String[list19.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","requestedClaims").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","requestedClaims").equals(reader.getName())){
                                                         
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
                                            
                                                    object.setRequestedClaims((java.lang.String[])
                                                        list20.toArray(new java.lang.String[list20.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","rpSessionId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRpSessionId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","stratosDeployment").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"stratosDeployment" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStratosDeployment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","subject").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSubject(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","useFullyQualifiedUsernameAsSubject").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"useFullyQualifiedUsernameAsSubject" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUseFullyQualifiedUsernameAsSubject(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","username").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsername(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
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
           
    