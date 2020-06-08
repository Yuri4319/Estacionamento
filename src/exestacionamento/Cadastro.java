package exestacionamento;

import javax.swing.JOptionPane;

public class Cadastro {
    public String propVeiculo;
    public String placaVeiculo;
    public String modVeiculo;
    public double hrEnt;
    public double minEnt;
    public double hrSaida;
    public double minSaida;
    public double taxa;
    
    public double calcularTempo (double hrEnt , double minEnt, double hrSaida, double minSaida){
        
    double saida = hrSaida + minSaida/60;
    double entrada = hrEnt + minEnt/60;
    double tempo = Math.ceil (saida - entrada);
        return tempo;
    
    
    }
    
    public String getPropVeiculo(){
        return propVeiculo;
    }
    public void setPropVeiculo (String propVeiculo){
        this.propVeiculo=propVeiculo;
    }
        
    public String getPlacaVeiculo(){
        return placaVeiculo;
    }
    public void setPlacaVeiculo (String placaVeiculo){
        this.placaVeiculo=placaVeiculo;
    }
    public String getModVeiculo(){
        return modVeiculo;
    }
    public void setModVeiculo(String modVeiculo){
        this.modVeiculo=modVeiculo;
    }
    public double getHrEnt(){
        return hrEnt;
    }
    public void setHrEnt(double hrEnt){
        this.hrEnt=hrEnt;
    }
    public double getMinEnt(){
        return minEnt;
    }
    public void setMinEnt(double minEnt){
        this.minEnt=minEnt;
    }
    public double getHrSaida(){
        return hrSaida;
    }
    public void setHrSaida(double hrSaida){
        this.hrSaida=hrSaida;
    }
    public double getMinSaida(){
        return minSaida;
    }
    public void setMinSaida(double minSaida){
        this.minSaida=minSaida;
    }
    public double getTaxa(){
        return taxa;
    }
    public void setTaxa(double taxa){
        this.taxa=taxa;
    }
    
    
    public double calcularPreco(double taxa,double horarioEstacionamento){
    double precoEstacionamento = horarioEstacionamento * taxa;
        JOptionPane.showMessageDialog(null,"Proprietário do veículo"+getPropVeiculo()
             +"\n Placa do carro: "+getPlacaVeiculo()
             +"\n Modelo: "+getModVeiculo()+"\n"
             + " Horário de entrada: "+getHrEnt()+"h e " +getMinEnt()+"min\n"
             +" Horário de saida: "+getHrSaida()+"h e " +getMinSaida()+"min\n" 
             +"Tempo no estacionamento: "+horarioEstacionamento+" hrs"
             +"\nValor total: R$ "+precoEstacionamento);
        return precoEstacionamento;
    }

}
