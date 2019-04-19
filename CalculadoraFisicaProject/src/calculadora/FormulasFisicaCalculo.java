/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Daniel
 */
public class FormulasFisicaCalculo {
    
    protected double forca;
    protected double massa;
    protected double aceleracao;
    
    public FormulasFisicaCalculo(){
        
    }
    
    public void setMassa(double massa){
        this.massa = massa;
    }
    
    public double getMassa(){
        return this.massa;
    }
    
    public void setAceleracao(double acelerar){
        this.aceleracao = acelerar;
    }
    
    public double getAceleracao(){
        return this.aceleracao;
    }
    
    public void setForca(double forca){
        this.forca = forca;
    }
    
    public double getForca(){
        return this.forca;
    }
}
 
