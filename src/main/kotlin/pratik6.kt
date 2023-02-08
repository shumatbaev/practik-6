fun main() {
var i=2
    val arr = Array(20){0}
    arr[0]=1
    arr[1]=1
while (i<20){
    arr[i]=arr[i-1]+arr[i-2]
    val num=arr[i]
    println(num)
    i++
    }

}