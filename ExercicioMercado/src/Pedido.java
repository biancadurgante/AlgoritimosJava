public class Pedido {
    TipoPagamento pagamento;
    Cliente cliente;
    Item item;

    public Pedido (TipoPagamento pagamento, Cliente cliente, Item item){
        this.pagamento = pagamento;
        this.cliente = cliente;
        this.item = item;
    }
    public String toString(){
        String lista;
        lista = pagamento+" "+cliente.nome+" "+item.produto.descricao;
        return lista;
    }
}
