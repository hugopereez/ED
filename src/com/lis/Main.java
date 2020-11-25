package com.lis;

import java.io.IOException;

import com.lis.Modelo.ArchivoCSV;
import com.lis.Modelo.DoubleLinkList;
import com.lis.Modelo.Ordenador;

public class Main {

    public static void main(String[] args) throws IOException {
    // write your code here
    

    ArchivoCSV arch = new ArchivoCSV("src/com/lis/Movie.csv");

    DoubleLinkList db = new DoubleLinkList();

    
    db = arch.leerCSV();

    db.displayList();

    /* //Prueba de ShellSort (Necesario que las peliculas tengan el parametro 'Duracion')
    Ordenador orden = new Ordenador();
    orden.shell(db);
    System.out.println("inicia lista ordenada por shell -------------------------------------");
    db.displayList(); */



    }
}
