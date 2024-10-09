package com.example.seminario_francisco_requena_snchez

import kotlin.math.max

fun main(){
    var d = intArrayOf(1, 2, 3, 4, 5)
    var c:Float= 12.0F
    var S:String="ana"
    var b:Char='o'
    var entero=12345
    var texto:String="Hola viva el betis y odio al sevilla a "
    println("Ejercicio 1: "+Max(d))
    println("Ejercicio 2: "+sumatoria(d))
    println("Ejercicio 3: "+ calculo(c))
    println("Ejercicio 4: "+ corregir(S))
    println("Ejercicio 5: "+ devuelto(S,b))
    println("Ejercicio 6: "+ subcadena(S,"a"))
    println("Ejercicio 7: "+ mayus(texto))
    println("Ejercicio 8: "+ sumadigitos(entero))
    println("Ejercicio 9: "+ calMCD(88,64))
}
//Ejercicio 1. Crea una función que obtenga el número máximo de una lista de
//números
fun Max(d: IntArray): Int {
   var e: Int=0
    e=d[0]

    for (i in 0..d.size-1) {
        if (e < d[i]) {
            e = d[i]
        }
    }

    return e
}

//Ejercicio 2. Crea una función que obtenga la sumatoria de una lista de números

    fun sumatoria(d: IntArray):Int{
        var e:Int=0
        for(i in 0..d.size-1){
            e+=d[i]
        }

        return e

    }
//Ejercicio 3. Crea una función que dada una distancia en millas calcule su
//correspondiente en kms
fun calculo(c:Float): Float {

    var t: Float = 1.609344F

    return c/t
}
//Ejercicio 4. Crea una función que determine si una cadena de texto es un
//palíndromo.
fun corregir(S :String):String{

    var cadenaInvertida = S.reversed()

    if (S.equals(cadenaInvertida))
        println("Son palindromos")
    else
        println("No son Palindromos");

    return S
}
//Ejercicio 5. Crea una función que cuenta cuántas veces aparece una letra en un
//texto.
fun devuelto(dev :String,c:Char):Int {
    var arayChar : CharArray = CharArray((dev.length))
    var cont=0
    for (i in 0..dev.length-1){
        arayChar.set(i,dev[i])
        if(arayChar[i]==c){
            cont++
        }
    }
    return cont
}
//Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en
//un texto.

fun subcadena(cadena :String,subcadena:String):Int{
    var cont=0

    for (i in 0..cadena.length-1){
        if(cadena[i]==subcadena[0]){
            for (j in 0..subcadena.length-1){
                var contaux=0
                if(cadena[j]==subcadena[j]){
                    contaux++
                }
                else    break
                if(contaux==subcadena.length){
                    cont++
                }
            }
        }
    }
    return cont;
}
//Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada
//palabra de un texto

fun mayus(texto :String):String{

    var aux=""
    texto[0].uppercaseChar();
    for (i in 0..texto.length-1){
        if(i == 0) aux+= texto[i].uppercaseChar()
        else {
            if (texto[i - 1] == ' ' && i != texto.length - 1) {
                aux += texto[i].uppercaseChar()
            }else{
                aux += texto[i]
            }
        }

    }
    return aux;
}
//Ejercicio 8. Crea una función que sume los dígitos de un número. Ejemplo:
//sumaDigitos(245) = 2 + 4 + 5 = 11

fun sumadigitos(entero:Int):Int{

    var sumatotal=0
    var enteroaux=entero
    for (i in 0..enteroaux){
        sumatotal+=enteroaux%10
        enteroaux=enteroaux/10
    }
    return sumatotal
}
//Ejercicio 9. Crea una función que calcule el máximo común divisor de dos números
//naturales

fun calMCD(div1:Int,div2 : Int):Int{
    var MCD=1
    var auxArray1:ArrayList<Int> = ArrayList<Int>()
    var auxArray2:ArrayList<Int> = ArrayList<Int>()
    var cont=0
    auxArray1= sacarfactor(div1)
    auxArray2= sacarfactor(div2)
    for (i in 0..auxArray1.size-1) {
        if (auxArray1[i] == auxArray2[i]){
            cont++
            MCD*=auxArray1[i]
        }

    }

    return MCD
}
fun sacarfactor(numero: Int):ArrayList<Int> {
    var factorsitos: ArrayList<Int> = ArrayList<Int>()
    var auxnumero = numero
    for (i in 2..auxnumero / 2) {
        if (auxnumero % i == 0 && isPrimo(i)) {
            while (auxnumero % i == 0) {
                factorsitos.add(i)
                auxnumero/= 2
            }
        }
    }
    return factorsitos;
}

fun isPrimo(numero: Int): Boolean {
    var cont:Int=0
    var primo=true
    var auxnumero=numero
    for (i in 1 .. auxnumero){
        if(auxnumero%i==0){
            cont++

        }
        if (cont>2){
            return false
        }
    }
    return primo
}
