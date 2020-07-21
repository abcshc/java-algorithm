package com.example.javaalgorithm.groomdevth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class ExchangeFreeGift {
    public void run(Reader reader) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(reader);
        int caseCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < caseCount; i++) {
            String[] coupons = br.readLine().split(" ");
            long seasonCount = Long.parseLong(coupons[0]);
            long normalCount = Long.parseLong(coupons[1]);
            System.out.println(Math.min((seasonCount + normalCount) / 12, seasonCount / 5));
        }
    }
}
