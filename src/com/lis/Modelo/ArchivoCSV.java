package com.lis.Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Esteban
 */
public class ArchivoCSV {
    public static final String SEPARADOR=",";
    private String ruta;

    public ArchivoCSV(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }
    
    public DoubleLinkList leerCSV() throws IOException{
        BufferedReader br = null;
        DoubleLinkList movies = new DoubleLinkList();
        try {
            br =new BufferedReader(new FileReader(getRuta()));
            String linea = br.readLine();
            boolean primeraVez = true;
            while (null!=linea) {
                if(primeraVez){
                    linea = br.readLine();
                    primeraVez = false;
                }
                String [] fila = linea.split(SEPARADOR);
                String id = fila[0];
                String titulo = fila[1];
                String duracion = fila[2];
                String color = fila[3];
                String idioma = fila[4];
                String pais = fila[5];
                String clasificacion = fila[6];
                String presupuesto = fila[7];
                String year = fila[8];
                String imdbScore = fila[9];
                String relacionDeAspecto = fila[10];
                String imdbLink = fila[11];
                Movie movie = new Movie(id,titulo,duracion,color,idioma,pais,clasificacion,presupuesto,year,imdbScore,relacionDeAspecto,imdbLink);
                movies.insertLast(movie);
                linea = br.readLine();
            }
         
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (null!=br) {
                br.close();
            }
        }
        return movies;
    }
}
