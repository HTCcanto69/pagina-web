/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pagweb;
import java.util.*;
/**
 *
 * @author HERMES
 */
public class EJERCICIO9 {

public static void main(String[] args)
{
    //imprimir rectángulo: altura, base
    cuad(5,10);
}
//método que imprime un rectángulo
//ejemplo: base = 4 y altura 3
//
// * * * *
// * * * *
// * * * *
//
static void cuad(int altura, int base)
{
    if(altura>0)
    {
        cuad2(base);//método recursivo que crea los elementos de cada línea
        cuad(altura-1, base);//llamada recursiva
    }
}
//crea los elementos de cada línea
static void cuad2(int n)
{
    if(n>0)
    {
        System.out.print("* ");
        cuad2(n-1);
    }
    else
        System.out.println();
}
}