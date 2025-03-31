/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoestruturadedados;

import java.util.ArrayList;


/**
 *
 * @author Carlos
 */
public class Carrinho {
     ArrayList<ItemCompra> listaItens = new ArrayList();
     private double totalCompra;
     private double porcDesconto;
     private double valorPagar;

    public Carrinho(Double porcDesconto) {
        this.listaItens = new ArrayList<>();
        this.porcDesconto = porcDesconto;
    }

     
     public void mostrarCarrinho(){
        System.out.println("\n🛒 Carrinho de Compras:");
        int i = 1;
        for (ItemCompra item : listaItens) {
            System.out.print(i + ". ");
            item.mostrarItem();
            i++;
        }
        System.out.println("Total da compra: R$ " + somaValores());
        System.out.println("Desconto aplicado: R$ " + calcDesconto());
        System.out.println("Valor final a pagar: R$ " + (somaValores() - calcDesconto()));
    }
     
     
     
     
     public Double somaValores(){
        double total = 0;
        for(ItemCompra i : listaItens){
        
            total += i.calcSubTotal();
        }
         return total;
        
     }
     
     
       
    public void adicionarItem(ItemCompra item){
        listaItens.add(item);
    }
     
    public Double calcDesconto(){
        return somaValores() * (porcDesconto/ 100);
    }
    
     //getter e setters
    public ArrayList<ItemCompra> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemCompra> listaItens) {
        this.listaItens = listaItens;
    }

    public Double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public Double getPorcDesconto() {
        return porcDesconto;
    }

    public void setPorcDesconto(Double porcDesconto) {
        this.porcDesconto = porcDesconto;
    }

    public Double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(Double valorPagar) {
        this.valorPagar = valorPagar;
    }
     
     
     
    
}
