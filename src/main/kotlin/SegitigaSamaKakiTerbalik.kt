class SegitigaSamaKakiTerbalik {
    fun nomer2(){
        print("Masukan berapa kali looping yang anda inginkan untuk segitiga sama kaki terbalik: ")
        val loop = readLine()
        if (loop != null){
            if (validate.isNumber(loop)){
                soal2(loop.toInt())
            }else{
                nomer2()
            }
        }else{
            nomer2()
        }
    }
    fun soal2(loop : Int){
        println("soal nomer 2 : Pola Segitiga Sama Kaki Terbalik Bintang")
        for (i in 1..loop){
            for (j in 1..i-1){
                print(" ")
            }
            for (k in i..loop){
                print("*")
            }
            for(l in i..loop-1){
                print("*")
            }
            println()
        }
        println()
    }
}