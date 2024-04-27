package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.Test;
import writer.Writer;
import writer.*;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		Test test = new Test(new Writer(), "Ohoho");
		test.run();

	}




}
