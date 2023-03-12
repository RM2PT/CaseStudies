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

public class ResearchTest {
    @Autowired DaoManage DM;
    @Autowired
    DLMMSSystem dlmmsSystem;
    @Autowired
    ManageAdministratorService manageAdministratorService;
    @Autowired
    ManageAPIService manageAPIService;
    @Autowired
    ManageDataSetService manageDataSetService;
    @Autowired
    ManageModelAccessService manageModelAccessService;
    @Autowired
    ManageModelService manageModelService;
    @Autowired
    ManageOnlineModelService manageOnlineModelService;
    @Autowired
    ThirdPartyServices thirdPartyServices;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void TestUploadModel() throws PreconditionException {
        var b = dlmmsSystem.uploadModel(0, "lemon", "lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        //第二次注册同样的名字会报错
        dlmmsSystem.uploadModel(0, "lemon", "lemon");
    }

    @Test
    public void TestDeleteModel() throws PreconditionException {
        var b = dlmmsSystem.deleteModel(0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        dlmmsSystem.deleteModel(0);
    }

    @Test
    public void TestVisitModel() throws PreconditionException {
        var b = dlmmsSystem.visitModel("lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        dlmmsSystem.visitModel("not exist");
        exceptionRule.expect(PreconditionException.class);
        dlmmsSystem.visitModel("CurrentVisitNumber greater");
    }

    @Test
    public void TestVisitOnlineModel() throws PreconditionException {
        var b = dlmmsSystem.visitOnlineModel("lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        dlmmsSystem.visitOnlineModel("not exist");
        exceptionRule.expect(PreconditionException.class);
        dlmmsSystem.visitOnlineModel("invalid");
    }

    @Test
    public void TestCreateAdministrator() throws PreconditionException {
        var b = manageAdministratorService.createAdministrator(0, 0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageAdministratorService.createAdministrator(0, 1);
        exceptionRule.expect(PreconditionException.class);
        manageAdministratorService.createAdministrator(1, 0);
    }

    @Test
    public void TestDeleteAdministrator() throws PreconditionException {
        var b = manageAdministratorService.deleteAdministrator(0, 0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageAdministratorService.deleteAdministrator(0, 1);
        exceptionRule.expect(PreconditionException.class);
        manageAdministratorService.deleteAdministrator(1, 0);
    }

    @Test
    public void TestCreateAPI() throws PreconditionException{
        var b = manageAPIService.createAPI("lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageAPIService.createAPI("lemon");
    }

    @Test
    public void TestDeleteAPI() throws PreconditionException{
        var b = manageAPIService.deleteAPI("lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageAPIService.deleteAPI("lemon");
    }

    @Test
    public void TestModifyAPI() throws PreconditionException{
        var b = manageAPIService.modifyAPI("lemon", false);
        Assertions.assertNotNull(b);
        b = manageAPIService.modifyAPI("lemon", true);
        Assertions.assertNotNull(b);
    }

    @Test
    public void TestQueryAPI() throws PreconditionException{
        var b = manageAPIService.queryAPI("lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageAPIService.queryAPI("lemon");
    }

    @Test
    public void TestCreateDataSet() throws PreconditionException{
        var b = manageDataSetService.createDataSet(0, "lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageDataSetService.createDataSet(0, "lemon");
    }

    @Test
    public void TestDeleteDataSetDataSet() throws PreconditionException{
        var b = manageDataSetService.deleteDataSet(0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageDataSetService.deleteDataSet(0);
    }

    @Test
    public void TestModifyDataSet() throws PreconditionException{
        var b = manageDataSetService.modifyDataSet(0, "lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageDataSetService.modifyDataSet(0, "lemon");
    }

    @Test
    public void TestQueryDataSet() throws PreconditionException{
        var b = manageDataSetService.queryDataSet(0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageDataSetService.queryDataSet(1);
    }

    @Test
    public void TestCreateAccess() throws PreconditionException{
        var b = manageModelAccessService.createAccess("lemon", 0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageModelAccessService.createAccess("lemon", 0);
    }

    @Test
    public void TestDeleteAccess() throws PreconditionException{
        var b = manageModelAccessService.deleteAccess("lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageModelAccessService.deleteAccess("lemon");
    }

    @Test
    public void TestModifyAccess() throws PreconditionException{
        var b = manageModelAccessService.modifyAccess("lemon", 0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageModelAccessService.modifyAccess("not exist", 0);
    }

    @Test
    public void TestQueryAccess() throws PreconditionException{
        var b = manageModelAccessService.queryAccess("lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageModelAccessService.queryAccess("not exist");
    }

    @Test
    public void TestModifyModel() throws PreconditionException{
        var b = manageModelService.modifyModel(0, "lemon", "forest");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageModelService.modifyModel(1, "lemon", "forest");
    }

    @Test
    public void TestDownModel() throws PreconditionException{
        var b = manageModelService.downModel(0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageModelService.downModel(0);
    }

    @Test
    public void TestListOnlineModel() throws PreconditionException{
        var b = manageModelService.listOnlineModel(0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageModelService.listOnlineModel(1);
    }

    @Test
    public void TestListAllAdministrator() throws PreconditionException{
        var b = manageModelService.listAllAdministrator(0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageModelService.listAllAdministrator(1);
    }

    @Test
    public void TestListAllDataSet() throws PreconditionException{
        var b = manageModelService.listAllDataSet(0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageModelService.listAllDataSet(1);
    }

    @Test
    public void TestListAllAccess() throws PreconditionException{
        var b = manageModelService.listAllAccess(0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageModelService.listAllAccess(1);
    }

    @Test
    public void TestSearchModel() throws PreconditionException{
        var b = manageModelService.serchModel(0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageModelService.serchModel(1);
    }

    @Test
    public void TestDeployOnlineModel() throws PreconditionException{
        var b = manageOnlineModelService.deployOnlineModel(0, 0, "lemon");
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageOnlineModelService.deployOnlineModel(0, 1, "lemon");
        exceptionRule.expect(PreconditionException.class);
        manageOnlineModelService.deployOnlineModel(1, 0, "lemon");
    }

    @Test
    public void TestQueryOnlineModel() throws PreconditionException{
        var b = manageOnlineModelService.queryOnlineModel(1);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageOnlineModelService.queryOnlineModel(0);
    }

    @Test
    public void TestStopOnlineModel() throws PreconditionException{
        var b = manageOnlineModelService.stopOnlineModel(1);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageOnlineModelService.stopOnlineModel(0);
    }

    @Test
    public void TestListAllAPI() throws PreconditionException{
        var b = manageOnlineModelService.listAllAPI(0);
        Assertions.assertNotNull(b);
        exceptionRule.expect(PreconditionException.class);
        manageOnlineModelService.listAllAPI(1);
    }

}
