package com.rm2pt.generator.springboot.ParkMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.ParkMS.entity.*;

public interface ParkRecordRepository extends JpaRepository<ParkRecord, Integer> ,JpaSpecificationExecutor<ParkRecord>{
	List<ParkRecord> findByOwnedPark(Park park);
			List<ParkRecord> findByPlateNumber(Object plateNumber);
			ParkRecord findByPlateNumberAndIsParking(Object plateNumber,Object paramTrue);
}
