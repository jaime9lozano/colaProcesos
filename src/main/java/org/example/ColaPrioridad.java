package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ColaPrioridad {
	public List<Proceso> procesos = new ArrayList<>();
	public void iniciarProcesos(int numProcesos) {
		for (int i=0;i<numProcesos;i++) {
			Proceso p=new Proceso(i);
			procesos.add(p);
		}
	}
	public void ensenar() {
		for(int i=0;i<procesos.size();i++) {
			System.out.println(procesos.get(i));
		}
	}
	public void ordenarProcesos() {
		Collections.sort(procesos, new Comparator<Proceso>() {
			 @Override
	            public int compare(Proceso proceso1, Proceso proceso2) {
				 int prioridad1 = proceso1.getPrioridad();
	                int prioridad2 = proceso2.getPrioridad();

	                if (prioridad1 != prioridad2) {
	                    return prioridad1 - prioridad2;
	                } else {
	                    // En caso de empate por prioridad, ordenar por fecha de creación
	                    return proceso1.getFecha_cre().compareTo(proceso2.getFecha_cre());
	                }
			 }
		});
	}
	public void eliminarProceso() {
	Proceso p= new Proceso(0);
	p= procesos.get(0);
	if(p.quantum==1) {
		procesos.remove(0);
	}else {
		p.quantum--;
		procesos.remove(0);
		procesos.add(p);
	}
	}
	public void cola(int numProce) {
		iniciarProcesos(numProce);
		ordenarProcesos();
		do {
			ensenar();
			eliminarProceso();
			System.out.println("--------------------------------------------------------------------");
		}while(!procesos.isEmpty());
		
	}
	public static void main(String[] args) {
		ColaPrioridad c=new ColaPrioridad();
		c.cola(3);
	}
}
