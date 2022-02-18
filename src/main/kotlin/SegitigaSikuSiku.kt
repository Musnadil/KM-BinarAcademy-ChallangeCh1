class SegitigaSikuSiku {
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