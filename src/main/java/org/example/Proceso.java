package org.example;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Proceso {
UUID pid;
String nombre;
int quantum;
int prioridad;
Date fecha_cre;
Date fecha_ult_mod;
public Proceso(int numero) {
    this.pid = UUID.randomUUID();
    this.nombre = "P" + numero;
    this.fecha_cre = new Date();
    this.fecha_ult_mod = this.fecha_cre;
    this.quantum = new Random().nextInt(100) + 1; 
    this.prioridad = new Random().nextInt(9);
}
public UUID getPid() {
	return pid;
}

public void setPid(UUID pid) {
	this.pid = pid;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getQuantum() {
	return quantum;
}

public void setQuantum(int quantum) {
	this.quantum = quantum;
}

public int getPrioridad() {
	return prioridad;
}

public void setPrioridad(int prioridad) {
	this.prioridad = prioridad;
}

public Date getFecha_cre() {
	return fecha_cre;
}

public void setFecha_cre(Date fecha_cre) {
	this.fecha_cre = fecha_cre;
}

public Date getFecha_ult_mod() {
	return fecha_ult_mod;
}

public void setFecha_ult_mod(Date fecha_ult_mod) {
	this.fecha_ult_mod = fecha_ult_mod;
}

public String toString() {
    return "PID: " + pid + ", Nombre: " + nombre + ", Prioridad: " + prioridad + ", Quantum: " + quantum +" Fecha Creacion: "+fecha_cre;
}
public static void main(String[] args) {
	
}
}
