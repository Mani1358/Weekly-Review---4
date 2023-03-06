package com.Java.weeklyreview4;

import java.util.*;

public class SortPrimeArray {
    public static void main(String[] args) {

        int[] arr = {5, 7, 2, 1, 9, 6, 17, 7};
        int[] primes = findPrimes(arr);
        Arrays.sort(primes);
        System.out.println(Arrays.toString(primes));
    }

    public static int[] findPrimes(int[] arr) {
        List<Integer> primes = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (num < 2) {
                continue;
            }

            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && !seen.contains(num)) {
                primes.add(num);
                seen.add(num);
            }
        }
        int[] result = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            result[i] = primes.get(i);
        }
        return result;
    }

}


