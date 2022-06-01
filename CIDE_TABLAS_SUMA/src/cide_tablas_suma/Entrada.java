/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_tablas_suma;

import java.io.*;
public class Entrada {
static String inicializar(){
String buzon="";
InputStreamReader flujo=new InputStreamReader(System.in);
BufferedReader teclado=new BufferedReader(flujo);
try{
buzon=teclado.readLine();
}
catch(Exception e){
System.out.append("Entrada incorrecta)");
}
return buzon;
}
static int entero(){
int valor=Integer.parseInt(inicializar());
return valor;
}
static double real(){
double valor=Double.parseDouble(inicializar());
return valor;
}
static String cadena(){
String valor=inicializar();
return valor;
}
static char caracter(){
String valor=inicializar();
return valor.charAt(0);
}
}