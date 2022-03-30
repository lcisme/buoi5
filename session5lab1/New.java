package session5lab1;

import java.util.ArrayList;

public class New implements INews{
    int id;
    String title,publishDate,author,content;
    float averageRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void disPlay() {
        System.out.println("Title "+title);
        System.out.println("PublishDate "+publishDate);
        System.out.println("Author "+author);
        System.out.println("Content "+content);
        System.out.format("AverageRate %.3f",averageRate);
    }

   int[] rateList = new int[3];

    public void calculate(){
        float tong =0;
        for (int i=0;i< rateList.length;i++){
            tong = rateList[i] + tong;
    }
        averageRate = tong/rateList.length;
}
}
