![█_First_Minecraft_Mod_█](https://github.com/user-attachments/assets/f4a31a7c-0166-4949-9c34-0da7c62917a2)

# Overview
This is an example first mod with a LOT of different items such as blocks, items, custom inventory groups, etc.
This mod is programmed in Java 21 for Minecraft Forge 1.21.

# Blocks

## Ores

### Alexandrite Ore

1. [Name](/src/main/resources/assets/firstmod/lang/en_us.json#L12): Alexandrite Ore

2. [Drop(s)](/src/main/resources/data/firstmod/loot_table/blocks/alexandrite_ore.json):
   - Will drop 1 Raw Alexandrite
     
3. Required Tool(s):
   - [Pickaxe](/src/main/resources/data/minecraft/tags/block/mineable/pickaxe.json#L6) level [stone](/src/main/resources/data/minecraft/tags/block/needs_stone_tool.json#L4) or higher

4. Crafting Recipe:
   - N/A
  
5. Apart of Recipe(s):
   - N/A

6. Use:
   - N/A

7. Description:
   - This ore drops a guaranteed 1 Raw Alexandrite when broken with a stone pickaxe or better-level pickaxe. This block will also drop between 2 to 4 exp when broken. Raw Alexandrite from this block can be used in other recipes.

> [!NOTE]
> Java definition for the [Alexandrite Ore](/src/main/java/net/joshua/firstmod/block/ModBlocks.java#L33-L35)
>``` java
> public static final RegistryObject<Block> ALEXANDRITE_ORE = registerBlock("alexandrite_ore",
>            () -> new DropExperienceBlock(UniformInt.of(2,4), BlockBehaviour.Properties.of()
>                   .strength(4f).requiresCorrectToolForDrops()));
>```

### Deepslate Alexandrite Ore

1. [Name](/src/main/resources/assets/firstmod/lang/en_us.json#L13): Deepslate Alexandrite Ore

2. [Drop(s)](/src/main/resources/data/firstmod/loot_table/blocks/deepslate_alexandrite_ore.json):
   - Will drop 2 to 5 Raw Alexandrite
     
3. Required Tool(s):
   - [Pickaxe](/src/main/resources/data/minecraft/tags/block/mineable/pickaxe.json#L7) level [diamond](/src/main/resources/data/minecraft/tags/block/needs_diamond_tool.json#L4) or higher

4. Crafting Recipe:
   - N/A
  
5. Apart of Recipe(s):
   - N/A

6. Use:
   - N/A

7. Description:
   - This ore drops 2 to 5 Raw Alexandrite when broken with a diamond pickaxe or better-level pickaxe. This block will also drop between 3 to 6 exp when broken. Raw Alexandrite from this block can be used in other recipes.

> [!NOTE]
> Java definition for the [Deepslate Alexandrite Ore](/src/main/java/net/joshua/firstmod/block/ModBlocks.java#L36-L38)
>``` java
> public static final RegistryObject<Block> DEEPSLATE_ALEXANDRITE_ORE = registerBlock("deepslate_alexandrite_ore",
>           () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of()
>                   .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
>```

### Alexandrite Block

1. [Name](/src/main/resources/assets/firstmod/lang/en_us.json#L10): Alexandrite Block

2. [Drop(s)](/src/main/resources/data/firstmod/loot_table/blocks/alexandrite_block.json):
   - Will drop itself
     
3. Required Tool(s):
   - [Pickaxe](/src/main/resources/data/minecraft/tags/block/mineable/pickaxe.json#L4) level [iron](/src/main/resources/data/minecraft/tags/block/needs_iron_tool.json#L4) or higher

4. [Crafting Recipe](/src/main/resources/data/firstmod/recipe/alexandrite/alexandrite_block_from_alexandrite.json):
   - 9 Alexandrite in a 3x3 grid = 1 Alexandrite Block
> [!NOTE]
> ![alexandrite_to_alexandrite_block](https://github.com/user-attachments/assets/ef9a8928-d1a5-44b4-b1fc-d8b22931d4a5)

  
6. Apart of Recipe(s):
   - N/A

7. Use:
   - N/A

8. Description:
   - This ore drops 2 to 5 Raw Alexandrite when broken with a diamond pickaxe or better-level pickaxe. This block will also drop between 3 to 6 exp when broken. Raw Alexandrite from this block can be used in other recipes.

> [!NOTE]
> Code for the [Alexandrite Block](/src/main/java/net/joshua/firstmod/block/ModBlocks.java)
>``` java
> public static final RegistryObject<Block> ALEXANDRITE_BLOCK = registerBlock("alexandrite_block",
>           () -> new Block(BlockBehaviour.Properties.of()
>                   .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
>```
