package com.bhnu;

import java.util.Arrays;

public class WaterContainer {
    public static void main(String[] args) {
        int[] containers = {5,10,30,20,15}; // Example container sizes
        int numPeople = 3; // Number of people

        int minTime = calculateMinimumTime(containers, numPeople);
        System.out.println("Job will be completed at time: " + minTime + " minutes");
    }

    private static int calculateMinimumTime(int[] containers, int numPeople) {
        Arrays.sort(containers); // Sort containers in ascending order
        int numContainers = containers.length;
        int[] fillTimes = new int[numPeople]; // Array to store the fill times for each person

        int maxContainerIndex = numContainers - 1;
        while (maxContainerIndex >= 0) {
            int personIndex = getPersonWithLeastFillTime(fillTimes);
            fillTimes[personIndex] += containers[maxContainerIndex];
            maxContainerIndex--;
        }

        int maxTime = Arrays.stream(fillTimes).max().getAsInt();
        if (maxTime > 60) {
            return 60; // Return 60 if the maximum fill time exceeds 60 minutes
        } else {
            return maxTime;
        }
    }

    private static int getPersonWithLeastFillTime(int[] fillTimes) {
        int minTime = Integer.MAX_VALUE;
        int personIndex = 0;

        for (int i = 0; i < fillTimes.length; i++) {
            if (fillTimes[i] < minTime) {
                minTime = fillTimes[i];
                personIndex = i;
            }
        }

        return personIndex;
    }
}

