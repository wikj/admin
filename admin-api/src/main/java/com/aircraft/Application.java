package com.aircraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 

 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
        System.out.println("启动成功\n" +
                ".------..------..------..------..------..------..------.\n" +
                "|S.--. ||U.--. ||C.--. ||C.--. ||E.--. ||S.--. ||S.--. |\n" +
                "| :/\\: || (\\/) || :/\\: || :/\\: || (\\/) || :/\\: || :/\\: |\n" +
                "| :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: || :\\/: |\n" +
                "| '--'S|| '--'U|| '--'C|| '--'C|| '--'E|| '--'S|| '--'S|\n" +
                "`------'`------'`------'`------'`------'`------'`------'\n");
    }
}
