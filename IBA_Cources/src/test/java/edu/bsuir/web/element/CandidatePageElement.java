package edu.bsuir.web.element;

import edu.bsuir.element.Element;
import org.openqa.selenium.By;

public class CandidatePageElement {


    public static final Element BUTTON_BACK_TO_LIST = new Element("Вернуться к списку", By.xpath("//div//a[contains(@href,'candidates') and img[contains(@src,'back')] ]"));

    public static final Element BUTTON_DELELE_CLOSE = new Element("Закрыть окно удаления", By.xpath("//button[@class='btn close close-content yui3-widget btn-content']"));
    public static final Element BUTTON_DELELE = new Element("Удалить", By.xpath("//div//a[@id='removeButton']"));
    public static final Element BUTTON_DELETE_CANCEL = new Element("Отменить удаление", By.xpath("//button[@class='btn btn-default btn-default-content yui3-widget btn-content']"));
    public static final Element BUTTON_DELETE_OK = new Element("Удалить подтверждение", By.xpath("//button[@class='btn btn-danger btn-danger-content yui3-widget btn-content']"));
    public static final Element BUTTON_EDIT = new Element("Редактировать", By.xpath("//div//a[@id='editButton']"));

    public static final Element PHOTO = new Element("Фото", By.xpath("//div[@id='profilePhoto']//img"));
    public static final Element BUTTON_CHANGE_PHOTO = new Element("Загрузить фото", By.xpath("//span[@id='changeImgLink']"));

    public static final Element BUTTON_EXPORT = new Element("Скачать резюме", By.xpath("//div[@id='exportProfileTo']//button"));
    public static final Element BUTTON_EXPORT_PDF = new Element("Скачать резюме pdf", By.xpath("//div[@id='printButtonPDF']"));
    public static final Element BUTTON_EXPORT_EXCEL = new Element("Скачать резюме excel", By.xpath("//div[@id='printButtonExcel']"));
    public static final Element BUTTON_EXPORT_WORD = new Element("Скачать резюме word", By.xpath("//div[@id='printButtonWord']"));

    public static final Element BUTTON_TAB_COMMENT = new Element("Кнопка комментарии", By.xpath("//div[@id='myTab']//a[@href='#tab-4']"));

    public static final Element TEXTAREA_COMMENT = new Element("Поле коментарий", By.xpath("//div[@id='allComments']//textarea"));
    public static final Element BUTTON_COMMENT = new Element("Добавить коментарий", By.xpath("//div[@id='allComments']//div[@class='comment-buttons pull-right']//a"));

    public static final Element BUTTON_LOAD_SV = new Element("Загрузить резюме", By.xpath("//div[@id='buttonsBar']//span[@id='loadCVLink']"));
    public static final Element BUTTON_LOAD_SV_CANCEL = new Element("Загрузить резюме отмена", By.xpath("//div[@id='buttonsBar']//span[@id='cancelButton']"));
    public static final Element BUTTON_LOAD_SV_OK = new Element("Загрузить резюме Продолжить", By.xpath(" //div[@id='buttonsBar']//span[@id='cancelButton']"));

    public static final Element BUTTON_EDIT_CANCEL = new Element("Редактирование отмена", By.xpath("//div[@id='buttonsBar']//a[@id='cancelButton']"));
    public static final Element BUTTON_EDIT_SAVE = new Element("Редактирование сохранить", By.xpath("//div[@id='buttonsBar']//a[@id='saveButton']"));


    public static final Element SURNAME = new Element("Фамилия", By.xpath("//input[@id='surname']"));
    public static final Element NAME = new Element("Имя", By.xpath("//input[@id='name']"));
    public static final Element SECOND_NAME = new Element("Отчество", By.xpath("//input[@id='secondName']"));
    public static final Element PHONE = new Element("Телефон", By.xpath("//input[@id='primaryTelephone']"));
    public static final Element PHONE_SECOND = new Element("Телефон", By.xpath("//input[@id='telephone']"));
    public static final Element BUTTON_PHONE_ADD = new Element("Телефон добавить", By.xpath("//i[@id='addTelephoneButton']"));

    public static final Element BUTTON_PHONE_DELETE = new Element("Телефон удалить", By.xpath("//i[@id='removeTel']"));
    public static final Element EMAIL = new Element("Почта", By.xpath("//input[@id='primaryEmail']"));
    public static final Element SKYPE = new Element("Скайп", By.xpath("//input[@id='skype']"));
    public static final Element COUNTRY = new Element("Страна", By.xpath("//input[@id='country']"));
    public static final Element CITY = new Element("Город", By.xpath("//input[@id='city']"));
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
    public static final Element DESCRIPTION = new Element("Описание работы", By.xpath("//textarea[@id='description']"));


    public static final Element BUTTON_COMPETENCE = new Element("Кнопка компетенции", By.xpath("//a[@href='#tab-1']"));








}
