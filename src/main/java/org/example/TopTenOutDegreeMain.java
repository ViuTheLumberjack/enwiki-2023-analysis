package org.example;

import java.io.IOException;

public class TopTenOutDegreeMain {
    public static void main(String[] args) throws IOException {
        WikiGraph wg = new WikiGraph("data/enwiki-2023");

        System.out.println(wg.getNumNodes());
        System.out.println(wg.getNumArcs());
        System.out.println(wg.getName(2000000));
    }
}