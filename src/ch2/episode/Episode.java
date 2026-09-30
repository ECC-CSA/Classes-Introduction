package ch2.episode;

class Episode {
  int seriesNumber;
  int episodeNumber;

  void play() {
    System.out.println("Playing ch2.episode " + episodeNumber);
  }

  void skipIntro() {
    System.out.println("Skipping intro...");
  }

  void skipToNext() {
    System.out.println("Loading next ch2.episode...");
  }
}

class EpisodeTestDrive {
  public static void main(String[] args) {
    Episode episode = new Episode();
    episode.seriesNumber = 4;
    episode.play();
    episode.skipIntro();
  }
}