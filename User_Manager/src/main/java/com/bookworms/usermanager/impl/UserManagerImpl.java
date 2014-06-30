package com.bookworms.usermanager.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.bookworms.usermanager.AddUser;
import com.bookworms.usermanager.AddUserResponse;
import com.bookworms.usermanager.GetUserRequest;
import com.bookworms.usermanager.SignInResponse;
import com.bookworms.usermanager.SignInUser;
import com.bookworms.usermanager.UserManagerPortType;

@WebService(serviceName = "UserManagerImpl", targetNamespace = "http://bookWorms.com/usermanager", endpointInterface = "com.bookworms.usermanager.UserManagerPortType")
public class UserManagerImpl implements UserManagerPortType {

	@WebResult(name = "addUserResponse", targetNamespace = "http://bookWorms.com/usermanager", partName = "getUserResponse")
	@WebMethod
	public AddUserResponse getUser(
			@WebParam(partName = "getUserRequest", name = "getUserRequest", targetNamespace = "http://bookWorms.com/usermanager") GetUserRequest getUserRequest) {
		return null;
	}

	@WebResult(name = "signInResponse", targetNamespace = "http://bookWorms.com/usermanager", partName = "signInResponse")
	@WebMethod
	public SignInResponse signIn(
			@WebParam(partName = "signInRequest", name = "signInRequest", targetNamespace = "http://bookWorms.com/usermanager") SignInUser signInRequest) {
		return null;
	}

	@WebResult(name = "addUserResponse", targetNamespace = "http://bookWorms.com/usermanager", partName = "addUserResponse")
	@WebMethod
	public AddUserResponse addUser(
			@WebParam(partName = "addUserRquest", name = "addUserRequest", targetNamespace = "http://bookWorms.com/usermanager") AddUser addUserRquest) {
		return null;
	}

}