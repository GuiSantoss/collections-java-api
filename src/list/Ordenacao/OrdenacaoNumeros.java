package list.Ordenacao;

import java.util.*;

public class OrdenacaoNumeros {
   List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();

    }

    public void adicionarNumeros(int numero){
        numeros.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(numeros);
    }
    public void ordenarDescendente(){
        Collections.sort(numeros, new Comparator<Integer>() {

        }
    }
    }