package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface RecommendBookRepository extends JpaRepository<RecommendBook, Integer> ,JpaSpecificationExecutor<RecommendBook>{
		List<RecommendBook> findByRecommendUser(User user);
			RecommendBook findByCallNo(Object callNo);
}
