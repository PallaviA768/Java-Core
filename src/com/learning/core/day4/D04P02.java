package com.learning.core.day4;

class CricketRating {
    private String playerName;
    float critic1;
    float critic2;
    private float critic3;
    private float avgRating;
    private String Coins;

    // Constructor
    public CricketRating(String playerName, float critic1, float critic2) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
    }

    // Constructor
    public CricketRating(String playerName, float critic1, float critic2, float critic3) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
    }

    // Method to calculate average rating based on two critics
    public void calculateAverageRating(float critic1, float critic2) {
        this.avgRating = (critic1 + critic2) / 2;
    }

    // Method to calculate average rating based on three critics
    public void calculateAverageRating(float critic1, float critic2, float critic3) {
        this.avgRating = (critic1 + critic2 + critic3) / 3;
    }

    // Method to calculate type of coin achieved by the player
    public String calculateCoins() throws NotEligibleException {
        if (avgRating >= 7) {
            return "gold coin";
        } else if (avgRating >= 5) {
            return "silver coin";
        } else if (avgRating >= 2) {
            return "copper coin";
        } else {
            throw new NotEligibleException("Not eligible for any coin");
        }
    }

    // Method to display all information
    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Average Rating: " + avgRating);
        try {
            System.out.println("Coins: " + calculateCoins());
        } catch (NotEligibleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Custom Exception class for not eligible cases
class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}

public class D04P02 {
    public static void main(String[] args) {
        // Input 1
        CricketRating player1 = new CricketRating("John", 9.3f, 9.6f);
        player1.calculateAverageRating(player1.critic1, player1.critic2);
        player1.display();
    }
}
