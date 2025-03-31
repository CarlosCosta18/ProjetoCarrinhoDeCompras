/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoestruturadedados;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ProjetoEstruturaDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);

        // 🔥 Carregar produtos do arquivo
        ArrayList<Produto> listaProdutos = Produto.lerProdutoDoArquivo("PRODUTOS.txt");

        
        

        // Criar o carrinho com 10% de desconto
        Carrinho carrinho = new Carrinho(10.0);

        // Permitir que o usuário adicione produtos ao carrinho
        ItemCompra.procurarProduto(listaProdutos, carrinho);

        // Exibir carrinho no final
        carrinho.mostrarCarrinho();
        scanner.close();
    }
}
     
        
        
    
    

    

