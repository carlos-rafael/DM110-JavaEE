package br.inatel.pos.mobile.dm110.api;

//classe Result, utilizada especificamente para o m�todo de subtra��o, o qual retorna um JSON
public class Result {
	
	//defini��o das vari�veis
	private String first;
	private String second;
	private String result;
	
	//getters e setters da classe
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	


}
