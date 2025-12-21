import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DischargeRecord {
        int patientid;
        long dischargeTime;

    public DischargeRecord(int patientid) {
        this.patientid = patientid;
        this.dischargeTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        LocalDateTime dateTime = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(dischargeTime),
                ZoneId.systemDefault()
        );

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return "DischargeRecord{" +
                "patientId=" + patientid +
                ", dischargeTime=" + dateTime.format(formatter) +
                '}';
    }
}