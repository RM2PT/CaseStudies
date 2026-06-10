package spring.net.mydream.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import spring.net.mydream.dao.*;
	import spring.net.mydream.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private BankCardRepository bankCardRepository;
		public BankCardRepository getBankCardDao() {
			return bankCardRepository;
		}
		@Autowired
		private UserRepository userRepository;
		public UserRepository getUserDao() {
			return userRepository;
		}
	}
	