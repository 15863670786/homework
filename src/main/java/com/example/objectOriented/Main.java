package com.example.objectOriented;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.input("D:\\sa\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("D:\\sa\\ooput.txt");

    }
}
