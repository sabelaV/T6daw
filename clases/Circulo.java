package clases;

import clases.Figura;
/**
*Esta clase calcula el área de un círculo
*@author anonymous
*version 1.0
*
*/
public class Circulo extends Figura{
    
    final double pi=3.1416;
    private double radio;
    /**
    *Método que calcula el área de un círculo
    *@return area
    */
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }
    /**
    *Devuelve el radio del círculo
    *@return radio
    */
    public double getRadio() {
        return radio;
    }
    /**
    *Modifica el radio del círculo
    *@param radio
    */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
