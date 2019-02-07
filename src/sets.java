import java.util.*;

public class sets {
    public static void main(String[] args) {


        System.out.println("  how many values do  you wanna add your first HashSet?");
        int n = askInteger();
        HashSet<Integer> values1 = creatRandomHeshset(n);

        System.out.println("  how many values do  you wanna add your first HashSet?");
        n = askInteger();
        HashSet<Integer> values2 = creatRandomHeshset(n);

        System.out.println("  first");
        printHashIntegerSet(values1);

        System.out.println("  second");
        printHashIntegerSet(values2);


        HashSet<Integer> difference = difference(values1, values2);
        System.out.println("  difference");
        printHashIntegerSet(difference);


    }


    public static HashSet<Integer> intersection(
            HashSet<Integer> numbers1,
            HashSet<Integer> numbers2) {


        numbers1.retainAll(numbers2);

        return numbers1;
    }


    public static HashSet<Integer> difference(
            HashSet<Integer> numbers1,
            HashSet<Integer> numbers2) {


        numbers1.removeAll(numbers2);

        return numbers1;
    }


    public static HashSet<Integer> unionAddall(
            HashSet<Integer> numbers1,
            HashSet<Integer> numbers2) {

        // Return the union of 'values1' and 'values2'
        // that is basically every element contained in
        // any of the two

        numbers1.addAll(numbers2);

        return numbers1;
    }


    public static HashSet<Integer> union(
            Set<Integer> numbers1,
            Set<Integer> numbers2) {

        // Return the union of 'values1' and 'values2'
        // that is basically every element contained in
        // any of the two

        HashSet<Integer> union = new HashSet<>() {
        };

        for (Integer x : numbers1) {
            union.add(x);
        }
        for (Integer x : numbers2) {
            union.add(x);
        }

        return union;
    }


    public static HashSet<Integer> creatRandomHeshset(int n) {

        HashSet<Integer> values = new HashSet<>();
        while (values.size() < n) {
            int value = randomSet();

            values.add(value);
        }

        return values;
    }


    public static TreeSet<Integer> creatTreesetRandom(int n) {
        TreeSet<Integer> values = new TreeSet<>();


        while (values.size() < n) {
            int value = randomSet();
            values.add(value);
        }

        return values;
    }


    public static HashSet<String> creatStringHeshset(int n) {

        HashSet<String> values = new HashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.println("enter " + i + ".nd element");
            String value = askString();

            values.add(value);
        }

        return values;
    }


    public static String askString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int askInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static Integer randomSet() {
        Random r = new Random();
        return r.nextInt(10);
    }

    public static void printHashStringSet(HashSet<String> values) {
        for (String el : values) {
            System.out.println(el);

        }
    }

    public static void printHashIntegerSet(HashSet<Integer> values) {

        for (Integer el : values) {
            System.out.println(el);
            ;

        }
    }

    public static void treeSetInteger(TreeSet<Integer> values) {

        for (Integer el : values) {
            System.out.println(el);


        }


    }
}

