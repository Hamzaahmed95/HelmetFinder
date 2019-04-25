package secretworld.helmetfinder;

/**
 * Created by Hamza Ahmed on 24-Apr-19.
 */

public class Helmet {

    String statusId;
    String LatLng;

    public Helmet(String statusId, String latLng) {
        this.statusId = statusId;
        LatLng = latLng;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getLatLng() {
        return LatLng;
    }

    public void setLatLng(String latLng) {
        LatLng = latLng;
    }
}
