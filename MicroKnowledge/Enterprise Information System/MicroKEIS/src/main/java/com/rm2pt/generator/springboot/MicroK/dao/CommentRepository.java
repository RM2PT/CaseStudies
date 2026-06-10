package com.rm2pt.generator.springboot.MicroK.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.MicroK.entity.*;

public interface CommentRepository extends JpaRepository<Comment, Integer> ,JpaSpecificationExecutor<Comment>{
	List<Comment> findByCommenttoReader(User user);
	List<Comment> findByCommenttoMicroknowledge(Microknowledge microknowledge);
}
