package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();
        System.out.println("What is your favorite band?");
        song.band = scanner.nextLine();
        System.out.println("What is your favourite track?");
        song.title = scanner.nextLine();
        System.out.println("How long it is?");
        song.length = scanner.nextInt();

        System.out.println(song.band + " - " + song.title + " - " + song.length + " minutes");
    }
}
