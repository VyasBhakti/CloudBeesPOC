package spring.maven.poc;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MavenService")
public class MavenService {

	private static final Logger logger = Logger.getLogger(MavenService.class);

	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public String sampleClass() {

		List<String> values = new ArrayList<String>();
		logger.info("Start sampleClass");
		
		values.add("Welcome to Cloudbees POC");

		logger.info("End sampleClass");
		return values.toString();

	}

}
