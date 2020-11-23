
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class RegisterEX {


    @XmlElementWrapper(name = "registerEX")
    @XmlElement(name = "man")
    private List<Man> manList;

    /**
     * This default constructor is required if there are other constructors.
     */
    public RegisterEX() {

    }

    public List<Man> getManList() {
        return manList;
    }

    public void setManList(List<Man> manList) {
        this.manList = manList;
    }

}