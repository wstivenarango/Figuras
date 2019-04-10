/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.logica;

/**
 *
 * @author Estudiantes
 */

    public class Triangulo extends Figura {

  
    public void calcularArea() {
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int base = temp.calcularDistancia(fin);
        int altura = origen.calcularDistancia(temp);
        area = (base * altura)/2;
    }

    public void calcularPerimetro() {
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int base = temp.calcularDistancia(fin);
        int altura = origen.calcularDistancia(temp);
        int hipotenusa = origen.calcularDistancia(fin);
//      area = (base * altura)/2;
        perimetro = (base + hipotenusa + altura);
    }

}

