import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import static org.junit.Assert.*;

public class Tester {
    private  Database database;
    @Before
    public void setDatabase(){
        database = new Database();
    }
    @Test
    public void addTraderToEmptyDatabase(){
        database.clear();
        assertEquals(0, database.size());
        Handlowiec trader = new Handlowiec("15242160793","Dwight","Schrute", new BigDecimal(1700),"123-654-789",new BigDecimal(150),new BigDecimal(7));
        database.addEmployee(trader);
        assertEquals(1, database.size());
        database.clear();
    }
    @Test
    public void addDirectorToEmptyDatabase(){
        database.clear();
        assertEquals(0, database.size());
        Dyrektor director = new Dyrektor("80092981991","Michael","Scott", new BigDecimal(4500),"123-456-999",new BigDecimal(200),"986-343",new BigDecimal(100));
        database.addEmployee(director);
        assertEquals(1, database.size());
        database.clear();
    }

    @Test
    public void addTraderToDatabaseWithOtherEmployees(){
        Handlowiec trader1 = new Handlowiec("03282011793","Jim","Halpert", new BigDecimal(1500),"123-456-789",new BigDecimal(150),new BigDecimal(7));
        Dyrektor director1 = new Dyrektor("80092981991","Michael","Scott", new BigDecimal(4500),"123-456-999",new BigDecimal(200),"986-343",new BigDecimal(100));
        Dyrektor director2 = new Dyrektor("05241117834","Robert","California", new BigDecimal(3500),"143-456-999",new BigDecimal(190),"980-343",new BigDecimal(90));
        database.addEmployee(trader1);
        database.addEmployee(director1);
        database.addEmployee(director2);
        int size = database.size();
        Handlowiec trader2 = new Handlowiec("15242160793","Dwight","Schrute", new BigDecimal(1700),"123-654-789",new BigDecimal(150),new BigDecimal(7));
        database.addEmployee(trader2);
        assertEquals(size+1,database.size());
        database.clear();
    }

    @Test
    public void addDirectorToDatabaseWithOtherEmployees(){
        Handlowiec trader1 = new Handlowiec("03282011793","Jim","Halpert", new BigDecimal(1500),"123-456-789",new BigDecimal(150),new BigDecimal(7));
        Dyrektor director1 = new Dyrektor("80092981991","Michael","Scott", new BigDecimal(4500),"123-456-999",new BigDecimal(200),"986-343",new BigDecimal(100));
        Handlowiec trader2 = new Handlowiec("15242160793","Dwight","Schrute", new BigDecimal(1700),"123-654-789",new BigDecimal(150),new BigDecimal(7));
        database.addEmployee(trader1);
        database.addEmployee(director1);
        database.addEmployee(trader2);
        int size = database.size();
        Dyrektor director2 = new Dyrektor("05241117834","Robert","California", new BigDecimal(3500),"143-456-999",new BigDecimal(190),"980-343",new BigDecimal(90));
        database.addEmployee(director2);
        assertEquals(size+1,database.size());
        database.clear();
    }

    @Test
    public void addTenRandomEmployeesToEmptyDatabase(){
        Handlowiec trader1 = new Handlowiec("03282011793","Jim","Halpert", new BigDecimal(1500),"123-456-789",new BigDecimal(150),new BigDecimal(7));
        Dyrektor director1 = new Dyrektor("80092981991","Michael","Scott", new BigDecimal(4500),"123-456-999",new BigDecimal(200),"986-343",new BigDecimal(100));
        Handlowiec trader2 = new Handlowiec("15242160793","Dwight","Schrute", new BigDecimal(1700),"123-654-789",new BigDecimal(150),new BigDecimal(7));
        Dyrektor director2 = new Dyrektor("05241117834","Robert","California", new BigDecimal(3500),"143-456-999",new BigDecimal(190),"980-343",new BigDecimal(90));
        Dyrektor director3 = new Dyrektor("94050104661","Janet","Levinson", new BigDecimal(3000),"143-444-999",new BigDecimal(160),"980-000",new BigDecimal(95));
        Handlowiec trader3 = new Handlowiec("95043037348","Pam","Beesly", new BigDecimal(1700),"132-654-789",new BigDecimal(150),new BigDecimal(7));
        Handlowiec trader4 = new Handlowiec("06280472779","Andy","Bernard", new BigDecimal(1700),"193-654-789",new BigDecimal(150),new BigDecimal(7));
        Handlowiec trader5 = new Handlowiec("52100876098","Stanley","Hudson", new BigDecimal(1700),"923-654-789",new BigDecimal(150),new BigDecimal(7));
        Handlowiec trader6 = new Handlowiec("87011162572","Ryan","Howard", new BigDecimal(1700),"183-654-789",new BigDecimal(150),new BigDecimal(7));
        Handlowiec trader7 = new Handlowiec("94022625057","Toby","Flenderson", new BigDecimal(1700),"543-654-789",new BigDecimal(150),new BigDecimal(7));
        database.addEmployee(trader1);
        assertEquals(1,database.size());
        database.addEmployee(director1);
        assertEquals(2,database.size());
        database.addEmployee(director2);
        assertEquals(3,database.size());
        database.addEmployee(director3);
        assertEquals(4,database.size());
        database.addEmployee(trader2);
        assertEquals(5,database.size());
        database.addEmployee(trader3);
        assertEquals(6,database.size());
        database.addEmployee(trader4);
        assertEquals(7,database.size());
        database.addEmployee(trader5);
        assertEquals(8,database.size());
        database.addEmployee(trader6);
        assertEquals(9,database.size());
        database.addEmployee(trader7);
        assertEquals(10,database.size());
        database.clear();
    }

