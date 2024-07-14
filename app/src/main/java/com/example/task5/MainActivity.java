package com.example.task5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private QuoteAdapter quoteAdapter;
    private String[] quotes = {
            "* Be yourself; everyone else is already taken. - Oscar Wilde",
            "* So many books, so little time. - Frank Zappa",
            "* Be the change that you wish to see in the world. - Mahatma Gandhi",
            "* Believe you can and you're halfway there. - Theodore Roosevelt",
            "* In three words I can sum up everything I've learned about life: it goes on. - Robert Frost",
            "* The only way to do great work is to love what you do. - Steve Jobs",
            "* The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
            "* Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
            "* Keep your eyes on the stars, and your feet on the ground. - Theodore Roosevelt",
            "* The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt",
            "* Everything you’ve ever wanted is on the other side of fear. - George Addair",
            "* Don’t watch the clock; do what it does. Keep going. - Sam Levenson",
            "* The only way to achieve the impossible is to believe it is possible. - Charles Kingsleigh (Alice in Wonderland movie)",
            "* If people knew how hard I worked to get my mastery, it wouldn't seem so wonderful after all. — Michelangelo",
            "* Before you start some work, always ask yourself three questions - Why am I doing it, What the results might be and Will I be successful. Only when you think deeply and find satisfactory answers to these questions, go ahead. — Chanakya",
            "* Do the best you can until you know better. Then when you know better, do better. — Maya Angelou",
            "* Success is no accident. It is hard work, perseverance, learning, studying, sacrifice and most of all, love of what you are doing or learning to do. — Pele",
            "* I do not know anyone who has got to the top without hard work. That is the recipe. It will not always get you to the top, but should get you pretty near. — Margaret Thatcher",
            "* Hard work spotlights the character of people: some turn up their sleeves, some turn up their noses, and some don’t turn up at all. — Sam Ewing",
            "* The only thing standing between you and outrageous success is continuous progress you need discipline. — Dan Waldschmidt",
            "* Talent is cheaper than table salt. What separates the talented individual from the successful one is a lot of hard work. — Stephen King",
            "* Hard work is a prison sentence only if it does not have meaning. Once it does, it becomes the kind of thing that makes you grab your wife around the waist and dance a jig. — Malcolm Gladwell",
            "* The fight is won or lost far away from witnesses — behind the lines, in the gym, and out there on the road, long before I dance under those lights. — Muhammad Ali",
            "* Most of the important things in the world have been accomplished by people who have kept on trying when there seemed to be no hope at all. — Dale Carnegie",
            "* The only place where success comes before work is in the dictionary. — Vince Lombardi",
            "* There are no secrets to success. It is the result of preparation, hard work, and learning from failure. — Colin Powell",
            "* Strive not to be a success, but rather to be of value. — Albert Einstein",
            "* Try not to become a man of success. Rather become a man of value. ― Albert Einstein",
            "* Success is stumbling from failure to failure with no loss of enthusiasm. ― Winston S. Churchill",
            "* Don't spend time beating on a wall, hoping to transform it into a door. ― Coco Chanel",
            "* If A is a success in life, then A equals x plus y plus z. Work is x; y is play; and z is keeping your mouth shut. ― Albert Einstein",
            "* It is hard to fail, but it is worse never to have tried to succeed. ― Theodore Roosevelt",
            "* If you want to live a happy life, tie it to a goal, not to people or things. ― Albert Einstein",
            "* It is our attitude at the beginning of a difficult task which, more than anything else, will affect its successful outcome. – William James",
            "* Success depends upon previous preparation, and without such preparation, there is sure to be failure. — Confucius",
            "* Our greatest weakness lies in giving up. The most certain way to succeed is always to try just one more time. – Thomas A. Edison",
            "* It is better to fail in originality than to succeed in imitation. – Herman Melville",
            "* In most things success depends on knowing how long it takes to succeed. – Montesquieu",
            "* I don’t believe in failure. It’s not failure if you enjoyed the process. – Oprah Winfrey",
            "* Success is not how high you have climbed, but how you make a positive difference to the world. ― Roy T. Bennett, The Light in the Heart",
            "* The worst part of success is trying to find someone who is happy for you. ― Bette Midler",
            "* I'm a success today because I had a friend who believed in me and I didn't have the heart to let him down. ― Abraham Lincoln",
            "* However difficult life may seem, there is always something you can do and succeed at. — Stephen Hawking",
            "* Today a reader. Tomorrow a leader. – Anonymous",
            "* He who asks a question is a fool for five minutes; he who does not ask a question remains a fool forever. — Chinese Proverb"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        quoteAdapter = new QuoteAdapter(quotes);
        recyclerView.setAdapter(quoteAdapter);
    }
}