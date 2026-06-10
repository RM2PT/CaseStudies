package spring.net.mydream.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import spring.net.mydream.dao.*;
	import spring.net.mydream.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private LoanRequestRepository loanRequestRepository;
		public LoanRequestRepository getLoanRequestDao() {
			return loanRequestRepository;
		}
		@Autowired
		private LoanRepository loanRepository;
		public LoanRepository getLoanDao() {
			return loanRepository;
		}
		@Autowired
		private LoanTermRepository loanTermRepository;
		public LoanTermRepository getLoanTermDao() {
			return loanTermRepository;
		}
		@Autowired
		private CheckingAccountRepository checkingAccountRepository;
		public CheckingAccountRepository getCheckingAccountDao() {
			return checkingAccountRepository;
		}
		@Autowired
		private CreditHistoryRepository creditHistoryRepository;
		public CreditHistoryRepository getCreditHistoryDao() {
			return creditHistoryRepository;
		}
		@Autowired
		private LoanAccountRepository loanAccountRepository;
		public LoanAccountRepository getLoanAccountDao() {
			return loanAccountRepository;
		}
		@Autowired
		private ApprovalLetterRepository approvalLetterRepository;
		public ApprovalLetterRepository getApprovalLetterDao() {
			return approvalLetterRepository;
		}
		@Autowired
		private LoanAgreementRepository loanAgreementRepository;
		public LoanAgreementRepository getLoanAgreementDao() {
			return loanAgreementRepository;
		}
	}
	