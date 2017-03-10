package ege;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Hello world!";
    }
	
	//veebis urlile kirjuta /tervita?eesnimi=minginimi
	@RequestMapping("/tervita")
	String tervitusfunktsioon3(String eesnimi) {
		return "Tere," + eesnimi;
	}
	
	//lisage teine tervitusfunktsioon
		@RequestMapping("/algus2")
		String tervitusfunktsioon2(){
			return "this is a message from God";
		}
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 4266);
        SpringApplication.run(Rakendus.class, args);
    }
}

//CTRL+C ja siis 3 punkt mitte mvn package
//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar