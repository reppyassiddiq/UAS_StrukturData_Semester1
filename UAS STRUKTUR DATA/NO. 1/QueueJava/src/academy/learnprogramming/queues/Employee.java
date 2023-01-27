package  academy.learnprogramming.queues;

public class Employee {

    private  String namaDepan;
    private  String namaBelakang;
    private  int umur;

    public Employee(String namaDepan, String namaBelakang, int umur) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.umur = umur;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (umur != employee.umur) return false;
        if (!namaDepan.equals(employee.namaDepan)) return false;
        return namaBelakang.equals(employee.namaBelakang);
    }
    public int hashCode() {
        int result = namaDepan.hashCode();
        result = 31 * result + namaBelakang.hashCode();
        result = 31 * result + umur;
        return result;
    }
    public String toString() {
        return "Employee{" +
                "namaDepan='" + namaDepan + '\'' +
                ", namaBelakang='" + namaBelakang + '\'' +
                ", umur=" + umur +
                '}';
    }

}
