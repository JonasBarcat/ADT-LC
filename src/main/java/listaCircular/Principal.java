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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaCircular LC=ListaCircular.LCVACIA();
        
        if(LC.ESLCVACIA(LC)){
            System.out.println("La lista circular esta vacia");
        }
        
        Nodo uno=new Nodo(" 1 ");
        Nodo dos=new Nodo(" 2 ");
        Nodo tres=new Nodo(" 3 ");
        
        LC.LCINSERTAR(LC, uno);
        LC.LCINSERTAR(LC,dos);
        LC.LCINSERTAR(LC, tres);
        
        LC.LCVER();
        System.out.println();
        LC.LCROTAR(LC);
         LC.LCROTAR(LC);
           LC.LCROTAR(LC);
             LC.LCROTAR(LC);
        LC.LCVER();  

        
    }
    
}
