package br.com.redhat.base.springfuse;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RotaSimples extends RouteBuilder {

	@Override
	public void configure() throws Exception {
//		from("timer:foo").to("log:bar");
	}

}
