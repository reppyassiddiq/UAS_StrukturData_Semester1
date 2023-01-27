public class Main {
    public static void main(String[] args) {
       Tree intTree = new Tree();

       intTree.insert(22);
       intTree.insert(28);
       intTree.insert(19);
       intTree.insert(67);
       intTree.insert(42);
       intTree.insert(88);
       intTree.insert(91);
       intTree.insert(17);
       intTree.insert(37);
       intTree.insert(53);
       intTree.insert(2);
       intTree.insert(60);

       //traverse in order adalah perintah untuk mengurutkan dari bawah hingga atas
       intTree.traverseInOrder();

       System.out.println(intTree.get(26));
       System.out.println(intTree.get(22));

       //size adalah perintah menghitung seluruh element
       System.out.println("\nSize:" + intTree.size());

       //max adalah perintah untuk mengetahui element paling banyak
       System.out.println("\nMax: " + intTree.max());

       //min adalah perintah untuk mengetahui element paling sedikit
       System.out.println("\nMin: " +intTree.min());
    }
}