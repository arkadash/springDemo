package external

import com.hello.service.ConsoleHelloService
import com.hello.service.HelloService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class HelloAutoConfiguration {

    @Bean
    fun helloService(): HelloService {
        return ConsoleHelloService()
    }
}