package edu.bsuir.web.element;

import edu.bsuir.element.Element;
import org.openqa.selenium.By;

public class CandidatePageElement {


    public static final String URL ="http://testing.cld.iba.by/web/guest/recruiting/candidates/-/candidates/createProfile";

    public static final Element SURNAME = new Element("Фамилия", By.xpath("//*[@id=\"surname\"]"));

    public static final Element NAME = new Element("Имя", By.xpath("//*[@id=\"name\"]"));

    public static final Element PHONE = new Element("Телефон", By.xpath("//*[@id=\"primaryTelephone\"]"));

    public static final Element EMAIL = new Element("Почта", By.xpath("//*[@id=\"primaryEmail\"]"));

    public static final Element SKYPE = new Element("Почта", By.xpath("//*[@id=\"skype\"]"));

    public static final Element COUNTRY = new Element("Страна", By.xpath("//*[@id=\"country\"]"));

    public static final Element CITY = new Element("Город", By.xpath("//*[@id=\"city\"]"));

    public static final Element ADD_EDUCATION_BUTTON = new Element("Образование", By.xpath("//a[@href=\"#tab-8\"]"));
    public static final Element CHOOSE_START_EDUCATION_BUTTON = new Element("Выбор начала учебы", By.xpath("//*[@id=\"startYear\"]/option[13]"));
    public static final Element CHOOSEN_FINISH_EDUCATION_BUTTON = new Element("Выбор окончания учебы", By.xpath("//*[@id=\"endYear\"]/option[7]"));
    public static final Element ADD_INFORMATION_ABOUT_EXPERIENCE = new Element("Добавить информацию об опыте", By.xpath("//*[@id=\"addWorkingExpButton\"]"));
    public static final Element ADD_POSITION = new Element("Должность", By.xpath("//*[@id=\"position\"]"));
     public static final Element DELETED_WORKING_INFORMATION = new Element("Удаление всей информации", By.xpath("//span[@class='remove remove-link remove-work-exp']"));


    public static final Element RECOMINDATION_BUTTON = new Element("Рекомендации", By.xpath("//a[@href=\"#tab-6\"]"));
    public static final Element ADD_POSITION_RECOMINDATION = new Element("Должность", By.xpath("//*[@id=\"recPosition\"]"));
    public static final Element ADD_COMPANY_RECOMINDATION = new Element("Компания", By.xpath("//*[@id=\"recCompany\"]"));
    public static final Element ADD_PHONE_RECOMINDATION = new Element("Телефон", By.xpath("//*[@id=\"recTelephone\"]"));
    public static final Element SAVE_BUTTON = new Element("Сохранить", By.xpath("//*[@id=\"saveButton\"]"));


    public static final Element BUTTON_DELETE_OK = new Element("Вернуться к списку", By.xpath("//button[contains(text(),'Удалить')]"));

    public static final Element BUTTON_DELETE_CANDIDATE = new Element("Вернуться к списку", By.xpath("//a[@id=\"removeButton\"]"));

    public static final Element BUTTON_BACK_TO_LIST = new Element("Вернуться к списку", By.xpath("//div//a[contains(@href,'candidates') and img[contains(@src,'back')] ]"));

     public static final Element BUTTON_EDIT = new Element("Редактировать", By.xpath("//div//a[@id='editButton']"));
    public static final Element PHOTO = new Element("Фото", By.xpath("//div[@id='profilePhoto']//img"));
    public static final Element BUTTON_CHANGE_PHOTO = new Element("Загрузить фото", By.xpath("//span[@id='changeImgLink']"));
   public static final Element TEXTAREA_COMMENT = new Element("Поле коментарий", By.xpath("//div[@id='allComments']//textarea"));

    public static final Element BUTTON_LOAD_SV = new Element("Загрузить резюме", By.xpath("//div[@id='buttonsBar']//span[@id='loadCVLink']"));
    public static final Element BUTTON_LOAD_SV_CANCEL = new Element("Загрузить резюме отмена", By.xpath("//div[@id='buttonsBar']//span[@id='cancelButton']"));
    public static final Element BUTTON_LOAD_SV_OK = new Element("Загрузить резюме Продолжить", By.xpath(" //div[@id='buttonsBar']//span[@id='cancelButton']"));

    public static final Element BUTTON_EDIT_CANCEL = new Element("Редактирование отмена", By.xpath("//div[@id='buttonsBar']//a[@id='cancelButton']"));


