
public class Main {
    public static void main(String[] args) {
        RoomService<StandardRoom> service = new RoomServiceImpl<>();
        StandardRoom room = new StandardRoom(101, 2, Prices.STANDARD);

        service.clean(room);
        service.reserve(room);
        service.free(room);

        LuxRoomService<LuxRoom> luxService = new LuxRoomServiceImpl<>();
        LuxRoom luxRoom = new LuxRoom(201, 4, Prices.LUX);

        luxService.reserve(luxRoom);
        luxService.foodDelivery(luxRoom);
        luxService.free(luxRoom);
    }
}
