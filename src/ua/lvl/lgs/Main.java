package ua.lvl.lgs;


public class Main {
    public static void main ( String [] args) {
        Number[] array = { 10, 30, 5, 4, 5, 6, 89, 90, 67, 9, 34, 56, 95, 34, 7, 6, 9, 23};
        Iterator.Collection collection = new Iterator.Collection ( array );

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }

        System.out.println("");
        Iterator collectionIterator = collection.outputValueOfArray ();
        while (collectionIterator.hasNext()) {
            System.out.print(collectionIterator.next() + "; ");
        }

        System.out.println("");
        Iterator collectionIterator1 = collection.outputArray ();
        while (collectionIterator1.hasNext()) {
            System.out.print(collectionIterator1.next() + "; ");
        }

    }
}