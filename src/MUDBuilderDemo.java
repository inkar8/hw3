// MUDBuilderDemo.java (Demo Class)
public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Caverns")
                .addRoom(new Dungeon.Room("Entrance Hall"))
                .addRoom(new Dungeon.Room("Treasure Chamber"))
                .addNPC(new Dungeon.NPC("Goblin King", "Boss"))
                .build();

        System.out.println(dungeon);
    }
}
