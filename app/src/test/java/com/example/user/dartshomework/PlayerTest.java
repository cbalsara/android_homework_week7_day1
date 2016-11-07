package com.example.user.dartshomework;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {

    @Test
    public void testPlayerSetup(){
        Player player = new Player("Cyrus Balsara", "El Tigre", 1);
        assertEquals( "Cyrus Balsara", player.getName() );
        assertEquals( "El Tigre", player.getNickName() );
    }

    @Test
    public void testPlayerRanking(){
        Player player = new Player("Cyrus Balsara", "El Tigre", 1);
        assertEquals( 1, player.getRanking() );
    }


    @Test
    public void changePlayerName(){
        Player player = new Player("Cyrus Balsara", "El Tigre", 1);
        player.setName("Tim");
        assertEquals( "Tim", player.getName() );
    }

    @Test
    public void changePlayerNickname(){
        Player player = new Player("Cyrus Balsara", "El Tigre", 1);
        player.setNickname("TIMAAAEE");
        assertEquals( "TIMAAAEE", player.getNickName() );
    }

    @Test
    public void changePlayerRanking(){
        Player player = new Player("Cyrus Balsara", "El Tigre", 1);
        player.setRanking(20);
        assertEquals( 20, player.getRanking() );
    }

    @Test
    public void getPlayerFullDetails(){
        Player player = new Player("Cyrus Balsara", "El Tigre", 1);
        assertEquals( "Cyrus Balsara", "El Tigre", "1", player.getFullDetails(String, String, int)
        );

    }




}
