class Water{
    public static void main(String[] args) {
        int Capacity = 5;
        
        int plant[]={2,2,3,3};
        int can=Capacity;
        int result=0;
        int i=0;
    
        while(i<plant.length)
        {
            if(can>=plant[i])
            {
                can=can-plant[i];
                ++result;
                ++i;
            }
            else
            {
                can=Capacity;
             
                result=result+i*2;
                
            }
        }
        System.out.println(result);
    }
}