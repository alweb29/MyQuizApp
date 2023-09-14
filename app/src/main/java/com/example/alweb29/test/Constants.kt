package com.example.alweb29.test

object Constants {
    
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        
        val qes1 = Question(
            1,
            "What geometry figure is this?",
            R.drawable.circleimg,
            "circle",
            "triangle",
            "square",
            "box",
            1
        )
        
        questionsList.add(qes1)

        val qes2 = Question(
            1,
            "What geometry figure is this?",
            R.drawable.triangleimg,
            "big circle",
            "triangle",
            "black square",
            "empty box",
            2
        )

        questionsList.add(qes2)


        val qes3 = Question(
            1,
            "What color is this figure?",
            R.drawable.squareimg,
            "red",
            "blue",
            "black",
            "pink",
            3
        )

        questionsList.add(qes3)
        return questionsList
    }
    
}