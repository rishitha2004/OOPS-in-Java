public class reserve {
    public int seats;
    public int booked;
    public int getseats(){
        return seats;
    }
    public int getbooked(){
        return booked;
    }
    reserve(int seats,int booked){
        this.seats=seats;
        this.booked=booked;
    }
    public void book(int req){
        if(req<=seats){
            System.out.println("seat available.Reserve Now!!");
            seats-=req;
            booked+=req;
            System.out.println(req+" seats reserved");
        }
    }
}
