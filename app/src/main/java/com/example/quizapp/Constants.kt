package com.example.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(1,
            "What flag does this country belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Armenia",
            "Australia",
            "India",
            1)

        questionList.add(que1)

        val que2 = Question(2,
            "What flag does this country belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Armenia",
            "Australia",
            "India",
            3)

        questionList.add(que2)


        val que3 = Question(3,
            "What flag does this country belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Brazil",
            "Australia",
            "India",
            2)

        questionList.add(que3)

        val que4 = Question(4,
            "What flag does this country belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Turkey",
            "Norway",
            "Finland",
            1)

        questionList.add(que4)

        val que5 = Question(5,
            "What flag does this country belong to?",
            R.drawable.ic_flag_of_fiji,
            "USA",
            "New Zealand",
            "Australia",
            "Fiji",
            4)

        questionList.add(que5)

        val que6 = Question(6,
            "What flag does this country belong to?",
            R.drawable.ic_flag_of_germany,
            "Poland",
            "Germany",
            "Russia",
            "Hungary",
            2)

        questionList.add(que6)

        val que7 = Question(7,
            "What flag does this country belong to?",
            R.drawable.ic_flag_of_india,
            "India",
            "Kuwait",
            "Hungary",
            "Israel",
            1)

        questionList.add(que7)

        val que8 = Question(8,
            "What flag does this country belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Jordan",
            "Kuwait",
            "Israel",
            "Saudi Arabia",
            2)

        questionList.add(que8)

        val que9 = Question(9,
            "What flag does this country belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina",
            "Armenia",
            "Australia",
            "New Zealand",
            4)
        questionList.add(que9)

        val que10 = Question(10,
            "What flag does this country belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Belgium",
            "France",
            "Germany",
            2)

        questionList.add(que10)


        return  questionList
    }
}