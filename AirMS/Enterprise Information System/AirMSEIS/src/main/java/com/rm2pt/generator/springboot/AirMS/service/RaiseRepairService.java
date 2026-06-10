package com.rm2pt.generator.springboot.AirMS.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rm2pt.generator.springboot.AirMS.entity.*;
import com.rm2pt.generator.springboot.AirMS.utils.DaoManage;
import com.rm2pt.generator.springboot.AirMS.utils.PreconditionException;
import com.rm2pt.generator.springboot.AirMS.utils.ServiceManage;
import com.rm2pt.generator.springboot.AirMS.utils.StandardOPs;
import com.rm2pt.generator.springboot.AirMS.redis.CurrentUtils;

@Transactional
@Service
public class RaiseRepairService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

				

	public static Object GetData(Object op) {
		return op;
	}
}
