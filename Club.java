import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    // Define any necessary fields here ...
    ArrayList<Membership> members;//40
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<>(); //40
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member); //42
    }
    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size(); //42
    }
    public ArrayList<Membership> purge(int month, int year){
        ArrayList<Membership> purgedMembers = new ArrayList<>();
        Iterator<Membership> it = new members.iterator();
        while(it.hasNext()){
            if(it.next().getMonth() == month && it.next().getYear() ==year){
                purgedMembers.add(it.next());
                it.remove();
            }
        }
        return purgedMembers;
}
