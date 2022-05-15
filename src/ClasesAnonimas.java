public class ClasesAnonimas {
    /*
     * Son clases que se ejecutan una sola, ves, se llaman al vuelo
     *
     * */
    public static void main(String[] args) {
        Arte arte = new Arte() {
            @Override
            public String verObraArte() {
                return "Hola implementacion de obra arte aninima";
            }
        };

        System.out.println("arte.verObraArte() = " + arte.verObraArte());
    }
}


abstract class Arte {
     abstract public String verObraArte();
    
}