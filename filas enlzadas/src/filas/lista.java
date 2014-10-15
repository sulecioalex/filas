package filas;

public class lista {

	nodo inicio;
	nodo fin;
	
	
	public lista()
	{
		inicio=null;
		fin=null;
		
	}
	
	
	public void insertarinicio(String info)
	{
		nodo nuevo =new nodo(info,inicio);
		
		inicio=nuevo;
		if (fin== null){
			fin=inicio;
		}
	}
	
 public void insertarfinal(String info){
	 nodo nuevo =new nodo(info,null);
	 
	 if (inicio==null) 
	 {
	fin= nuevo;	 
	 }
	 else 
	 {
		 fin.setSiguiente(nuevo);
		 fin=nuevo;
	 }
	 
 }
 
 
 public void eliminarinicio()
 {
	 inicio=inicio.siguiente;
	 
 }
	
	
 public String extraerinicio()
 {
	String info=inicio.getInfo();
	inicio=inicio.getSiguiente();
	if (inicio==null){
		fin=null;
	}
	return info;
 }
  public void listar()
  {
	  nodo temp=inicio;
	  while (temp != null){
		  System.out.println(temp.getInfo());
		  temp = temp.siguiente;
	  }
  }
  
  
}

