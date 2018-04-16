public class Bus {

    private Buschauffeur buschauffeur;
    private Mens[] stoelen = new Mens[24];

    public Bus(Buschauffeur buschauffeur) {

        this.buschauffeur = buschauffeur;

    }

    public void instappen(Mens mens1, Mens mens2, Mens mens3){

        instappen(mens1);
        instappen(mens2);
        instappen(mens3);

    }

    public int vrijePlek() {

        for (int i = 0; i < stoelen.length; i++) {

            if (stoelen[i] == null){

                return i;

            }

        }

        return -1;

    }

    public void instappen(Mens mens) {

        if (vrijePlek() == -1){

            System.out.println("De bus is vol");

        }

        this.stoelen[vrijePlek()] = mens;
        showInfo(mens);

    }

    public void showInfo(Mens mens){

        {

            System.out.println(mens.getName()+ " is ingestapt");

        }

    }

    private int getCount() {

        int aantal = 0;
        for (int i = 0; i < stoelen.length; i++) {

            Mens huidigestoelen = stoelen[i];
            if (huidigestoelen != null)
                aantal++;

        }

        return aantal;
    }

    public String toString() {

        return "Er zitten "+ getCount() +" Kinderen in de bus";

    }

}
