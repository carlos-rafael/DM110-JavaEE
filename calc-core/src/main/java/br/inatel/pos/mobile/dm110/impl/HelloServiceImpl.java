package br.inatel.pos.mobile.dm110.impl;

import br.inatel.pos.mobile.dm110.api.HelloService;
import br.inatel.pos.mobile.dm110.api.Result;

//Classe responsável por implementar os métodos definidos na interface HelloService
public class HelloServiceImpl implements HelloService{

	//Implementa o método de soma, recebendo como parâmteros de entrada os dois números inseridos na url
	@Override
	public Result sum(String num1, String num2) {
		//como recebi o valor em String, foi necessário convertê-lo para int, se não o fizesse os valores seriam concatenados.
		int num1Int = Integer.parseInt(num1);
		int num2Int = Integer.parseInt(num2);
		int resultado = num1Int + num2Int;
		
		String message = Integer.toString(resultado);
		Result result = new Result();
		result.setFirst(num1);
		result.setSecond(num2);
		result.setResult(message);
		//retorno do resultado
		return result;
	}

	//Implementa o método de subtração, recebendo como parâmetros de entrada dois números, enviados através do form do POSTMAN
	@Override
	public Result buildSubMessage(String num1, String num2) {
		//realizei o parse para int para ter certeza que estaria realizando a operação de subtração com números e nõ strings
		int resultado = Integer.parseInt(num1) - Integer.parseInt(num2);
		
		//criação do objeto do tipo Result, que será retornado ao usuário em JSON
		String message = Integer.toString(resultado);
		Result result = new Result();
		result.setFirst(num1);
		result.setSecond(num2);
		result.setResult(message);
		//retorno do resultado
		return result;
	}
	
}
