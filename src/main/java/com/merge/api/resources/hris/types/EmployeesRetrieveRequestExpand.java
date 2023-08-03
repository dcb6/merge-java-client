package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EmployeesRetrieveRequestExpand {
    COMPANY("company"),

    COMPANY_PAY_GROUP("company,pay_group"),

    EMPLOYMENTS("employments"),

    EMPLOYMENTS_COMPANY("employments,company"),

    EMPLOYMENTS_COMPANY_PAY_GROUP("employments,company,pay_group"),

    EMPLOYMENTS_GROUPS("employments,groups"),

    EMPLOYMENTS_GROUPS_COMPANY("employments,groups,company"),

    EMPLOYMENTS_GROUPS_COMPANY_PAY_GROUP("employments,groups,company,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION("employments,groups,home_location"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_COMPANY("employments,groups,home_location,company"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_COMPANY_PAY_GROUP("employments,groups,home_location,company,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_MANAGER("employments,groups,home_location,manager"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_MANAGER_COMPANY("employments,groups,home_location,manager,company"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_MANAGER_COMPANY_PAY_GROUP(
            "employments,groups,home_location,manager,company,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_MANAGER_PAY_GROUP("employments,groups,home_location,manager,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_MANAGER_TEAM("employments,groups,home_location,manager,team"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_MANAGER_TEAM_COMPANY("employments,groups,home_location,manager,team,company"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_MANAGER_TEAM_COMPANY_PAY_GROUP(
            "employments,groups,home_location,manager,team,company,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_MANAGER_TEAM_PAY_GROUP("employments,groups,home_location,manager,team,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_PAY_GROUP("employments,groups,home_location,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_TEAM("employments,groups,home_location,team"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_TEAM_COMPANY("employments,groups,home_location,team,company"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_TEAM_COMPANY_PAY_GROUP("employments,groups,home_location,team,company,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_TEAM_PAY_GROUP("employments,groups,home_location,team,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION("employments,groups,home_location,work_location"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_COMPANY("employments,groups,home_location,work_location,company"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_COMPANY_PAY_GROUP(
            "employments,groups,home_location,work_location,company,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER("employments,groups,home_location,work_location,manager"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_COMPANY(
            "employments,groups,home_location,work_location,manager,company"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_COMPANY_PAY_GROUP(
            "employments,groups,home_location,work_location,manager,company,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_PAY_GROUP(
            "employments,groups,home_location,work_location,manager,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM(
            "employments,groups,home_location,work_location,manager,team"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM_COMPANY(
            "employments,groups,home_location,work_location,manager,team,company"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM_COMPANY_PAY_GROUP(
            "employments,groups,home_location,work_location,manager,team,company,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM_PAY_GROUP(
            "employments,groups,home_location,work_location,manager,team,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_PAY_GROUP(
            "employments,groups,home_location,work_location,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_TEAM("employments,groups,home_location,work_location,team"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_TEAM_COMPANY(
            "employments,groups,home_location,work_location,team,company"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_TEAM_COMPANY_PAY_GROUP(
            "employments,groups,home_location,work_location,team,company,pay_group"),

    EMPLOYMENTS_GROUPS_HOME_LOCATION_WORK_LOCATION_TEAM_PAY_GROUP(
            "employments,groups,home_location,work_location,team,pay_group"),

    EMPLOYMENTS_GROUPS_MANAGER("employments,groups,manager"),

    EMPLOYMENTS_GROUPS_MANAGER_COMPANY("employments,groups,manager,company"),

    EMPLOYMENTS_GROUPS_MANAGER_COMPANY_PAY_GROUP("employments,groups,manager,company,pay_group"),

    EMPLOYMENTS_GROUPS_MANAGER_PAY_GROUP("employments,groups,manager,pay_group"),

    EMPLOYMENTS_GROUPS_MANAGER_TEAM("employments,groups,manager,team"),

    EMPLOYMENTS_GROUPS_MANAGER_TEAM_COMPANY("employments,groups,manager,team,company"),

    EMPLOYMENTS_GROUPS_MANAGER_TEAM_COMPANY_PAY_GROUP("employments,groups,manager,team,company,pay_group"),

    EMPLOYMENTS_GROUPS_MANAGER_TEAM_PAY_GROUP("employments,groups,manager,team,pay_group"),

    EMPLOYMENTS_GROUPS_PAY_GROUP("employments,groups,pay_group"),

    EMPLOYMENTS_GROUPS_TEAM("employments,groups,team"),

    EMPLOYMENTS_GROUPS_TEAM_COMPANY("employments,groups,team,company"),

    EMPLOYMENTS_GROUPS_TEAM_COMPANY_PAY_GROUP("employments,groups,team,company,pay_group"),

    EMPLOYMENTS_GROUPS_TEAM_PAY_GROUP("employments,groups,team,pay_group"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION("employments,groups,work_location"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_COMPANY("employments,groups,work_location,company"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_COMPANY_PAY_GROUP("employments,groups,work_location,company,pay_group"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_MANAGER("employments,groups,work_location,manager"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_MANAGER_COMPANY("employments,groups,work_location,manager,company"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_MANAGER_COMPANY_PAY_GROUP(
            "employments,groups,work_location,manager,company,pay_group"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_MANAGER_PAY_GROUP("employments,groups,work_location,manager,pay_group"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_MANAGER_TEAM("employments,groups,work_location,manager,team"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_MANAGER_TEAM_COMPANY("employments,groups,work_location,manager,team,company"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_MANAGER_TEAM_COMPANY_PAY_GROUP(
            "employments,groups,work_location,manager,team,company,pay_group"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_MANAGER_TEAM_PAY_GROUP("employments,groups,work_location,manager,team,pay_group"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_PAY_GROUP("employments,groups,work_location,pay_group"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_TEAM("employments,groups,work_location,team"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_TEAM_COMPANY("employments,groups,work_location,team,company"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_TEAM_COMPANY_PAY_GROUP("employments,groups,work_location,team,company,pay_group"),

    EMPLOYMENTS_GROUPS_WORK_LOCATION_TEAM_PAY_GROUP("employments,groups,work_location,team,pay_group"),

    EMPLOYMENTS_HOME_LOCATION("employments,home_location"),

    EMPLOYMENTS_HOME_LOCATION_COMPANY("employments,home_location,company"),

    EMPLOYMENTS_HOME_LOCATION_COMPANY_PAY_GROUP("employments,home_location,company,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_MANAGER("employments,home_location,manager"),

    EMPLOYMENTS_HOME_LOCATION_MANAGER_COMPANY("employments,home_location,manager,company"),

    EMPLOYMENTS_HOME_LOCATION_MANAGER_COMPANY_PAY_GROUP("employments,home_location,manager,company,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_MANAGER_PAY_GROUP("employments,home_location,manager,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_MANAGER_TEAM("employments,home_location,manager,team"),

    EMPLOYMENTS_HOME_LOCATION_MANAGER_TEAM_COMPANY("employments,home_location,manager,team,company"),

    EMPLOYMENTS_HOME_LOCATION_MANAGER_TEAM_COMPANY_PAY_GROUP(
            "employments,home_location,manager,team,company,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_MANAGER_TEAM_PAY_GROUP("employments,home_location,manager,team,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_PAY_GROUP("employments,home_location,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_TEAM("employments,home_location,team"),

    EMPLOYMENTS_HOME_LOCATION_TEAM_COMPANY("employments,home_location,team,company"),

    EMPLOYMENTS_HOME_LOCATION_TEAM_COMPANY_PAY_GROUP("employments,home_location,team,company,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_TEAM_PAY_GROUP("employments,home_location,team,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION("employments,home_location,work_location"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_COMPANY("employments,home_location,work_location,company"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_COMPANY_PAY_GROUP(
            "employments,home_location,work_location,company,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_MANAGER("employments,home_location,work_location,manager"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_MANAGER_COMPANY("employments,home_location,work_location,manager,company"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_MANAGER_COMPANY_PAY_GROUP(
            "employments,home_location,work_location,manager,company,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_MANAGER_PAY_GROUP(
            "employments,home_location,work_location,manager,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM("employments,home_location,work_location,manager,team"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM_COMPANY(
            "employments,home_location,work_location,manager,team,company"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM_COMPANY_PAY_GROUP(
            "employments,home_location,work_location,manager,team,company,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM_PAY_GROUP(
            "employments,home_location,work_location,manager,team,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_PAY_GROUP("employments,home_location,work_location,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_TEAM("employments,home_location,work_location,team"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_TEAM_COMPANY("employments,home_location,work_location,team,company"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_TEAM_COMPANY_PAY_GROUP(
            "employments,home_location,work_location,team,company,pay_group"),

    EMPLOYMENTS_HOME_LOCATION_WORK_LOCATION_TEAM_PAY_GROUP("employments,home_location,work_location,team,pay_group"),

    EMPLOYMENTS_MANAGER("employments,manager"),

    EMPLOYMENTS_MANAGER_COMPANY("employments,manager,company"),

    EMPLOYMENTS_MANAGER_COMPANY_PAY_GROUP("employments,manager,company,pay_group"),

    EMPLOYMENTS_MANAGER_PAY_GROUP("employments,manager,pay_group"),

    EMPLOYMENTS_MANAGER_TEAM("employments,manager,team"),

    EMPLOYMENTS_MANAGER_TEAM_COMPANY("employments,manager,team,company"),

    EMPLOYMENTS_MANAGER_TEAM_COMPANY_PAY_GROUP("employments,manager,team,company,pay_group"),

    EMPLOYMENTS_MANAGER_TEAM_PAY_GROUP("employments,manager,team,pay_group"),

    EMPLOYMENTS_PAY_GROUP("employments,pay_group"),

    EMPLOYMENTS_TEAM("employments,team"),

    EMPLOYMENTS_TEAM_COMPANY("employments,team,company"),

    EMPLOYMENTS_TEAM_COMPANY_PAY_GROUP("employments,team,company,pay_group"),

    EMPLOYMENTS_TEAM_PAY_GROUP("employments,team,pay_group"),

    EMPLOYMENTS_WORK_LOCATION("employments,work_location"),

    EMPLOYMENTS_WORK_LOCATION_COMPANY("employments,work_location,company"),

    EMPLOYMENTS_WORK_LOCATION_COMPANY_PAY_GROUP("employments,work_location,company,pay_group"),

    EMPLOYMENTS_WORK_LOCATION_MANAGER("employments,work_location,manager"),

    EMPLOYMENTS_WORK_LOCATION_MANAGER_COMPANY("employments,work_location,manager,company"),

    EMPLOYMENTS_WORK_LOCATION_MANAGER_COMPANY_PAY_GROUP("employments,work_location,manager,company,pay_group"),

    EMPLOYMENTS_WORK_LOCATION_MANAGER_PAY_GROUP("employments,work_location,manager,pay_group"),

    EMPLOYMENTS_WORK_LOCATION_MANAGER_TEAM("employments,work_location,manager,team"),

    EMPLOYMENTS_WORK_LOCATION_MANAGER_TEAM_COMPANY("employments,work_location,manager,team,company"),

    EMPLOYMENTS_WORK_LOCATION_MANAGER_TEAM_COMPANY_PAY_GROUP(
            "employments,work_location,manager,team,company,pay_group"),

    EMPLOYMENTS_WORK_LOCATION_MANAGER_TEAM_PAY_GROUP("employments,work_location,manager,team,pay_group"),

    EMPLOYMENTS_WORK_LOCATION_PAY_GROUP("employments,work_location,pay_group"),

    EMPLOYMENTS_WORK_LOCATION_TEAM("employments,work_location,team"),

    EMPLOYMENTS_WORK_LOCATION_TEAM_COMPANY("employments,work_location,team,company"),

    EMPLOYMENTS_WORK_LOCATION_TEAM_COMPANY_PAY_GROUP("employments,work_location,team,company,pay_group"),

    EMPLOYMENTS_WORK_LOCATION_TEAM_PAY_GROUP("employments,work_location,team,pay_group"),

    GROUPS("groups"),

    GROUPS_COMPANY("groups,company"),

    GROUPS_COMPANY_PAY_GROUP("groups,company,pay_group"),

    GROUPS_HOME_LOCATION("groups,home_location"),

    GROUPS_HOME_LOCATION_COMPANY("groups,home_location,company"),

    GROUPS_HOME_LOCATION_COMPANY_PAY_GROUP("groups,home_location,company,pay_group"),

    GROUPS_HOME_LOCATION_MANAGER("groups,home_location,manager"),

    GROUPS_HOME_LOCATION_MANAGER_COMPANY("groups,home_location,manager,company"),

    GROUPS_HOME_LOCATION_MANAGER_COMPANY_PAY_GROUP("groups,home_location,manager,company,pay_group"),

    GROUPS_HOME_LOCATION_MANAGER_PAY_GROUP("groups,home_location,manager,pay_group"),

    GROUPS_HOME_LOCATION_MANAGER_TEAM("groups,home_location,manager,team"),

    GROUPS_HOME_LOCATION_MANAGER_TEAM_COMPANY("groups,home_location,manager,team,company"),

    GROUPS_HOME_LOCATION_MANAGER_TEAM_COMPANY_PAY_GROUP("groups,home_location,manager,team,company,pay_group"),

    GROUPS_HOME_LOCATION_MANAGER_TEAM_PAY_GROUP("groups,home_location,manager,team,pay_group"),

    GROUPS_HOME_LOCATION_PAY_GROUP("groups,home_location,pay_group"),

    GROUPS_HOME_LOCATION_TEAM("groups,home_location,team"),

    GROUPS_HOME_LOCATION_TEAM_COMPANY("groups,home_location,team,company"),

    GROUPS_HOME_LOCATION_TEAM_COMPANY_PAY_GROUP("groups,home_location,team,company,pay_group"),

    GROUPS_HOME_LOCATION_TEAM_PAY_GROUP("groups,home_location,team,pay_group"),

    GROUPS_HOME_LOCATION_WORK_LOCATION("groups,home_location,work_location"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_COMPANY("groups,home_location,work_location,company"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_COMPANY_PAY_GROUP("groups,home_location,work_location,company,pay_group"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER("groups,home_location,work_location,manager"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_COMPANY("groups,home_location,work_location,manager,company"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_COMPANY_PAY_GROUP(
            "groups,home_location,work_location,manager,company,pay_group"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_PAY_GROUP("groups,home_location,work_location,manager,pay_group"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM("groups,home_location,work_location,manager,team"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM_COMPANY("groups,home_location,work_location,manager,team,company"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM_COMPANY_PAY_GROUP(
            "groups,home_location,work_location,manager,team,company,pay_group"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM_PAY_GROUP(
            "groups,home_location,work_location,manager,team,pay_group"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_PAY_GROUP("groups,home_location,work_location,pay_group"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_TEAM("groups,home_location,work_location,team"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_TEAM_COMPANY("groups,home_location,work_location,team,company"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_TEAM_COMPANY_PAY_GROUP(
            "groups,home_location,work_location,team,company,pay_group"),

    GROUPS_HOME_LOCATION_WORK_LOCATION_TEAM_PAY_GROUP("groups,home_location,work_location,team,pay_group"),

    GROUPS_MANAGER("groups,manager"),

    GROUPS_MANAGER_COMPANY("groups,manager,company"),

    GROUPS_MANAGER_COMPANY_PAY_GROUP("groups,manager,company,pay_group"),

    GROUPS_MANAGER_PAY_GROUP("groups,manager,pay_group"),

    GROUPS_MANAGER_TEAM("groups,manager,team"),

    GROUPS_MANAGER_TEAM_COMPANY("groups,manager,team,company"),

    GROUPS_MANAGER_TEAM_COMPANY_PAY_GROUP("groups,manager,team,company,pay_group"),

    GROUPS_MANAGER_TEAM_PAY_GROUP("groups,manager,team,pay_group"),

    GROUPS_PAY_GROUP("groups,pay_group"),

    GROUPS_TEAM("groups,team"),

    GROUPS_TEAM_COMPANY("groups,team,company"),

    GROUPS_TEAM_COMPANY_PAY_GROUP("groups,team,company,pay_group"),

    GROUPS_TEAM_PAY_GROUP("groups,team,pay_group"),

    GROUPS_WORK_LOCATION("groups,work_location"),

    GROUPS_WORK_LOCATION_COMPANY("groups,work_location,company"),

    GROUPS_WORK_LOCATION_COMPANY_PAY_GROUP("groups,work_location,company,pay_group"),

    GROUPS_WORK_LOCATION_MANAGER("groups,work_location,manager"),

    GROUPS_WORK_LOCATION_MANAGER_COMPANY("groups,work_location,manager,company"),

    GROUPS_WORK_LOCATION_MANAGER_COMPANY_PAY_GROUP("groups,work_location,manager,company,pay_group"),

    GROUPS_WORK_LOCATION_MANAGER_PAY_GROUP("groups,work_location,manager,pay_group"),

    GROUPS_WORK_LOCATION_MANAGER_TEAM("groups,work_location,manager,team"),

    GROUPS_WORK_LOCATION_MANAGER_TEAM_COMPANY("groups,work_location,manager,team,company"),

    GROUPS_WORK_LOCATION_MANAGER_TEAM_COMPANY_PAY_GROUP("groups,work_location,manager,team,company,pay_group"),

    GROUPS_WORK_LOCATION_MANAGER_TEAM_PAY_GROUP("groups,work_location,manager,team,pay_group"),

    GROUPS_WORK_LOCATION_PAY_GROUP("groups,work_location,pay_group"),

    GROUPS_WORK_LOCATION_TEAM("groups,work_location,team"),

    GROUPS_WORK_LOCATION_TEAM_COMPANY("groups,work_location,team,company"),

    GROUPS_WORK_LOCATION_TEAM_COMPANY_PAY_GROUP("groups,work_location,team,company,pay_group"),

    GROUPS_WORK_LOCATION_TEAM_PAY_GROUP("groups,work_location,team,pay_group"),

    HOME_LOCATION("home_location"),

    HOME_LOCATION_COMPANY("home_location,company"),

    HOME_LOCATION_COMPANY_PAY_GROUP("home_location,company,pay_group"),

    HOME_LOCATION_MANAGER("home_location,manager"),

    HOME_LOCATION_MANAGER_COMPANY("home_location,manager,company"),

    HOME_LOCATION_MANAGER_COMPANY_PAY_GROUP("home_location,manager,company,pay_group"),

    HOME_LOCATION_MANAGER_PAY_GROUP("home_location,manager,pay_group"),

    HOME_LOCATION_MANAGER_TEAM("home_location,manager,team"),

    HOME_LOCATION_MANAGER_TEAM_COMPANY("home_location,manager,team,company"),

    HOME_LOCATION_MANAGER_TEAM_COMPANY_PAY_GROUP("home_location,manager,team,company,pay_group"),

    HOME_LOCATION_MANAGER_TEAM_PAY_GROUP("home_location,manager,team,pay_group"),

    HOME_LOCATION_PAY_GROUP("home_location,pay_group"),

    HOME_LOCATION_TEAM("home_location,team"),

    HOME_LOCATION_TEAM_COMPANY("home_location,team,company"),

    HOME_LOCATION_TEAM_COMPANY_PAY_GROUP("home_location,team,company,pay_group"),

    HOME_LOCATION_TEAM_PAY_GROUP("home_location,team,pay_group"),

    HOME_LOCATION_WORK_LOCATION("home_location,work_location"),

    HOME_LOCATION_WORK_LOCATION_COMPANY("home_location,work_location,company"),

    HOME_LOCATION_WORK_LOCATION_COMPANY_PAY_GROUP("home_location,work_location,company,pay_group"),

    HOME_LOCATION_WORK_LOCATION_MANAGER("home_location,work_location,manager"),

    HOME_LOCATION_WORK_LOCATION_MANAGER_COMPANY("home_location,work_location,manager,company"),

    HOME_LOCATION_WORK_LOCATION_MANAGER_COMPANY_PAY_GROUP("home_location,work_location,manager,company,pay_group"),

    HOME_LOCATION_WORK_LOCATION_MANAGER_PAY_GROUP("home_location,work_location,manager,pay_group"),

    HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM("home_location,work_location,manager,team"),

    HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM_COMPANY("home_location,work_location,manager,team,company"),

    HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM_COMPANY_PAY_GROUP(
            "home_location,work_location,manager,team,company,pay_group"),

    HOME_LOCATION_WORK_LOCATION_MANAGER_TEAM_PAY_GROUP("home_location,work_location,manager,team,pay_group"),

    HOME_LOCATION_WORK_LOCATION_PAY_GROUP("home_location,work_location,pay_group"),

    HOME_LOCATION_WORK_LOCATION_TEAM("home_location,work_location,team"),

    HOME_LOCATION_WORK_LOCATION_TEAM_COMPANY("home_location,work_location,team,company"),

    HOME_LOCATION_WORK_LOCATION_TEAM_COMPANY_PAY_GROUP("home_location,work_location,team,company,pay_group"),

    HOME_LOCATION_WORK_LOCATION_TEAM_PAY_GROUP("home_location,work_location,team,pay_group"),

    MANAGER("manager"),

    MANAGER_COMPANY("manager,company"),

    MANAGER_COMPANY_PAY_GROUP("manager,company,pay_group"),

    MANAGER_PAY_GROUP("manager,pay_group"),

    MANAGER_TEAM("manager,team"),

    MANAGER_TEAM_COMPANY("manager,team,company"),

    MANAGER_TEAM_COMPANY_PAY_GROUP("manager,team,company,pay_group"),

    MANAGER_TEAM_PAY_GROUP("manager,team,pay_group"),

    PAY_GROUP("pay_group"),

    TEAM("team"),

    TEAM_COMPANY("team,company"),

    TEAM_COMPANY_PAY_GROUP("team,company,pay_group"),

    TEAM_PAY_GROUP("team,pay_group"),

    WORK_LOCATION("work_location"),

    WORK_LOCATION_COMPANY("work_location,company"),

    WORK_LOCATION_COMPANY_PAY_GROUP("work_location,company,pay_group"),

    WORK_LOCATION_MANAGER("work_location,manager"),

    WORK_LOCATION_MANAGER_COMPANY("work_location,manager,company"),

    WORK_LOCATION_MANAGER_COMPANY_PAY_GROUP("work_location,manager,company,pay_group"),

    WORK_LOCATION_MANAGER_PAY_GROUP("work_location,manager,pay_group"),

    WORK_LOCATION_MANAGER_TEAM("work_location,manager,team"),

    WORK_LOCATION_MANAGER_TEAM_COMPANY("work_location,manager,team,company"),

    WORK_LOCATION_MANAGER_TEAM_COMPANY_PAY_GROUP("work_location,manager,team,company,pay_group"),

    WORK_LOCATION_MANAGER_TEAM_PAY_GROUP("work_location,manager,team,pay_group"),

    WORK_LOCATION_PAY_GROUP("work_location,pay_group"),

    WORK_LOCATION_TEAM("work_location,team"),

    WORK_LOCATION_TEAM_COMPANY("work_location,team,company"),

    WORK_LOCATION_TEAM_COMPANY_PAY_GROUP("work_location,team,company,pay_group"),

    WORK_LOCATION_TEAM_PAY_GROUP("work_location,team,pay_group");

    private final String value;

    EmployeesRetrieveRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
