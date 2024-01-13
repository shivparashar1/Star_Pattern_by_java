// public class starpattern
// {
//   public static void main(String[] args) 
//   {
//      int n=5;
//      for(int i=0; i<n; i++)
//      {
//         for(int j=0; j<n; j++)
//         {
//             System.out.print("* ");
//         }
//         System.out.println();
//      }
//   }
// }


       // TO PRINT A RECTANGLE BY STAR PATTERN   
// public class starpattern
// {
//   public static void main(String[] args) 
//   {
//      int n=10;
//      for(int i=0; i<n; i++)
//      {
//         for(int j=0; j<n; j++)
//         {
//             if(i==0 || j==0 || i==n-1 || j==n-1)
//             {
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
            
//         }
//         System.out.println();
//      }
//   }
// }


     // TO PRINT 'A' PATTERN bY STAR
// public class starpattern
// {
//   public static void main(String[] args) 
//   {
//      int n=10;
//      for(int i=0; i<n; i++)
//      {
//         for(int j=0; j<n; j++)
//         {
//             if(i==0 || j==0 || i==(n-1)/2 || j==n-1)
//             {
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
            
//         }
//         System.out.println();
//      }
//   }
// }



     // TO PRINT 'H' PATTERN BY STAR
// public class starpattern
// {
//   public static void main(String[] args) 
//   {
//      int n=10;
//      for(int i=0; i<n; i++)
//      {
//         for(int j=0; j<n; j++)
//         {
//             if(j==0 || j==n-1 || i==(n-1)/2)
//             {
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
            
//         }
//         System.out.println();
//      }
//   }
// }


//    // TO PRINT 'A' PATTERN BY STAR
// public class starpattern
// {
//     public static void main(String[] args) {
//         int n=10;
//         for(int i=0; i<n; i++)
//         {
//            for(int j=0; j<n; j++)
//            {
//             if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || 
//             i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0)
//             {
//             System.out.print("*");
//             }
//             else
//             {
//                 System.out.print(" ");
//             }
//            } 
//            System.out.println();
//         }
//     }
// }




// public class starpattern
// {
//     public static void main(String[] args) {
//         int n=19;
//         for(int i=0; i<n; i++)
//         {
//            for(int j=0; j<n; j++)
//            {
//             // if(i==j)  //single diagonal
//             // if(i==j || i+j == n-1)  // double diagonal
//             // if(i==j || i+j == n-1 || i==0 || j==0 ||i==n-1 || j==n-1) //rectangle with its diagonal
//             if(i==j || i+j == n-1 || i==0 || j==0 ||i==n-1 || j==n-1 || 
//             i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==n-1 + (n-1)/2)
            
//             {
//             System.out.print("*");
//             }
//             else
//             {
//                 System.out.print(" ");
//             }
//            } 
//            System.out.println();
//         }
//     }
// }





public class starpattern
{
    public static void main(String[] args) {
        int n=19;
        for(int i=0; i<n; i++)
        {
           for(int j=0; j<n; j++)
         {
            if(i==0 || j==0 ||i==n-1 || j==n-1 || 
            i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==n-1 + (n-1)/2)
            
            {
            System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
         }  System.out.print("  ");
         for(int j=0; j<n; j++)
         {
            if(i==j || i+j == n-1 || i==0 || j==0 ||i==n-1 || j==n-1 || 
            i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==n-1 + (n-1)/2)
            
            {
            System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
         } 
         System.out.println();
        }
    }
}