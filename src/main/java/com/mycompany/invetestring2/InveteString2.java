/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.invetestring2;

/**
 *
 * @author nando
 */
public class InveteString2 {

    public static void main(String[] args) {
    int topo;
    String s1 = "Cachorro quer comer banana";
    String k1 = "";
    char[] s = new char[100];
    char k;
            
    for(int i=0; i<s1.length();i++){
        s[i]=s1.charAt(i);    
    }
    
    
    Pilha pilha = new Pilha();
    
    topo = pilha.topopilha;
    
    for(int i=0; i < s1.length();i++){
        if(s[i] != ' '){
            topo = pilha.push(topo, s[i]);
        }else{
            k1 = k1 + " ";
            while(pilha.tamanho()!=0){
                k = pilha.pop(topo);
                k1 = k1 + k;
                topo--;
            }
        }
    }
    
    if(pilha.tamanho()!=0){
     k1 = k1 + " ";
     while(pilha.tamanho()!=0){
       k = pilha.pop(topo);
       k1 = k1 + k;
       topo--;
     }
    }
    
    if(s1.equals(k1)){
        System.out.println(s1+" eh um palindromo");
    }
    
    System.out.println(k1);
  }
}
