package core;


import javax.swing.*;

public class controller{

      private static  model Model;
      private static view View;
      public controller(model m, view v) {
          Model = m;
          View = v;
      }

      private void initView() {
      }

    private void saveNumber1() {
        Model.setNumber1(View.getNb1().getText());

    }

    private void saveNumber2() {
        Model.setNumber2(View.getNb2().getText());

    }

    private void printResultat() {

    }
  }