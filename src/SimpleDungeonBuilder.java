// SimpleDungeonBuilder.java (Concrete Builder)
import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private final List<Dungeon.Room> rooms = new ArrayList<>();
    private final List<Dungeon.NPC> npcs = new ArrayList<>();

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Dungeon.Room room) {
        this.rooms.add(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(Dungeon.NPC npc) {
        this.npcs.add(npc);
        return this;
    }

    @Override
    public Dungeon build() {
        return new Dungeon(name, rooms, npcs);
    }
}
