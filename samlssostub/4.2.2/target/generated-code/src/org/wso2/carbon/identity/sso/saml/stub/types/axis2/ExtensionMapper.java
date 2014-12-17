
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Dec 06, 2014 (05:07:07 IST)
 */

        
            package org.wso2.carbon.identity.sso.saml.stub.types.axis2;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://dto.saml.sso.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SAMLSSOReqValidationResponseDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSOReqValidationResponseDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.saml.sso.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SAMLSSOAuthnReqDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSOAuthnReqDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://base.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "IdentityException".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.sso.saml.stub.types.base.IdentityException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.saml.sso.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SAMLSSORespDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.sso.saml.stub.types.SAMLSSORespDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.saml.sso.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SingleLogoutRequestDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.sso.saml.stub.types.SingleLogoutRequestDTO.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    