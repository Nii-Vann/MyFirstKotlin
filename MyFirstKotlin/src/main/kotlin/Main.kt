fun calculateY(m : Int, x : Int, c : Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c
}


fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {
    // This function takes the equations of two lines:
    // yOne = mOne * x + cOne and yTwo = mTwo * x + cTwo
    // and prints the X value they intersect at
    // or prints "Don't intersect" if they do not.
    // You only need to check x values between 0 and 100

    for (x in 0..100 ){
        var yOne = mOne * x + cOne
        var yTwo = mTwo * x + cTwo

        if (yOne == yTwo){
            println("They intersect at $x")
        } else {

        }

    }

}


fun main(){
    //Using a for loop to print points on the line y = 3x + 5, y = 4x + 2 for all integer X between -5 and 5.
    for (i in 0..20){

        var answer1 = calculateY(3,i,5)
        var answer2 = calculateY(4,i,2)

        when  {
            (answer1 == answer2) -> {
                println("they are the same at $i")}
        }

        //Alternative method
//       var same = if (answer1 == answer2){
//           println("they are the same at $i")
//       } else { }
    }


    var test = intersection(3, 5, 4, 2)
    println(test)


}
