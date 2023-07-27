
// Find the biggest number from this array

fun main() {
   val myArray = arrayOf(4, 5, 8, 9, 10, 2, 3)
    var max = myArray[0]
    for(item in myArray) {
        if(item > max) {
            max = item
        }
    }
    print(max)
}