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
public class ResultadoFormulaFisica extends FormulasFisicaCalculo{
    
    public double resultadoForca(){
        return this.getAceleracao() * this.getMassa();
    }
    
    public double resultadoMassa(){
        return this.forca / this.aceleracao;
    }
    
    public double resultadoAceleracao(){
        return this.forca / this.massa;
    }
    
}
