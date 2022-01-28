package com.example.baseballsimulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun Inning(){
        var teamOne = TeamOne()
        var teamTwo = TeamTwo()

        for(player in teamOne.team) {
            var rand = (0...100).random()
        }



    }
}


class Player(
    val name: String,
    val hitChance: Double,
    val baseCounter: Int = 0,
    val strikes: Int = 0,
    val onField: Boolean = false
)





class TeamOne : AppCompatActivity() {


    var Player1 = Player("Eddie Rosario", 31.6)
    var Player2 = Player("Jorge Soler", 32.3)
    var Player3 = Player("Freddie Freeman", 37.9)
    var Player4 = Player("Austin Riley", 37.9)
    var Player5 = Player("Adam Duvall", 32.4)
    var Player6 = Player("Joe Pederson", 31.5)
    var Player7 = Player("Ozzie Albies", 33.6)
    var Player8 = Player("Travis J'Arnaud", 29.1)
    var Player9 = Player("Dansby Swanson", 32.2)



    var team = arrayOf(Player1, Player2, Player3, Player4, Player5, Player6, Player7, Player8, Player9)

    var score = 0
}

class TeamTwo: AppCompatActivity() {
    var Player1 = Player("Jose Altuve", 35.7)
    var Player2 = Player("Michael Brantley", 34.7)
    var Player3 = Player("Carlos Currea", 36.4)
    var Player4 = Player("Yordan Alva", 36.9)
    var Player5 = Player("Yuli Gurriel", 36.3)
    var Player6 = Player("Kyle Tucker", 38.3)
    var Player7 = Player("Alex Bregman", 33.6)
    var Player8 = Player("Juse Siri", 40.1)
    var Player9 = Player("Martin Maldonado", 25.8)

    var team = arrayOf(Player1, Player2, Player3, Player4, Player5, Player6, Player6, Player7, Player8, Player9)

    var score = 0

}