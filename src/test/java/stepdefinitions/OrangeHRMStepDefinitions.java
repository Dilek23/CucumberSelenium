package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OrangeHRMLoginPage;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class OrangeHRMStepDefinitions {
    /*
Tablo şekline bağlı olarak datalar;
List <List<String>> table
List <Map<String, String>> table
Map <String, String> table
Map <String, List<String>> table
Map <String, Map<String, String>> table
//Scenario Outline
Test verilerini tanımlamak için keyword (Examples) kullanılır.
Tüm test için çalışır.
Veri setindeki her satır bir senaryo görevi görür.
Data Table
Test verilerini tanımlamak için keyword kullanılmaz.
Yalnızca altında tanımlı olduğu step için çalışır.
//Scenario DataTable'lar, Scenario Outline kadar popüler değildir


  */


    @Given("kullanici HRMLogin sayfasina gider")
    public void kullaniciHRMLoginSayfasinaGider() {
       Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

    }

    @When("kullanici credentials girer")
    public void kullaniciCredentialsGirer(DataTable table) {
        //1.Yol-> List matoduyla table parccalama
     //  List<List<String>> data= table.asLists();
     //  for (List<String>satir:data){
     //      for (String hucre:satir){
     //          System.out.println(hucre+" - ");
     //      }
     //      System.out.println();
     //  }
       //2.->yol
       // String username=table.cell(1,0);
        //String password=table.cell(1,1);
       // System.out.println(username+" "+password);
        //3.Yol
          //int rowCount= table.height();
          //int colCount= table.width();
          //for (int i=1;i<rowCount;i++){
          //    for (int j = 0; j <colCount ; j++) {
          //      // Webelement işlemleri yapcaz
          //        table.cell(i,j);

        OrangeHRMLoginPage lp=new OrangeHRMLoginPage(Driver.getDriver());

          List<Map<String,String>>data=table.asMaps(String.class, String.class);
          for (Map<String,String> maps:data){
              String userId= maps.get("admin_id");
              String userpassword= maps.get("admin_pass");
              lp.typeUsrname(userId);
              lp.typePassword(userpassword);
              lp.clickLogin();
              System.out.println(maps);
          }
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));

    }

    @When("kullanici  invalid credentials girer")
    public void kullaniciInvalidCredentialsGirer(DataTable table) {
        OrangeHRMLoginPage lp=new OrangeHRMLoginPage(Driver.getDriver());
       List<List<String>> data=table.asLists();
        for (int row= 1; row< table.height() ; row++) {
            String username= table.cell(row,0);
            String password= table.cell(row,1);
            String errroEssage= table.cell(row,2);
            lp.typeUsrname(username);
            lp.typePassword(password);
            lp.clickLogin();
            lp.verifyErrMessage(errroEssage);

        }
    Driver.closeDriver();
        }
    }






