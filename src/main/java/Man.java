import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "man")
@XmlAccessorType(XmlAccessType.FIELD)
public class Man {

    private String initials;
    private String status;
    private String email;
    private String color_of_hair;
    private String color_of_eyes;
    private int height;
    private String date_marriage;
    private String date_divorce;
    private String reason_divorce;
    private int attractiveness;

    /**
     * This default constructor is required if there are other constructors.
     */
    public Man() {

    }

    /**
     * Constructor for all mens
     */
    public Man(String initials, String status, String email, String color_of_hair, String color_of_eyes,
               int height) {
        this.initials = initials;
        this.status = status;
        this.email = email;
        this.color_of_hair = color_of_hair;
        this.color_of_eyes = color_of_eyes;
        this.height = height;
    }

    /**
     * Constructor for ex and current mens
     */
    public Man(String initials, String status, String email, String color_of_hair, String color_of_eyes,
               int height, String date_marriage) {
        this.initials = initials;
        this.status = status;
        this.email = email;
        this.color_of_hair = color_of_hair;
        this.color_of_eyes = color_of_eyes;
        this.height = height;
        this.date_marriage = date_marriage;
    }

    /**
     * Constructor for ex mens with all mandatory elements
     */
    public Man(String initials, String status, String email, String color_of_hair, String color_of_eyes,
               int height, String date_marriage, String date_divorce) {
        this.initials = initials;
        this.status = status;
        this.email = email;
        this.color_of_hair = color_of_hair;
        this.color_of_eyes = color_of_eyes;
        this.height = height;
        this.date_marriage = date_marriage;
        this.date_divorce = date_divorce;
    }

    /**
     * Constructor for ex mens with one optional element reason_divorce
     */
    public Man(String initials, String status, String email, String color_of_hair, String color_of_eyes,
               int height, String date_marriage, String date_divorce, String reason_divorce) {
        this.initials = initials;
        this.status = status;
        this.email = email;
        this.color_of_hair = color_of_hair;
        this.color_of_eyes = color_of_eyes;
        this.height = height;
        this.date_marriage = date_marriage;
        this.date_divorce = date_divorce;
        this.reason_divorce = reason_divorce;
    }

    /**
     * Constructor for future mens with one optional param attractiveness
     */
    public Man(String initials, String status, String email, String color_of_hair, String color_of_eyes,
               int height, int attractiveness) {
        this.initials = initials;
        this.status = status;
        this.email = email;
        this.color_of_hair = color_of_hair;
        this.color_of_eyes = color_of_eyes;
        this.height = height;
        this.attractiveness = attractiveness;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getColor_of_hair() {
        return color_of_hair;
    }

    public void setColor_of_hair(String color_of_hair) {
        this.color_of_hair = color_of_hair;
    }

    public String getColor_of_eyes() {
        return color_of_eyes;
    }

    public void setColor_of_eyes(String color_of_eyes) {
        this.color_of_eyes = color_of_eyes;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) { this.height = height; }

    public String getDate_marriage() {
        return date_marriage;
    }

    public void setDate_marriage(String date_marriage) {
        this.date_marriage = date_marriage;
    }

    public String getDate_divorce() {
        return date_divorce;
    }

    public void setDate_divorce(String date_divorce) {
        this.date_divorce = date_divorce;
    }

    public String getReason_divorce() {
        return reason_divorce;
    }

    public void setReason_divorce(String reason_divorce) {
        this.reason_divorce = reason_divorce;
    }

    public int getAttractiveness() { return attractiveness; }

    public void setAttractiveness(int attractiveness) { this.attractiveness = attractiveness; }
}