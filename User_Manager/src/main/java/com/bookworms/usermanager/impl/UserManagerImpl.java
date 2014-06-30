package com.bookworms.usermanager.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.bookworms.usermanager.AddUser;
import com.bookworms.usermanager.AddUserResponse;
import com.bookworms.usermanager.ClientFaultMessage;
import com.bookworms.usermanager.ForgotPasswordRequest;
import com.bookworms.usermanager.ForgotPasswordResponse;
import com.bookworms.usermanager.GetUserRequest;
import com.bookworms.usermanager.ResetPasswordRequest;
import com.bookworms.usermanager.ResetPasswordResponse;
import com.bookworms.usermanager.ServerFaultMessage;
import com.bookworms.usermanager.SignInResponse;
import com.bookworms.usermanager.SignInUser;
import com.bookworms.usermanager.UserManagerPortType;
import com.bookworms.ws.faults.ClientFault;
import com.bookworms.ws.faults.FaultDetails;

@WebService(serviceName = "UserManagerImpl", targetNamespace = "http://bookWorms.com/usermanager", endpointInterface = "com.bookworms.usermanager.UserManagerPortType")
public class UserManagerImpl implements UserManagerPortType {
	@WebResult(name = "resetPasswordResponse", targetNamespace = "http://bookWorms.com/usermanager", partName = "resetPasswordResponse")
	@WebMethod
	public ResetPasswordResponse resetPassword(
			@WebParam(partName = "resetPasswordRequest", name = "resetPasswordRequest", targetNamespace = "http://bookWorms.com/usermanager") ResetPasswordRequest resetPasswordRequest)
			throws ClientFaultMessage, ServerFaultMessage {
		return null;
	}

	@WebResult(name = "signInResponse", targetNamespace = "http://bookWorms.com/usermanager", partName = "signInResponse")
	@WebMethod
	public SignInResponse signIn(
			@WebParam(partName = "signInRequest", name = "signInRequest", targetNamespace = "http://bookWorms.com/usermanager") SignInUser signInRequest)
			throws ClientFaultMessage, ServerFaultMessage {
		return null;
	}

	@WebResult(name = "forgotPasswordResponse", targetNamespace = "http://bookWorms.com/usermanager", partName = "forgotPasswordResponse")
	@WebMethod
	public ForgotPasswordResponse forgotPassword(
			@WebParam(partName = "forgotPasswordRequest", name = "forgotPasswordRequest", targetNamespace = "http://bookWorms.com/usermanager") ForgotPasswordRequest forgotPasswordRequest)
			throws ClientFaultMessage, ServerFaultMessage {
		return null;
	}

	@WebResult(name = "addUserResponse", targetNamespace = "http://bookWorms.com/usermanager", partName = "addUserResponse")
	@WebMethod
	public AddUserResponse addUser(
			@WebParam(partName = "addUserRquest", name = "addUserRequest", targetNamespace = "http://bookWorms.com/usermanager") AddUser addUserRquest)
			throws ClientFaultMessage, ServerFaultMessage {
		return null;
	}

	@WebResult(name = "addUserResponse", targetNamespace = "http://bookWorms.com/usermanager", partName = "getUserResponse")
	@WebMethod
	public AddUserResponse getUser(
			@WebParam(partName = "getUserRequest", name = "getUserRequest", targetNamespace = "http://bookWorms.com/usermanager") GetUserRequest getUserRequest)
			throws ClientFaultMessage, ServerFaultMessage {
		FaultDetails details=new FaultDetails();
		details.setCode("9999");
		details.setText("Exception in DB");
		ClientFault clientFault=new ClientFault();
		clientFault.setFault(details);
		if(getUserRequest.getUserId()<=0)
			throw new ClientFaultMessage("error in DB",clientFault);
		return null;
	}

}
