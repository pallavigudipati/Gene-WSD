package trials;

import utils.FormatConverter;

// import utils.*;

public class SameAminoAcid {
    public static void main(String[] args) {
       /* FormatConverter.FASTAToWord2Vec("src/data/sequence1.txt", "src/data/w2vsequence4.txt", true);
        FormatConverter.FASTAToWord2Vec("src/data/sequence2.txt", "src/data/w2vsequence4.txt", true);
        FormatConverter.FASTAToWord2Vec("src/data/sequence3.txt", "src/data/w2vsequence4.txt", true);
        FormatConverter.FASTAToWord2Vec("src/data/sequence4.txt", "src/data/w2vsequence4.txt", true);
        */
        FormatConverter.FASTAToWord2Vec("src/data/sequence1.txt", "src/data/w2vsequenceChr1.txt", false);
        FormatConverter.FASTAToWord2Vec("src/data/sequence2.txt", "src/data/w2vsequenceChr2.txt", false);
        FormatConverter.FASTAToWord2Vec("src/data/sequence3.txt", "src/data/w2vsequenceChr3.txt", false);
        FormatConverter.FASTAToWord2Vec("src/data/sequence4.txt", "src/data/w2vsequenceChr4.txt", false);
    }
}
