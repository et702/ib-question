package Due_8_6;

public class Member
{
    private String memberID;
    private String memberName;
    private int loyaltyPoints;

    public Member(String memberID,
                  String memberName,
                  int loyaltyPoints)
    {
        this.memberID = memberID;
        this.memberName = memberName;
        this.loyaltyPoints = loyaltyPoints;
    }

    public String getMemberID()
    {
        return memberID;
    }

    public String getMemberName()
    {
        return memberName;
    }

    public int getLoyaltyPoints()
    {
        return loyaltyPoints;
    }
}