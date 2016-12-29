import java.sql.Timestamp;
import java.util.Date;

public class TestDrive {
    public static void main(String[] args) {


        long time = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(time);
        Date date = new Date(time);

        assert date.equals(timestamp) : "Not equal values";
        System.out.println(date.equals(timestamp));

        System.out.println(timestamp.equals(date));



    }
}
