package com.rm2pt.generator.springboot.DLModelMS.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import com.rm2pt.generator.springboot.DLModelMS.dao.*;
	import com.rm2pt.generator.springboot.DLModelMS.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private ModelRepository modelRepository;
		public ModelRepository getModelDao() {
			return modelRepository;
		}
		@Autowired
		private RunningModelRepository runningModelRepository;
		public RunningModelRepository getRunningModelDao() {
			return runningModelRepository;
		}
		@Autowired
		private MykeyRepository mykeyRepository;
		public MykeyRepository getMykeyDao() {
			return mykeyRepository;
		}
		@Autowired
		private DataSetRepository dataSetRepository;
		public DataSetRepository getDataSetDao() {
			return dataSetRepository;
		}
		@Autowired
		private AttachmentRepository attachmentRepository;
		public AttachmentRepository getAttachmentDao() {
			return attachmentRepository;
		}
	}
	