package com.rm2pt.generator.springboot.MicroK.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import com.rm2pt.generator.springboot.MicroK.dao.*;
	import com.rm2pt.generator.springboot.MicroK.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private UserRepository userRepository;
		public UserRepository getUserDao() {
			return userRepository;
		}
		@Autowired
		private MicroknowledgeRepository microknowledgeRepository;
		public MicroknowledgeRepository getMicroknowledgeDao() {
			return microknowledgeRepository;
		}
		@Autowired
		private CommentRepository commentRepository;
		public CommentRepository getCommentDao() {
			return commentRepository;
		}
	}
	