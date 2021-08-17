package com.example.quizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.india,
            "Japan",
            "Srilanka",
            "Usa",
            "India",
            4
        )

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.srilanka,
            "Japan",
            "Usa",
            "Sri lanka",
            "India",
            3
        )
        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.usa,
            "Srilanka",
            "Usa",
            "Japan",
            "India",
            2
        )
        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.bhutan,
            "Japan",
            "Nepal",
            "Bhutan",
            "India",
            3
        )
        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.itly,
            "Usa",
            "India",
            "Japan",
            "itly",
            4
        )
        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.india,
            "Japan",
            "Srilanka",
            "Usa",
            "India",
            4
        )

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.srilanka,
            "Japan",
            "Usa",
            "Sri lanka",
            "India",
            3
        )
        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.usa,
            "Srilanka",
            "Usa",
            "Japan",
            "India",
            2
        )
        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.bhutan,
            "Japan",
            "Nepal",
            "Bhutan",
            "India",
            3
        )
        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.itly,
            "Usa",
            "India",
            "Japan",
            "itly",
            4
        )


        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)
        return questionsList
    }

}