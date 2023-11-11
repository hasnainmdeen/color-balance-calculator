package org.example;

import java.util.*;

public class DNAColorBalance {

    private static final Map<Character, Boolean> redLaserPhoto = new HashMap<>();
    private static final Map<Character, Boolean> greenLaserPhoto = new HashMap<>();

    static {
        redLaserPhoto.put('C', true);
        redLaserPhoto.put('A', true);
        redLaserPhoto.put('G', false);
        redLaserPhoto.put('T', false);

        greenLaserPhoto.put('T', true);
        greenLaserPhoto.put('A', true);
        greenLaserPhoto.put('G', false);
        greenLaserPhoto.put('C', false);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sequences = new ArrayList<>();
        System.out.println("Enter DNA sequences, one per line (empty line to end):");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String sequence = line.replaceAll("\\s", "").toUpperCase();
            if (!sequence.matches("[AGTC]+")) {
                System.out.println("Invalid DNA sequence: " + sequence);
                continue;
            }
            sequences.add(sequence);
        }
        scanner.close();

        int maxSequenceLength = sequences.stream().mapToInt(String::length).max().orElse(0);

        for (int cycle = 0; cycle < maxSequenceLength; cycle++) {
            int redVisibleCount = 0;
            int greenVisibleCount = 0;

            // Check visibility for each sequence in the current cycle
            for (String sequence : sequences) {
                if (cycle < sequence.length()) {
                    char base = sequence.charAt(cycle);
                    redVisibleCount += redLaserPhoto.getOrDefault(base, false) ? 1 : 0;
                    greenVisibleCount += greenLaserPhoto.getOrDefault(base, false) ? 1 : 0;
                }
            }

            System.out.println((cycle + 1) + ". " + redVisibleCount + " / " + greenVisibleCount);
        }
    }
}
