
/**
 * SAMLSSOReqValidationResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Dec 06, 2014 (05:07:07 IST)
 */

            
                package org.wso2.carbon.identity.sso.saml.stub.types;
            

            /**
            *  SAMLSSOReqValidationResponseDTO bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SAMLSSOReqValidationResponseDTO
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SAMLSSOReqValidationResponseDTO
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
                        * field for LogOutReq
                        */

                        
                                    protected boolean localLogOutReq ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLogOutReqTracker = false ;

                           public boolean isLogOutReqSpecified(){
                               return localLogOutReqTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getLogOutReq(){
                               return localLogOutReq;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LogOutReq
                               */
                               public void setLogOutReq(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localLogOutReqTracker =
                                       true;
                                   
                                            this.localLogOutReq=param;
                                    

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
                        * field for LogoutRespDTO
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO[] localLogoutRespDTO ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLogoutRespDTOTracker = false ;

                           public boolean isLogoutRespDTOSpecified(){
                               return localLogoutRespDTOTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO[]
                           */
                           public  org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO[] getLogoutRespDTO(){
                               return localLogoutRespDTO;
                           }

                           
                        


                               
                              /**
                               * validate the array for LogoutRespDTO
                               */
                              protected void validateLogoutRespDTO(org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LogoutRespDTO
                              */
                              public void setLogoutRespDTO(org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO[] param){
                              
                                   validateLogoutRespDTO(param);

                               localLogoutRespDTOTracker = true;
                                      
                                      this.localLogoutRespDTO=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO
                             */
                             public void addLogoutRespDTO(org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO param){
                                   if (localLogoutRespDTO == null){
                                   localLogoutRespDTO = new org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO[]{};
                                   }

                            
                                 //update the setting tracker
                                localLogoutRespDTOTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLogoutRespDTO);
                               list.add(param);
                               this.localLogoutRespDTO =
                             (org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO[])list.toArray(
                            new org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO[list.size()]);

                             }
                             

                        /**
                        * field for LogoutResponse
                        */

                        
                                    protected java.lang.String localLogoutResponse ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLogoutResponseTracker = false ;

                           public boolean isLogoutResponseSpecified(){
                               return localLogoutResponseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLogoutResponse(){
                               return localLogoutResponse;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LogoutResponse
                               */
                               public void setLogoutResponse(java.lang.String param){
                            localLogoutResponseTracker = true;
                                   
                                            this.localLogoutResponse=param;
                                    

                               }
                            

                        /**
                        * field for Passive
                        */

                        
                                    protected boolean localPassive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPassiveTracker = false ;

                           public boolean isPassiveSpecified(){
                               return localPassiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPassive(){
                               return localPassive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Passive
                               */
                               public void setPassive(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localPassiveTracker =
                                       true;
                                   
                                            this.localPassive=param;
                                    

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
                        * field for Response
                        */

                        
                                    protected java.lang.String localResponse ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResponseTracker = false ;

                           public boolean isResponseSpecified(){
                               return localResponseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResponse(){
                               return localResponse;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Response
                               */
                               public void setResponse(java.lang.String param){
                            localResponseTracker = true;
                                   
                                            this.localResponse=param;
                                    

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
                        * field for Valid
                        */

                        
                                    protected boolean localValid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValidTracker = false ;

                           public boolean isValidSpecified(){
                               return localValidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getValid(){
                               return localValid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Valid
                               */
                               public void setValid(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localValidTracker =
                                       true;
                                   
                                            this.localValid=param;
                                    

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
                           namespacePrefix+":SAMLSSOReqValidationResponseDTO",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SAMLSSOReqValidationResponseDTO",
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
                             } if (localLogOutReqTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "logOutReq", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("logOutReq cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogOutReq));
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
                             } if (localLogoutRespDTOTracker){
                                       if (localLogoutRespDTO!=null){
                                            for (int i = 0;i < localLogoutRespDTO.length;i++){
                                                if (localLogoutRespDTO[i] != null){
                                                 localLogoutRespDTO[i].serialize(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","logoutRespDTO"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://dto.saml.sso.identity.carbon.wso2.org/xsd", "logoutRespDTO", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://dto.saml.sso.identity.carbon.wso2.org/xsd", "logoutRespDTO", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localLogoutResponseTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "logoutResponse", xmlWriter);
                             

                                          if (localLogoutResponse==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLogoutResponse);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPassiveTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "passive", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("passive cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassive));
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
                             } if (localResponseTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "response", xmlWriter);
                             

                                          if (localResponse==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResponse);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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
                             } if (localValidTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "valid", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("valid cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValid));
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
                                    } if (localLogOutReqTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "logOutReq"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogOutReq));
                            } if (localLoginPageURLTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "loginPageURL"));
                                 
                                         elementList.add(localLoginPageURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoginPageURL));
                                    } if (localLogoutRespDTOTracker){
                             if (localLogoutRespDTO!=null) {
                                 for (int i = 0;i < localLogoutRespDTO.length;i++){

                                    if (localLogoutRespDTO[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                          "logoutRespDTO"));
                                         elementList.add(localLogoutRespDTO[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                          "logoutRespDTO"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                          "logoutRespDTO"));
                                        elementList.add(localLogoutRespDTO);
                                    
                             }

                        } if (localLogoutResponseTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "logoutResponse"));
                                 
                                         elementList.add(localLogoutResponse==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogoutResponse));
                                    } if (localPassiveTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "passive"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassive));
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
                                    } if (localResponseTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "response"));
                                 
                                         elementList.add(localResponse==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponse));
                                    } if (localRpSessionIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "rpSessionId"));
                                 
                                         elementList.add(localRpSessionId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRpSessionId));
                                    } if (localSubjectTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "subject"));
                                 
                                         elementList.add(localSubject==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubject));
                                    } if (localValidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "valid"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValid));
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
        public static SAMLSSOReqValidationResponseDTO parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SAMLSSOReqValidationResponseDTO object =
                new SAMLSSOReqValidationResponseDTO();

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
                    
                            if (!"SAMLSSOReqValidationResponseDTO".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SAMLSSOReqValidationResponseDTO)org.wso2.carbon.identity.sso.saml.stub.types.axis2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","logOutReq").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"logOutReq" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLogOutReq(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","logoutRespDTO").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list8.add(null);
                                                              reader.next();
                                                          } else {
                                                        list8.add(org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone8 = false;
                                                        while(!loopDone8){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone8 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","logoutRespDTO").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list8.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list8.add(org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone8 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLogoutRespDTO((org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO.class,
                                                                list8));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","logoutResponse").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLogoutResponse(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","passive").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"passive" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPassive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","response").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResponse(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","valid").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"valid" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setValid(
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
           
    