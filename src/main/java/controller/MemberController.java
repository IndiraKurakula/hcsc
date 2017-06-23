package controller;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import bean.AppDetails;
import bean.Member;
import service.MemberService;

import com.sun.jersey.api.view.Viewable;

@Path("/members")
public class MemberController {

	MemberService memberService = new MemberService();

	/* hit url with rest/members, then it wll return all data in json */
	
	  /*@GET	 
	  @Produces(MediaType.APPLICATION_JSON) 
	  public List<Member> getCountries()
	  { System.out.println("inside member getCountries"); List<Member>
	  listOfMembers=memberService.getAllMembers();
	  return listOfMembers; }*/
	 

	/* hit url with rest/members/7, then it wll return hello word 7 */
	/*
	 * @GET
	 * 
	 * @Path("/{id}")
	 * 
	 * @Produces(MediaType.TEXT_HTML) public String
	 * getCountryById(@PathParam("id") int id) {
	 * 
	 * System.out.println("inside getCountryById"); return "hello world " + id ;
	 * }
	 */

	/*
	 * click on button in index.jsp then it wll return status of user
	 * 
	 * @POST
	 * 
	 * @Path("/{id}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public String
	 * getuserstatus(@FormParam("usernumber") int usernumber) {
	 * 
	 * System.out.println("inside getuserstatus"); return "hello world" +
	 * usernumber ; String status = memberService.verifydetails(usernumber);
	 * System.out.println("outside of Dao");
	 * 
	 * return "status value of user " + status; }
	 */

	@POST
	/* @Path("/{id}") */
	@Produces(MediaType.APPLICATION_JSON)
	public Viewable getuserstatus(@FormParam("usernumber") int usernumber) {

		String status = memberService.verifydetails(usernumber);
		System.out.println("status in controller " + status);

		Map<String, String> model = new HashMap<>();
		model.put("usernumber", "status");

		Viewable v = null;
		String msg = "Invalid User!!! Access Denied";

		if (status.equals("Active"))
			/*v = new Viewable("/index1.jsp", model);*/
			v = new Viewable("/demo.jsp", model);
		else if (status.equals("Inactive"))
			v = new Viewable("/LoginFail.jsp", model);

		/* request.setAttribute("msg", "Invalid user or password"); */

		return v;
	}

	/* for application detail from db */
	@POST
	@Path("/details")
	@Produces(MediaType.APPLICATION_JSON)
	public List<AppDetails> getappdetail(@FormParam("appnumber") int appnumber) {

		System.out.println("inside getuserstatus");
		// return "hello world" + usernumber ;
		List<AppDetails> listOfMembers = memberService.getappdetails(appnumber);
		return listOfMembers;
	}

	/*
	 * @GET
	 * 
	 * @Path("/{id}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Country
	 * getCountryById(@PathParam("id") int id) { System.out.println(
	 * "inside getCountryById"); return countryService.getCountry(id); }
	 * 
	 * 
	 * 
	 * @POST
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Country addCountry(Country
	 * country) { System.out.println("inside addCountry"); Country c= new
	 * Country(); c=countryService.addCountry(country); System.out.println(
	 * "country : "+c); System.out.println("country : "+c.getCountryName());
	 * System.out.println("country : "+c.getId());
	 * 
	 * return countryService.addCountry(country); }
	 * 
	 * @PUT
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Country
	 * updateCountry(Country country) { System.out.println(
	 * "inside updateCountry"); return countryService.updateCountry(country);
	 * 
	 * }
	 * 
	 * @DELETE
	 * 
	 * @Path("/{id}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public void
	 * deleteCountry(@PathParam("id") int id) { System.out.println(
	 * "inside deleteCountry"); countryService.deleteCountry(id);
	 * 
	 * }
	 */

}
