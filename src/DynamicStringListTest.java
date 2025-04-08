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
 
    String actual =  testList.get(2);

    assertEquals("a", actual);
  }


  @Test
  void testGetOutOfBoundsIndex() 
  {
  
    DynamicStringList testList = new DynamicStringList();
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");
   
    assertThrows(IndexOutOfBoundsException.class, () -> {
      testList.get(18);
    });
  }




}




