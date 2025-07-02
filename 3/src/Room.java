
public abstract class Room {
    protected int roomNumber;
    protected int maxOccupants;
    protected int pricePerNight;
    protected boolean isReserved;

    public Room(int roomNumber, int maxOccupants, Prices price) {
        this.roomNumber = roomNumber;
        this.maxOccupants = maxOccupants;
        this.pricePerNight = price.getValue();
        this.isReserved = false;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
