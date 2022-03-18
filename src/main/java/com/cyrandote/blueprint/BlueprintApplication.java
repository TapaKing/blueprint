package com.cyrandote.blueprint;

import com.cyrandote.blueprint.controllers.BlueprintController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BlueprintApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BlueprintApplication.class, args);
		BlueprintController controller = (BlueprintController) ctx.getBean("blueprintController");
		System.out.println(controller.create());
	}

}
