package xyz.itihub.distributedtransaction.localmsg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class LocalMsgApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalMsgApplication.class, args);
    }
}
