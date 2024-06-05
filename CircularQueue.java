public class CircularQueue{
     static class Queue{
        static int arr[];
        static int size;
        static int rear= -1;
        static int front =-1;

        Queue(int n)
        {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty()
        {
            return rear == -1 && front ==-1;
        }

        public static boolean isFull()
        {
            return (rear+1)%size == front;
        }

        //add
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("full queue");
                return;
            }

            if( front == -1)
            {
                front =0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //delete
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("list is empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front)
            {
                return rear = front =-1;
            }
            else{
                front = (front+1)%size;
            }
            
            return result;
        }

        //peek
        public static int peek()
        {
             if(isEmpty())
             {
                System.out.println("queue is empty");
                return -1;
             }
             return arr[front];
        }
     }
     public static void main(String[] args)
     {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty())
        {
            System.out.print(q.peek()+" ");
            q.remove();
        }
     }
}