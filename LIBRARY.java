public class LIBRARY {


    //Choices of Genres
    public void checkchoicestype(String type){
        if (type.equalsIgnoreCase("Non-Fiction")){
            System.out.println();
            System.out.println("----GENRE CHOICES----");
            System.out.println();
            System.out.println("1. History");
            System.out.println("2. Philosophy");

        } else if (type.equalsIgnoreCase("Fiction")){
            System.out.println();
            System.out.println("----GENRE CHOICES----");
            System.out.println();
            System.out.println("1. Fantasy");
            System.out.println("2. Science Fiction");
        } else {
            System.out.println();
            System.out.println("Not in Choices");
        } 

    }

    //Choices of Titles
    public void checkchoicesgenre(String genre, String type){
        if (genre.equalsIgnoreCase("History")&& type.equalsIgnoreCase("Non-Fiction")){
            System.out.println();
            System.out.println("----TITLE CHOICES----");
            System.out.println();
            System.out.println("1. Black and British");
            System.out.println("2. Sapiens");
        
        }else if (genre.equalsIgnoreCase("Philosophy")&& type.equalsIgnoreCase("Non-Fiction")){
            System.out.println();
            System.out.println("----TITLE CHOICES----");
            System.out.println();
            System.out.println("1. The Republic");
            System.out.println("2. Meditation");

        }else if (genre.equalsIgnoreCase("Fantasy")&& type.equalsIgnoreCase("Fiction")){
            System.out.println();
            System.out.println("----TITLE CHOICES----");
            System.out.println();
            System.out.println("1. The Lord Of The Rings");
            System.out.println("2. Harry Potter");

        }else if (genre.equalsIgnoreCase("Science Fiction")&& type.equalsIgnoreCase("Fiction")){
            System.out.println();
            System.out.println("----TITLE CHOICES----");
            System.out.println();
            System.out.println("1. 1984");
            System.out.println("2. Ready Player One");
        }
    }
    
}