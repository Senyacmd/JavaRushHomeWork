package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zergMax = new Zerg();
        zergMax.name = "Max";
        
        Zerg zergBella = new Zerg();
        zergBella.name = "Bella";
        
        Zerg zergJack = new Zerg();
        zergJack.name = "Jack";

        Zerg zergLolo = new Zerg();
        zergLolo.name = "Lolo";

        Zerg zergPio = new Zerg();
        zergPio.name = "Pio";

        Zerg zergJoli = new Zerg();
        zergJoli.name = "Joli";

        Zerg zergMori = new Zerg();
        zergMori.name = "Mori";

        Zerg zergBilli = new Zerg();
        zergBilli.name = "Billi";

        Zerg zergJoy = new Zerg();
        zergJoy.name = "Joy";
        
        Zerg zergRon = new Zerg();
        zergRon.name = "Ron";


        Protos protosRijy = new Protos();
        protosRijy.name = "Rijy";

        Protos protosRiko = new Protos();
        protosRiko.name = "Riko";

        Protos protosKelli = new Protos();
        protosKelli.name = "Kelli";

        Protos protosRozy = new Protos();
        protosRozy.name = "Rozy";

        Protos protosSesi = new Protos();
        protosSesi.name = "Sesi";


        Terran terranMarty = new Terran();
        terranMarty.name = "Marty";

        Terran terranBony = new Terran();
        terranBony.name = "Bony";

        Terran terranLissa = new Terran();
        terranLissa.name = "Lissa";

        Terran terranLora = new Terran();
        terranLora.name = "Lora";

        Terran terranParty = new Terran();
        terranParty.name = "Party";

        Terran terranSofi = new Terran();
        terranSofi.name = "Sofi";

        Terran terranMerry = new Terran();
        terranMerry.name = "Merry";

        Terran terranBetty = new Terran();
        terranBetty.name = "Betty";

        Terran terranElly = new Terran();
        terranElly.name = "Elly";

        Terran terranVerty = new Terran();
        terranVerty.name = "Verty";

        Terran terranEndy = new Terran();
        terranEndy.name = "Endy";

        Terran terranNesty = new Terran();
        terranNesty.name = "Nesty";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}