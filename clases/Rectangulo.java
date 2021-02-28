package clases;
/**
*Esta clase calcula el área de un rectángulo
*@author anonymous
*version 1.0
*
*/
public class Rectangulo extends Figura{
    
    private double base;
    private double altura;
    /**
    *Método que calcula el área de un rectángulo
    *@return area
    */
    public double CalcularArea() {        
        return this.area=(base*altura);
     }
    /**
    *Devuelve la base del rectángulo
    *@return base
    */
    public double getBase() {
        return base;
    }
    /**
    *Modifica la base del rectángulo
    *@param base
    */
    public void setBase(double base) {
        this.base = base;
    }
    /**
    *Devuelve la altura del rectángulo
    *@return altura
    */
    public double getAltura() {
        return altura;
    }
    /**
    *Modifica la altura del rectángulo
    *@param altura
    */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
