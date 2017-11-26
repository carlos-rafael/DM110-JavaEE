package br.inatel.pos.mobile.dm110.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//define o caminho para acessar os servicços definidos nessa classe
@Path("/calc")
public interface HelloService {
	
	//método GET que realiza a operação de soma, utilizando parâmetro de query
	@GET
	@Path("/sum/{first}/{second}")
	//O retorno desse método é do tipo JSON
	@Produces(MediaType.APPLICATION_JSON)
	//define método de soma, a ser implementado pela classe HelloServiceImpl
	Result sum(@PathParam("first")String first, @PathParam("second")String second);
	
	//método POST que realiza a operação de subtração, utilizando parâmetro de form
	@POST
	@Path("/subtract")
	//o retono desse método é do tipo JSON
	@Produces(MediaType.APPLICATION_JSON)
	//define o método de subtração, a ser implementaado pela classe HelloServiceImpl
	Result buildSubMessage(@FormParam("first") String first, @FormParam("second") String second);
	
}