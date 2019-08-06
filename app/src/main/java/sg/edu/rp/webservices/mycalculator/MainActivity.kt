package sg.edu.rp.webservices.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var trans = false
    var point = false
    var before = "0"
    var after = ""
    var process = ""
    var question = ""
    var answer = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick (view: View){
        val btnSelected = view as Button
        when (btnSelected.id){
            button0.id -> if (trans == false){
                if (before.toInt() != 0){
                    before = before + "0"
                } else{
                    before = "0"
                }
            } else{
                if (after.toInt() != 0){
                    after = after + "0"
                } else{
                    after = "0"
                }
            }
            button1.id -> if (trans == false){
                if (before.toInt() != 0){
                    before = before + "1"
                } else{
                    before = "1"
                }
            } else{
                if (after.toInt() != 0){
                    after = after + "1"
                } else{
                    after = "1"
                }
            }
            button2.id -> if (trans == false){
                if (before.toInt() != 0){
                    before = before + "2"
                } else{
                    before = "2"
                }
            } else{
                if (after.toInt() != 0){
                    after = after + "2"
                } else{
                    after = "2"
                }
            }
            button3.id -> if (trans == false){
                if (before.toInt() != 0){
                    before = before + "3"
                } else{
                    before = "3"
                }
            } else{
                if (after.toInt() != 0){
                    after = after + "3"
                } else{
                    after = "3"
                }
            }
            button4.id -> if (trans == false){
                if (before.toInt() != 0){
                    before = before + "4"
                } else{
                    before = "4"
                }
            } else{
                if (after.toInt() != 0){
                    after = after + "4"
                } else{
                    after = "4"
                }
            }
            button5.id -> if (trans == false){
                if (before.toInt() != 0){
                    before = before + "5"
                } else{
                    before = "5"
                }
            } else{
                if (after.toInt() != 0){
                    after = after + "5"
                } else{
                    after = "5"
                }
            }
            button6.id -> if (trans == false){
                if (before.toInt() != 0){
                    before = before + "6"
                } else{
                    before = "6"
                }
            } else{
                if (after.toInt() != 0){
                    after = after + "6"
                } else{
                    after = "6"
                }
            }
            button7.id -> if (trans == false){
                if (before.toInt() != 0){
                    before = before + "7"
                } else{
                    before = "7"
                }

            } else{
                if (after.toInt() != 0){
                    after = after + "7"
                } else{
                    after = "7"
                }
            }
            button8.id -> if (trans == false){
                if (before.toInt() != 0){
                    before = before + "8"
                } else{
                    before = "8"
                }
            } else{
                if (after.toInt() != 0){
                    after = after + "8"
                } else{
                    after = "8"
                }
            }
            button9.id -> if (trans == false){
                if (before.toInt() != 0){
                    before = before + "9"
                } else{
                    before = "9"
                }
            } else{
                if (after.toInt() != 0){
                    after = after + "9"
                } else{
                    after = "9"
                }
            }
            buttonPoint.id -> if (trans == false){
                if (point == false){
                    before = before + "."
                    point = true
                }
            } else{
                if (point == false){
                    after = after + "."
                    point = true
                }
            }
            buttonPlus.id -> if (trans == false){
                process = "+"
                after = "0"
                trans = true
                point = false
            } else{
                before = (before.toInt() + after.toInt()).toString()
                process = "+"
                after = "0"
                point = false
            }
            buttonMinus.id -> if (trans == false){
                process = "-"
                after = "0"
                trans = true
                point = false
            } else{
                before = (before.toInt() - after.toInt()).toString()
                process = "-"
                after = "0"
                point = false
            }
            buttonTimes.id -> if (trans == false){
                process = "*"
                after = "0"
                trans = true
                point = false
            } else{
                before = (before.toInt() * after.toInt()).toString()
                process = "*"
                after = "0"
                point = false
            }
            buttonDivide.id -> if (trans == false){
                process = "/"
                after = "0"
                trans = true
                point = false
            } else{
                before = (before.toInt() / after.toInt()).toString()
                process = "/"
                after = "0"
                point = false
            }
            buttonEquals.id -> if (trans == false){
                textViewA.text = "=$before"
                point = false
                before = "0"
            } else{
                if (process.equals("+")){
                    answer = (before.toInt() + after.toInt()).toString()
                } else if (process.equals("-")){
                    answer = (before.toInt() - after.toInt()).toString()
                } else if (process.equals("*")){
                    answer = (before.toInt() * after.toInt()).toString()
                } else if (process.equals("/")){
                    answer = (before.toInt() / after.toInt()).toString()
                }
                textViewA.text = "=$answer"
                point = false
                trans = false
                before = "0"
                process = ""
                after = "0"
            }
            buttonAC.id -> {
                before = "0"
                process = ""
                point = false
                trans = false
                after = "0"
                answer = ""
                textViewA.text = ""
            }
        }
        question = "$before $process $after"
        textViewQ.text = question
    }
}
