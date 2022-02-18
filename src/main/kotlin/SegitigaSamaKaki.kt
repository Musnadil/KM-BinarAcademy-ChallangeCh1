class SegitigaSamaKaki {
    fun soal1(loop : Int){
        println("soal nomer 1 : Pola Segitiga Sama Kaki Bintang")

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
        println()
    }
}