    @Test
    public void deleteRandomTraderFromDatabase(){
        Handlowiec trader1 = new Handlowiec("03282011793","Jim","Halpert", new BigDecimal(1500),"123-456-789",new BigDecimal(150),new BigDecimal(7));
        Dyrektor director1 = new Dyrektor("80092981991","Michael","Scott", new BigDecimal(4500),"123-456-999",new BigDecimal(200),"986-343",new BigDecimal(100));
        Handlowiec trader2 = new Handlowiec("15242160793","Dwight","Schrute", new BigDecimal(1700),"123-654-789",new BigDecimal(150),new BigDecimal(7));
        Dyrektor director2 = new Dyrektor("05241117834","Robert","California", new BigDecimal(3500),"143-456-999",new BigDecimal(190),"980-343",new BigDecimal(90));
        Dyrektor director3 = new Dyrektor("94050104661","Janet","Levinson", new BigDecimal(3000),"143-444-999",new BigDecimal(160),"980-000",new BigDecimal(95));
        Handlowiec trader3 = new Handlowiec("95043037348","Pam","Beesly", new BigDecimal(1700),"132-654-789",new BigDecimal(150),new BigDecimal(7));
        Handlowiec trader4 = new Handlowiec("06280472779","Andy","Bernard", new BigDecimal(1700),"193-654-789",new BigDecimal(150),new BigDecimal(7));
        Handlowiec trader5 = new Handlowiec("52100876098","Stanley","Hudson", new BigDecimal(1700),"923-654-789",new BigDecimal(150),new BigDecimal(7));
        Handlowiec trader6 = new Handlowiec("87011162572","Ryan","Howard", new BigDecimal(1700),"183-654-789",new BigDecimal(150),new BigDecimal(7));
        Handlowiec trader7 = new Handlowiec("52100876098","Toby","Flenderson", new BigDecimal(1700),"543-654-789",new BigDecimal(150),new BigDecimal(7));
        database.addEmployee(trader1);
        database.addEmployee(director1);
        database.addEmployee(director2);
        database.addEmployee(director3);
        database.addEmployee(trader2);
        database.addEmployee(trader3);
        database.addEmployee(trader4);
        database.addEmployee(trader5);
        database.addEmployee(trader6);
        database.addEmployee(trader7);
        int size = database.size();
        database.removeEmployee(database.searchEmployee("52100876098"));
        assertEquals(size -1,database.size());
        database.clear();
    }


    @Test
    public void deleteRandomDirectorFromDatabase(){
        Handlowiec trader1 = new Handlowiec("03282011793","Jim","Halpert", new BigDecimal(1500),"123-456-789",new BigDecimal(150),new BigDecimal(7));
        Dyrektor director1 = new Dyrektor("80092981991","Michael","Scott", new BigDecimal(4500),"123-456-999",new BigDecimal(200),"986-343",new BigDecimal(100));
        Handlowiec trader2 = new Handlowiec("15242160793","Dwight","Schrute", new BigDecimal(1700),"123-654-789",new BigDecimal(150),new BigDecimal(7));
        Dyrektor director2 = new Dyrektor("05241117834","Robert","California", new BigDecimal(3500),"143-456-999",new BigDecimal(190),"980-343",new BigDecimal(90));
        Dyrektor director3 = new Dyrektor("94050104661","Janet","Levinson", new BigDecimal(3000),"143-444-999",new BigDecimal(160),"980-000",new BigDecimal(95));
        Handlowiec trader3 = new Handlowiec("95043037348","Pam","Beesly", new BigDecimal(1700),"132-654-789",new BigDecimal(150),new BigDecimal(7));
        Handlowiec trader4 = new Handlowiec("06280472779","Andy","Bernard", new BigDecimal(1700),"193-654-789",new BigDecimal(150),new BigDecimal(7));
        Handlowiec trader5 = new Handlowiec("52100876098","Stanley","Hudson", new BigDecimal(1700),"923-654-789",new BigDecimal(150),new BigDecimal(7));
        Handlowiec trader6 = new Handlowiec("87011162572","Ryan","Howard", new BigDecimal(1700),"183-654-789",new BigDecimal(150),new BigDecimal(7));
        Handlowiec trader7 = new Handlowiec("52100876098","Toby","Flenderson", new BigDecimal(1700),"543-654-789",new BigDecimal(150),new BigDecimal(7));
        database.addEmployee(trader1);
        database.addEmployee(director1);
        database.addEmployee(director2);
        database.addEmployee(director3);
        database.addEmployee(trader2);
        database.addEmployee(trader3);
        database.addEmployee(trader4);
        database.addEmployee(trader5);
        database.addEmployee(trader6);
        database.addEmployee(trader7);
        int size = database.size();
        database.removeEmployee(database.searchEmployee("94050104661"));
        assertEquals(size -1,database.size());
        database.clear();
    }


    @ParameterizedTest
    @ValueSource(strings = {"94022625057", "97013076739", "05262587650", "62071000790", "01290481296", "00231080392", "52031597291", "13282074779", "67092897604", "82062696500"})
    public void checkValidPESEL(String p) throws Exception{
        assertTrue(Controller.checkPesel(p));
    }

    @ParameterizedTest
    @ValueSource(strings = {"94022625056", "9701307679", "05262517650", "62091000790", "01290401296", "00231080391", "42031597291", "14282074779", "67092897607", "82062696590"})
    public void checkInvalidPESEL(String p) throws Exception{
        assertFalse(Controller.checkPesel(p));
    }



}
