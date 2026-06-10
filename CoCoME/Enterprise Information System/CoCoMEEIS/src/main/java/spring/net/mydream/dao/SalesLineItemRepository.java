package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface SalesLineItemRepository extends JpaRepository<SalesLineItem, Integer> ,JpaSpecificationExecutor<SalesLineItem>{
		List<SalesLineItem> findByBelongedSale(Sale sale);
		List<SalesLineItem> findByBelongedItem(Item item);
}
