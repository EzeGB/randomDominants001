import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String [] tipo = {"sus","#11","#9","b9#11","#9b13","b913"};
        String [] notas = {"C","Db","D","Eb","E","F","Gb","G","Ab","A","Bb","B"};
        int randTipo = (int)(Math.random()*5);
        int randNotas = (int)(Math.random()*11);
        System.out.println(notas[randNotas]+tipo[randTipo]);
    }
}