/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoestruturadedados;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ItemCompra {
    private String descricao;
    private int qtde;
    private double preco;

    public ItemCompra(String descricao, int qtde, double preco) {
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    public static void procurarProduto(ArrayList<Produto> p, Carrinho carrinho){
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Digite o codigo do produto( ou 99999 para finalizar)");
            int codProduto = scanner.nextInt();

            if(codProduto == 99999){
                System.out.println("Encerrando... Mostrando carrinho");
                break;
            }

            boolean encontrado = false;
            for(Produto prod : p ){
                if(prod.getCodigo() == codProduto){
                    System.out.println("Produto encontrado " + prod.getDescricao());
                    System.out.println("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();

                    //cria e add no carrinho
                    ItemCompra novoItem = new ItemCompra(prod.getDescricao(), quantidade, prod.getPreco());
                    carrinho.adicionarItem(novoItem);

                    System.out.println("Produto adicionado ao carrinho!");
                    encontrado = true;
                    break;

                }

            }   
            if (!encontrado) {
                    System.out.println("❌ Produto não encontrado! Tente novamente.");
                }

            }
    }
    
    public Double calcSubTotal(){
        
        
        return qtde * preco;
    
    
    }
  
    
    public void mostrarItem(){
        System.out.println(descricao + " | Qtde: " + qtde + " | Preço: R$ " + preco + " | Subtotal: R$ " + calcSubTotal());
    }
    

    
    //getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    
    
}
