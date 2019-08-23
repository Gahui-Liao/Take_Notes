package model;

public class Data {

    private String title;   //标题
    private String content; //内容
    private String times;   //时间
    private int ids;        //编号

    public Data(String ti,int id,String con ,String time){
        this.ids=id;
        this.title=ti;
        this.content=con;
        this.times=time;
    }

    public Data(String ti,String con,String time){
        this.title=ti;
        this.content=con;
        this.times=time;
    }

    public Data(int i,String ti,String time){
        this.ids=i;
        this.title=ti;
        this.times=time;
    }

    public Data(String ti,String con){
        this.title=ti;
        this.content=con;
    }

    public int getIds() {
        return ids;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getTimes() {
        return times;
    }
}