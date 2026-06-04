import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.ArrayList<String> playlist = new java.util.ArrayList<>();

        System.out.println("Enter the first song:");
        String firstSong = scanner.nextLine();
        playlist.add(firstSong);

        System.out.println("Enter the second song:");
        String secondSong = scanner.nextLine();
        playlist.add(secondSong);

        System.out.println("Enter the third song:");
        String thirdSong = scanner.nextLine();
        playlist.add(thirdSong);

        System.out.println("Playlist: " + playlist);

        if (playlist.size() > 1) {
            String removed = playlist.remove(1);
            System.out.println("Removed song: " + removed);
        }

        if (!playlist.isEmpty()) {
            System.out.println("First song in playlist: " + playlist.get(0));
        }

        boolean containsAnimal = playlist.contains("Animal");
        System.out.println("Contains 'Animal': " + containsAnimal);

        System.out.println("Final playlist: " + playlist);
        scanner.close();
    }
}
