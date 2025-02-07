abstract class AbsTest implements Testable {
   
   
}

class TestSub extends AbsTest {

    @Override
    public void display() {
        System.out.println("Display method implemented in TestSub class.");
    }
}


public class Maain {
    public static void main(String[] args) {
        TestSub testSub = new TestSub();
        testSub.display();  
    }
}
