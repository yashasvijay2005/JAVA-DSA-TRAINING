public class employe {
    String name;
    int id ;
    double salary;
    
    employe(int i ,String n,double s) {
        id = i;
        name = n;
        salary = s;
    }
    void display() {
        System.out.println(id+" "+name+" "+salary);
    }
    public static void main(String[] args) {
        employe ob = new employe(123,"varada",50000);
        employe ob1 = new employe(124,"varsha",60000);
        ob1.display();
        ob.display();
    }
}