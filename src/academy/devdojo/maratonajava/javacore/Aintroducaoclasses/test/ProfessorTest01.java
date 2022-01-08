package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Rogéria";
        professor.idade = 40;
        professor.sexo = 'F';
        System.out.println(professor.nome+", "+ professor.idade+", "+ professor.sexo);
    }
}
