package session5lab1;

public class Main {
    public static void main(String[] args){
        New nw = new New();
        System.out.println("Tin tức con sờ lốc");
        nw.setTitle("Bản tin sáng");
        nw.setPublishDate("28/3/2022");
        nw.setAuthor("Lê Cường");
        nw.setContent("Football");
        nw.rateList[0] = 5;
        nw.rateList[1] = 9;
        nw.rateList[2] = 9;
        nw.calculate();
        nw.disPlay();

    }
}
