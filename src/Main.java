import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
ArrayList<String> namesA= new ArrayList<>();
        namesA.add(0,"Emanuel");
        namesA.add(1,"Duker");
        namesA.add(2,"Johnathan");
        namesA.add(3,"Daniel");
        namesA.add(4,"Elon");

        ArrayList<String> namesB= new ArrayList<>();
        namesB.add(0,"Annabet");
        namesB.add(1,"Gwen");
        namesB.add(2,"Alice");
        namesB.add(3,"Elizabeth");
        namesB.add(4,"Kasandra");

        ArrayList<String> namesC= new ArrayList<>();
        namesC.add(namesA.get(0));
        namesC.add(namesB.get(4));
        namesC.add(namesA.get(1));
        namesC.add(namesB.get(3));
        namesC.add(namesA.get(2));
        namesC.add(namesB.get(2));
        namesC.add(namesA.get(3));
        namesC.add(namesB.get(1));
        namesC.add(namesA.get(4));
        namesC.add(namesB.get(0));

        Collections.sort(namesC, Comparator.comparing(String::length));

        System.out.println("Список А: "+ namesA);
        System.out.println("Список Б: "+ namesB);
        System.out.println("Список С: "+ namesC);
        System.out.println("Сортировка по возрастанию: "+ namesC);

    }
}