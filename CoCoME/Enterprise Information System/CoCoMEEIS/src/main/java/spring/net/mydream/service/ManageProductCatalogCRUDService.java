package spring.net.mydream.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.net.mydream.entity.*;
import spring.net.mydream.utils.DaoManage;
import spring.net.mydream.utils.PreconditionException;
import spring.net.mydream.utils.ServiceManage;
import spring.net.mydream.utils.StandardOPs;
import spring.net.mydream.redis.CurrentUtils;

@Transactional
@Service
public class ManageProductCatalogCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createProductCatalog(int id,String name) throws PreconditionException{
		ProductCatalog productcatalog = (ProductCatalog)GetData(DM.getProductCatalogDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(productcatalog) == true)
		{
			ProductCatalog pro = new ProductCatalog();
			pro.setId(id);
			pro.setName(name);
			DM.getProductCatalogDao().save(pro);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public ProductCatalog queryProductCatalog(int id) throws PreconditionException{
		ProductCatalog productcatalog = (ProductCatalog)GetData(DM.getProductCatalogDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(productcatalog) == false)
		{
			return productcatalog;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyProductCatalog(int id,String name) throws PreconditionException{
		ProductCatalog productcatalog = (ProductCatalog)GetData(DM.getProductCatalogDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(productcatalog) == false)
		{
			productcatalog.setId(id);
			productcatalog.setName(name);
			DM.getProductCatalogDao().save(productcatalog);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteProductCatalog(int id) throws PreconditionException{
		ProductCatalog productcatalog = (ProductCatalog)GetData(DM.getProductCatalogDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(productcatalog) == false && productcatalog!= null)
		{
			DM.getProductCatalogDao().delete(productcatalog);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				
	public static Object GetData(Optional<?> op) {
		if (op.isPresent())
			return op.get();
		else 
			return null;
	}
}
