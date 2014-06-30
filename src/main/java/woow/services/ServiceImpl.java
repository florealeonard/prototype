package woow.services;

import org.springframework.stereotype.Component;

import woow.domain.Bean;

@Component
public class ServiceImpl implements Service {

	@Override
	public Bean getBean(String name) {		
		Bean b = new Bean(name);						
		return b;
	}
}