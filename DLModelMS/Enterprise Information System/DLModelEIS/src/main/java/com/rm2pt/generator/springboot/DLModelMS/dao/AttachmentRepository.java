package com.rm2pt.generator.springboot.DLModelMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.DLModelMS.entity.*;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> ,JpaSpecificationExecutor<Attachment>{
}
