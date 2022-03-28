
package uspg.edu.gt.listaenlazadasimple;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l = new Lista();
        l.insertarInicio("a");
        l.InsertarFinal("b");
        l.InsertarFinal("c");
        l.InsertarFinal("d");
        l.InsertarFinal("e");
        l.InsertarFinal("f");
        l.InsertarFinal("g");
        l.insertarInicio("z");
        l.Listar();
        System.out.println();
        l.EliminarInicio();
        l.Listar();
        
        System.out.println();
        System.out.println("================");
        System.out.println();
        System.out.println(l.ExtraerInicio());
        l.Listar();
    }
    
}
