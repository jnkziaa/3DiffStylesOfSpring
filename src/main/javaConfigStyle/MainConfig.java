import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MainConfig {


    @Bean
    public JavaConfigPhone cellPhone(){
        JavaConfigPhone javaConfigPhone = new JavaConfigPhone();
        javaConfigPhone.setMob("4081234567");
        return javaConfigPhone;
    }
    @Bean
    public JavaConfigPhone homePhone(){
        JavaConfigPhone javaConfigPhone = new JavaConfigPhone();
        javaConfigPhone.setMob("4087654321");
        return javaConfigPhone;
    }

    @Bean
    public JavaConfigAddress homeAddress(){
        JavaConfigAddress annoAddress = new JavaConfigAddress();
        annoAddress.setCity("Santa Clara");
        annoAddress.setCountry("United States");
        annoAddress.setState("California");
        annoAddress.setZipcode("95050");
        return annoAddress;
    }

    @Bean
    public JavaConfigStudent annoStudent(){
        JavaConfigStudent annoStudent = new JavaConfigStudent();
        annoStudent.setId(1339987);
        annoStudent.setName("John Albesa");
        annoStudent.setAdd(homeAddress());
        List<JavaConfigPhone> javaConfigPhoneList = new ArrayList<>();
        javaConfigPhoneList.add(homePhone());
        javaConfigPhoneList.add(cellPhone());
        annoStudent.setPh(javaConfigPhoneList);
        return annoStudent;
    }



}
