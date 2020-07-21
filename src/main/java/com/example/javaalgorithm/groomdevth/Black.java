package com.example.javaalgorithm.groomdevth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class Black {
    public static void run(Reader reader) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(reader);

        String input1 = br.readLine();
        // N : [0], K : [1]
        String[] info = input1.split(" ");
        double n = Double.parseDouble(info[0]);
        double k = Double.parseDouble(info[1]);

        String input2 = br.readLine();

        int result = (int) Math.ceil((n - k) / (k - 1)) + 1;

        System.out.print(result);
    }
}
