fun main(args: Array<String>) {

    var count:Int=1
    var countPar: Int=0
    var countImpar: Int=0

    while (count<=10){
        println("Informe um numero")
        var numero = readLine()!!.toInt()
        if(numero%2==0){
            countPar++

        }else {
            countImpar++
        }
        count++
    }
    println("total de $countPar numeros par foram digitados")
    println("total de $countImpar impar foram digitados")

}