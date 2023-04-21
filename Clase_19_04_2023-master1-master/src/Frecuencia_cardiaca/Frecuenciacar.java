package Frecuencia_cardiaca;

public class Frecuenciacar {
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int ano;

    //CONSTRUCTOR


    public Frecuenciacar(String nombre, String apellido, int dia, int mes, int ano) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //GET Y SET


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int calcularEdad (){
        return( 2023-this.ano);
    }
    public int calcularFrecuencia(){
        return (220-calcularEdad());
    }
    public double getCalcularFrecuenciaesperadamin(){
        return (0.5*calcularFrecuencia());
    }
    public double getCalcularFrecuenciaesperadamax(){
        return (0.85*calcularFrecuencia());
    }


}
