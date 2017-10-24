package com.mhm.POJO;

import java.util.Scanner;

public class Restaurante {
    //TODO atributos
    Scanner lec=new Scanner(System.in);
    private String nombre,direccion;
    private int nroPlatos,nroEmpleados;
    private String platos[][]=new String [100][2];
    private String empleados[][]=new String [100][2];
    //TODO constructores
    public Restaurante() {
    }
    public Restaurante(String nombre) {
        this.nombre = nombre;
    }
    //TODO getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getNroPlatos() {
        return nroPlatos;
    }
    public void setNroPlatos(int nroPlatos) {
        this.nroPlatos = nroPlatos;
    }
    public int getNroEmpleados() {
        return nroEmpleados;
    }
    public void setNroEmpleados(int nroEmpleados) {
        this.nroEmpleados = nroEmpleados;
    }

    //TODO leer()
    public void leer(){
        System.out.print("Ingrese Nombre:");
        setNombre(lec.next());
        System.out.print("Ingrese Direccion:");
        setDireccion(lec.next());
        System.out.print("Ingrese Nro de Platos:");
        setNroPlatos(lec.nextInt());
        System.out.println("Ingrese Platos");
        for (int i = 0; i <getNroPlatos(); i++) {
            System.out.print("Ingrese Nombre:");
            platos[i][0]=lec.next();
            System.out.print("Ingrese Precio:");
            platos[i][1]=lec.next();
        }
        System.out.print("Ingrese Nro de Empleados:");
        setNroPlatos(lec.nextInt());
        System.out.println("Ingrese Empleados");
        for (int i = 0; i <getNroPlatos(); i++) {
            System.out.print("Ingrese Nombre:");
            platos[i][0]=lec.next();
            System.out.print("Ingrese Cargo:");
            platos[i][1]=lec.next();
        }
    }
    //TODO leer(nombre:String)
    public void leer(String nombre){
        setNombre(nombre);
        System.out.print("Ingrese Direccion:");
        setDireccion(lec.next());
        System.out.print("Ingrese Nro de Platos:");
        setNroPlatos(lec.nextInt());
        System.out.println("Ingrese Platos");
        for (int i = 0; i <getNroPlatos(); i++) {
            System.out.print("Ingrese Nombre:");
            platos[i][0]=lec.next();
            System.out.print("Ingrese Precio:");
            platos[i][1]=lec.next();
        }
        System.out.print("Ingrese Nro de Empleados:");
        setNroPlatos(lec.nextInt());
        System.out.println("Ingrese Empleados");
        for (int i = 0; i <getNroPlatos(); i++) {
            System.out.print("Ingrese Nombre:");
            platos[i][0]=lec.next();
            System.out.print("Ingrese Cargo:");
            platos[i][1]=lec.next();
        }
    }
    // TODO mostrar()
    public void mostrar(){
        System.out.println("NOMBRE:"+getNombre()+"\n"+
                "DIRECCION:"+getDireccion());
        System.out.println("PLATOS:");
        for (int i = 0; i <getNroPlatos() ; i++) {
            System.out.print(platos[i][0]+" | "+platos[i][1]+"\n");
        }
        System.out.println("EMPLEADOS:");
        for (int i = 0; i <getNroEmpleados() ; i++) {
            System.out.print(empleados[i][0]+" | "+empleados[i][1]+"\n");
        }
    }
    // TODO mostrar(nombre:String)
    public void mostrar(String nombre){
        for(int i=0;i<getNroPlatos();i++){
            if(platos[i][0].equals(nombre)){
                System.out.println("Nombre:"+platos[i][0]+"Precio:"+platos[i][1]);
            }
        }
    }
    //TODO adicionarPlatos
    public void adicionarPlatos(int n){
        int m=getNroPlatos();
        setNroPlatos(getNroPlatos()+n);
        for(int i=m;i<getNroPlatos();i++){
            System.out.print("Ingreso Nombre:");
            platos[i][0]=lec.next();
            System.out.print("Ingrese Precio:");
            platos[i][1]=lec.next();
        }
    }
    //TODO actualizarPlato
    public void actualizarPlato (String n){
        for(int i=0;i<getNroPlatos();i++){
            if(platos[i][0].equals(n)){
                System.out.println("Actualizando...");
                System.out.print("Ingreso Nombre:");
                platos[i][0]=lec.next();
                System.out.print("Ingrese Precio:");
                platos[i][1]=lec.next();
            }
        }
    }
    //TODO eliminarPlato
    public void eliminarPlato(String n){
        for (int i = 0; i <getNroPlatos() ; i++) {
            if (platos[i][0].equals(n)){
                System.out.println("Eliminando...");
                for (int k=i;k<getNroPlatos();k++){
                    platos[k][0]=platos[k+1][0];
                    platos[k][1]=platos[k+1][1];
                }
                setNroPlatos(getNroPlatos()-1);
            }
        }
    }
    //TODO adicionarEmpleados
    public void adicionarEmpledos(int n){
        int m=getNroEmpleados();
        setNroEmpleados(getNroEmpleados()+n);
        for(int i=m;i<getNroEmpleados();i++){
            System.out.print("Ingreso Nombre:");
            empleados[i][0]=lec.next();
            System.out.print("Ingrese Precio:");
            empleados[i][1]=lec.next();
        }
    }
    //TODO actualizarPlato
    public void actualizarEmpleado (String n){
        for(int i=0;i<getNroEmpleados();i++){
            if(empleados[i][0].equals(n)){
                System.out.println("Actualizando...");
                System.out.print("Ingreso Nombre:");
                empleados[i][0]=lec.next();
                System.out.print("Ingrese Precio:");
                empleados[i][1]=lec.next();
            }
        }
    }
    //TODO eliminarPlato
    public void eliminarEmpleado(String n){
        for (int i = 0; i <getNroEmpleados() ; i++) {
            if (empleados[i][0].equals(n)){
                System.out.println("Eliminando...");
                for (int k=i;k<getNroPlatos();k++){
                    empleados[k][0]=empleados[k+1][0];
                    empleados[k][1]=empleados[k+1][1];
                }
                setNroEmpleados(getNroEmpleados()-1);
            }
        }
    }
}
