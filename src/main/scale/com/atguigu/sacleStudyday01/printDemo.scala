package com.atguigu.sacleStudyday01

object printDemo {
  def main(args: Array[String]): Unit = {
    var str1 = "hello"
    var str2= "hello"
    //println(str1+str2)
    var name:String = "tom"
    var age:Int = 10
    var sal:Float = 10.67f
    var height:Double = 180.15
    printf("名字=%s 年龄是%d 薪水是%.2f 升高%.3f",name,age,sal,height)

    println(s"个人信息如下：\n 名字$name \n 年龄$age \n 薪水${sal*10}"  )
    println("测试克隆git")
  }

}
