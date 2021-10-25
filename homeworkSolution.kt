Answer Q1


fun main() {



    print("your name: ")
    val nameSu =readLine()
    print("your age:")




    try {
        val ageSu = readLine()?.toInt()
        //readLine تعطي المستخدم خاصيه كتابه المدخل المراد
        print(" your GPA: ")
        val GPASu = readLine()?.toDouble()
//readLineتعطي المستخدم خاصيه كتابه المدخل المراد
        val student = Stud (nameSu,ageSu ,GPASu  )
        student.speak(nameSu,ageSu,GPASu)
        print("first number:")
        val numF= readLine()?.toInt()
        print("second number:")
        val numF2 = readLine()?.toInt()
        print(student.adding(numF,numF2))
    }catch (e : NumberFormatException){
        println("Errrorrrrr")
    }
}
class Stud (name:String? ,age :Int?,GPA : Double?) {
    fun speak (name: String?,age: Int?,GPA: Double?){
        println("Hi my name is $name,\n I'm $age years old,\n my GPA is $GPA")
    }


    fun adding (num1: Int?, num2 :Int?):Int?{
        println("the sum of $num1,and $num2 is = ")
        return num2?.let{ num1?.plus(it) }
    }
}
///Answer Q2
Race conditions occur when two threads interact in
a negatve way depending on the exact order
that their different instruction are executed
Answer Q3///
Yes, In the <<println(weapon.name)
Answer Q4//
we must use a scope function, maybe in this situation use also

