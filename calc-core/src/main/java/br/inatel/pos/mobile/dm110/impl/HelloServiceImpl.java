package br.inatel.pos.mobile.dm110.impl;

import br.inatel.pos.mobile.dm110.api.HelloService;
import br.inatel.pos.mobile.dm110.api.Result;

//Classe respons�vel por implementar os m�todos definidos na interface HelloService
public class HelloServiceImpl implements HelloService{

	//Implementa o m�todo de soma, recebendo como par�mteros de entrada os dois n�meros inseridos na url
	@Override
	public Result sum(String num1, String num2) {
		//como recebi o valor em String, foi necess�rio convert�-lo para int, se n�o o fizesse os valores seriam concatenados.
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

	//Implementa o m�todo de subtra��o, recebendo como par�metros de entrada dois n�meros, enviados atrav�s do form do POSTMAN
	@Override
	public Result buildSubMessage(String num1, String num2) {
		//realizei o parse para int para ter certeza que estaria realizando a opera��o de subtra��o com n�meros e n� strings
		int resultado = Integer.parseInt(num1) - Integer.parseInt(num2);
		
		//cria��o do objeto do tipo Result, que ser� retornado ao usu�rio em JSON
		String message = Integer.toString(resultado);
		Result result = new Result();
		result.setFirst(num1);
		result.setSecond(num2);
		result.setResult(message);
		//retorno do resultado
		return result;
	}
	
}
