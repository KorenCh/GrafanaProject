package test;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ApiFlows;

@Listeners(utilities.Listener.class)
public class GrafanaAPI extends CommonOps {

    @Test(description = "Test1 - Get Team Data")
    @Description("Get Team Name And Verify Expected")
    public void test1_VerifyTeam() {
        response = httpRequest.get("/api/teams/search");
        Verifications.verifyText(ApiFlows.getTeamData("teams[1].name"), "Gym");
    }

    @Test(description = "Test2 - Add Team")
    @Description("Add Team And Verify Created")
    public void test2_addTeam() {
        ApiFlows.createTeam("Soda", "Soda@gmail.com");
        Verifications.verifyText(ApiFlows.getTeamData("teams[2].name"), "Soda");
    }

    @Test(description = "Test3 - Update Team")
    @Description("Update Team And Verify ")
    public void test3_updateTeam() {
        String id = ApiFlows.getTeamData("teams[2].id");
        ApiFlows.updateTeam("Soda", "Soda@walla.co.il", id);
        Verifications.verifyText(ApiFlows.getTeamData("teams[2].name"), "Soda");
    }

    @Test(description = "Test4 - delete Team")
    @Description("Delete Team And Verify ")
    public void test4_deleteTeam() {
        String id = ApiFlows.getTeamData("teams[2].id");
        ApiFlows.deleteTeam(id);
        Verifications.verifyText(ApiFlows.getTeamData("totalCount"), "2");
    }

    @Test(description = "Test5 - Add Member To Team")
    @Description("Add Member To Team, Verify Created")
    public void test5_addMemberToTeam() {
        int userId = Integer.parseInt(ApiFlows.getUsersData("id[0]"));
        String teamId = ApiFlows.getTeamData("teams[1].id");
        ApiFlows.addMemberToTeam(userId, teamId);
        Verifications.verifyText(ApiFlows.getTeamUsers("name[0]", teamId), "David");
    }
}