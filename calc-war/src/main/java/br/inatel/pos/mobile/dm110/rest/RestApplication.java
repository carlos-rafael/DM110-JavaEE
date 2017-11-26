package br.inatel.pos.mobile.dm110.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.pos.mobile.dm110.impl.HelloServiceImpl;

//define o path da aplicação rest
@ApplicationPath("/rest")
public class RestApplication extends Application {
	
	//essa medida é necessária para que as classes do outro projeto sejam visíveis a este.
	@Override
	public Set<Class<?>> getClasses() {
		//adicionamos à HashSet classes a classe que implementa os serviços definidos pela interface HelloService
		Set<Class<?>> classes = new HashSet<>();
		classes.add(HelloServiceImpl.class);
		return classes;
	}

}
