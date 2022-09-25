package hw1.q4;

import java.util.Random;

public class QuestionFour {
    // 4) Generate two random arrays of size n > 100 from a set S={'A', ‘C', 'T', 'G'}. Return the first index if you
    // can find only 4 consecutive "G's" in both the arrays at the same indexes. Experiment with different values
    // of n.
    private char[] nucleicAcids = {'A', 'C', 'G', 'T'};

    char[] generateDnaSequence(int n) {
        Random rand = new Random();
        char[] dnaSequence = new char[n];
        int x;
        for (int i = 0; i < n; i++) {
            x = rand.nextInt(4);
            dnaSequence[i] = nucleicAcids[x];
        }
        return dnaSequence;
    }
    public int questionFour(int n) {
//        char[] sequenceOne = generateDnaSequence(n);
//        char[] sequenceTwo = generateDnaSequence(n);
        char[] sequenceOne = {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'};
        char[] sequenceTwo = {'C', 'G', 'G', 'G', 'G', 'A', 'G', 'G', 'G', 'G', 'G'};
        int gSeqStart = 0;
        int gCount = 0;
        int index = 0;

        System.out.print("Sequence One: { ");
        for (char c : sequenceOne) {
            System.out.print(c + " ");
        }
        System.out.print("}\nSequence Two: { ");
        for (char c : sequenceTwo) {
            System.out.print(c + " ");
        }
        System.out.print("}\n");
        while (index < 11 && gCount < 4) {
            if (sequenceOne[index] == 'G' && gCount == 0) {
                gSeqStart = index;
            }
            if (sequenceOne[index] == 'G' && sequenceTwo[index] == 'G') {
                gCount++;
            } else {
                gCount = 0;
            }
            index++;
        }

        if (gCount == 4) {
            return gSeqStart;
        } else {
            return -1;
        }
    }
}
