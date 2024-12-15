package Домашка777;

import java.time.LocalDateTime;

    public interface HumanReadableTimestamp {
        String getHumanReadableTimestamp(LocalDateTime timestamp);

        String getTimestamp(LocalDateTime eventTimestamp);
    }




