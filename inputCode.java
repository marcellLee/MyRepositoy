public class Foo {
  public static void bar() { // Ncss = 252: reported!
    boolean a, b = true;
    int qwerty;
    try { // 2 * 2 + 2 = 6
      if (true) { // 2
        List buz = new ArrayList();
      }

      for(int i = 0; i < 19; i++) { // * 2
        List buz = new ArrayList();
      }
    } catch(Exception e) {
      if (true) { // 2
        e.printStackTrace();
      }
    }

    while (j++ < 20) { //  * 2
      List buz = new ArrayList();
    }

    switch(j) { // * 7
      case 1:
      case 2: break;
      case 3: j = 5; break;
      case 4: if (b && a) { bar(); } break;
      default: break;
    }

    do { // * 3
        List buz = new ArrayList();
    } while (a && j++ < 30);
  }
}
