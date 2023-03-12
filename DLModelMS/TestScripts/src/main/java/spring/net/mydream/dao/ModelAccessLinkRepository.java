package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface ModelAccessLinkRepository extends JpaRepository<ModelAccessLink, Integer> ,JpaSpecificationExecutor<ModelAccessLink>{
		List<ModelAccessLink> findByBelongedModel(Model model);
			ModelAccessLink findBySymbol(Object symbol);
}
