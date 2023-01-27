package academy.learnprogramming.queues;

public class Main {

    public static void main(String[] args) {

        Employee ikiAbon = new Employee("iki", "abon", 19);
        Employee opikblender = new Employee("opik", "blender", 21);
        Employee iyankabel = new Employee("iyan", "kabel", 19);
        Employee sandeskompeni = new Employee("sandes", "kompeni", 19);
        Employee reppyganteng = new Employee("reppy", "ganteng", 20);

    // queue adalah struktur data linier yang menerapkan prinsip operasi dimana elemen data yang masuk pertama akan keluar lebih dulu.

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(ikiAbon);
        queue.add(opikblender);
        queue.add(iyankabel);
        queue.add(sandeskompeni);
        queue.add(reppyganteng);

    // fungsi add berfungsi untuk menambah data dalam queue(antrian)

        queue.remove();
        queue.remove();
    // fungsi remove adalah mengeluarkan atau menghapus antrian dari atas

        queue.printQueue();
        // fungsi print adalah untuk menampilkan keseluruhan data

    //fungsi size adalah untuk mengetahui jumlah antrian yang tersedia
        System.out.println(queue.size());



    }
}