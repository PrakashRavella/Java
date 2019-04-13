package com.prakash;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        displayHighScorePosition("prakash ",500);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {


            int finalscore = score + (levelCompleted * bonus);
            finalscore += 2000;
            System.out.println("the final score is " + finalscore);
            return finalscore;

        }
        return -1;

    }


    public static void displayHighScorePosition (String playername,int position ){

    }

    public static int calculatedHighScorePosition(int playerscore) {

        if(playerscore>1000)
            return playerscore=1;
        if(playerscore>500 &&playerscore<1000)
            System.out.println(("Score is between 500 and 1000"));


    }
}







