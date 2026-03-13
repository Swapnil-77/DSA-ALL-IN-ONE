package Queue;

import java.util.Stack;

class QueueFromStack{
    public static void main(String[] args) {
        QueueFromStack q = new QueueFromStack();
        q.add(10); q.add(20); q.add(30); q.add(40);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    void add(int val){
        st1.push(val);
    }

    int remove(){
        if(st1.size()==0 && st2.size()==0) return -1;
        if(st2.size()==0){
            while(st1.size()>0){
                st2.push(st1.pop());
            }
        }
        return st2.pop();
    }

    int peek(){
        if(st1.size()==0 && st2.size()==0) return -1;
        if(st2.size()==0){
            while(st1.size()>0){
                st2.push(st1.pop());
            }
        }
        return st2.peek();
    }
}

