import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente mimoso = new Cliente ("Bianca", "11111111");
        System.out.println("Cliente:");
        System.out.println(mimoso.nome+" "+mimoso.cpf);
        System.out.println(mimoso.cpf);


        Produto coisa = new Produto (Descricao.ARROZ, 32.99,100);
        System.out.println("Produto:");
        System.out.println(coisa.descricao);
        System.out.println(coisa.preco);

        Item tanana = new Item (2, coisa);

        Pedido listinha = new Pedido(TipoPagamento.DINHEIRO, mimoso, tanana);
        System.out.println("Pedido:");
        System.out.println(listinha.toString());

        Scanner inputMenu = new Scanner (System.in);
        Scanner inputProduto = new Scanner (System.in);
        Scanner inputQuantidade = new Scanner (System.in);

        int menu;
        String nomeProduto;
        int quantidade;

        do{
            System.out.println("Menu:");
            System.out.println("Escolha uma opcao\n(1) Criar Pedido\n(0) Sair:");
            menu=inputMenu.nextInt();
                switch(menu){
                    case 1:
                        System.out.println("Digite o nome do produto: ");
                        nomeProduto=inputProduto.nextLine();
                        System.out.println("Digite a quantidade de produtos: ");
                        quantidade=inputQuantidade.nextInt();
                }
        }while(menu!=0);

    }
}