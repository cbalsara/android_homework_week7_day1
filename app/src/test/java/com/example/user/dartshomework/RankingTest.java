package com.example.user.dartshomework;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 07/11/2016.
 */

public class RankingTest {
    ArrayList<Player> testAnswers;

    @Before
    public void before(){
        testAnswers = new ArrayList<Player>();
        testAnswers.add("Phil Taylor");
        testAnswers.add("The Power");
        testAnswers.add("3");
    }

    @Test
    public void getPlayersTest() {
        Player player = new Player();
        assertEquals( player.getPlayers() );
    }

    @Test
    public void getPlayerAtSpecificIndex(){
        Player player = new player(testAnswers);
        Player result = player.getPlayerByIndex(2);
        assertEquals("3", result);
    }



}
