package com.feizi;

import com.feizi.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller
public class SpringBootWebApplication {

	@RequestMapping("/")
	public String index(Model model){
		Person single = new Person("weizhuang", 11);

		List<Person> persons = new ArrayList<>();
		Person p1 = new Person("zhangsan", 12);
		Person p2 = new Person("lisi", 13);
		Person p3 = new Person("wangwu", 14);

		persons.add(p1);
		persons.add(p2);
		persons.add(p3);

		model.addAttribute("singlePerson", single);
		model.addAttribute("persons", persons);

		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
}
