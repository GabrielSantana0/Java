package Desafio;

public class ContaCorrente extends ContaBancaria {
    private double tarifa = 20.0;

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void cobrarTarifa() {
        saldoBancario -= tarifa;
        System.out.println("Tarifa mensal de: R$ " + tarifa + " cobrada. Saldo atual: " + saldoBancario);
    }

}
