package onlineShop;

import onlineShop.log.Logger;
import onlineShop.log.PaymentAction;
import onlineShop.log.ServerLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Logger getLogger() {
        return new ServerLogger();
    }

    @Bean
    public PaymentAction paymentAction() {
        return new PaymentAction();
    }
}
