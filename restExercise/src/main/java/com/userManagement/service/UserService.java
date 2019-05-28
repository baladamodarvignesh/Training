/**
 * 
 */
package com.userManagement.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.userManagement.bean.User;
import com.userManagement.dao.UserDAO;

/**
 * @author balavign
 *
 */
@Path("/UserService")

public class UserService {
	UserDAO userDao = new UserDAO();
	private static final String SUCCESS_RESULT="<result>success</result>";
	   private static final String FAILURE_RESULT="<result>failure</result>";


	@GET
	@Path("/users")
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers() {
		return userDao.getAllUsers();
	}

	@GET
	@Path("/users/{userid}")
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("userid") int userid) {
		return userDao.getUser(userid);
	}

	@POST
	@Path("/users")
//	@Produces(MediaType.APPLICATION_XML)
//	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String createUser(User e)
			throws IOException {
		
		int result = userDao.addUser(e);
		if (result == 1) {
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}

	@PUT
	@Path("/users")
//	@Produces(MediaType.APPLICATION_XML)
//	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateUser(User user)
			throws IOException {
		
		int result = userDao.updateUser(user);
		if (result == 1) {
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}

	@DELETE
	@Path("/users/{userid}")
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteUser(@PathParam("userid") int userid) {
		int result = userDao.deleteUser(userid);
		if (result == 1) {
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}

	@OPTIONS
	@Path("/users")
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public String getSupportedOperations() {
		return "<operations>GET, PUT, POST, DELETE</operations>";
	}
}
