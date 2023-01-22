//Client Code
public class DPCDSB_Emissions_Assessment {
    public static void main(String[] args) {   
        //Create objects
//<Marcus>
        Emissions LOYO = new Emissions("Loyola", 12, 7, 2880, 1000);
        Emissions STFX = new Emissions("St.Francis-Xavier", 8.5, 10, 4050, 1200);
//<Ryan>
        Emissions GONZ = new Emissions("Gonzaga", 9, 12, 3490, 1033);
        Emissions CARD = new Emissions("Cardinal Leger", 9, 16, 4308, 1500);
        Emissions ROCH = new Emissions("St.Roch", 12, 12, 2670, 970);
        
        //Create object list to be processed
        Emissions[] schoolList = {LOYO, STFX, GONZ, CARD, ROCH};
//<Daniel>
        //Print calculation result for each object
        for (Emissions school : schoolList) {
            System.out.println(school.toString());
            //System.out.println(school.getSchoolName() + "\n\t\t\t\t Carbon Offset --> " + school.carbonOffset() + " trees");
        }
    } 
}  