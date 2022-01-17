package academy.devdojo.maratonajava.javacore.Oexcecao.exception.model;

public class LoginInvalidoException  extends Exception {
    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
