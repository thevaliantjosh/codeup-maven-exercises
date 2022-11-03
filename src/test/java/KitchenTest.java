import org.junit.*;
import static org.junit.Assert.*;

public class KitchenTest {
    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow corn");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("blue corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("flower");
        kitchenWithMany.add("white corn");
    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
    }

    @Test
    public void testSize(){
        assertEquals(0, emptyKitchen.size());
        assertEquals(1, kitchenWithOne.size());

        assertEquals(4, kitchenWithMany.size());
    }

    @Test
    public void testAdd(){
        //Making sure the empty kitchen returns true:
        assertTrue(emptyKitchen.isEmpty());

        //Add any tortilla to make it not empty anymore
        emptyKitchen.add("Flower Tortilla");

        //Making sure the empyKitchen returns false once we add an element to it
        assertFalse(emptyKitchen.isEmpty());

        //Making sure the other instances of are not empty since they added items in the setUp method
        assertFalse(kitchenWithOne.isEmpty());
        assertFalse(kitchenWithMany.isEmpty());
    }

    @Test
    public void testRemove(){
        //Trying to pop from an empty kitchen
        emptyKitchen.pop(); //This will not work on its own
        //The void method should catch the if statement and the size should still be 0
        assertEquals(0, emptyKitchen.size());

        kitchenWithOne.pop();
        assertEquals(0, kitchenWithOne.size());

        kitchenWithMany.pop();
        assertEquals(3, kitchenWithMany.size());
    }

    @Test
    public void testContains(){
        assertFalse(emptyKitchen.contains("blue corn"));
        assertTrue(kitchenWithOne.contains("yellow corn"));
        assertTrue(kitchenWithMany.contains("white corn"));
    }




}
