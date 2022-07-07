package ch.bbw.intelligencetypemaven.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserPoints {
    private int musical = 0;
    private int mathematical = 0;
    private int spatial = 0;
    private int bodily = 0;
    private int intrapersonal = 0;
    private int interpersonal = 0;
    private int naturally = 0;
    private int linguistic = 0;
    private String[] types = new String[]{"Musikalisch", "Mathematisch", "Räumlich", "Körperlich",
            "Intrapersonal", "Interpersonal", "Natur", "Linguistisch"};

    // Löschen im finalen Projekt
    public void increment(String type, int number) {
        switch (type) {
            case "musical":
                musical += number;
                break;
            case "mathematical":
                mathematical += number;
                break;
            case "spatial":
                spatial += number;
                break;
            case "bodily":
                bodily += number;
                break;
            case "intrapersonal":
                intrapersonal += number;
                break;
            case "interpersonal":
                interpersonal += number;
                break;
            case "naturally":
                naturally += number;
                break;
            case "linguistic":
                linguistic += number;
                break;
        }
    }

    public int getMusical() {
        return musical;
    }

    public int getMathematical() {
        return mathematical;
    }

    public int getSpatial() {
        return spatial;
    }

    public int getBodily() {
        return bodily;
    }

    public int getIntrapersonal() {
        return intrapersonal;
    }

    public int getInterpersonal() {
        return interpersonal;
    }

    public int getLinguistic() {
        return linguistic;
    }


    public int getNaturally() {
        return naturally;
    }

    public List<String> getIntelligenceType() {
        int maxNum = 0;
        int[] scores = new int[]{musical, mathematical, spatial, bodily, intrapersonal, interpersonal, naturally,
                linguistic};

        List<String> yourResult = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxNum) {
                maxNum = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxNum) {
                yourResult.add(types[i]);
            }
        }

        return yourResult;
    }

    public void setScoresZero() {
        musical = 0;
        mathematical = 0;
        spatial = 0;
        bodily = 0;
        intrapersonal = 0;
        interpersonal = 0;
        naturally = 0;
        linguistic = 0;
    }
}
