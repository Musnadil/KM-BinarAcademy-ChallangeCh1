class SegitigaSamaKakiTerbalik {
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