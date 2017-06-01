/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arlen
 */
public class Moto extends Veiculo{
    private int cilindradas;
    public Moto(String modelo, String marca, String placa, int cilindradas) {
        super(modelo, marca, placa);
        this.cilindradas = cilindradas;
        
    }
    
    @Override
    public String getDescricaoVeiculo() {
        return super.getDescricaoVeiculo() + "\t" + cilindradas + "\tR$ " + calcularImposto();
    }
    
    @Override
    public double calcularImposto() {
        double imposto = 0;
        
        if(cilindradas == 125) {
            imposto = super.calcularImposto() * 1.05;
        } else if(cilindradas == 250){
            imposto = super.calcularImposto() * 1.15;
        }
        
        return imposto + 50;
    }
    
}
