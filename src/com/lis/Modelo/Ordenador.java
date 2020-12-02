package com.lis.Modelo;

public class Ordenador {

    
    /* Ordena tomando como parametro la duración de la pelicula */

    public void shell(DoubleLinkList lista) {

        int salto, i;
        Movie aux;
        boolean cambios;
  
        for (salto = lista.getSize() / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {                                        
                cambios = false;
                for (i = salto; i < lista.getSize(); i++)   
                {
                    try{
                    String duracion1 = ((lista.getIndexLink(i - salto)).getData().getDuracion());
                    String duracion2 =((lista.getIndexLink(i)).getData().getDuracion());                    
                    int d1= Integer.parseInt(duracion1);
                    int d2= Integer.parseInt(duracion2);
                   

                    if (d1 > d2) {       
                        aux = lista.getIndexLink(i).getData();   
                        lista.getIndexLink(i).setData(lista.getIndexLink(i - salto).getData());          
                        lista.getIndexLink(i - salto).setData(aux);
                        cambios = true;                                                 
                    }
                }catch(NumberFormatException e){
                    System.out.println("elementos no comparables");
                }
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
            while (j > 0 && Integer.parseInt(lista.getIndexLink(j).getData().getId())  < Integer.parseInt(key.getData().getId())){
                lista.getIndexLink(j+1).setData(lista.getIndexLink(j).getData()); 
                j = j - 1;  
            }
            lista.getIndexLink(j+1).setData(key.getData());
        }  
    }
    public void selectionSort(DoubleLinkList lista) 
    { 
        int n = lista.getSize(); 
  
        // recorrimiento de la lista no ordenada 
        for (int i = 0; i < n-1; i++) 
        { 
            // encuentra el elemento mas pequeño
            int minIdx = i; //indice del elemento mas pequeño
            
            for (int j = i+1; j < n; j++) 
            {
            	if (Integer.parseInt((lista.getIndexLink(j)).getData().getDuracion()) < 
                		Integer.parseInt((lista.getIndexLink(minIdx)).getData().getDuracion()))
            	{
                	
                	min_idx = j;
                }
            }
                
                     
  
            // intercambio del elemeto mas pequeño con el primero
            if(minIdx != i) {
            	Movie temp;
            	temp = lista.getIndexLink(minIdx).getData();
            	lista.getIndexLink(minIdx).setData(lista.getIndexLink(i).getData());
            	lista.getIndexLink(i).setData(temp);
            }else{
            	//no hace nada
            }
             
        } 
    }
}
