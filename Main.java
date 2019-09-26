package com.collections;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter file name: ");
        FileSorted fileSorted = new FileSorted();
        try {
            fileSorted.getFileName();
            fileSorted.bytesToString();
            fileSorted.printWords();
            fileSorted.printFrequency();
            fileSorted.printMostFrequent();
        } catch (FileNotFoundException f) {
            System.out.println("Wrong filename. Please try again.");
        } catch (IOException io) {
            io.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred");


        }
    }
}

