package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface ItemRepository extends JpaRepository<Item, Integer> ,JpaSpecificationExecutor<Item>{
		List<Item> findByBelongedCatalog(ProductCatalog productCatalog);
			List<Item> findByStockNumber(Object param0);
			Item findByBarcode(Object barcode);
}
