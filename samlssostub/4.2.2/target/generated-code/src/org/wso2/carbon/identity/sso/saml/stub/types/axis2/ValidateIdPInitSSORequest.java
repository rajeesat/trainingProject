
/**
 * ValidateIdPInitSSORequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Dec 06, 2014 (05:07:07 IST)
 */

            
                package org.wso2.carbon.identity.sso.saml.stub.types.axis2;
            

            /**
            *  ValidateIdPInitSSORequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ValidateIdPInitSSORequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://org.apache.axis2/xsd",
                "validateIdPInitSSORequest",
                "ns3");

            

                        /**
                        * field for HttpServletRequest
                        */

                        
                                    protected java.lang.Object localHttpServletRequest ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHttpServletRequestTracker = false ;

                           public boolean isHttpServletRequestSpecified(){
                               return localHttpServletRequestTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getHttpServletRequest(){
                               return localHttpServletRequest;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HttpServletRequest
                               */
                               public void setHttpServletRequest(java.lang.Object param){
                            localHttpServletRequestTracker = true;
                                   
                                            this.localHttpServletRequest=param;
                                    

                               }
                            

                        /**
                        * field for HttpServletResponse
                        */

                        
                                    protected java.lang.Object localHttpServletResponse ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHttpServletResponseTracker = false ;

                           public boolean isHttpServletResponseSpecified(){
                               return localHttpServletResponseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getHttpServletResponse(){
                               return localHttpServletResponse;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HttpServletResponse
                               */
                               public void setHttpServletResponse(java.lang.Object param){
                            localHttpServletResponseTracker = true;
                                   
                                            this.localHttpServletResponse=param;
                                    

                               }
                            

                        /**
                        * field for SpEntityID
                        */

                        
                                    protected java.lang.String localSpEntityID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpEntityIDTracker = false ;

                           public boolean isSpEntityIDSpecified(){
                               return localSpEntityIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSpEntityID(){
                               return localSpEntityID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpEntityID
                               */
                               public void setSpEntityID(java.lang.String param){
                            localSpEntityIDTracker = true;
                                   
                                            this.localSpEntityID=param;
                                    

                               }
                            

                        /**
                        * field for RelayState
                        */

                        
                                    protected java.lang.String localRelayState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRelayStateTracker = false ;

                           public boolean isRelayStateSpecified(){
                               return localRelayStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRelayState(){
                               return localRelayState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RelayState
                               */
                               public void setRelayState(java.lang.String param){
                            localRelayStateTracker = true;
                                   
                                            this.localRelayState=param;
                                    

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
                        * field for SessionId
                        */

                        
                                    protected java.lang.String localSessionId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSessionIdTracker = false ;

                           public boolean isSessionIdSpecified(){
                               return localSessionIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSessionId(){
                               return localSessionId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SessionId
                               */
                               public void setSessionId(java.lang.String param){
                            localSessionIdTracker = true;
                                   
                                            this.localSessionId=param;
                                    

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
                        * field for AuthnMode
                        */

                        
                                    protected java.lang.String localAuthnMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAuthnModeTracker = false ;

                           public boolean isAuthnModeSpecified(){
                               return localAuthnModeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAuthnMode(){
                               return localAuthnMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AuthnMode
                               */
                               public void setAuthnMode(java.lang.String param){
                            localAuthnModeTracker = true;
                                   
                                            this.localAuthnMode=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://org.apache.axis2/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":validateIdPInitSSORequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "validateIdPInitSSORequest",
                           xmlWriter);
                   }

               
                   }
                if (localHttpServletRequestTracker){
                            
                            if (localHttpServletRequest!=null){
                                if (localHttpServletRequest instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localHttpServletRequest).serialize(
                                               new javax.xml.namespace.QName("http://org.apache.axis2/xsd","httpServletRequest"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://org.apache.axis2/xsd", "httpServletRequest", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localHttpServletRequest, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://org.apache.axis2/xsd", "httpServletRequest", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localHttpServletResponseTracker){
                            
                            if (localHttpServletResponse!=null){
                                if (localHttpServletResponse instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localHttpServletResponse).serialize(
                                               new javax.xml.namespace.QName("http://org.apache.axis2/xsd","httpServletResponse"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://org.apache.axis2/xsd", "httpServletResponse", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localHttpServletResponse, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://org.apache.axis2/xsd", "httpServletResponse", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localSpEntityIDTracker){
                                    namespace = "http://org.apache.axis2/xsd";
                                    writeStartElement(null, namespace, "spEntityID", xmlWriter);
                             

                                          if (localSpEntityID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSpEntityID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRelayStateTracker){
                                    namespace = "http://org.apache.axis2/xsd";
                                    writeStartElement(null, namespace, "relayState", xmlWriter);
                             

                                          if (localRelayState==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRelayState);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQueryStringTracker){
                                    namespace = "http://org.apache.axis2/xsd";
                                    writeStartElement(null, namespace, "queryString", xmlWriter);
                             

                                          if (localQueryString==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQueryString);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSessionIdTracker){
                                    namespace = "http://org.apache.axis2/xsd";
                                    writeStartElement(null, namespace, "sessionId", xmlWriter);
                             

                                          if (localSessionId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSessionId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRpSessionIdTracker){
                                    namespace = "http://org.apache.axis2/xsd";
                                    writeStartElement(null, namespace, "rpSessionId", xmlWriter);
                             

                                          if (localRpSessionId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRpSessionId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAuthnModeTracker){
                                    namespace = "http://org.apache.axis2/xsd";
                                    writeStartElement(null, namespace, "authnMode", xmlWriter);
                             

                                          if (localAuthnMode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAuthnMode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://org.apache.axis2/xsd")){
                return "ns3";
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

                 if (localHttpServletRequestTracker){
                            elementList.add(new javax.xml.namespace.QName("http://org.apache.axis2/xsd",
                                                                      "httpServletRequest"));
                            
                            
                                    elementList.add(localHttpServletRequest==null?null:
                                    localHttpServletRequest);
                                } if (localHttpServletResponseTracker){
                            elementList.add(new javax.xml.namespace.QName("http://org.apache.axis2/xsd",
                                                                      "httpServletResponse"));
                            
                            
                                    elementList.add(localHttpServletResponse==null?null:
                                    localHttpServletResponse);
                                } if (localSpEntityIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://org.apache.axis2/xsd",
                                                                      "spEntityID"));
                                 
                                         elementList.add(localSpEntityID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpEntityID));
                                    } if (localRelayStateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://org.apache.axis2/xsd",
                                                                      "relayState"));
                                 
                                         elementList.add(localRelayState==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRelayState));
                                    } if (localQueryStringTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://org.apache.axis2/xsd",
                                                                      "queryString"));
                                 
                                         elementList.add(localQueryString==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueryString));
                                    } if (localSessionIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://org.apache.axis2/xsd",
                                                                      "sessionId"));
                                 
                                         elementList.add(localSessionId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSessionId));
                                    } if (localRpSessionIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://org.apache.axis2/xsd",
                                                                      "rpSessionId"));
                                 
                                         elementList.add(localRpSessionId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRpSessionId));
                                    } if (localAuthnModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://org.apache.axis2/xsd",
                                                                      "authnMode"));
                                 
                                         elementList.add(localAuthnMode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthnMode));
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
        public static ValidateIdPInitSSORequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ValidateIdPInitSSORequest object =
                new ValidateIdPInitSSORequest();

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
                    
                            if (!"validateIdPInitSSORequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ValidateIdPInitSSORequest)org.wso2.carbon.identity.sso.saml.stub.types.axis2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://org.apache.axis2/xsd","httpServletRequest").equals(reader.getName())){
                                
                                     object.setHttpServletRequest(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.wso2.carbon.identity.sso.saml.stub.types.axis2.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://org.apache.axis2/xsd","httpServletResponse").equals(reader.getName())){
                                
                                     object.setHttpServletResponse(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.wso2.carbon.identity.sso.saml.stub.types.axis2.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://org.apache.axis2/xsd","spEntityID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSpEntityID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://org.apache.axis2/xsd","relayState").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRelayState(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://org.apache.axis2/xsd","queryString").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://org.apache.axis2/xsd","sessionId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSessionId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://org.apache.axis2/xsd","rpSessionId").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://org.apache.axis2/xsd","authnMode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAuthnMode(
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
           
    