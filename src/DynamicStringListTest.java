import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DynamicStringListTest
{ 

  @Test
  void testGetInBoundsIndex() 
  {
    // arrange

    DynamicStringList testList = new DynamicStringList();
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");
    // act
    String actual =  testList.get(2);
    //assert
    assertEquals("a", actual);
  }




}




