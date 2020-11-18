package Modelo;

public class Movie {
    private String id;
    private String titulo;
    private String duracion;
    private String color;
    private String idioma;
    private String pais;
    private String clasificacion;
    private String presupuesto;
    private String year;
    private String imdbScore;
    private String relacionDeAspecto;
    private String imdbLink;

    public Movie(String id, String titulo, String duracion, String color, String idioma, String pais, String clasificacion, String presupuesto, String year, String imdbScore, String relaciónDeAspecto, String imdbLink) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.color = color;
        this.idioma = idioma;
        this.pais = pais;
        this.clasificacion = clasificacion;
        this.presupuesto = presupuesto;
        this.year = year;
        this.imdbScore = imdbScore;
        this.relacionDeAspecto = relaciónDeAspecto;
        this.imdbLink = imdbLink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(String presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImdbScore() {
        return imdbScore;
    }

    public void setImdbScore(String imdbScore) {
        this.imdbScore = imdbScore;
    }

    public String getRelaciónDeAspecto() {
        return relacionDeAspecto;
    }

    public void setRelaciónDeAspecto(String relaciónDeAspecto) {
        this.relacionDeAspecto = relaciónDeAspecto;
    }

    public String getImdbLink() {
        return imdbLink;
    }

    public void setImdbLink(String imdbLink) {
        this.imdbLink = imdbLink;
    }

    @Override
    public String toString() {
        return "| " + id + " | " + titulo + " | " + duracion + " | " + color + " | " + idioma + " | " + pais + " | " + clasificacion + " | " + presupuesto + " | " + year + " | " + imdbScore + " | " + relacionDeAspecto + " | " + imdbLink;
    }
    
    
    
}
