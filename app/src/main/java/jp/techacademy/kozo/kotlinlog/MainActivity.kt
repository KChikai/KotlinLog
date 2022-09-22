package jp.techacademy.kozo.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        Log.d("kotlintest", "ログへの出力テスト")
//        Log.d("kotlintest", "ログ1"); Log.d("kotlintest", "ログ2")

//        val points = intArrayOf(10, 6, 15, 23, 17)
//        var points2 = points.copyOf(10)
//        val points3 = IntArray(10)
//        for (point in points2) {
//            Log.d("kotlintest", point.toString())
//        }
//        Log.d("kotlintest", total(10).toString())

//        val dog = Dog("dog", 29)

        // homework about Human class
        val father = Human("山田太郎", 29, "プログラミング")
        father.say()
        father.think()

        val mother = Human("山田花子", 29, "料理")
        mother.say()
        mother.think()

        Log.d("kotlintest", "MainActivity finished successfully!")

    }

//    private fun total(last: Int): Int{
//        var sum = 0
//        for (i in 1..last){
//            sum += i
//        }
//        return sum
//    }
}