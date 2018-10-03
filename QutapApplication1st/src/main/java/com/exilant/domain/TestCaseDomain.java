package com.exilant.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="TestCase")
public class TestCaseDomain {
	@Id
	private String testCaseID;
	private String requirementId;
	private String testScenarioId;
	private String testCaseDescription;
	private String testCaseCategory;
	private String testCasePriority;
	private String testCaseTag;
	private String testSteps;
	private String testData;
	private String expectedResult;
	
	public String getTestCaseID() {
		return testCaseID;
	}
	public void setTestCaseID(String testCaseID) {
		this.testCaseID = testCaseID;
	}
	public String getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(String requirementId) {
		this.requirementId = requirementId;
	}
	public String getTestScenarioId() {
		return testScenarioId;
	}
	public void setTestScenarioId(String testScenarioId) {
		this.testScenarioId = testScenarioId;
	}
	public String getTestCaseDescription() {
		return testCaseDescription;
	}
	public void setTestCaseDescription(String testCaseDescription) {
		this.testCaseDescription = testCaseDescription;
	}
	public String getTestCaseCategory() {
		return testCaseCategory;
	}
	public void setTestCaseCategory(String testCaseCategory) {
		this.testCaseCategory = testCaseCategory;
	}
	public String getTestCasePriority() {
		return testCasePriority;
	}
	public void setTestCasePriority(String testCasePriority) {
		this.testCasePriority = testCasePriority;
	}
	public String getTestCaseTag() {
		return testCaseTag;
	}
	public void setTestCaseTag(String testCaseTag) {
		this.testCaseTag = testCaseTag;
	}
	
	public String getTestSteps() {
		return testSteps;
	}
	public void setTestSteps(String testSteps) {
		this.testSteps = testSteps;
	}
	public String getTestData() {
		return testData;
	}
	public void setTestData(String testData) {
		this.testData = testData;
	}
	public String getExpectedResult() {
		return expectedResult;
	}
	public void setExpectedResult(String expectedResult) {
		this.expectedResult = expectedResult;
	}
	

}

