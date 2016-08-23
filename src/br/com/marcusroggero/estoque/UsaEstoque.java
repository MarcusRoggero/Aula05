package br.com.marcusroggero.estoque;

public class UsaEstoque {

	public static void main(String[] args) {
		
		Estoque estoque1 = new Estoque("Banana", 12, 60);
		Estoque estoque2 = new Estoque("Maçã", 5, 30);
		Estoque estoque3 = new Estoque("Salada Mista",10,3);
		
		estoque1.darBaixa(5);
		estoque2.reporEstoque(10);
		estoque3.darBaixa(4);
		
		estoque1.precisaRepor();
		estoque2.precisaRepor();
		estoque3.precisaRepor();

		System.out.println(estoque1.mostra());
		System.out.println(estoque2.mostra());
		System.out.println(estoque3.mostra());
				
	}

}
