package filas;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
	

		int a = 0;
		String b;
		int opcion=0;
		lista l=new lista();
		Scanner r= new Scanner(System.in);
		while (a!=5){
			System.out.println("ingrese uno para agregar al inicio ");
			System.out.println("ingrese dos para agregar al final ");
			System.out.println("ingrese tres para agregar al eliminar inicio ");
			System.out.println("ingrese tres para agregar al eliminar fin ");
			
			System.out.println("ingrese cuatro para salir");
			a=r.nextInt();
			switch(a){
			case 1:{
				System.out.println("ingrese una letra  agregar al inicio del nodo ");
				b=r.next();
				l.insertarinicio(b);
				l.listar();
				break;
			}
			case 2:{
				System.out.println("ingrese una letra  agregar al inicio  del nodo ");
				b=r.next();
				l.insertarfinal(b);
				l.listar();
				break;
			}
			case 3:{
				System.out.println("eliminara el primer nodo");
				l.eliminarinicio();
				l.listar();
				break;
			}
			case 4:{
				System.out.println("extraer el primer nodo");
				System.out.println(l.extraerinicio());
				l.listar();
				break;
			}
			}
		}
	}

}
