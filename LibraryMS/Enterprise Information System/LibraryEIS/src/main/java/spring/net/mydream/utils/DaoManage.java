package spring.net.mydream.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import spring.net.mydream.dao.*;
	import spring.net.mydream.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private UserRepository userRepository;
		public UserRepository getUserDao() {
			return userRepository;
		}
		@Autowired
		private StudentRepository studentRepository;
		public StudentRepository getStudentDao() {
			return studentRepository;
		}
		@Autowired
		private FacultyRepository facultyRepository;
		public FacultyRepository getFacultyDao() {
			return facultyRepository;
		}
		@Autowired
		private BookRepository bookRepository;
		public BookRepository getBookDao() {
			return bookRepository;
		}
		@Autowired
		private SubjectRepository subjectRepository;
		public SubjectRepository getSubjectDao() {
			return subjectRepository;
		}
		@Autowired
		private BookCopyRepository bookCopyRepository;
		public BookCopyRepository getBookCopyDao() {
			return bookCopyRepository;
		}
		@Autowired
		private LoanRepository loanRepository;
		public LoanRepository getLoanDao() {
			return loanRepository;
		}
		@Autowired
		private ReserveRepository reserveRepository;
		public ReserveRepository getReserveDao() {
			return reserveRepository;
		}
		@Autowired
		private RecommendBookRepository recommendBookRepository;
		public RecommendBookRepository getRecommendBookDao() {
			return recommendBookRepository;
		}
		@Autowired
		private AdministratorRepository administratorRepository;
		public AdministratorRepository getAdministratorDao() {
			return administratorRepository;
		}
		@Autowired
		private LibrarianRepository librarianRepository;
		public LibrarianRepository getLibrarianDao() {
			return librarianRepository;
		}
	}
	