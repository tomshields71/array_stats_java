public class num_stats{

    

        private final double[] arr;
      
        public num_stats(double[] a){
          arr = a;
        }
      
        public String toString(){
          String s = "{";
          for(int i = 0; i < arr.length - 1; i++){
            s += arr[i] + ", ";
          }
          return s + arr[arr.length - 1] + "}";
        }
      
        public double average(){
          double sum = 0;
          for(double n: arr)
            sum += n;
          return sum/arr.length;
        }
      
        public double range(){
          double min = arr[0];
          double max = min;
          for(double n: arr){
            if(n > max)
              max = n;
            if(n < min)
              min = n;
          }
          return max - min;
        }
      
        public int sortStatus() {
          boolean increasing = true;
          boolean decreasing = true;
      
          /* Iterates through all except the first value in the array, and checks if
           * current value is smaller than the previous (meaning arr is not decreasing
           * or is greater than the previous (meaning arr is not increasing).
           */
          for(int i = 1; i < arr.length; i++)
          {
            if(arr[i] < arr[i-1])
            {
              increasing = false;
            }
            if(arr[i] > arr[i-1])
            {
              decreasing = false;
            }
          }
          // check increasing first, so if all are same, 1 is returned
          if(increasing)
            return 1;
          if(decreasing)
            return -1;
          return 0;
        }
      
      }