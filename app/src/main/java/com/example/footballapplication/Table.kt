package com.example.footballapplication

import com.google.gson.annotations.SerializedName

data class Table(
    @SerializedName("position")
    var position: Int,
    @SerializedName("team")
    var team: Team,
    @SerializedName("playedGames")
    var playedGames: Int,
    @SerializedName("won")
    var won: Int,
    @SerializedName("draw")
    var draw: Int,
    @SerializedName("lost")
    var lost: Int,
    @SerializedName("points")
    var points: Int,
    @SerializedName("goalsFor")
    var goalsFor: Int,
    @SerializedName("goalsAgainst")
    var goalsAgainst: Int,
    @SerializedName("goalDifference")
    var goalDifference: Int
)
