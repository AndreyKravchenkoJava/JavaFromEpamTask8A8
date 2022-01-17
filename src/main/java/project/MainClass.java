package project;

public class MainClass {
    public static void main(String[] args) {
        String str = "Hello world, i em a junior java developer and (i love learning with my college). My age is a 18 ears old";

        System.out.println(str.replaceAll("\\([^)]+\\)", ""));
    }
}
