// IDungeonBuilder.java (Interface)
public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Dungeon.Room room);
    IDungeonBuilder addNPC(Dungeon.NPC npc);
    Dungeon build();
}
