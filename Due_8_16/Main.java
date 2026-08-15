package Due_8_16;

public class Main
{
    public static void main(String[] args)
    {
        Customer c1 =
            new Customer("C101", "Alice Kim", 4);

        Customer c2 =
            new Customer("C102", "Ben Lee", 9);

        Customer c3 =
            new Customer("C103", "Charlie Park", 6);

        WaitingList waitingList = new WaitingList();

        /*
        waitingList.addToFront(c1);
        waitingList.addToFront(c2);
        waitingList.addToFront(c3);

        System.out.println(
            waitingList.countCustomers()
        );
        */

        Performance p1 =
            new Performance("Nova", 240, 35.0);

        Performance p2 =
            new Performance("Aurora", 180, 28.0);

        Performance p3 =
            new Performance("Echo", 310, 42.0);

        FestivalSchedule schedule =
            new FestivalSchedule();

        /*
        schedule.addPerformance(0, 0, p1);
        schedule.addPerformance(1, 2, p2);
        schedule.addPerformance(2, 4, p3);

        System.out.println(
            schedule.totalAudience()
        );
        */

        int[] ticketData =
            {120, 85, 230, 155, 70, 190};

        TicketStatistics stats =
            new TicketStatistics(ticketData);

        /*
        System.out.println(
            stats.totalRecursive(0)
        );

        System.out.println(
            stats.countAboveRecursive(0, 100)
        );

        System.out.println(
            stats.maximumRecursive(0)
        );
        */
    }
}