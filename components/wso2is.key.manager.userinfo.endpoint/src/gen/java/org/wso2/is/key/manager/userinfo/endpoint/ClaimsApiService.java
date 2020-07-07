package org.wso2.is.key.manager.userinfo.endpoint;

import org.wso2.is.key.manager.userinfo.endpoint.*;
import org.wso2.is.key.manager.userinfo.endpoint.dto.*;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;


import org.wso2.is.key.manager.userinfo.endpoint.dto.ClaimListDTO;
import org.wso2.is.key.manager.userinfo.endpoint.dto.ClaimRequestDTO;
import org.wso2.is.key.manager.userinfo.endpoint.dto.ErrorDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface ClaimsApiService {
      public Response claimsGeneratePost(ClaimRequestDTO properties, MessageContext messageContext) ;
      public Response claimsGet(String username, String domain, String dialect, MessageContext messageContext) ;
}