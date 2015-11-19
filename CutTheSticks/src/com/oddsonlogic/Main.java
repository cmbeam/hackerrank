package com.oddsonlogic;

import java.util.Scanner;

public class Main {

    static int findNonZeroSticks(int sticks[])
    {
        int count = 0;
        for (int i = 0; i <sticks.length ; i++) {
            if(sticks[i] > 0) count++;
        }
        return count;
    }
    static void makeCuts(int sticks[])
    {
        while (findNonZeroSticks(sticks) > 0) {
            System.out.println(findNonZeroSticks(sticks));
            int lowestValue = 1000000000;
            for (int i = 0; i < sticks.length; i++) {
                if (sticks[i] != 0 && lowestValue > sticks[i]) {
                    lowestValue = sticks[i];
                }
            }
            //System.out.println("lowest value: " + lowestValue);
            for (int i = 0; i < sticks.length; i++) {
                if(sticks[i] != 0)
                {
                    sticks[i] = sticks[i] - lowestValue;
                }
            }

        }
    }

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

        int n;
        int sticks[];

        n = in.nextInt();
        sticks = new int[n];

        for (int i = 0; i < n ; i++) {
            sticks[i] = in.nextInt();

        }

        makeCuts(sticks);



    }
}
