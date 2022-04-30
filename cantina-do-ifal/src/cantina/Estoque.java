package cantina;

public class Estoque {
	private Item[] itens = new Item[10];
	private int index = 0;
	
	public void cadastrarItem(String nome, String desc, double preco_compra, 
			double preco_venda, int quantidade_comprada, int quantidade_vendida) throws ValorInvalidoException 
	{
		this.itens[index] = new Item(nome, desc, preco_compra, preco_venda, quantidade_comprada, quantidade_vendida);
		index++;
	}
	public void acresentarItem(int index, double quantidade){
		this.itens[index].quantidade_comprada += quantidade;
	}
	
}
