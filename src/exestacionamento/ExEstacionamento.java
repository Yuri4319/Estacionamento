package exestacionamento;

import javax.swing.JOptionPane;
public class ExEstacionamento {
    public static void main(String[] args) {
    Cadastro informacoes= new Cadastro();
    informacoes.setPropVeiculo((JOptionPane.showInputDialog("Proprietário do veículo: ")));
    informacoes.setPlacaVeiculo((JOptionPane.showInputDialog("Placa do veículo: ")));
    informacoes.setModVeiculo((JOptionPane.showInputDialog("Modelo do veículo: ")));
    informacoes.setHrEnt (Integer.parseInt(JOptionPane.showInputDialog("Hora de entrada no estacionamento: ")));
    informacoes.setMinEnt (Integer.parseInt(JOptionPane.showInputDialog("Minuto de entrada no estacionamento: ")));
    informacoes.setHrSaida (Integer.parseInt(JOptionPane.showInputDialog("Hora de saída do estacionamento: ")));
    informacoes.setMinSaida (Integer.parseInt(JOptionPane.showInputDialog("Minuto de saída do estacionamento: ")));
    informacoes.setTaxa (Integer.parseInt(JOptionPane.showInputDialog("Digite a taxa: ")));
    
    
    double horarioEstacionamento = informacoes.calcularTempo(informacoes.getHrEnt(),informacoes.getMinEnt(),informacoes.getHrSaida(),informacoes.getMinSaida());
    double tarifaFinal = informacoes.calcularPreco(informacoes.getTaxa(),informacoes.getTaxa());
    }
    
    }