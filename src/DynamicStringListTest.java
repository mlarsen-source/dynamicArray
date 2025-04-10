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

  // tests for add method
  
  @Test
  void testAddNoResize()
  {
    DynamicStringList testList = new DynamicStringList();
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");
   
    String actual =  testList.get(3);

    assertEquals("test", actual);
  }

  @Test
  void testAddYesResize()
  {
    DynamicStringList testList = new DynamicStringList();
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");
    testList.add("of");
    testList.add("our");
    testList.add("Dynamic");
    testList.add("String");
    testList.add("List");
    testList.add("for");
    testList.add("practice");
    testList.add("and");
    testList.add("learning");
   
    String actual =  testList.get(11);

    assertEquals("and", actual);
  }

  @Test
  void testRemoveInBounds()
  {
    DynamicStringList testList = new DynamicStringList();
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");
   
    String actual =  testList.remove(3);

    assertEquals("test", actual);
  }

  @Test
  void testRemoveOutOfBounds() 
  {
    DynamicStringList testList = new DynamicStringList();
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");
   
    assertThrows(IndexOutOfBoundsException.class, () -> {
      testList.remove(18);
    });
  }

  @Test
  void testSize() 
  {
    DynamicStringList testList = new DynamicStringList();
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");
 
    int actual =  testList.size();

    assertEquals(4, actual);
  }

  // tests for capacity method
  @Test
  void testCapacityNoResize()
  {
    DynamicStringList testList = new DynamicStringList();
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");
 
    int actual =  testList.capacity();
 
    assertEquals(10, actual);
  }
 
  @Test
  void testCapacityResize()
  {
    DynamicStringList testList = new DynamicStringList();
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");
    testList.add("of");
    testList.add("our");
    testList.add("Dynamic");
    testList.add("String");
    testList.add("List");
    testList.add("for");
    testList.add("practice");
    testList.add("and");
    testList.add("learning");
  
    int actual =  testList.capacity();
 
    assertEquals(20, actual);
  }
  @Test
  void testCapacityResizeAgain()
  {
    DynamicStringList testList = new DynamicStringList();
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");
    testList.add("of");
    testList.add("our");
    testList.add("Dynamic");
    testList.add("String");
    testList.add("List");
    testList.add("for");
    testList.add("practice");
    testList.add("and");
    testList.add("learning");
    testList.add("This");
    testList.add("is");
    testList.add("a");
    testList.add("test");
    testList.add("of");
    testList.add("our");
    testList.add("Dynamic");
    testList.add("String");
    testList.add("List");
  
    int actual =  testList.capacity();
 
    assertEquals(40, actual);
  }
  


}




