class SegitigaSikuSiku {
    fun nomer5(){
        print("Masukan berapa kali looping yang anda inginkan untuk segitiga siku siku: ")
        val loop = readLine()
        if (loop != null){
            if (validate.isNumber(loop)){
                soal5(loop.toInt())
            }else{
                nomer5()
            }
        }else{
            nomer5()
        }
    }
    fun soal5(loop:Int){
        println("soal nomer 5 : Pola Segitiga Siku - Siku Bintang")
        var i = 1
        while (i <=loop) {
            var j = 1
            while(j <= i){
                print("*")
                j++
            }
            println()
            i++
        }
    }
}