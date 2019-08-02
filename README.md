# java-cal

Simple replacement for UNIX `cal` utility

Just another hello world on this lang

## Usage

```
cal:
 -1                 Display current month (default)
 -3                 Display three month
 -h,--help          Get help
 -n <amount>        Display n month from today
 -Y                 Display current year
 -y,--year <year>   Display cal for same year
 ```
 
 ## Example
 
 ### Get calendar for specific year
 
  ```
 $ cal -y 2000
 ```
 
 <details>
  
 <summary>Show output</summary>
  
 ```
                                          2000                                          
          JANUARY                      FEBRUARY                        MARCH           
MON THU WED THU FRI SAT SUN   MON THU WED THU FRI SAT SUN   MON THU WED THU FRI SAT SUN
                      1   2         1   2   3   4   5   6             1   2   3   4   5
  3   4   5   6   7   8   9     7   8   9  10  11  12  13     6   7   8   9  10  11  12
 10  11  12  13  14  15  16    14  15  16  17  18  19  20    13  14  15  16  17  18  19
 17  18  19  20  21  22  23    21  22  23  24  25  26  27    20  21  22  23  24  25  26
 24  25  26  27  28  29  30    28  29                        27  28  29  30  31        
 31                                                                                    

           APRIL                          MAY                          JUNE            
MON THU WED THU FRI SAT SUN   MON THU WED THU FRI SAT SUN   MON THU WED THU FRI SAT SUN
                      1   2     1   2   3   4   5   6   7                 1   2   3   4
  3   4   5   6   7   8   9     8   9  10  11  12  13  14     5   6   7   8   9  10  11
 10  11  12  13  14  15  16    15  16  17  18  19  20  21    12  13  14  15  16  17  18
 17  18  19  20  21  22  23    22  23  24  25  26  27  28    19  20  21  22  23  24  25
 24  25  26  27  28  29  30    29  30  31                    26  27  28  29  30        

           JULY                         AUGUST                       SEPTEMBER         
MON THU WED THU FRI SAT SUN   MON THU WED THU FRI SAT SUN   MON THU WED THU FRI SAT SUN
                      1   2         1   2   3   4   5   6                     1   2   3
  3   4   5   6   7   8   9     7   8   9  10  11  12  13     4   5   6   7   8   9  10
 10  11  12  13  14  15  16    14  15  16  17  18  19  20    11  12  13  14  15  16  17
 17  18  19  20  21  22  23    21  22  23  24  25  26  27    18  19  20  21  22  23  24
 24  25  26  27  28  29  30    28  29  30  31                25  26  27  28  29  30    
 31                                                                                    

          OCTOBER                      NOVEMBER                      DECEMBER          
MON THU WED THU FRI SAT SUN   MON THU WED THU FRI SAT SUN   MON THU WED THU FRI SAT SUN
                          1             1   2   3   4   5                     1   2   3
  2   3   4   5   6   7   8     6   7   8   9  10  11  12     4   5   6   7   8   9  10
  9  10  11  12  13  14  15    13  14  15  16  17  18  19    11  12  13  14  15  16  17
 16  17  18  19  20  21  22    20  21  22  23  24  25  26    18  19  20  21  22  23  24
 23  24  25  26  27  28  29    27  28  29  30                25  26  27  28  29  30  31
 30  31                                                                                


 ```
 
 </details>
 
 ### Get calendar for next 5 month
 
 ```
 $ cal -n 5
 ```
 
 <details>
  <summary> Show output </summary>
  
  ```
           AUG 2019                      SEP 2019                      OCT 2019          
MON THU WED THU FRI SAT SUN   MON THU WED THU FRI SAT SUN   MON THU WED THU FRI SAT SUN
              1   2   3   4                             1         1   2   3   4   5   6
  5   6   7   8   9  10  11     2   3   4   5   6   7   8     7   8   9  10  11  12  13
 12  13  14  15  16  17  18     9  10  11  12  13  14  15    14  15  16  17  18  19  20
 19  20  21  22  23  24  25    16  17  18  19  20  21  22    21  22  23  24  25  26  27
 26  27  28  29  30  31        23  24  25  26  27  28  29    28  29  30  31            
                               30                                                      

         NOV 2019                      DEC 2019                      JAN 2020          
MON THU WED THU FRI SAT SUN   MON THU WED THU FRI SAT SUN   MON THU WED THU FRI SAT SUN
                  1   2   3                             1             1   2   3   4   5
  4   5   6   7   8   9  10     2   3   4   5   6   7   8     6   7   8   9  10  11  12
 11  12  13  14  15  16  17     9  10  11  12  13  14  15    13  14  15  16  17  18  19
 18  19  20  21  22  23  24    16  17  18  19  20  21  22    20  21  22  23  24  25  26
 25  26  27  28  29  30        23  24  25  26  27  28  29    27  28  29  30  31        
                               30  31                                                  

         FEB 2020          
MON THU WED THU FRI SAT SUN
                      1   2
  3   4   5   6   7   8   9
 10  11  12  13  14  15  16
 17  18  19  20  21  22  23
 24  25  26  27  28  29    

  ```
  </details>

## Using as library

You can easy build you own calendar. All calendars in this README (see the cal.calendar package) are easy compiled used  the classes in the cal.model.* and cal.decorator packages
