import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import spring.net.mydream.entity.*;
import spring.net.mydream.service.*;
import spring.net.mydream.utils.DaoManage;
import spring.net.mydream.utils.PreconditionException;
import spring.net.mydream.utils.StandardOPs;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = spring.net.mydream.DemoApplication.class)
@FixMethodOrder(MethodSorters.JVM)

public class MicroTest {
    @Autowired DaoManage DM;
    @Autowired
    BasicInfoManageService basicInfoManageService;
    @Autowired
    MicroKnowledgeSystem microKnowledgeSystem;
    @Autowired
    MultiVersionManagementService multiVersionManagementService;
    @Autowired
    ThirdPartyServices thirdPartyServices;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void TestCreate() throws PreconditionException {
        var b = basicInfoManageService.create("lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        //第二次注册同样的名字会报错
        basicInfoManageService.create("lemon");
    }

    @Test
    public void TestFind() throws PreconditionException {
        var b = basicInfoManageService.find("lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        //not exist
        basicInfoManageService.create("not exist");
    }

    @Test
    public void TestUpdate() throws PreconditionException {
        var b = basicInfoManageService.update("lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        //not exist
        basicInfoManageService.update("not exist");
    }

    @Test
    public void TestAddComment() throws PreconditionException {
        var b = basicInfoManageService.addComment("lemon", "forest");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        //not exist
        basicInfoManageService.addComment("not exist", "forest");
    }

    @Test
    public void TestAddProjectHistory() throws PreconditionException {
        var b = basicInfoManageService.addProjectHistory("lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        //already exist
        basicInfoManageService.addProjectHistory("lemon");
    }

    @Test
    public void TestUpdateComment() throws PreconditionException {
        var b = basicInfoManageService.updateComment("lemon", "forest");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        //not exist
        basicInfoManageService.updateComment("not exist", "forest");
    }

    @Test
    public void TestUpdateProjectHistory() throws PreconditionException{
        var b = basicInfoManageService.updateProjectHistory("lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        //not exist
        basicInfoManageService.updateProjectHistory("not exist");
    }

    @Test
    public void TestAddMK() throws PreconditionException{
        var b = basicInfoManageService.addMK("lemon", "forest");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        //already exist
        basicInfoManageService.addMK("lemon", "forest");
    }

    @Test
    public void TestUpdateMK() throws PreconditionException{
        var b = basicInfoManageService.updateMK("lemon", "forest");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        //not exist
        basicInfoManageService.updateComment("not exist", "forest");
    }

    @Test
    public void TestListProjectHistory() throws PreconditionException{
        var b = basicInfoManageService.listProjectHistory();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestListMK() throws PreconditionException{
        var b = basicInfoManageService.listMK();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestProjectManagement() throws PreconditionException{
        var b = microKnowledgeSystem.projectManagement();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestRelatedProjectCollection() throws PreconditionException{
        var b = microKnowledgeSystem.relatedProjectCollection();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestMemberManage() throws PreconditionException{
        var b = microKnowledgeSystem.memberManage();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestMemberDynamics() throws PreconditionException{
        var b = microKnowledgeSystem.memberDynamics();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestClassification() throws PreconditionException{
        var b = microKnowledgeSystem.classification();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestMKGraph() throws PreconditionException{
        var b = microKnowledgeSystem.mKGraph();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestMKRecommendation() throws PreconditionException{
        var b = microKnowledgeSystem.mKRecommendation();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestContentEdit() throws PreconditionException{
        var b = microKnowledgeSystem.contentEdit("lemon", "forest");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        //not exist
        microKnowledgeSystem.contentEdit("not exist", "forest");
    }

    @Test
    public void TestTeamForum() throws PreconditionException{
        var b = microKnowledgeSystem.teamForum();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestBusinessDataManagement() throws PreconditionException{
        var b = microKnowledgeSystem.businessDataManagement();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestMKManagement() throws PreconditionException{
        var b = microKnowledgeSystem.mKManagement();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestTeamDataManagement() throws PreconditionException{
        var b = microKnowledgeSystem.teamDataManagement();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestBasicDataManagement() throws PreconditionException{
        var b = microKnowledgeSystem.basicDataManagement();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestLogManagement() throws PreconditionException{
        var b = microKnowledgeSystem.logManagement();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestUserManagement() throws PreconditionException{
        var b = microKnowledgeSystem.userManagement();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestResearchTeamManagement() throws PreconditionException{
        var b = microKnowledgeSystem.researchTeamManagement();
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestChangeVersion() throws PreconditionException{
        var b = multiVersionManagementService.changeVersion("lemon", "forest");
        Assertions.assertNotNull(b);
        // not exist
        exceptionRule.expect(PreconditionException.class);
        multiVersionManagementService.changeVersion("not exist", "forest");
    }

}

