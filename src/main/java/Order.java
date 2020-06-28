/****
 *@author:cmh
 *@date: 2020/6/281215
 *@descrption:
 */
public class Order {
    private Item item;
    private int num;
    public Order(Item item,int num){
        this.item=item;
        this.num=num;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
