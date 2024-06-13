import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itembuy;


    public CarrinhoDeCompras() {
        this.itembuy = new ArrayList<>();

    }

    public void adicionarItem (String nome, double preco, int quantidade){
        itembuy.add(new Item(nome,preco,quantidade));

        }

        public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item i : itembuy){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        itembuy.removeAll(itemParaRemover);
        }

        public double calcularValorTotal(){
        double total =0;

        for (Item i : itembuy){
            total += i.getPreco() * i.getQuantidade();
        }
        return total;

        }

        public void exibirItens(){
        for (Item i : itembuy){
            System.out.println("Nome: " + i.getNome() + "Preço: " + i.getPreco() + "Quantidade: " + i.getQuantidade() );

        }
        }

    public static void main(String[] args) {
        CarrinhoDeCompras  carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("banana",2.50,2);
        carrinhoDeCompras.adicionarItem("maçã",4,4);
        carrinhoDeCompras.adicionarItem("melão",6,1);

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("banana");
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total depois de remover: " + carrinhoDeCompras.calcularValorTotal());
    }

    }
