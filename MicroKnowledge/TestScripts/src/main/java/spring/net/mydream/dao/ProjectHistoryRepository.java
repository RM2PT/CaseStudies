package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface ProjectHistoryRepository extends JpaRepository<ProjectHistory, Integer> ,JpaSpecificationExecutor<ProjectHistory>{
		List<ProjectHistory> findByProjectHistory2project(Project project);
			ProjectHistory findByTitle(Object title);
}
