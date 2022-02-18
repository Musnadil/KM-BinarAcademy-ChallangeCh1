class BelahKetupat {
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