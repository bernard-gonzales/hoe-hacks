public class Event {
    Object status;
    String place;

    Event(String place)
    {
        if(place != null)
            this.place = place;
    }
}
