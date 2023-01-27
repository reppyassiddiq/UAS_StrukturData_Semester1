public class Main {
    public static void main(String[] args){
        String[] data = {"kaylif","akung","ucup","viko","sena"};
        liniearSearch(data, "viko");

    }
    public static void liniearSearch (String[] data,String nama){

        boolean status = true;
        for (int i = 0; i < data.length; i++){
            if (nama.equalsIgnoreCase(data[i])){
                System.out.println(nama + ": ditemukan pada posisi ke-" + (i+1) + "dan pada index ke-" + i);
                status = true ;
                break;
            }

        }

        // ketika data tidak ditemukan
        if (status == false){
            System.out.println(nama + " tidak ditemukan ");
        }
    }
}