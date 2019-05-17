

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class SaveUserToDataBase {
    @InjectMocks
    public Database dbConnection;
    @Mock
  public Database db ;

    //@Mock private db.Connection mockConnection

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void saveUser()  {
       SaveUser savingUser=new SaveUser();
     savingUser.saveItems(88,"Noel","Maseko",dbConnection);
    }
    @Test
    public void saveUser2(){
        SaveUser savingTheUser= new SaveUser();
        savingTheUser.saveItems(6,"thirthy","three",dbConnection);
    }

}
