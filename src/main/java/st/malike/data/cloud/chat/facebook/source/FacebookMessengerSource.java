 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.data.cloud.chat.facebook.source;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.stream.messaging.Source;

/**
 *
 * @author malike_st
 */
@EnableBinding(Source.class)
@EnableConfigurationProperties(FacebookMessengerSourceProperties.class)
@SpringBootApplication
public class FacebookMessengerSource {

    
    public static void main(String[] args) {
        SpringApplication.run(FacebookMessengerSource.class, args);

    }
}
