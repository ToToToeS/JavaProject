public class Continue_break {
  /*  public static void main(String[] args) {
        int i = 0;
        while(true){
            System.out.println(i);
            i++;
            if (i > 10)
            {
                break;
            }
        }
    }*/
    public static void main(String[] args){
        for (int i = 0; i<15; i++)
        {
            if(i%2 == 0){
                continue; // Возращает ход программы обратно к циклу фор(отмеченно если навести на continue)
            }
            System.out.printf("Нечетное число "+i+"\n");
        }
    }
}
