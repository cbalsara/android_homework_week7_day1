package com.example.user.dartshomework;

import java.util.ArrayList;



/**
 * Created by user on 07/11/2016.
 */

public class Ranking {

    protected ArrayList<Player> mPlayers;

    public Ranking(){
        mPlayers = new ArrayList<Player>();

        setUpPlayers();
    }
//    method overload option below
    public Ranking(ArrayList<Player> existingPlayers){
        mPlayers = new ArrayList<Player>(existingPlayers);
    }

    private void setUpPlayers() {
        String[] players = {
                "Michael Van Gerwen", "Mighty Mike", "1",
                "Gary Anderson", "The Flying Scotsman", "2",
                "Phil Taylor", "The Power", "3",
                "Adrian Lewis", "Jackpot", "4",
                "Peter Wright", "Snakebite", "5",
                "James Wade" ,"The Machine", "6",
                "Robert Thornton", "The Thorn", "7",
                "Michael Smith", "Bully Boy", "8",
                "Dave Chisnall", "Chizzy", "9",
                "Ian White", "Diamond", "10"
        };
    }

//    return a copy of the Arraylist above
    public ArrayList<Player> getPlayers(){
        return new ArrayList<Player>(mPlayers);
    }


    //    get a player with their specific ranking (array numbers 2,5,8,11,14,17,20,23,26,29)
    public Player getPlayerByIndex(int index){
        return mPlayers.get(index);
    }


//    replace the player at the end of the list with a new one


}
