package se.yrgo.util;

public class Score {
    private static Integer score;
    private static Integer highScore;
    private static String playerName = "Sven";


    public Score(Integer highScore, String playerName) {
        Score.highScore = highScore;
        Score.playerName = playerName;
    }

    public static void setScore(float birdPosition) {
        score = (int)birdPosition / 10;
    }

    public static void setHighScore() {
        if(highScore == null) {
            highScore = 0;
        }
        if (score > highScore) {
            highScore = score;

        }



    }
   public static void checkIfAllTimeHigh() {
        System.out.println(playerName + score);
    }

    public static String getScoreString() {
        return score.toString();
    }
    public static String getHighScore () {
        return highScore.toString();
    }

    public String getPlayerName() {
        return playerName;
    }
    public Integer getScore() {
        return highScore;
    }




}
