class Song {
    String title;
    Song previous;
    Song next;

    Song(String title) {
        this.title = title;
        this.previous = null;
        this.next = null;
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.addSong("majboor");
        player.addSong("queens");
        player.addSong("tulasi");

        player.showPlaylist();
    }
}

class MusicPlayer {
    Song head;
    Song current;

    void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
            current = head;
            return;
        }
        Song temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newSong;
        newSong.previous = temp;
    }

    void showPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("Playlist Details:");
        Song temp = head;
        while (temp != null) {
            String prevTitle = (temp.previous != null) ? temp.previous.title : "None";
            String nextTitle = (temp.next != null) ? temp.next.title : "None";
            String currentMarker = (temp == current) ? " - (Currently Playing)" : "";

            System.out.println("[ Prev: " + prevTitle + " \n Song: " + temp.title + " \n Next: " + nextTitle + " ]" + currentMarker);
            temp = temp.next;
        }
    }
    void playNextSong() {
        if (current == null) {
            System.out.println("Playlist is empty.");
        } else if (current.next != null) {
            current = current.next;
            System.out.println("Now playing: " + current.title);
        } else {
            System.out.println("Reached the end of the playlist.");
        }
    }

    void playPreviousSong() {
        if (current == null) {
            System.out.println("Playlist is empty.");
        } else if (current.previous != null) {
            current = current.previous;
            System.out.println("Now playing: " + current.title);
        } else {
            System.out.println("Already at the first song.");
        }
    }
}
