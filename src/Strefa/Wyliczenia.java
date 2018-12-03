package Strefa;

public class Wyliczenia {

    public static void main(String[] args) {
        Superbohater superbohater = Superbohater.SUPERMAN;

        switch(superbohater){
            case BATMAN:
                System.out.println(Superbohater.BATMAN.getMoc());
                break;
            case SUPERMAN:
                System.out.println(Superbohater.SUPERMAN.getMoc());
                break;
            case SPIDERMAN:
                System.out.println(Superbohater.SPIDERMAN.getMoc());
                break;
                default:
                    break;
        }
    }


}
