package org.example;

public class QueueArray {

    public static class Queue{

        static int arr[];
        static  int size;
        static int rear = -1;

        public Queue(int n) {
            arr = new int[n];
           this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is empty");
                return;
            }
            rear++;
            arr[rear] = data;
        }
    }

    public static void main(String[] args) {
         Queue q = new Queue(5);
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);

//         while (!q.isEmpty()){
//             System.out.println();
//         }
    }
}
