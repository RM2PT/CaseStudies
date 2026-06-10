package spring.net.mydream.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.net.mydream.service.*;
@Component
	public class ServiceManage {
	@Autowired
	private SubmitLoanRequestModule submitLoanRequestModule;
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	@Autowired
	private EnterValidatedCreditReferencesModule enterValidatedCreditReferencesModule;
	@Autowired
	private EvaluateLoanRequestModule evaluateLoanRequestModule;
	@Autowired
	private GenerateLoanLetterAndAgreementModule generateLoanLetterAndAgreementModule;
	@Autowired
	private LoanProcessingSystemSystem loanProcessingSystemSystem;
	@Autowired
	private ManageLoanTermCRUDService manageLoanTermCRUDService;
	public Object getService(String name) {
	if("SubmitLoanRequestModule".equals(name)) {
			return submitLoanRequestModule;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		else if("EnterValidatedCreditReferencesModule".equals(name)) {
			return enterValidatedCreditReferencesModule;
		}
		else if("EvaluateLoanRequestModule".equals(name)) {
			return evaluateLoanRequestModule;
		}
		else if("GenerateLoanLetterAndAgreementModule".equals(name)) {
			return generateLoanLetterAndAgreementModule;
		}
		else if("LoanProcessingSystemSystem".equals(name)) {
			return loanProcessingSystemSystem;
		}
		else if("ManageLoanTermCRUDService".equals(name)) {
			return manageLoanTermCRUDService;
		}
		return null;
	}
	}
	