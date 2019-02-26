package com.codingnomads.part_08;

class QueueBook {

    char q[]; // this array holds the queue
    int putloc, getloc; // the put and get indices

    QueueBook(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    void put(char ch) {
//        if (putloc == q.length) {
//            System.out.println(" - QueueBook is full.");
//            return;
//        }
        q[putloc++] = ch;
    }

    // get a character from the queue
    char get() {
        if (getloc == putloc) {
            System.out.println(" - QueueBook is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }

}

// Demostrate the queue class.

class QDemo {
    public static void main(String[] args) {
        QueueBook bigQ = new QueueBook(100);
        QueueBook smallQ = new QueueBook(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        // put some number into bigQ
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }
        // retrieve and display element from bigQ
        System.out.println("Contents of bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }

        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        try {
            for (i = 0; i < 10; i++) {
                System.out.println("Attempting to store " + (char) ('Z' - i));

                smallQ.put((char) ('Z' + i));

                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catching the exception
            System.out.println("Index out-of-bounds!");
        }


        System.out.println();

        // more errors on smallQ
        System.out.println("Contents of smallQ: ");
        try {
            for (i = 0; i < 5; i++) {
                ch = smallQ.get();

                if (ch != (char) 0) System.out.println(ch);
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catching the exception
            System.out.println("Trying to store ch at index out of bounds");
        }
    }
}
