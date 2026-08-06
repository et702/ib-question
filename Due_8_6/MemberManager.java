package Due_8_6;

public class MemberManager
{
    private Member[] allMembers;
    private int numberOfMembers;

    public MemberManager()
    {
        allMembers = new Member[100];
        numberOfMembers = 0;
    }

    public boolean addMember(Member newMember)
    {
        if (numberOfMembers >= allMembers.length)
        {
            return false;
        }

        allMembers[numberOfMembers] = newMember;
        numberOfMembers++;
        return true;
    }

    public int countPriorityMembers(int index)
    {
        // TODO: Question 17(b)
        return 0;
    }
}