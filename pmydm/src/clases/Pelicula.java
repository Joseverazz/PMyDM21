package clases;

public class Pelicula {

    private String m_sTitulo;
    private String m_sDirector;
    private String m_sCategoria;
    private int m_nAnio;
    private int m_nDuracion;

    public Pelicula(String m_sTitulo, String m_sDirector, String m_sCategoria, int m_sAnio, int m_sDuracion) {
        setM_sTitulo(m_sTitulo);
        setM_sDirector(m_sDirector);
        setM_sCategoria(m_sCategoria);
        setM_nAnio(m_sAnio);
        setM_nDuracion(m_sDuracion);
    }

    public Pelicula()
    {
        setM_sTitulo("Titulo");
        setM_sDirector("Director");
        setM_sCategoria("Categoria");
        setM_nAnio(1900);
        setM_nDuracion(90);
    }

    public String getM_sTitulo() {
        return m_sTitulo;
    }

    public String getM_sDirector() {
        return m_sDirector;
    }

    public String getM_sCategoria() {
        return m_sCategoria;
    }

    public int getM_nAnio() {
        return m_nAnio;
    }

    public int getM_nDuracion() {
        return m_nDuracion;
    }

    public void setM_sTitulo(String m_sTitulo) {
        this.m_sTitulo = m_sTitulo;
    }

    public void setM_sDirector(String m_sDirector) {
        this.m_sDirector = m_sDirector;
    }

    public void setM_sCategoria(String m_sCategoria) {
        this.m_sCategoria = m_sCategoria;
    }

    public void setM_nAnio(int m_nAnio) {
        this.m_nAnio = m_nAnio;
    }

    public void setM_nDuracion(int m_nDuracion) {
        this.m_nDuracion = m_nDuracion;
    }

    /***
     *
     * @param p1 Película
     * @param p2 Película
     * @return Película la película màs antigua, si son iguales null
     */
    public Pelicula peliculaMasAntigua(Pelicula p1, Pelicula p2){
        if (p1.getM_nAnio() < p2.getM_nAnio()) return p1;
        else if (p2.getM_nAnio() < p1.getM_nAnio()) return p2;
        return null;
    }

    public Pelicula peliculaMasAntigua(Pelicula p1, Pelicula p2, Pelicula p3){

        return peliculaMasAntigua((peliculaMasAntigua(p1,p2)== null)?p1:peliculaMasAntigua(p1,p2),p3);
    }

    public Pelicula peliculaMasAntigua(Pelicula p1, Pelicula p2, Pelicula p3, Pelicula p4){

        return peliculaMasAntigua((peliculaMasAntigua(p1,p2,p3)== null)?p1:peliculaMasAntigua(p1,p2,p3),p4);
    }

    @Override
    public String toString() {
        return "Pelicula: \n" +
                "Titulo= " + getM_sTitulo() + '\n' +
                "Director= " + getM_sDirector() + '\n' +
                "Categoria= " + getM_sCategoria() + '\n' +
                "Año= " + getM_nAnio() + '\n' +
                "Duracion= " + getM_nDuracion();
    }
}
