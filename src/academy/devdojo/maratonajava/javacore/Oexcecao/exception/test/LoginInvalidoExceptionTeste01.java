package academy.devdojo.maratonajava.javacore.Oexcecao.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecao.exception.model.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usuarioDB = "admin";
        String senhaDB = "admin";
        System.out.println("Usuário: ");
        String usuarioDigitado = teclado.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = teclado.nextLine();
        if(!usuarioDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
