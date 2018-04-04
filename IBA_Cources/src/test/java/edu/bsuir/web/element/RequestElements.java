package edu.bsuir.web.element;

import edu.bsuir.element.Element;
import org.openqa.selenium.By;

public class RequestElements {
/*
    public static final By CREATE_BUTTON = By.xpath("//*[@id=\"addRequest\"]/div[2]/div[2]/a");

    public static final By POSITION = By.xpath("//*[@id=\"name\"]");
    public static final By CLOSING_DATE = By.xpath("//*[@id=\"plannedClosingDate\"]");

    public static final By PRIORITY_0 = By.xpath("//*[@id=\"priority-0\"]");
    public static final By PRIORITY_1 = By.xpath("//*[@id=\"priority-1\"]");
    public static final By PRIORITY_2 = By.xpath("//*[@id=\"priority-2\"]");

    public static final By QUANTITY = By.xpath("//*[@id=\"quantity\"]");
    public static final By REASON = By.xpath("//*[@id=\"creationReason\"]");

    public static final By CONTRACT_0 = By.xpath("//*[@id=\"contractType-0\"]");
    public static final By CONTRACT_1 = By.xpath("//*[@id=\"contractType-1\"]");
    public static final By CONTRACT_2 = By.xpath("//*[@id=\"contractType-2\"]");

    public static final By SALARY = By.xpath("//*[@id=\"salary\"]");
    public static final By SALARY_CURRENCY = By.xpath("//*[@id=\"currency\"]");

    public static final By JOB_TYPE = By.xpath("//*[@id=\"jobType\"]");
    public static final By EMPLOYEES = By.xpath("//*[@id=\"employees\"]");
    public static final By BUSINESS_TRIP = By.xpath("//*[@id=\"businessTrip\"]");

    public static final By PERIOD = By.xpath("//*[@id=\"probationPeriod\"]");
    public static final By RESPONSABILITIES = By.xpath("//*[@id=\"responsibilities\"]");

    public static final By CANDIDATE_INTERNAL = By.xpath("//*[@id=\"candidateTypeInternal\"]");
    public static final By CANDIDATE_EXTERNAL = By.xpath("//*[@id=\"candidateTypeExternal\"]");
    public static final By EDUCATION = By.xpath("//*[@id=\"education\"]");
    public static final By EDUCATION_SPECIALIZATION = By.xpath("//*[@id=\"educationSpecialization\"]");

    public static final By EXPIRIENCE = By.xpath("//*[@id=\"experience\"]");
    public static final By WORKING_EXPIRIENCE = By.xpath("//*[@id=\"priority.working.experience\"]");
    public static final By NONPRIORITY_EXPIRIENCE = By.xpath("//*[@id=\"undesirableWorkingExperience\"]");

    public static final By COMPRTENCE =  By.xpath("//*[@id=\"editrequiredCompetence\"]");
    public static final By SEARCH_COMPETENCE = By.xpath("//*[@id=\"searchCompetenceWord\"]");

    public static final By EDIT_COMPETENCE = By.xpath("//*[@id=\"editrequiredCompetence\"]");
    public static final By FILL_TEMPLATE = By.xpath("//*[@id=\"fillFromTemplate\"]");

    public static final By TEMPLATE_APPLICATION = By.xpath("//*[@id=\"templateApplications\"]");
    public static final By OK_BUTTON = By.xpath("//*[@class='btn btn-primary-modal']");
    public static final By CANCEL_BUTTON = By.xpath("//*[@class=\"btn btn-default btn-default-content\"]");
    public static final By CATEGORY_COMPETENCE = By.xpath("//*[@class='multiselect dropdown-toggle btn btn-default']");
    public static final By REGION_COMPETENCE = By.xpath("//*[@id=\"searchInput\"]");

    public static final By FILTER_SELECT_0 = By.xpath("//*[@id=\"func-area-filtermultiselect-0\"]");
    public static final By FILTER_SELECT_1 = By.xpath("//*[@id=\"func-area-filtermultiselect-1\"]");
    public static final By FILTER_SELECT_2 = By.xpath("//*[@id=\"func-area-filtermultiselect-2\"]");
    public static final By FILTER_SELECT_3 = By.xpath("//*[@id=\"func-area-filtermultiselect-3\"]");
    public static final By FILTER_SELECT_4 = By.xpath("//*[@id=\"func-area-filtermultiselect-4\"]");
    public static final By FILTER_SELECT_5 = By.xpath("//*[@id=\"func-area-filtermultiselect-5\"]");
    public static final By FILTER_SELECT_6 = By.xpath("//*[@id=\"func-area-filtermultiselect-6\"]");

    public static final By CLOSE_WND = By.xpath("//*[@class='btn close close-content yui3-widget btn-content']");

    public static final By ENGLISH_COMPETENCE =By.xpath("//*[@id=\"competence_222\"]");

    public static final By BUTTON = By.xpath("//*[@id=\"cancelButton\"]");
    public static final By COMMENT= By.xpath("//*[@id=\"comment\"]");
    public static final By BUTTON_SAVE =By.xpath("//*[@id=\"save\"]");

    public static final By TIMETABLE = By.xpath("//*[@id=\"timetable\"]");




 */


