package core;

public class principale {
    public static void main(String [] args) {
        model m = new model("10", "25");
        view v = new view("Jeudy Calculatrice");
        controller c = new controller(m, v);
    }
}
