package secretworld.helmetfinder;

/**
 * Created by Hamza Ahmed on 18-Apr-19.
 */

public class Call {

    private int id;
    private String contactName;
    private String contactNumber;


    public Call(String contactName,String contactNumber){
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
