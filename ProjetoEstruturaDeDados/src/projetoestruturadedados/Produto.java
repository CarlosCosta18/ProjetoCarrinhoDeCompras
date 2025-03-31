/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoestruturadedados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Produto {
    private int codigo;
    private String descricao;
    private Double preco;

    public Produto(int codigo, String descricao, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  codigo + "; " + descricao + "; " + preco;
    }
    
    
    
    
    
    public static void criarProduto(String caminho){
     File arquivo = new File(caminho);
        try {
            if(arquivo.createNewFile()){
                System.out.println("Arquivo Criado");
            } else{
                System.out.println("Arquivo ja existe");
            }
        } catch (IOException e) {
            System.out.println("Erro na criação do arquvo");
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Produto> lerProdutoDoArquivo(String caminho){
        ArrayList<Produto> listaProdutos = new ArrayList();
        
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
            String linha;
            while((linha = br.readLine()) != null){
                String [] dados = linha.split(";");
                int codigo = Integer.parseInt(dados[0]);
                String descricao = dados[1];
                double preco = Double.parseDouble(dados[2]);
            
                
                listaProdutos.add(new Produto(codigo, descricao, preco));
            }
            System.out.println("Produtos adicionados");
        } catch (IOException e) {
            System.out.println("Error ao ler o arquivo");
            e.printStackTrace();
        }
        return listaProdutos;
    
    }
    
    
    
        
    //getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
}
