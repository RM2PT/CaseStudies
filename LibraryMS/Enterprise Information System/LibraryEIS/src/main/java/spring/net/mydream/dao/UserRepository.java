package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface UserRepository extends JpaRepository<User, Integer> ,JpaSpecificationExecutor<User>{
//			List<User> findByIsReturned(Object paramFalse);
			List<User> findBySuspensionDays(Object param0);
			User findByUserID(Object userid);
}
