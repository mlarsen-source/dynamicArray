import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DynamicStringListTest
{ 


  // tests for get method
  @Test
  void testGetInBoundsIndex() 
  {
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

  // tests for set method
  @Test
  void testSetInBoundsIndex() 
  {
    DynamicStringList testList = new DynamicStringList();
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");

    testList.set(2,"not a");
 
    String actual =  testList.get(2);

    assertEquals("not a", actual);
  }

  @Test
  void testSetOutOfBoundsIndex() 
  {
    DynamicStringList testList = new DynamicStringList();
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");
   
    assertThrows(IndexOutOfBoundsException.class, () -> {
      testList.set(4,"Not a");
    });
  }




}




