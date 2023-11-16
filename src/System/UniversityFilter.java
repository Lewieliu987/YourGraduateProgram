package System;

import java.util.Map;

public class UniversityFilter {
    private static UniversityFilter instance;

    private UniversityFilter() {
    }

    public static UniversityFilter getInstance() {
        if (instance == null) {
            instance = new UniversityFilter();
        }
        return instance;
    }

    public static void printUniversitiesByTier(Map<Integer, String> universityMap, int tier, String region) {
        universityMap.forEach((id, universityData) -> {

            String[] data = universityData.split(",");
            if (data.length >= 3) {
                // Check if the tier matches
                if (Integer.parseInt(data[2].trim()) == tier && data[1].equals(region)) {
                    System.out.println("University Name: " + data[0] + ", Region: " + data[1] + ", Tier: " + data[2]);
                }
            } else {
                System.err.println("Invalid data format for university ID " + id);
            }
        });
    }
}