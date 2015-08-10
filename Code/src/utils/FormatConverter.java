package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class FormatConverter {

    public static void FASTAToWord2Vec(String inputFile, String outputFile, boolean append) {
        try {
            String currentGene = "";
            String currentCodon = "";
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, append));
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (!(line.charAt(0) == 'A' || line.charAt(0) == 'C'
                        || line.charAt(0) == 'T' || line.charAt(0) == 'G')) {
                    // Gene ends.
                    if (!currentGene.isEmpty()) {
                        bw.write(currentGene + "\n");
                    }
                    currentGene = "";
                } else {
                    if (!line.isEmpty()) {
                        String part = currentCodon + line;
                        String[] codons = part.split("(?<=\\G.{3})");
                        if (codons[codons.length - 1].length() != 3) {
                            currentCodon = new String(codons[codons.length - 1]);
                            codons[codons.length - 1] = "";
                        } else {
                            currentCodon = "";
                        }
                        String newPart = Arrays.toString(codons);
                        newPart = newPart.replaceAll(", ", " ");
                        newPart = newPart.replaceAll("\\[|\\]", "");
                        if (!currentGene.isEmpty()) {
                            currentGene += " ";
                        }
                        currentGene += newPart.trim();
                    }
                }
            }
            br.close();
            bw.write("\n");
            bw.close();
        } catch (Exception e) {
            System.out.println("In FASTAToWord2Vec " + e.getMessage());
        }
    }
}