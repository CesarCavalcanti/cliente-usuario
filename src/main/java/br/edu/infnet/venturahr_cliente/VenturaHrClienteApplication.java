package br.edu.infnet.venturahr_cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VenturaHrClienteApplication {

    public static void main(String[] args) {
        SpringApplication.run(VenturaHrClienteApplication.class, args);
    }

}
