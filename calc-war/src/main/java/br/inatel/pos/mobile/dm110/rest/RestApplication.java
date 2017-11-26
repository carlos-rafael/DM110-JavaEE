package br.inatel.pos.mobile.dm110.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.pos.mobile.dm110.impl.HelloServiceImpl;

//define o path da aplica��o rest
@ApplicationPath("/rest")
public class RestApplication extends Application {
	
	//essa medida � necess�ria para que as classes do outro projeto sejam vis�veis a este.
	@Override
	public Set<Class<?>> getClasses() {
		//adicionamos � HashSet classes a classe que implementa os servi�os definidos pela interface HelloService
		Set<Class<?>> classes = new HashSet<>();
		classes.add(HelloServiceImpl.class);
		return classes;
	}

}
