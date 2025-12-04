package com.xulioxesus;

public class Cliente {
    //================= Zona de atributos clase ===========================
    static int contadorPedidos = 0;

    //================= Zona de atributos instancia ===========================
    String nome;
    int edade;
    String nomeEmpresa;
    //================= Zona de comportamento (clase) ===========================
    static void incrementarContadorPedidos(int contadorPedidos){
        //this.contadorPedidos = contadorPedidos;
    }
    //================= Zona de comportamento (instancia) =======================

    void setNome(String nome){
        nome = nome;
    }

    void realizarPedido(){
        System.out.println("Realizado pedido");
        Cliente.contadorPedidos++;
    }

    void eliminarPedido(){
        System.out.println("Eliminado pedido");
        Cliente.contadorPedidos--;
    }
}
