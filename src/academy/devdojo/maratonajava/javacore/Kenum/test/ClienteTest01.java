package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.model.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.model.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.model.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Danimar", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Apple", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println("Desconto no débito: "+TipoPagamento.DEBITO.calculaDesconto(100)+"%");
        System.out.println("Desconto no crédito: "+TipoPagamento.CREDITO.calculaDesconto(100)+"%");
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeFormatado());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeFormatado("Pessoa física");
        System.out.println(tipoCliente2);
    }
}
