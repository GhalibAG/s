public class Main {
    public static void main(String[] args) {
        // Deklarasi array dipindahkan ke sini agar bisa diakses oleh main
        String cars[] = new String[4];
        cars[0] = "Volvo";
        cars[1] = "Toyota";
        cars[2] = "Yamaha";
        cars[3] = "Ford";
        cars[4] = "Honda"; // Ini akan menyebabkan ArrayIndexOutOfBoundsException
        
        // Perulangan dimulai dari 0 dan berakhir di 3 (total 4 iterasi)
        // Indeks array di Java dimulai dari 0
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Mobil Ke- " + (i + 1) + " Adalah " + cars[i]);
        }
    }
}

//PBO NIATT
