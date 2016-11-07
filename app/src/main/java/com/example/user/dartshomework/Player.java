package com.example.user.dartshomework;

/**
 * Created by user on 07/11/2016.
 */

public class Player {
    private String name;
    private String nickname;
    private int ranking;

    public Player (String name, String nickname, int ranking){
        this.name = name;
        this.nickname = nickname;
        this.ranking = 1;
    }

    public String getName(){
        return this.name;
}

    public void setName(String name){
        this.name = name;
    }


    public String getNickName(){
        return this.nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public int getRanking(){
        return this.ranking;
    }

    public void setRanking(int ranking){
        this.ranking = ranking;
    }

    public String getFullDetails(String name,String nickname,int ranking){
        return this.name + this.nickname + this.ranking;
    }













}
