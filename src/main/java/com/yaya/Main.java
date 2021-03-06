package com.yaya;

import com.acooly.core.common.boot.Apps;
import org.springframework.boot.SpringApplication;
import com.acooly.core.common.BootApp;


/**
 * @author qiubo
 */
@BootApp(sysName = "acooly-order-consumer", httpPort = 8081)
public class Main {
    public static void main(String[] args) {
        Apps.setProfileIfNotExists("sdev");
        new SpringApplication(Main.class).run(args);
    }
}