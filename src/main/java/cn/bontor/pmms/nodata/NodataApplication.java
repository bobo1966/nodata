package cn.bontor.pmms.nodata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class NodataApplication {

    public static void main(String[] args) {
        SpringApplication.run(NodataApplication.class, args);
    }
}
