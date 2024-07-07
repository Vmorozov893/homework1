//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("1 задание");
        var dog = 8.0;
        System.out.println("Значение переменной dog: " + dog);
        var cat = 3.6;
        System.out.println("Значение переменной cat: " + cat);
        var paper = 763789;
        System.out.println("Значение переменной paper: " + paper + "\n");
        System.out.println("2 задание");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("новые значения переменных: " + dog + ' ' + cat + ' ' + paper + "\n");
        System.out.println("3 задание");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("новые значения переменных: " + dog + ' ' + cat + ' ' + paper + "\n");
        System.out.println("4 задание");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
}