fun main(args: Array<String>)
{
    val age1:Int = 42 //Задание 1
    val age2:Int = 21

    val avg1:Double = (age1 + age2) / 2.0 //Задание 2
    println(avg1)

    val firstName:String = "Vladimr" //Зд 4
    val lastName:String = "Zvolinskiy"

    val fullName:String = (firstName + " " + lastName) //Зд5
    println(fullName)

    val myDetails:String = ("Hi, my name is " + fullName) //Зд6
    println(myDetails)

    val date = Triple(11, 10, 2022) //Зд7

    var month=date.first //Зд8
    var day=date.second
    var year=date.third

    println(month) //Зд9
    println(year)

    var monthupdated = date.first +5 //Зд10
    var yearupdate = date.third
    val updateddate = Pair(monthupdated, yearupdate)

    println (updateddate)
}