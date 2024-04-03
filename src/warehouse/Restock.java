package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	    // Uset his file to test restock

        //Warehouse Object
        Warehouse w = new Warehouse();

        // Number of Queries 
        int length = StdIn.readInt();

        for(int i = 0; i < length; i++){

            String newQ = StdIn.readString();

            if(newQ.equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();

                //Product product = new Product(id, name, stock, demand);
                w.addProduct(id, name, stock, day, demand);


            }
            else if(newQ.equals("restock")){
                int id = StdIn.readInt();
                int amount = StdIn.readInt();

                w.restockProduct(id, amount);

            }
            

        }
        StdOut.println(w);



    }
}
