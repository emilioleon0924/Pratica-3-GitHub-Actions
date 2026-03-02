package com.example;

import mate.Operacion;

public class Main {
    public static void main(String[] args) {
        Operacion op1 = new Operacion(2, 6);

        System.out.println(op1.suma());
        System.out.println(op1.resta());
        System.out.println(op1.division());
    }
}