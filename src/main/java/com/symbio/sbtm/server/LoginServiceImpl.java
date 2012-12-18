package com.symbio.sbtm.server;

import com.symbio.sbtm.client.LoginService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {
	@Override
	public String loginServer(String name, String password)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
}
