package view;
/**
 *
 * @author datng
 */
import java.util.Date;

public class txtDate {
    private Date date;

    public txtDate() {
        this.date = new Date(); // Initialize with the current date
    }

    public txtDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.toString(); // Customize this if needed
    }
}
