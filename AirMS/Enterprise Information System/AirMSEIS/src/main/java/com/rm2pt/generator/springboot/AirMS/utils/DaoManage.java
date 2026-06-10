package com.rm2pt.generator.springboot.AirMS.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import com.rm2pt.generator.springboot.AirMS.dao.*;
	import com.rm2pt.generator.springboot.AirMS.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private RepairRepository repairRepository;
		public RepairRepository getRepairDao() {
			return repairRepository;
		}
		@Autowired
		private StaffRepository staffRepository;
		public StaffRepository getStaffDao() {
			return staffRepository;
		}
		@Autowired
		private DeviceRepository deviceRepository;
		public DeviceRepository getDeviceDao() {
			return deviceRepository;
		}
		@Autowired
		private ApprovalHistoryRepository approvalHistoryRepository;
		public ApprovalHistoryRepository getApprovalHistoryDao() {
			return approvalHistoryRepository;
		}
	}
	