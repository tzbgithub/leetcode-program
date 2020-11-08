//package 哈希链表_LRU缓存;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class LRUCache {
//
//    //创建一个双链表的数据结构
//    class DListedLink{
//        int key ,value;
//        DListedLink pre ;
//        DListedLink next;
//        //构造函数
//        DListedLink(){}
//        DListedLink(int _key, int _value){
//            key = _key;
//            value = _value;
//        }
//    }
//
//    private Map<Integer,DListedLink> cache = new HashMap<Integer,DListedLink>();//创建栈
//    private int size;//当前元素的数量
//    private int capacity;//元素上限
//    //创建双链表的辅助头尾
//    private DListedLink head;
//    private DListedLink tail;
//
//    public LRUCache(int capacity) {
//        this.capacity = capacity;
//        this.size = 0;
//        //头尾结点创建，并且连接
//        head = new DListedLink();
//        tail = new DListedLink();
//        head.next = tail;
//        tail.pre = head;
//    }
//
//    public int get(int key) {
//        DListedLink node =  cache.get(key);
//        //如果键不再存在，返回-1
//        if(node == null)
//            return -1;
//        //如果键存在，得到值，并且把这个结点放到头部
//        moveToHead(node);
//        return node.value;
//    }
//
//    public void put(int key, int value) {
//        DListedLink node = cache.get(key);
//        //如果对象没有，创建新的结点
//        if(node ==null){
//            DListedLink newNode = new DListedLink(key,value);
//            //
//            cache.put(key,newNode);
//            //添加头部,结构性修改，size变量增加，
//            addToHead(newNode);
//            ++size;
//            //如果满了，就要删除辅助尾巴的前一个元素（实际上是DLinkedList的最后一个元素），并且在map里面删除
//            if(size>capacity){
//                DListedLink tail = removeTail();
//                cache.remove(tail.key);
//                --size;
//            }
//        }
//        else{
//            //存在就更新，并且移动到头部
//            node.value = value;
//            moveToHead(node);
//        }
//    }
//
//    private void moveToHead(DListedLink node){
//        removeNode(node);
//        addToHead(node);
//
//    }
//
//    private void addToHead(DListedLink node){
//
//        node.pre = head;
//        node.next = head.next;
//        head.next.pre = node;
//        head.next = node;
//
//    }
//
//    private void removeNode(DListedLink node){
//        node.pre.next = node.next;
//        node.next.pre = node.pre;
//    }
//
//    private DListedLink removeTail(){
//        DListedLink res= tail.pre;
//        removeNode(res);
//        return res;
//
//    }
//}
//
///**
// * Your LRUCache object will be instantiated and called as such:
// * LRUCache obj = new LRUCache(capacity);
// * int param_1 = obj.get(key);
// * obj.put(key,value);
// */