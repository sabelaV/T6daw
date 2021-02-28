package clases;
/**
*Esta clase calcula el área de un triángulo
*@author anonymous
*version 1.0
*
*/
public class Triangulo extends Figura{
    
    private double base;
    private double altura;
    /**
    *Método que calcula el área de un triángulo
    *@return area
    */
    public double CalcularArea() {        
        return this.area=(base*altura)/2;
     }
    /**
    *Devuelve la base del triángulo
    *@return base
    */
    public double getBase() {
        return base;
    }
    /**
    *Modifica la base del triángulo
    *@param base
    */
    public void setBase(double base) {
        this.base = base;
    }
    /**
    *Devuelve la altura del triángulo
    *@return altura
    */
    public double getAltura() {
        return altura;
    }
    /**
    *Modifica la altura del triángulo
    *@param altura
    */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
