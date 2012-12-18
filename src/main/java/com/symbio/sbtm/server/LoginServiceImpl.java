package com.symbio.sbtm.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.symbio.sbtm.client.LoginService;

@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {

	@Override
	public String greetServer(String name, String password)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if (name.equals("admin") && password.equals(""))
			return "Login successfully";
		else
			return "Invalid user name and password";
	}

}
