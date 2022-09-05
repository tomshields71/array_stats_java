public class string_stats{

    

        private final String[] arr;
      
        public string_stats(String[] a){
          arr = a;
        }
      
        public String toString(){
          String s = "{";
          for(int i = 0; i < arr.length - 1; i++){
            s += "\"" + arr[i] + "\", ";
          }
          return s + "\"" + arr[arr.length-1] + "\"}";
        }
      
        public double averageLength(){
          int sum = 0;
          for(String w: arr)
            sum += w.length();
          return (double) sum/arr.length;
        }
      
        public int search(String target){
          for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(target))
              return i;
          }
          return -1;
        }
      
        public int sortStatus() {
          boolean alphabetical = true;
          boolean reverse = true;
      
          /* Works the same way as sortStatus in the NumStatsArray class, but uses
           * the compareTo method to determine if one String appears alphabetically
           * after the other.
           */
          for(int i = 1; i < arr.length; i++)
          {
            int compVal = arr[i].compareTo(arr[i-1]);
            if(compVal < 0)
            {
              alphabetical = false;
            }
            if(compVal > 0)
            {
              reverse = false;
            }
          }
          if(alphabetical)
            return 1;
          if(reverse)
            return -1;
          return 0;
        }
      
      }