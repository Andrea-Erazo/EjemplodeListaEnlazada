
package uspg.edu.gt.listaenlazadasimple;


public class Lista {
    
    Nodo inicio;
    Nodo fin;
    
    public Lista(){
        inicio = null;
        fin = null;
        
    }
    public void insertarInicio(String info){
        
        Nodo nuevo = new Nodo(info,inicio);
        
        inicio = nuevo;
        if(fin==null)
            fin= inicio;
            
        }
    
        public void InsertarFinal(String info){
            Nodo nuevo = new Nodo(info,null);
            
            if(inicio== null){
                fin = nuevo;
                nuevo = fin;
                
                        
               
            }
            else{
                fin.setSiguiente(nuevo);
                fin = nuevo;   
            }
        }   
        public void EliminarInicio()
        {
            inicio = inicio.siguiente;
        }
        public String ExtraerInicio(){
            String info = inicio.getInfo();
            inicio = inicio.getSiguiente();
            if(inicio==null){
                
            fin=null;
        }
        return info;
        }
        public void Listar(){
            Nodo temp= inicio;
            
            while(temp != null){
                
                System.out.println(temp.getInfo());
                
                temp = temp.siguiente;
            }
        }
        }
        
 
    
    

