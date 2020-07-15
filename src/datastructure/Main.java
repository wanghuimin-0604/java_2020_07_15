package datastructure;

/**
 * Created with IntelliJ IDEA.
 * Description:顺序表
 * User:wanghuimin
 * Date:2020-07-15
 * Time:17:52
 * 一万年太久，只争朝夕，加油
 */
//定义一个顺序表
    class MyArrayList{
        private int[] elem=new int[1024];
        //数组中存的元素个数
        private int size;

    public MyArrayList(int[] elem, int size) {
        this.elem = elem;
        this.size = 0;
    }

    public MyArrayList() {
    }
    //提供的操作
    /**
     * 添加元素
     * 删除元素
     * 判断顺序表是否为空
     * 判断顺序表是否满了
     * 判断某个元素在顺序表中是否存在
     * 根据下标得到该下标位置的元素
     * 查找某个元素对应的位置
     * 给pos位置重新设置值
     * 扩容
     * 删除第一次出现的key
     * 获取顺序表产长度
     * 清空顺序表
     */
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(size==this.elem.length){
            return true;
        }
        return false;
    }
    //在pos位置添加元素
    public void add(int pos,int data){
        //先判断顺序表是否满了
        if(isFull()==true){
            return;
        }
        elem[pos]=data;
        size++;
    }

    //判断某个元素在表中是否存在
    public boolean contains(int tofind){
        if(isEmpty()){
            return false;
        }
        for(int i=0;i<size;i++){
            if(elem[i]==tofind){
                return true;
            }
        }
        //循环遍历这个表
        return false;
    }

    //根据下标得到元素
    public int getPos(int pos){
        if(isEmpty()){
            return -1;
        }
        return elem[pos];
    }
    //查找该元素的下标
    public int search(int key){
        if(isEmpty()){
            return -1;
        }
        for(int i=0;i<size;i++){
            if(elem[i]==key){
                return i;
            }
        }
        return -1;
    }

    public void setPos(int pos,int value){
        elem[pos]=value;
    }

    //删除第一次出现的值key
    public void delet(int key){
        if(isEmpty()){
            return;
        }
        int i=search(key);
        while(i<size) {
            //如果找到这个元素
            //就把这个元素之后的元素全部向前移动一个位置
            //这个元素就会被删除了
            elem[i] = elem[i + 1];
            i++;
        }
        size--;
    }
    //获取顺序表的长度
    public int length(){
        return size;
    }

    //扩容
    public void increase(){
        int[] newlarr=new int[elem.length*2];
        for(int i=0;i<length();i++){
            newlarr[i]=elem[i];
        }
    }

    //打印
    public void display(){
        for(int i=0;i<size;i++){
            System.out.println(elem[i]);
        }
    }

}
public class Main {
    public static void main(String[] args) {
        MyArrayList m=new MyArrayList();
        m.add(0,1);
        m.add(1,2);
        m.add(2,3);
        m.display();

        System.out.println("顺序表是否为空"+m.isEmpty());
        System.out.println("顺序表是否满了"+m.isFull());
        System.out.println("顺序表是否包含该元素"+m.contains(2));
        System.out.println("该位置元素为"+m.getPos(0));
        System.out.println("顺序表长度为"+m.length());
        m.setPos(1,22);
        System.out.println("该元素的下标为"+m.search(3));
        m.delet(1);
        m.display();

        m.increase();


    }
}
