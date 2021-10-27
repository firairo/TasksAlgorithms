package com.lexshi.hash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //firstTask()
        //secondTask()
        //thirdTask()
        //fourTask(3)
        //fiveTask()
        sixTask()
    }


    // Надо вывести случайно сгенерированное 3х значное число и его наибольшую цифру
    private fun firstTask() {
        val value = (100..999).random()
        val d3 = value % 10
        val d2 = (value / 10) % 10
        val d1 = (value / 100) % 10

        println(value)

        if (d2 >= d1) {
            if (d2 >= d3) {
                println(d2)
            } else {
                println(d3)
            }
        } else {
            if (d1 >= d3) {
                println(d1)
            } else {
                println(d3)
            }

        }
    }

    // Надо вывести 3 случайно сгенерированных 3х значных числа, и сумму их первых цифр
    private fun secondTask() {
        val n1 = (100..999).random()
        val n2 = (100..999).random()
        val n3 = (100..999).random()

        println("n1 = $n1, n2 = $n2, n3 = $n3")

        val d1 = (n1 / 100) % 10
        val d2 = (n2 / 100) % 10
        val d3 = (n3 / 100) % 10
        println("$d1+$d2+$d3 = ${d1 + d2 + d3}")


    }

    // Надо вывести на экран случайно сгенерированное 3х значное число, и сумму его цифр.
    private fun thirdTask() {
        val value = (100..999).random()

        println("value = $value")

        val d3 = value % 10
        val d2 = (value / 10) % 10
        val d1 = (value / 100) % 10

        println("$d1+$d2+$d3 = ${d1 + d2 + d3}")

    }

    //Дан список слов (занесите штук 20-30 в ArrayList). Надо вывести каждое N-ное (число N задаётся в программе).
    private fun fourTask(n: Int) {

        val myArray = arrayOf<String>(
            "Петр", "Алексей", "Мария", "Надежда", "Анастасия", "Юлия",
            "Сергей", "Василий", "Владимир", "Тимофей", "Арнольд",
            "Марфа", "Алладин", "Моисей", "Вячеслав", "Кирилл",
            "Евгений", "Людмила", "Зинаида", "Прасковья", "Марат",
            "Эльдар", "Зухра", "Зураб", "Юрий", "Михаил",
            "Фред", "Монах", "Палладин", "Ильф", "Ларс",
        )


        var i = 0
        var b = 1
        while (i < myArray.size) {
            if (b != n) {
                b++
            } else {
                println(myArray[i])
                b = 1
            }
            i++
        }
    }


    //Дан список слов (занесите штук 20-30 в ArrayList). Надо каждое слово преобразовать —
    //первая буква большая, остальные маленькие.
    //Затем полученные слова склеить в одну большую строку, и вывести.
    private fun fiveTask() {

        val myArray = arrayOf<String>(
            "петр", "алексей", "мария", "надежда", "анастасия", "юлия",
            "сергей", "василий", "владимир", "тимофей", "арнольд",
            "марфа", "алладин", "моисей", "вячеслав", "кирилл",
            "евгений", "людмила", "зинаида", "прасковья", "марат",
            "эльдар", "зухра", "зураб", "юрий", "михаил",
            "фред", "монах", "палладин", "ильф", "ларс",
        )

        var i = 0
        var fullString = ""
        while (i < myArray.size) {
            myArray[i] =
                myArray[i].lowercase().substring(0, 1).uppercase() + myArray[i].substring(1)
                    .lowercase()
            fullString = (fullString + myArray[i])
            i++
        }

        println(fullString)
    }


    //Дан список слов (занесите штук 20-30 в ArrayList).
    //Надо вывести уникальные слова и сколько раз они повторяются.
    //Отсортировать по кол–ву повторений, используя самописную сортировку пузырьком.
    private fun sixTask() {
        val myArray = arrayOf<String>(
            "петр", "алексей", "мария", "надежда", "анастасия", "владимир",
            "сергей", "ларс", "владимир", "людмила", "арнольд",
            "марфа", "алладин", "моисей", "вячеслав", "арнольд",
            "василий", "людмила", "зинаида", "прасковья", "марат",
            "сергей", "василий", "надежда", "тимофей", "арнольд",
            "петр", "монах", "палладин", "ильф", "ларс",
        )

        val lookup = mutableMapOf<String, Int>()
        for (key in myArray) {
            if (lookup.containsKey(key)) {
                lookup[key] = lookup[key]!!.plus(1)
            } else {
                lookup[key] = 1
            }
        }
       println(lookup.toString())

    }
}