    public static final Element CREATE_API_BUTTON = new Element("button _create_api",By.xpath("//a[@class='btn btn-primary' and text()='Новая заявка']"));

    public static final Element NAME = new Element("name",By.xpath("//*[@id='name']"));
    public static final Element DATE = new Element("date",By.xpath("//*[@id='plannedClosingDate']"));
    public static final Element PRIORITY = new Element("priority",By.xpath("//div[./input[@id='priority-1']]"));
    public static final Element QUANTITY = new Element("quantity",By.xpath("//*[@id='quantity']"));
    public static final Element REASON = new Element("reasone",By.xpath("//*[@id='creationReason']"));
    public static final Element CONTRACT_TYPE = new Element("contract_type",By.xpath("//div[./input[@id='contractType-1']]"));
    public static final Element SALARY = new Element("salary",By.xpath("//*[@id='salary']"));
    public static final Element EMPLOYEES = new Element("employees",By.xpath("//*[@id='employees']"));
    public static final Element BUSINESS_TRIP = new Element("business_trip",By.xpath("//*[@id='businessTrip']"));
    public static final Element TIMETABLE = new Element("timetable",By.xpath("//*[@id='timetable']"));
    public static final Element PROBATION_PERIOD = new Element("probation_period",By.xpath("//*[@id='probationPeriod']"));
    public static final Element RESPONSIBILITIES = new Element("responsibilities",By.xpath("//*[@id='responsibilities']"));

    public static final Element CANDIDATE_TYPE_EXTERNAL = new Element("external_type",By.xpath("//div[./input[@id='candidateTypeExternal']]"));
    public static final Element CANDIDATE_TYPE_INTERNAL = new Element("internal_type",By.xpath("//div[./input[@id='candidateTypeInternal']]"));


    public static final Element EDUCATION_SPECIALIZATION = new Element("education_specialization",By.xpath("//*[@id='educationSpecialization']"));
    public static final Element PRIORITY_ORGANISATIONS = new Element("priority_organization",By.xpath("//*[@id='priority.working.experience']"));
    public static final Element UNDESIRABLE_WORKING_EXPERIENCE = new Element("undesirable_working_experience",By.xpath("//*[@id='undesirableWorkingExperience']"));
    public static final Element REQUIRED_COMPETENCE = new Element("required_competence",By.id("editrequiredCompetence"));
    public static final Element NOT_REQUIRED_COMPETENCE = new Element("not_required_competence",By.xpath("//*[@id='editnotRequiredCompetence']"));
    public static final Element COMMENT = new Element("comment",By.xpath("//*[@id='comment']"));

    public static final Element SAVE_BUTTON = new Element("save_button",By.xpath("//button[@class='btn btn-primary pull-right' and @id='save']"));
    public static final Element OK_BUTTON = new Element("ok_button",By.xpath("//button[text() = 'OK']"));

    public static Element BASIC = new Element("Basic",By.xpath("//span[text()='Базовые']"));
    public static Element LEARNABILITY =  new Element("Learnability",By.xpath("//span[text() = 'Обучаемость']"));

}
