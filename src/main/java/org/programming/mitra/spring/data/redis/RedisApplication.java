/**
 * 
 */
package org.programming.mitra.spring.data.redis;

import org.programming.mitra.spring.data.redis.config.Configurations;
import org.programming.mitra.spring.data.redis.model.Address;
import org.programming.mitra.spring.data.redis.model.Employee;
import org.programming.mitra.spring.data.redis.repository.impl.RepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author Naresh Joshi
 * @since 18-Feb-2016
 */

@SpringBootApplication
@Import({ Configurations.class })
public class RedisApplication {

	public static void main(String... args) {
		
		ApplicationContext context = SpringApplication.run(RedisApplication.class, args);

		RepositoryImpl repository = context.getBean(RepositoryImpl.class);

		repository.put(new Employee(15, "Naresh", new Address(1, "Dehradun", "UK")));
		
		Employee employee = new Employee();
		employee.setId(15);
		
		System.out.println(repository.get(employee));
	}

}
