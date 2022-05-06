package workflows;

import extensions.ApiActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class ApiFlows extends CommonOps {

    @Step("Flow - Get Required Data From Team")
    public static String getTeamData(String jPath) {
        response = ApiActions.get("/api/teams/search");
        return ApiActions.extractFromJson(response, jPath);
    }

    @Step("Flow - Get Required Data From Team")
    public static String getTeamUsers(String jPath, String id) {
        response = ApiActions.get("/api/teams/" + id +"/members");
        return ApiActions.extractFromJson(response, jPath);
    }


    @Step("Flow - Get Required Data From Users")
    public static String getUsersData(String jPath) {
        response = ApiActions.get("/api/users");
        return ApiActions.extractFromJson(response, jPath);
    }


    @Step("Flow - Create New Team")
    public static void createTeam(String name, String email) {
        params.put("name", name);
        params.put("email", email);
        ApiActions.post(params, "/api/teams");
    }

    @Step("Flow - Update Team Data")
    public static void updateTeam(String name, String email, String id) {
        params.put("name", name);
        params.put("email", email);
        ApiActions.put(params, "/api/teams/" + id);
    }

    @Step("Flow - Delete Team")
    public static void deleteTeam(String id) {
        ApiActions.delete(id);
    }

    @Step("Flow - Add Member To Team")
    public static void addMemberToTeam(int userId, String teamId) {
        params.put("userId", userId);
        ApiActions.post(params, "/api/teams/" + teamId + "/members");
    }

}
