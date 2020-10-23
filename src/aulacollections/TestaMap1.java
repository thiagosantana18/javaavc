package aulacollections;

import java.util.HashMap;
import java.util.Map;

import sistemacontacorrente.Conta;

public class TestaMap1 {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.depositar(10);
		c1.setNome("Lucas");
		c1.setLimite(200);
		Conta c2 = new Conta();
		c2.depositar(20);
		c2.setNome("Matheus");
		c2.setLimite(300);
		Conta c3 = new Conta();
		c3.depositar(30);
		c3.setNome("Rafael");
		c3.setLimite(400);
		
		Map<String, Conta> mapaContas = new HashMap<String, Conta>();
		mapaContas.put("cliente1", c1);
		mapaContas.put("cliente2", c2);
		mapaContas.put("cliente3", c3);
		
		Conta contaRecuperada = mapaContas.get("cliente2");
		System.out.println(contaRecuperada);
		System.out.println(contaRecuperada.getNome());
		System.out.println(contaRecuperada.getLimite());
		System.out.println(contaRecuperada.getSaldo());
	}

}
