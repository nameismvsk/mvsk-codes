//Any one can use this code and if any one can modify it based on your requirements 
import java.util.Scanner;

public class StudentResultSystem {
   private static final String[][] STUDENT_DB = new String[][]{{"ST101", "Alice", "80", "75", "70", "85", "90"}, {"ST102", "Bob", "70", "65", "75", "80", "85"}, {"ST103", "Charlie", "20", "90", "80", "70", "85"}};

   public StudentResultSystem() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("\ud83e\udd73 Welcome to the Student Result System! \ud83e\udd73");
      System.out.println("\ud83c\udf93 Please log in to check your results. \ud83c\udf93");
      System.out.print("\ud83d\udd11 Enter your Registered ID (e.g., ST101): ");
      String var2 = var1.nextLine().toUpperCase();
      System.out.print("\u270d\ufe0f Enter your Name: ");
      String var3 = var1.nextLine().toUpperCase();
      boolean var4 = false;
      String[][] var5 = STUDENT_DB;
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         String[] var8 = var5[var7];
         if (var8[0].equalsIgnoreCase(var2) && var8[1].equalsIgnoreCase(var3)) {
            var4 = true;
            System.out.println("\n\u2705 \ud83c\udf89 Login Successful! Here are your results: \ud83c\udf89 \u2705");
            System.out.println("+----------------+-------+------------+");
            System.out.println("| \ud83d\udcd6 Subject     | \ud83d\udcca Marks | \u2705 Pass/Fail |");
            System.out.println("+----------------+-------+------------+");
            int var9 = 0;

            for(int var10 = 2; var10 < var8.length; ++var10) {
               int var11 = Integer.parseInt(var8[var10]);
               var9 += var11;
               String var12 = var11 >= 40 ? "\u2705 Pass" : "\u274c Fail";
               System.out.printf("| Subject %-7d | %-5d | %-10s |\n", var10 - 1, var11, var12);
            }

            System.out.println("+----------------+-------+------------+");
            double var13 = (double)var9 / (double)(var8.length - 2);
            System.out.printf("\n\u2b50 Total Marks: %d\n", var9);
            System.out.printf("\ud83d\udcca Percentage: %.2f%%\n", var13);
            System.out.println("\n\ud83d\udcc4 You can now manually copy this output or implement file export for saving.");
            break;
         }
      }

      if (!var4) {
         System.out.println("\n\u274c Invalid Details. Please check your Registered ID or Name.");
      }

      var1.close();
   }
}
