
public class LuxRoomServiceImpl<T extends LuxRoom> implements LuxRoomService<T> {

    @Override
    public void clean(T room) {
        System.out.println("Люкс-комната " + room.getRoomNumber() + " почищена.");
    }

    @Override
    public void reserve(T room) {
        if (room.isReserved()) {
            throw new RoomAlreadyReservedException("Люкс-комната " + room.getRoomNumber() + " уже забронирована.");
        }
        room.setReserved(true);
        System.out.println("Люкс-комната " + room.getRoomNumber() + " успешно забронирована.");
    }

    @Override
    public void free(T room) {
        room.setReserved(false);
        System.out.println("Люкс-комната " + room.getRoomNumber() + " освобождена.");
    }

    @Override
    public void foodDelivery(T room) {
        System.out.println("В комнату " + room.getRoomNumber() + " доставлена еда.");
    }
}
