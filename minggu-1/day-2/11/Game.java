public class Game {
    public static void main(String[] args){

        // membuat objek player
        Player petani = new Player();

        // mengisi atribut player
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoin = 100;

        // menjalankan method
        petani.run();

        if(petani.isDead()){
            System.out.println("Game Over!");
        }

    }
}