public class User
{
    String username;
    String email;

    User(String name, String email)
    {
        if (name != null)
            username = name;
        if (emailValid(email))
        {
            this.email = email;
        }
    }
    User()
    {
        username = "Anonymous";
        email = null;
    }

    public void createEvent()
    {

    }
    public boolean emailValid(String email)
    {
        return true;

    }
}