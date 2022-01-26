
class Main3
{
    public static void main(String[] args)
    {
        long total_mils = System.currentTimeMillis();
        System.out.println(total_mils);
        long total_sec = total_mils/1000;

        long current_sec = total_sec%60;
        long total_min = total_sec/60;

        long current_min = total_min%60;
        long total_hours = total_min/60;

        long current_hour = total_hours%24;

        System.out.println("Current time is "+current_hour+":"+current_min+":"+current_sec+" GMT");
    }

}
