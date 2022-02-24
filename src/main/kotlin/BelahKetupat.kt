class BelahKetupat {
    fun nomer3(){
        print("Masukan berapa kali looping yang anda inginkan untuk pola belah ketupat: ")
        val loop = readLine()
        if (loop != null){
            if (validate.isNumber(loop)){
                soal3(loop.toInt())
            }else{
                nomer3()
            }
        }else{
            nomer3()
        }
    }
    fun soal3(loop:Int){
        val loop2 = loop-1
        println("soal nomer 3 : Pola Belah Ketupat Bintang")
        for (i in 1..loop){
            for (j in loop-1 downTo i){
                print(" ")
            }
            for (k in 1..i){
                print("*")
            }
            for (l in 1..i-1){
                print("*")
            }
            println()
        }
        for (i in 1..loop2){
            for (j in 1..i){
                print(" ")
            }
            for (k in i..loop2){
                print("*")
            }
            for(l in i..loop2-1){
                print("*")
            }
            println()
        }
        println()
    }
}