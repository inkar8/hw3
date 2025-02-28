// Dungeon.java (Product class)
import java.util.List;

public class Dungeon {
    private final String name;
    private final List<Room> rooms;
    private final List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    @Override
    public String toString() {
        return "Dungeon{name='" + name + "', rooms=" + rooms + ", npcs=" + npcs + "}";
    }

    // Inner Room class
    public static class Room {
        private final String description;

        public Room(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Room{" + "description='" + description + "'}";
        }
    }

    // Inner NPC class
    public static class NPC {
        private final String name;
        private final String type;

        public NPC(String name, String type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return "NPC{name='" + name + "', type='" + type + "'}";
        }
    }
}
