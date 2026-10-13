public class Member {
    private String name;
    private String memberId;

    public Member(String name, int memberId){
        this.name = name;
        this.memberId = memberId;
    }

    public String getName(){
        return name;
    }

    public String getMemberId(){
        return memberId;
    }
    
}
