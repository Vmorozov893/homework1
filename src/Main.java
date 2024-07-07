//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println("Значение переменной dog: " + dog);
        var cat = 3.6;
        System.out.println("Значение переменной cat: " + cat);
        var paper = 763789;
        System.out.println("Значение переменной paper: " + paper + "\n");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("новые значения переменных: " + dog + ' ' + cat + ' ' + paper + "\n");
    }
}