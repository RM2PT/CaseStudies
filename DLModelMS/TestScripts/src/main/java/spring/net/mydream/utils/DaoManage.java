package spring.net.mydream.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import spring.net.mydream.dao.*;
	import spring.net.mydream.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private ModelRepository modelRepository;
		public ModelRepository getModelDao() {
			return modelRepository;
		}
		@Autowired
		private ModelAccessLinkRepository modelAccessLinkRepository;
		public ModelAccessLinkRepository getModelAccessLinkDao() {
			return modelAccessLinkRepository;
		}
		@Autowired
		private OnlineModelRepository onlineModelRepository;
		public OnlineModelRepository getOnlineModelDao() {
			return onlineModelRepository;
		}
		@Autowired
		private AdministratorRepository administratorRepository;
		public AdministratorRepository getAdministratorDao() {
			return administratorRepository;
		}
		@Autowired
		private APIRepository aPIRepository;
		public APIRepository getAPIDao() {
			return aPIRepository;
		}
		@Autowired
		private DataSetRepository dataSetRepository;
		public DataSetRepository getDataSetDao() {
			return dataSetRepository;
		}
	}
	