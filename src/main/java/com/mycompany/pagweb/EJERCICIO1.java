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
public class EJERCICIO1 {

public static void main(String[] args)
{
    //llamada para obtener la suma de 5
    System.out.println(sum(4));
}
//método que devuelve la suma de los elementos desde n hasta 1
//ejemplo: n = 4 -> 4+3+2+1=10
static int sum(int n)
{
    //caso base
    if(n==1)
        return 1;

    //llamada recursiva
    else
        return n+sum(n-1);
}
}
