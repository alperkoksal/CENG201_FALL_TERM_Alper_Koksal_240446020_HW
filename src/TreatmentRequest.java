    import java.time.format.DateTimeFormatter;
    import java.time.Instant;
    import java.time.LocalDateTime;
    import java.time.ZoneId;

    public class TreatmentRequest {
        int patientid;
        long arrivalTime;
        boolean priority;


        public TreatmentRequest(int patientid,boolean priority) {
            this.patientid = patientid;
            this.priority = priority;
            this.arrivalTime = System.currentTimeMillis();
        }

        @Override
        public String toString() {
            LocalDateTime dateTime = LocalDateTime.ofInstant(
                    Instant.ofEpochMilli(arrivalTime),
                    ZoneId.systemDefault()
            );

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            return "TreatmentRequest{" +
                    "patientid=" + patientid +
                    ", arrivalTime=" + dateTime.format(formatter) +
                    '}';
        }
    }
