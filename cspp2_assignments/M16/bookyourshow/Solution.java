import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for show.
 * @author     Prasanth...
 */
class BookYourShow {
    Patron[] patrons;
    Show[] shows;
    private int p_size;
    private int s_size;
    
    /**
     * Constructs the object.
     */
    public BookYourShow() {
        this.shows = new Show[10];
        this.patrons = new Patron[10];
        this.p_size = 0;
        this.s_size = 0;
    }

    /**
     * { function_description }
     */
    public void s_resize() {
        shows = Arrays.copyOf(shows, shows.length * 2);
        // patrons = Arrays.copyOf(patrons, patrons.length * 2);
    }
    public void p_resize() {
        // shows = Arrays.copyOf(shows, shows.length * 2);
        patrons = Arrays.copyOf(patrons, patrons.length * 2);
    }

    /**
     * Adds a show.
     *
     * @param      newShow  The new show
     */
    public void addAShow(Show newShow) {
        if (s_size == shows.length) {
            s_resize();
        }
        shows[s_size++] = newShow;
    }

    /**
     * Adds a patron.
     *
     * @param      patron  The patron
     */
    public void addAPatron(Patron newpatron) {
        if (p_size > patrons.length) {
            p_resize();
        }
        patrons[p_size++] = newpatron;
    }

    /**
     * Gets a show.
     *
     * @param      moviname  The moviname
     * @param      datetime  The datetime
     *
     * @return     A show.
     */
    public Show getAShow(String moviname, String datetime) {
        for (int i =0; i < s_size; i++) {
            if (shows[i].getMovieName().equals(moviname)
                && shows[i].getDate().equals(datetime)) {
                    return shows[i];
            }
        }
        return null;
    }

    /**
     * to book a show.
     *
     * @param      moviename  The moviename
     * @param      datetime   The datetime
     * @param      p          { parameter_description }
     */
    public void bookAShow(String moviename, String datetime, Patron p) {
        addAPatron(p);
        Show avaiableShow = getAShow(moviename, datetime);
        if (avaiableShow != null) {
            String[] seats = avaiableShow.getSeats();
            String[] bookedSeats = p.getBookedSeats();
            for (int i = 0; i < seats.length; i++) {
                for (int j =0; j < bookedSeats.length; j++) {
                    if (seats[i].equals(bookedSeats[j]) && !seats[i].equals("N/A")) {
                        seats[i] = "N/A";
                    }
                }
            }
        } else {
            System.out.println("No show");
        }
    }
    public void showAll() {
        for (int i = 0; i < s_size; i++) {
            System.out.println(shows[i]);
        }
    }
    /**
     * { function_description }
     *
     * @param      moviename     The moviename
     * @param      datetime      The datetime
     * @param      mobilenumber  The mobilenumber
     */
    public void printTicket(String moviename,
        String datetime, String mobilenumber) {
        Show show = getAShow(moviename, datetime);
        if (show != null) {
            for (int i = 0; i < p_size; i++) {
                if (patrons[i].getNum().equals(mobilenumber)) {
                    System.out.println(mobilenumber + " " + moviename + " " + datetime);
                    return;
                } 
            }
            System.out.println("Invalid");
        } else {
            System.out.println("Invalid");
        }
    }
}
class Show {
    private String movieName;
    private String movieTime;
    private String[] seats;
    /**
     * Constructs the object for show class.
     *
     * @param      mname   The mname
     * @param      mtime   The mtime
     * @param      nseats  The nseats
     */
    Show(String mname, String mtime, String[] nseats) {
        this.movieName = mname;
        this.movieTime = mtime;
        this.seats = nseats;
    }
    public String getMovieName() {
        return this.movieName;
    }
    public String getDate() {
        return this.movieTime;
    }
    public String[] getSeats() {
        return this.seats;
    }
    public String ExceptTickets() {
        String s = "";
        s += movieName + "," + movieTime;
        return s;
    }
    public String toString() {
        String s = "";
        s += movieName + "," + movieTime + ",";
        s += Arrays.toString(seats).replace(", ",",");
        return s;
    }
}

/**
 * Class for patron.
 */
class Patron {
    private String customerName;
    private String phoneNumber;
    private String[] bookedSeats;
    /**
     * Constructs the object for Patron class.
     *
     * @param      cname     The cname
     * @param      phonenum  The phonenum
     * @param      bseats    The bseats
     */
    Patron(String cname, String phonenum, String[] bseats) {
        this.customerName = cname;
        this.phoneNumber = phonenum;
        this.bookedSeats = bseats;
    }
    public String getCname() {
        return this.customerName;
    }
    public String getNum() {
        return this.phoneNumber;
    }
    public String[] getBookedSeats() {
        return this.bookedSeats;
    }
    public String toString() {
        String s = "";
        return s;
    }
}
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method to drive program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        BookYourShow bys = new BookYourShow();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] tokens = scan.nextLine().
                replace("[", "").replace("]", "").split(",");
            String[] check = tokens[0].split(" ");
            switch (check[0]) {
                case "add":
                    int k = 2;
                    String[] seats = new String[tokens.length - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.addAShow(new Show(check[1], tokens[1], seats));
                break;

                case "book":
                    k = 2 + 2;
                    seats = new String[tokens.length - 2 - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.bookAShow(check[1], tokens[1],
                        new Patron(tokens[2], tokens[2 + 1], seats));
                break;

                case "get":
                    Show show = bys.getAShow(check[1], tokens[1]);
                    if (show != null) {
                       System.out.println(show.ExceptTickets());
                    } else {
                        System.out.println("No show");
                    }
                break;

                case "print":
                    bys.printTicket(check[1], tokens[1], tokens[2]);
                break;

                case "showAll":
                    bys.showAll();
                break;

                default:
                break;
            }
        }
    }
}
