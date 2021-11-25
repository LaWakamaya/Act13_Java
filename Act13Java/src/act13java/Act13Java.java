/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act13java;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alan Franco
 */

interface OrdenarAnon {
    public void anon();
}

interface OrdenarLambda {
    void ordenarLambda(ArrayList<String> a);
}

class OrdenarReferencia {
    static void ordenarLongitud(ArrayList<String> a){
        MyComparator comparar = new MyComparator();
        Collections.sort(a, comparar);
        System.out.println(a.toString());
    }
    static void ordenarAlfabetico(ArrayList<String> a){
        Collections.sort(a);
        System.out.println(a.toString());
    }
}

public class Act13Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyComparator comparar = new MyComparator();
        ArrayList<String> palabras = new ArrayList<String>();
        palabras.add("palabra");
        palabras.add("monopoly");
        palabras.add("abrazo");
        palabras.add("guanabana");
        palabras.add("si");
        palabras.add("luna");
        palabras.add("sol");
        palabras.add("amortiguador");
        palabras.add("saludos");
        palabras.add("zorro");
        System.out.println("Arreglo desordenado:");
        System.out.println(palabras.toString());
        
        System.out.println("\nOrdenar con clase anonima por longitud");
        OrdenarAnon anonL = new OrdenarAnon(){
            public void anon(){
                ArrayList<String> palabras1 = new ArrayList<String>();
                palabras1 = (ArrayList)palabras.clone();
                Collections.sort(palabras1, comparar);
                System.out.println(palabras1.toString());
            }
        };
        anonL.anon();
        
        System.out.println("\nOrdenar con lambda por longitud");
        OrdenarLambda lambdaL = (a) -> {
            a = (ArrayList)palabras.clone();
            Collections.sort(a, comparar);
            System.out.println(a.toString());
        };
        lambdaL.ordenarLambda(palabras);
        
        System.out.println("\nOrdenar con referencia por longitud");
        OrdenarLambda referenciaL = OrdenarReferencia::ordenarLongitud;
        referenciaL.ordenarLambda(palabras);
        
        System.out.println("\nOrdenar con clase anonima por orden alfabetico");
        OrdenarAnon anonA = new OrdenarAnon(){
            public void anon(){
                ArrayList<String> palabras2 = new ArrayList<String>();
                palabras2 = (ArrayList)palabras.clone();
                Collections.sort(palabras2);
                System.out.println(palabras2.toString());
            }
        };
        anonA.anon();
        
        System.out.println("\nOrdenar con lambda por orden alfabetico");
        OrdenarLambda lambdaA = (a) -> {
            a = (ArrayList)palabras.clone();
            Collections.sort(a);
            System.out.println(a.toString());
        };
        lambdaA.ordenarLambda(palabras);
        
        System.out.println("\nOrdenar con referencia por orden alfabetico");
        OrdenarLambda referenciaA = OrdenarReferencia::ordenarAlfabetico;
        referenciaA.ordenarLambda(palabras);
    }
    
}
