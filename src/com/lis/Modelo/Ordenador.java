package com.lis.Modelo;

public class Ordenador {
    public void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;
  
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {                                        
                cambios = false;
                for (i = salto; i < A.length; i++)   
                {
                    if (A[i - salto] > A[i]) {       
                        aux = A[i];                 
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;                                                 
                    }
                }
            }
        }
    public void insertionSort(DoubleLinkList lista){
        int i, j;  
        DoubleLink key;
        for (i = 1; i < lista.getSize(); i++){
            key = lista.getIndexLink(i);  
            j = i - 1;  
            while (j > 0 && Integer.parseInt(lista.getIndexLink(j).getData().getId())  > Integer.parseInt(key.getData().getId())){
                lista.getIndexLink(j+1).setData(lista.getIndexLink(j).getData()); 
                j = j - 1;  
            }
            lista.getIndexLink(j+1).setData(key.getData());
        }  
    }
}