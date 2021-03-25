/*
Opracuj drzewo przeszukiwan binarnych przechowujace wartosci jakiegos typu
(zaproponuj ten typ: np. samochod, budynek, zegarek).
Algorytm porownujacy ma byc dostarczany w formie interfejsu Comparable bądz Comparator.
Zaproponuj takie dwa algorytmy oparte o te dwa interfejsy.
Algorytmy powinny byc nieoczywiste - nie powinny bazowac wylacznie na liczbach,
datach czy kolejnosci alfabetycznej.  Rozwiazanie powinno uwzgledniac:

- generowanie przykladowego drzewa skladajacego sie z co najmniej 30 elementow zgodnie
z podanymi regulami sortowania wynikajacymi z algorytmu Comparable badz Comparator

- tworzenie pustego drzewa,

- dodawanie elementu do drzewa,

- wypisywanie w kolejnosci rosnacej zawartosci drzewa.

 */

public class Main {

    public static void main(String[] args) {
        BSTGenrator readyTree = new BSTGenrator();
        BST tree = readyTree.createBST();
        System.out.println("\n" + "Drzewo inorder: " + "\n");
        tree.printInorder();
    }

}
