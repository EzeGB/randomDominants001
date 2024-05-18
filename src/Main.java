import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String [] tipo = {"sus","#11","#9","(b9#11)","#9b13","(b913)"};
        String [] notas = {"C7","Db7","D7","Eb7","E7","F7","Gb7","G7","Ab7","A7","Bb7","B7"};

        for (int i=0; i<32;i++){
            int randTipo = (int)(Math.random()*5);
            int randNotas = (int)(Math.random()*11);
            System.out.print(notas[randNotas]+tipo[randTipo]);
            if ((i+1)%4==0){
                System.out.println();
            } else {
                System.out.print("-");
            }
        }
    }
}