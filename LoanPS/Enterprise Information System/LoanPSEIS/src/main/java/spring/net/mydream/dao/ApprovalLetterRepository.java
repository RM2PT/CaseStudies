package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface ApprovalLetterRepository extends JpaRepository<ApprovalLetter, Integer> ,JpaSpecificationExecutor<ApprovalLetter>{
}
