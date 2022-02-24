class Menu {
    fun showOptions(){
        println("""
            Silahkan pilih diantara 2 dibawah :
            1. Daftar
            2. Masuk
        """.trimIndent())
        print(">> ")
        val pilihan = readLine()
        if (pilihan != null){
            if (validate.isNumber(pilihan)){
                when(pilihan.toInt()){
                    1 -> daftar()
                    2 -> masuk()
                    else -> showOptions()
                }
            }else{
                showOptions()
            }
        }
    }

    fun daftar(){
        println("=========== DAFTAR ===========")
        print("Masukan Nama : ")
        var usernameInput = readLine()
        if (usernameInput != null){
            if (validate.isNumber(usernameInput)){
                println("Nama tidak boleh menggunakan karakter angka")
                daftar()
            }else{
                print("Masukan Password : ")
                var passwordInput = readLine().toString()
                print("masukan kembali Password : ")
                var rePassInput = readLine().toString()
                if (passwordInput == rePassInput){
                    DataUser.user.add(Account(usernameInput.toString(),passwordInput))
                    println("Data berhasil ditambah")
                    showOptions()
                }else{
                    daftar()
                }
            }
        }else{
            daftar()
        }


    }

    private fun masuk() {
        println("=========== MASUK ===========")
        print("Input Username : ")
        var usernameInput = readLine().toString()
        print("Input Password : ")
        var passwordInput = readLine().toString()

        var isLoginSuccess = false
        var signedAccount = Account("","")

        for (akun in DataUser.user){
            if (akun.username == usernameInput
                && akun.password == passwordInput){
                isLoginSuccess = true
                signedAccount = akun
            }
        }
        if (isLoginSuccess){
            val soal = PilihSoal()
            soal.pilihan()
        }else{
            println("username atau password salah!")
            masuk()
        }

    }
}