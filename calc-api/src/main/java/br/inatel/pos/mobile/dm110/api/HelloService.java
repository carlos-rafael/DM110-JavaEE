package br.inatel.pos.mobile.dm110.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//define o caminho para acessar os servic�os definidos nessa classe
@Path("/calc")
public interface HelloService {
	
	//m�todo GET que realiza a opera��o de soma, utilizando par�metro de query
	@GET
	@Path("/sum/{first}/{second}")
	//O retorno desse m�todo � do tipo JSON
	@Produces(MediaType.APPLICATION_JSON)
	//define m�todo de soma, a ser implementado pela classe HelloServiceImpl
	Result sum(@PathParam("first")String first, @PathParam("second")String second);
	
	//m�todo POST que realiza a opera��o de subtra��o, utilizando par�metro de form
	@POST
	@Path("/subtract")
	//o retono desse m�todo � do tipo JSON
	@Produces(MediaType.APPLICATION_JSON)
	//define o m�todo de subtra��o, a ser implementaado pela classe HelloServiceImpl
	Result buildSubMessage(@FormParam("first") String first, @FormParam("second") String second);
	
}