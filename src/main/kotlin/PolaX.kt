class PolaX {
    fun nomer4(){
        print("Masukan berapa kali looping yang anda inginkan untuk pola X: ")
        val loop = readLine()
        if (loop != null){
            if (validate.isNumber(loop)){
                soal4(loop.toInt())
            }else{
                nomer4()
            }
        }else{
            nomer4()
        }
    }
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