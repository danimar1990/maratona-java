package academy.devdojo.maratonajava.javacore.Kenum.model;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica");
    public final int valor;
    private String nomeFormatado;

    TipoCliente(int valor, String nomeFormatado) {
        this.valor = valor;
        this.nomeFormatado = nomeFormatado;
    }

    public static TipoCliente tipoClientePorNomeFormatado(String nomeFormatado) {
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeFormatado().equals(nomeFormatado)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeFormatado() {
        return nomeFormatado;
    }
}
