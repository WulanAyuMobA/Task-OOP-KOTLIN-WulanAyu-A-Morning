package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        // Simulasi pengurangan stok baju
        stokBaju(10)

        // Simulasi pengurangan stok baju melebihi jumlah stok yang ada
        stokBaju(20)
    } catch (e: StokBajuException) {
        println("Error: ${e.message}")
    }

}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun stokBaju(jumlah: Int) {
        var stokBaju = 20

        if (jumlah > stokBaju) {
            throw StokBajuException("Jumlah stok tidak mencukupi, Stok Saat Ini $stokBaju")

        }

        stokBaju -= jumlah
        println("$jumlah baju berhasil dikurangi dari stok, Baju Yang diminta adalah : $jumlah")
    }

class StokBajuException(message: String) : Exception(message)
