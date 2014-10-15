package filas;

public class nodo {
	private String info;
	nodo siguiente;
	
	
	
	public nodo(String i, nodo s)
	{
		info=i;
		siguiente =s;
		

		
	}



	public String getInfo() {
		return info;
	}



	public void setInfo(String info) {
		this.info = info;
	}



	public nodo getSiguiente() {
		return siguiente;
	}



	public void setSiguiente(nodo siguiente) {
		this.siguiente = siguiente;
	}
}
