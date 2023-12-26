package dataStructuresAndAlgo.code_optimization;

import java.util.HashSet;
import java.util.Set;

/*
* 488p 동전 게임
* */
public class code_optimization_03 {
    // 최적화 전 O(N²)
    public String gameWinner( int numberOfCoins, String currentPlayer ){
        if( numberOfCoins <= 0 )
            return currentPlayer;

        String nextPlayer = "";
        if( "you".equals(currentPlayer) )
            nextPlayer = "them";
        else if( "them".equals(currentPlayer) )
            nextPlayer = "you";

        if( gameWinner(numberOfCoins - 1, nextPlayer ).equals(currentPlayer) ||
             gameWinner(numberOfCoins - 2, nextPlayer).equals(currentPlayer))
            return currentPlayer;
        else
            return nextPlayer;

    }
    // 최적화 후 O(1)
    public String gameWinner2( int numberOfCoins ){

        if( (numberOfCoins - 1) % 3 == 0 )
            return "them";
        else
            return "you";

    }
}
