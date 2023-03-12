package spring.net.mydream.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import spring.net.mydream.dao.*;
	import spring.net.mydream.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private TeamRepository teamRepository;
		public TeamRepository getTeamDao() {
			return teamRepository;
		}
		@Autowired
		private ActivityLogRepository activityLogRepository;
		public ActivityLogRepository getActivityLogDao() {
			return activityLogRepository;
		}
		@Autowired
		private UserRepository userRepository;
		public UserRepository getUserDao() {
			return userRepository;
		}
		@Autowired
		private MKRepository mKRepository;
		public MKRepository getMKDao() {
			return mKRepository;
		}
		@Autowired
		private ProjectRepository projectRepository;
		public ProjectRepository getProjectDao() {
			return projectRepository;
		}
		@Autowired
		private ProjectHistoryRepository projectHistoryRepository;
		public ProjectHistoryRepository getProjectHistoryDao() {
			return projectHistoryRepository;
		}
		@Autowired
		private GrpRepository grpRepository;
		public GrpRepository getGrpDao() {
			return grpRepository;
		}
		@Autowired
		private CommentRepository commentRepository;
		public CommentRepository getCommentDao() {
			return commentRepository;
		}
		@Autowired
		private CommentReplyRepository commentReplyRepository;
		public CommentReplyRepository getCommentReplyDao() {
			return commentReplyRepository;
		}
		@Autowired
		private AuthorRepository authorRepository;
		public AuthorRepository getAuthorDao() {
			return authorRepository;
		}
		@Autowired
		private KeywordRepository keywordRepository;
		public KeywordRepository getKeywordDao() {
			return keywordRepository;
		}
	}
	