/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Lab06
 */
public class Persona {
    String name;
    int age;
    String direccion;
    int sueldo;
    String trabajo;
    int deuda;
    public void miNombre(){
        System.out.println("Mi nombre es : " + name);
    }
    public void Edad(){
        System.out.println("mi edad es de : " + age);
    }
    
    public String Vivienda(String direccion, String pais){
        return "Yo vivo en " + direccion + " en el pais de  : " + pais;
    }
    
    public int edadSueldo(int edad){
        int datosEdad = edad;
        return datosEdad;
    }
    
    public Boolean Misueldo(Boolean sueldo){
        Boolean total = sueldo;
        return total;
    }
    
    public static void main(String[] args) {
        Persona pl1 = new Persona();
        pl1.age = 17;
        pl1.name = "omar";
        pl1.deuda = 100;
        pl1.Edad();
        pl1.edadSueldo(17);
    }
}
