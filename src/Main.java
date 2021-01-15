public class Main {

    static void menu(Integer[] array){
        Collection collection = new Collection(array);

        System.out.println("Масив від початку до кінця з заміною непарних елементів на нуль ");
        Iterator iteratorForward = collection.useForwardIterator();

        while (iteratorForward.hasNext()) {
            Integer next = iteratorForward.next();

            if (next % 2 != 0) {
                System.out.println(0);
            } else
                System.out.println(next);
        }

        System.out.println();

        System.out.println("З кінця через одне значення ");
        Iterator iteratorBackward = collection.useBackwardIterator();

        while (iteratorBackward.hasNext()) {
            Integer next = iteratorBackward.next();

            System.out.println(next);
        }

        System.out.println();

        System.out.println("Кожен третій непарний елемент");
        Iterator iteratorAnonymous = collection.useAnonymIterator();

        int i = 1;
        while (iteratorAnonymous.hasNext()) {
            Integer next = iteratorAnonymous.next();

            if (i % 3 == 0) {
                if (next % 2 != 0) {
                    System.out.println(next);
                }
            }

            i++;
        }

        System.out.println();

        System.out.println("Кожен пятний елемент -100");
        Iterator iteratorLocal = collection.useLocalIterator();

        int j = 1;
        while (iteratorLocal.hasNext()) {
            Integer next = iteratorLocal.next();

            if (j % 5 == 0) {
                if (next % 2 == 0) {
                    System.out.println(next - 100);
                }
            }

            j++;
        }

        System.out.println();

        System.out.println("Кожен другий елемент непарний:");
        Iterator iteratorStatic = Collection.useStaticIterator();

        int index = 1;
        while (iteratorStatic.hasNext()) {
            Integer next = iteratorStatic.next();

            if (index % 2 == 0) {
                if (next % 2 == 0) {
                    System.out.println(next + 1);
                }
            }

            index++;
        }

    }

    public static void main(String[] args) {

        Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29 };

        menu(array);
    }

}