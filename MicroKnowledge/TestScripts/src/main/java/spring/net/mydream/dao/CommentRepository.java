package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface CommentRepository extends JpaRepository<Comment, Integer> ,JpaSpecificationExecutor<Comment>{
		List<Comment> findByComment2team(Team team);
			Comment findByName(Object cmname);
}
