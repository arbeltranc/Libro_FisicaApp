/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro_fisicaapp;

/**
 *
 * @author ALEX BELTRAN
 */
class Libro_Fisica {
    
//Atributos
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;
    
    //Constructor
  
public Libro_Fisica(int codigo, String titulo, String autor, int anio_edicion){
 this.codigo=codigo;
 
 this.titulo=titulo;
 
 this.autor=autor;
 
 this.anio_edicion=anio_edicion;

}

//Metodos
public void setCodigo(int codigo){
    this.codigo=codigo;
}
public int getCodigo(){
    return codigo;
}
public void setTitulo(String titulo){
    this.titulo=titulo;
}
public String getTitulo(){
    return titulo;
}
public void setAutor(String autor){
    this.autor=autor;
}
public String getAutor(){
    return autor;
}
public void setAnio_edicion(int anio_edicion){
    this.anio_edicion=anio_edicion;
}
public int getAnio_edicion(){
    return anio_edicion;
}
@Override
public String toString(){
    return "El código "+codigo+" corresponde al libro con iitulo "+titulo+" del autor "+autor+" editado en "+anio_edicion+".";
}
//clase ejecutable
}

class Libro_FisicaApp{
    public static void main(String[] args){
         //creamos los objetos
         
         Libro_Fisica libro1=new Libro_Fisica(6070, "TEORIA DEL TODO"," STEPHEN W. HAWKING", 2000);
         Libro_Fisica libro2=new Libro_Fisica(1123, "FISICA FUNDAMENTAL ","ZAMBRANO", 2006);
         Libro_Fisica libro3=new Libro_Fisica(3690, "HIPERESPACIO "," MICHIO KAKU", 2001);
         //mostramos su estado
         System.out.println(libro1);
         System.out.println(libro2);
         System.out.println(libro3);
         
    }
}
