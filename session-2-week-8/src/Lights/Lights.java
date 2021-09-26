package Lights;

    public class Lights {
        public void lightColour() {
            System.out.println("The light colour is white");
        }
    }

    class blueLight extends Lights {
        public void lightColour() {
            System.out.println("The light colour is blue");
        }
    }

    class greenLight extends Lights {
        public void lightColour() {
            System.out.println("The light colour is green");
        }
    }

    class Main {
        public static void main(String[] args) {
            Lights white = new Lights ();
            Lights blue = new blueLight ();
            Lights green = new greenLight ();
            white.lightColour();
            blue.lightColour();
            green.lightColour();

        }

    }
