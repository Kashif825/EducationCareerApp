package com.example.educationcareer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

       val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val adapter = ArticlesAdapter(getArticles())
        recyclerView.adapter=adapter
        val manager= LinearLayoutManager(this)
        recyclerView.layoutManager= manager


    }


}
fun getArticles(): List<Article> {
    val articles = ArrayList<Article>()
    articles.add(Article(
        "Using Campus Resources: Making the Most of What Your University Offers",
        "October 11, 2024",
        R.drawable.image1,
        "College life can feel overwhelming at times but designed with the vision",
         "College life can feel overwhelming at times but designed with the vision to help you live comfortably, there are a number of resources on your campus.\n" +
                 "\n" +
                 "Here are 7 crucial services that can enhance your university experience and make it more enjoyable.\n" +
                 "1. The Writing Center\n" +
                 "\n" +
                 "We have all been there – the blank screen and the blinking cursor. That’s what the writing center is here to help you with. They are not just grammar nerds (although they excel at that, too). They will help you turn incoherent ideas into well-structured arguments.\n" +
                 "\n" +
                 " What they do:\n" +
                 "\n" +
                 "–  Proofread and catch those pesky typos\n" +
                 "\n" +
                 "–  Brainstorming sessions to ignite your creativity\n" +
                 "\n" +
                 "– Help sorting your thoughts (because outlines can really be a pain)\n" +
                 "\n" +
                 "Pro tip: Deliver rough drafts of your work early. The process of fine-tuning becomes much manageable when you are not squeezing all that in on the eve of the deadline."
    ))
    articles.add(Article(
        "Why Are Goal-Setting Strategies Important for Students and How Can They Be Implemented? ",
        "October 4, 2024 ",
        R.drawable.image2,
        "Goal-setting is an important skill that every student can benefit from, regardless",
        "Goal-setting is an important skill that every student can benefit from, regardless of their age or academic level.\n" +
                "\n" +
                "Research indicates that goal setting positively impacts students of all ages and grades. For instance, a study involving elementary students with low math skills found that setting short-term goals improved their academic performance, as well as their intrinsic motivation and self-confidence.\n" +
                "\n" +
                "Goal-setting strategies are essential tools for students, helping them navigate their academic journeys and personal growth. By setting clear, achievable goals, students can enhance their performance and develop essential skills for future success."
    ))

    articles.add(Article(
        "How Can Modern Educators Benefit from the Best Classroom Technology Tools and Apps?",
        "September 19, 2024  ",
        R.drawable.image3,
        "Dan Schwartz, dean of Stanford Graduate School of Education (GSE) quoted “Technology",
        "Dan Schwartz, dean of Stanford Graduate School of Education (GSE) quoted “Technology is a game-changer for education – it offers the prospect of universal access to high-quality learning experiences, and it creates fundamentally new ways of teaching.”\n" +
                "\n" +
                "Source: https://news.stanford.edu/stories/2024/02/technology-in-education\n" +
                "\n" +
                "The educational landscape is constantly evolving. Modern-day educators need to embrace the power of technology to keep up with the future education trends and technologies.\n" +
                "\n" +
                "According to a research report, the global EdTech market size was estimated at 142.37 billion USD  in 2023 and is expected to grow at a CAGR of 13.4% from 2024 to 2030.\n" +
                "\n" +
                "Immersive technologies like augmented reality, virtual reality (VR), and mixed reality are expected to be used in classrooms with the release of many high-profile devices in the near future.\n" +
                "\n" +
                "Personalized learning is the need of the hour as it enables educators to generate content aligned with students’ interests and skill levels. It also makes lessons more accessible for multilingual learners and students with disabilities. All this requires educators who are well-versed in the latest educational tools and technologies."

    ))
    articles.add(Article(
        "How to Achieve Academic and Personal Success: The Power of Goal Setting ",
        "September 14, 2024 ",
        R.drawable.image4,
        "Achieving success in both academics and personal life begins with setting clear,",
        "Achieving success in both academics and personal life begins with setting clear, actionable goals. Setting specific objectives helps you to stay motivated, focused, and ultimately achieve your desired outcomes.\n" +
                "\n" +
                "In this blog, we’ll delve into the power of goal setting and explore how it can significantly impact your journey toward academic and personal success.\n" +
                "\n" +
                "How does setting goals help you achieve personal and professional success?\n" +
                "\n" +
                "Goal setting provides a roadmap that helps you focus your efforts, stay motivated, and measure your progress along the way.\n" +
                "\n" +
                "Setting goals also boosts motivation, improves productivity and performance, and gives a sense of purpose and meaning. Thus, goal setting fosters personal growth and development while enhancing confidence and self-esteem.\n" +
                "\n" +
                "SMART is a popular goal-setting framework that stands for:"

    ))

    articles.add(Article(
        "How Acacia University Prepares You to Support Diverse Learners ",
        "September 14, 2024 ",
        R.drawable.image5,
        "Acacia University’s mission is built around its core values of teaching excellence,",
        "Acacia University’s mission is built around its core values of teaching excellence, organizational integrity, and commitment to diversity. These principles guide the university’s approach to equipping educators with the tools, knowledge, and mindset necessary to create inclusive learning environments where all students can thrive.\n" +
                "Excellence in Teaching\n" +
                "\n" +
                "Acacia University trains educators in culturally responsive teaching, adapting methods to fit the diverse backgrounds of students. This approach ensures that lessons are relevant, and engaging, making students feel seen and valued."


    ))
    articles.add(Article(
        "Using Campus Resources: Making the Most of What Your University Offers",
        "October 11, 2024",
        R.drawable.image1,
        "College life can feel overwhelming at times but designed with the vision",
        "College life can feel overwhelming at times but designed with the vision to help you live comfortably, there are a number of resources on your campus.\n" +
                "\n" +
                "Here are 7 crucial services that can enhance your university experience and make it more enjoyable.\n" +
                "1. The Writing Center\n" +
                "\n" +
                "We have all been there – the blank screen and the blinking cursor. That’s what the writing center is here to help you with. They are not just grammar nerds (although they excel at that, too). They will help you turn incoherent ideas into well-structured arguments.\n" +
                "\n" +
                " What they do:\n" +
                "\n" +
                "–  Proofread and catch those pesky typos\n" +
                "\n" +
                "–  Brainstorming sessions to ignite your creativity\n" +
                "\n" +
                "– Help sorting your thoughts (because outlines can really be a pain)\n" +
                "\n" +
                "Pro tip: Deliver rough drafts of your work early. The process of fine-tuning becomes much manageable when you are not squeezing all that in on the eve of the deadline."
    ))
    articles.add(Article(
        "Why Are Goal-Setting Strategies Important for Students and How Can They Be Implemented? ",
        "October 4, 2024 ",
        R.drawable.image2,
        "Goal-setting is an important skill that every student can benefit from, regardless",
        "Goal-setting is an important skill that every student can benefit from, regardless of their age or academic level.\n" +
                "\n" +
                "Research indicates that goal setting positively impacts students of all ages and grades. For instance, a study involving elementary students with low math skills found that setting short-term goals improved their academic performance, as well as their intrinsic motivation and self-confidence.\n" +
                "\n" +
                "Goal-setting strategies are essential tools for students, helping them navigate their academic journeys and personal growth. By setting clear, achievable goals, students can enhance their performance and develop essential skills for future success."
    ))

    articles.add(Article(
        "How Can Modern Educators Benefit from the Best Classroom Technology Tools and Apps?",
        "September 19, 2024  ",
        R.drawable.image3,
        "Dan Schwartz, dean of Stanford Graduate School of Education (GSE) quoted “Technology",
        "Dan Schwartz, dean of Stanford Graduate School of Education (GSE) quoted “Technology is a game-changer for education – it offers the prospect of universal access to high-quality learning experiences, and it creates fundamentally new ways of teaching.”\n" +
                "\n" +
                "Source: https://news.stanford.edu/stories/2024/02/technology-in-education\n" +
                "\n" +
                "The educational landscape is constantly evolving. Modern-day educators need to embrace the power of technology to keep up with the future education trends and technologies.\n" +
                "\n" +
                "According to a research report, the global EdTech market size was estimated at 142.37 billion USD  in 2023 and is expected to grow at a CAGR of 13.4% from 2024 to 2030.\n" +
                "\n" +
                "Immersive technologies like augmented reality, virtual reality (VR), and mixed reality are expected to be used in classrooms with the release of many high-profile devices in the near future.\n" +
                "\n" +
                "Personalized learning is the need of the hour as it enables educators to generate content aligned with students’ interests and skill levels. It also makes lessons more accessible for multilingual learners and students with disabilities. All this requires educators who are well-versed in the latest educational tools and technologies."

    ))
    articles.add(Article(
        "How to Achieve Academic and Personal Success: The Power of Goal Setting ",
        "September 14, 2024 ",
        R.drawable.image4,
        "Achieving success in both academics and personal life begins with setting clear,",
        "Achieving success in both academics and personal life begins with setting clear, actionable goals. Setting specific objectives helps you to stay motivated, focused, and ultimately achieve your desired outcomes.\n" +
                "\n" +
                "In this blog, we’ll delve into the power of goal setting and explore how it can significantly impact your journey toward academic and personal success.\n" +
                "\n" +
                "How does setting goals help you achieve personal and professional success?\n" +
                "\n" +
                "Goal setting provides a roadmap that helps you focus your efforts, stay motivated, and measure your progress along the way.\n" +
                "\n" +
                "Setting goals also boosts motivation, improves productivity and performance, and gives a sense of purpose and meaning. Thus, goal setting fosters personal growth and development while enhancing confidence and self-esteem.\n" +
                "\n" +
                "SMART is a popular goal-setting framework that stands for:"

    ))

    articles.add(Article(
        "How Acacia University Prepares You to Support Diverse Learners ",
        "September 14, 2024 ",
        R.drawable.image5,
        "Acacia University’s mission is built around its core values of teaching excellence,",
        "Acacia University’s mission is built around its core values of teaching excellence, organizational integrity, and commitment to diversity. These principles guide the university’s approach to equipping educators with the tools, knowledge, and mindset necessary to create inclusive learning environments where all students can thrive.\n" +
                "Excellence in Teaching\n" +
                "\n" +
                "Acacia University trains educators in culturally responsive teaching, adapting methods to fit the diverse backgrounds of students. This approach ensures that lessons are relevant, and engaging, making students feel seen and valued."


    ))

    return articles
}
