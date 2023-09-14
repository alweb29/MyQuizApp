package com.example.alweb29.test

import android.media.Image

data class Question (
    val id: Int,
    val question: String,
    val image: Int,

    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,

    val correctAnswer: Int
)