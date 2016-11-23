package com.example.spring.client;

import java.util.Date;

import javax.ws.rs.core.MediaType;










import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.example.spring.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;


public class EmployeeClient {

	public static void main(String[] args){
		Client client=Client.create();
		

		WebResource webResource = client
				   .resource("http://localhost:8080/SpringRestExample");
		System.out.println("output"+ webResource.path("/rest/emp/dummy").accept(MediaType.APPLICATION_JSON).get(String.class));
		Employee empjson=new Employee();
		
		empjson.setId(8888);
		empjson.setName("Ajmal");
		empjson.setCreatedDate( new Date());

		ObjectMapper mapper=new ObjectMapper();
		try {
		client.addFilter(new HTTPBasicAuthFilter("user", "user"));	
		WebResource authResource = client
				   .resource("http://localhost:8080/SpringRestExample/rest/emp/create");
		ClientResponse createresponse=authResource.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(ClientResponse.class,mapper.writeValueAsString(empjson));
		System.out.println("Create Response code for create :" +createresponse.getStatus() );
		if(createresponse.getStatus()==200){
			System.out.println(createresponse.getEntity(String.class));
		}
		}catch (JsonProcessingException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("output"+ webResource.path("/rest/emp/8888").accept(MediaType.APPLICATION_JSON).get(String.class));
	}
	
}