    public static final Element SECOND_NAME = new Element("Отчество", By.xpath("//input[@id='secondName']"));
    public static final Element PHONE_SECOND = new Element("Телефон", By.xpath("//input[@id='telephone']"));
    public static final Element BUTTON_PHONE_ADD = new Element("Телефон добавить", By.xpath("//i[@id='addTelephoneButton']"));

    public static final Element BUTTON_PHONE_DELETE = new Element("Телефон удалить", By.xpath("//i[@id='removeTel']"));
   public static final Element RELOCATION = new Element("Адрес", By.xpath("//input[@id='relocation']"));

    public static final Element BD_DAY = new Element("Дата Рождения ДЕНЬ", By.xpath("//input[@id='dateOfBirthDay']"));
    public static final Element BD_MONTH = new Element("Дата Рождения  МЕСЯЦ", By.xpath("//input[@id='dateOfBirthMonth']"));
    public static final Element BD_YEAR = new Element("Дата Рождения  ГОД", By.xpath("//input[@id='dateOfBirthYear']"));
    public static final Element EDUCATION = new Element("Образование", By.xpath("//select[@id='education']"));
    public static final Element DESIRED_POSITION = new Element("Желаемая долджность", By.xpath("//input[@id='desiredPosition']"));
    public static final Element BUTTON_COMPETENCE_EDIT = new Element("Редактировать компетенцию", By.xpath("//a[@id='editCompetence']"));

    public static final Element UNIVERSITY = new Element("Университет", By.xpath("//input[@id='university']"));
    public static final Element FACULTY = new Element("Факультет", By.xpath("//input[@id='faculty']"));
    public static final Element SPECIALIZATION = new Element("Специальность", By.xpath("//input[@id='specialization']"));
    public static final Element UNIVERSITY_START_YEAR = new Element("Год начала обучения", By.xpath("//select[contains(@id,'startYear')]"));
    public static final Element UNIVERSITY_END_YEAR = new Element("Год окончания обучения", By.xpath("//select[contains(@id,'endYear')]"));
    public static final Element BUTTON_EDUCATION_REMOVE = new Element("Удалить образование", By.xpath("//span[contains(@id,'removeEducation')]"));

    public static final Element BUTTON_DELETE_PHONE = new Element("Удалить телефон", By.xpath("//span[contains(@id,'addEducationDetailsButton')]"));

    public static final Element POSITION = new Element("Должность", By.xpath("//input[contains(@id,'position')]"));
    public static final Element COMPANY = new Element("Компания", By.xpath("//input[contains(@id,'company')]"));
    public static final Element JOB_START_MONTH = new Element("Начало работы месяц", By.xpath("//select[contains(@id,'startMonth')]"));
    public static final Element JOB_START_YEAR= new Element("Начало работы год", By.xpath("//div[@class='controls']//select[@id='startYear']"));
    public static final Element CHECKBOX_JOB_NOW = new Element("Работает по натсоящее время", By.xpath("//input[@id='tillNow']"));
    public static final Element JOB_END_MONTH = new Element("Конец работы месяц", By.xpath("//div[@class='controls']//select[@id='endMonth']"));
    public static final Element JOB_END_YEAR = new Element("Конец работы год", By.xpath("//div[@class='controls']//select[@id='endYear']"));
    public static final Element DESCRIPTION_JOB = new Element("Описание работы", By.xpath("//textarea[@id='description']"));


    public static final Element BUTTON_COMPETENCE = new Element("Кнопка компетенции", By.xpath("//a[@href='#tab-1']"));


    public static final Element ERROR_MESSAGE = new Element("Кнопка компетенции", By.xpath("//tc-alert[@type='danger']//div[@class='message']//span"));
    public static final Element SUCCESS_MESSAGE = new Element("Кнопка компетенции", By.xpath("//tc-alert[@type='success']//div[@class='message']//span"));

    public static final Element TAB_EDUCATION =     new Element("",By.xpath("//a[@href = '#tab-8']"));
    public static final Element TAB_EXPIRIENCE = new Element("",By.xpath("//a[@href = '#tab-2']"));
    public static final Element TAB_MOTIVATION = new Element("",By.xpath("//a[@href = '#tab-3']"));
    public static final Element TAB_RECOMMENDATIONS = new Element("",By.xpath("//a[@href = '#tab-6']"));

    public static final String URL_CANDIDATE = "http://testing.cld.iba.by/web/guest/recruiting/candidates/-/candidates/232";

    public static final Element ATTACH_FILE = new Element("",By.xpath("//span//i[@class=\"fa fa-plus add-attachment\"]"));



}
