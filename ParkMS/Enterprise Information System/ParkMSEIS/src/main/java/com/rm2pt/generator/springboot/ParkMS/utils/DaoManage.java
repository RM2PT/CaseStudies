package com.rm2pt.generator.springboot.ParkMS.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import com.rm2pt.generator.springboot.ParkMS.dao.*;
	import com.rm2pt.generator.springboot.ParkMS.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private ParkRecordRepository parkRecordRepository;
		public ParkRecordRepository getParkRecordDao() {
			return parkRecordRepository;
		}
		@Autowired
		private ParkRepository parkRepository;
		public ParkRepository getParkDao() {
			return parkRepository;
		}
		@Autowired
		private VehicleRepository vehicleRepository;
		public VehicleRepository getVehicleDao() {
			return vehicleRepository;
		}
		@Autowired
		private MemberRepository memberRepository;
		public MemberRepository getMemberDao() {
			return memberRepository;
		}
	}
	