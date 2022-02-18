class PolaX {
    fun soal4(loop:Int){
        println("soal nomer 4 : Pola X Bintang")
        for (i in 1..loop) {
            for(j in 1..loop){
                if(i==j){
                    print("*")
                }else if(j+i==(loop+1)){
                    print("*")
                }else{
                    print(" ")
                }
            }
            println()
        }
        println()
    }
}