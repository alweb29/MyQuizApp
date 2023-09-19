package com.example.alweb29.test

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.alweb29.test.databinding.ActivityQuizQuestionsBinding

class QuizQuestionsActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityQuizQuestionsBinding

    private var progressBar : ProgressBar? = null
    private var tvProgressBar : TextView? = null
    private var tvQuestion : TextView? = null
    private var ivImage : ImageView? = null

    private var tvOptionOne : TextView? = null
    private var tvOptionTwo : TextView? = null
    private var tvOptionThree : TextView? = null
    private var tvOptionFour : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        progressBar = findViewById(R.id.progress_bar)
        tvProgressBar = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)

        val questionsList = Constants.getQuestions()
        Log.i("There are", "${questionsList.size}")
        for (i in questionsList){
            Log.e("Question", i.question)
        }


        var currentPosition = 1
        var question :Question = questionsList[currentPosition - 1]

        ivImage?.setImageResource(question.image)
        tvProgressBar?.text = "$currentPosition/${progressBar?.max}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionThree


        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_quiz_questions)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}