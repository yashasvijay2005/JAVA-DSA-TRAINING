package association.aggrigation;

public class patient {
    
    String patientName;
    int patientage;
    String disease,dateOfArival;
    information info;
    payment pay;
    

    public patient(String patientName,int patientage,String disease,String dateOfArival, information info, payment pay){
        this.patientName=patientName;
        this.patientage=patientage;
        this.disease=disease;
        this.dateOfArival=dateOfArival;
        this.info=info;
        this.pay=pay;
    }
    void patientDetails(){
        System.out.println("Patient Name: "+this.patientName);
        System.out.println("Patient Age: "+this.patientage);
        System.out.println("Disease: "+this.disease);
        System.out.println("Date of Arival: "+this.dateOfArival);
        System.out.println("block no :"+this.info.blockNo);
        System.out.println("floor no :"+this.info.floorNo);
        System.out.println("room no :"+this.info.roomNo);
        System.out.println("bed no :"+this.info.bedNo);
        System.out.println("adm fees :"+this.pay.admfees);
        System.out.println("reg fees :"+this.pay.regfees);
        System.out.println("balance amount :"+this.pay.balAmt);
    }

    public static void main(String[] args) {
        information info = new information('A', 2, 205, 3);
        payment pay = new payment(5000, 2000, 3000);
        patient p1 = new patient("John", 30, "Flu", "2024-06-01", info, pay);
        p1.patientDetails();
    }
}
