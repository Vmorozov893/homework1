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
        System.out.println(friend + "\n");

        System.out.println("5 задание");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog + "\n");

        System.out.println("6 задание");

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var differenceWeight = Math.abs(boxerWeight1-boxerWeight2);
        var sumWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Разница между массами: " + differenceWeight);
        System.out.println("Сумма масс: " + sumWeight + "\n");

        System.out.println("7 задание");

        var remainderWeight = boxerWeight2 % boxerWeight1;
        System.out.println("Остаток от деления: " + remainderWeight + "\n");

        System.out.println("8 задание");

        var hoursWork = 640;
        var hoursEmployee = 8;
        var employee = hoursWork / hoursEmployee;
        System.out.println("Всего работников в компании - " + employee + " человек." + "\n");
        employee = employee + 94;
        hoursWork = employee * hoursEmployee;
        System.out.println("Если в компании работает " + employee + " человека, то всего " + hoursWork + " часа работы может быть поделено между сотрудниками.");
    }
}