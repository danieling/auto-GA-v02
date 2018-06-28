package org.umssdiplo.automationv01.core.managepage.organizationalstructuremenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class EmployeeList extends BasePage {
    @FindBy(xpath = "//table[@class='table table-sm table-hover']")
    private WebElement listEmployees;

    public EmployeePage selectEmployee(String name) {   // navigate until the employee form
        System.out.println("//td[contains(text(),'" + name + "')]");
        WebElement sCellValue = listEmployees.findElement(By.xpath("//td[contains(text(),'" + name + "')]"));
        System.out.println(sCellValue.toString());
        WebElement editButton = sCellValue.findElement(By.xpath("//i[@class='fa fa-pencil-square-o']"));
        System.out.println(editButton.toString());
        CommonEvents.jsClickElement(editButton);
        // update salary
        return new EmployeePage();
    }
}
