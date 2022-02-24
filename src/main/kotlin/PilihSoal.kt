class PilihSoal {
    fun pilihan (){
        println("""
            ======================================
            
            1. Pola Segitiga sama kaki
            2. Pola Segitiga sama kaki terbalik
            3. Pola Belahketupat
            4. Pola X
            5. Pola Segitiga siku - siku
            
            ======================================
        """.trimIndent())
        print(">> ")
        val pilihanInput = readLine()
        if (pilihanInput != null){
            when (pilihanInput.toString()){
                "1" -> {
                    val pola1 = SegitigaSamaKaki()
                    pola1.nomer1()
                    pilihan()
                }
                "2" ->{
                    val pola2 = SegitigaSamaKakiTerbalik()
                    pola2.nomer2()
                    pilihan()

                }
                "3"->{
                    val pola3 = BelahKetupat()
                    pola3.nomer3()
                    pilihan()

                }
                "4"->{
                    val pola4 = PolaX()
                    pola4.nomer4()
                    pilihan()

                }
                "5"->{
                    val pola5 = SegitigaSikuSiku()
                    pola5.nomer5()
                    pilihan()

                }
                else ->{
                    pilihan()
                }
            }
        }else{
            pilihan()
        }
    }
}