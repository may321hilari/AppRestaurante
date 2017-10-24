package com.mhm;

import com.mhm.POJO.Restaurante;

public class Main {

    public static void main(String[] args) {
        Restaurante restaurante1=new Restaurante();
        restaurante1.leer();
        restaurante1.mostrar();
        restaurante1.adicionarPlatos(1);
        restaurante1.actualizarPlato("A");
        restaurante1.eliminarPlato("A");
        restaurante1.adicionarEmpledos(1);
        restaurante1.actualizarEmpleado("A");
        restaurante1.eliminarEmpleado("A");
        restaurante1.mostrar();
    }
}
