/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaCircular;

/**
 *
 * @author jonas
 */
public class ListaCircular {
    
    private Nodo ventana;


    public ListaCircular() {
    }
    
    public static ListaCircular LCVACIA(){
    ListaCircular LC=new ListaCircular();
    return LC;
    }
    
    public boolean  ESLCVACIA(ListaCircular LC){
        return ventana==null;
    }
    
    public ListaCircular LCINSERTAR(ListaCircular LC,Nodo node){
        Nodo aux=new Nodo(node.getNombre());
        if(ESLCVACIA(LC)){
            LC.ventana=aux;
            LC.ventana.setSiguiente(aux);
        }else{
            aux.setSiguiente(LC.ventana.getSiguiente());
            LC.ventana.setSiguiente(aux);
        }
    return LC;
    }
    
    
    public ListaCircular LCBORRAR(ListaCircular LC){
        if(ESLCVACIA(LC)){
            return LC;
        }else if(ventana==ventana.getSiguiente()){
           ventana=null;
           return LC;
        }else{
           ventana.setSiguiente(ventana.getSiguiente().getSiguiente());
           return LC;
        }
    }
    
    
    
    public Nodo LCVALOR(ListaCircular LC){
        if(ESLCVACIA(LC)){
            return null;
        }else{
            return LC.ventana.getSiguiente();
        }
    }
    
    
    public ListaCircular LCROTAR(ListaCircular LC){
        if(ESLCVACIA(LC)){
            return LC;
        }else{
            ventana=ventana.getSiguiente();
        }
    return LC;
    }
    
    
    public void LCVER(){
        Nodo aux=this.ventana;
        int x=0;
        while(aux!=null && x<3){
            x++;
            System.out.print(aux.getSiguiente().getNombre()+"->");
            aux=aux.getSiguiente();
        }
    }
    
}
