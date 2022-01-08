package academy.devdojo.maratonajava.javacore.Kenum.model;

public enum TipoPagamento {
    DEBITO(1, "Débito") {
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO(2, "Crédito") {
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.05;
        }
    };
    public final int valor;
    private final String nomeFormatado;

    TipoPagamento(int valor, String nomeFormatado) {
        this.valor = valor;
        this.nomeFormatado = nomeFormatado;
    }

    public abstract double calculaDesconto(double valor);

    public int getValor() {
        return valor;
    }

    public String getNomeFormatado() {
        return nomeFormatado;
    }
}
