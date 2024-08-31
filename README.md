![█_First_Minecraft_Mod_█](https://github.com/user-attachments/assets/f4a31a7c-0166-4949-9c34-0da7c62917a2)

# Overview
This is an example first mod with a LOT of different items such as blocks, items, custom inventory groups, etc.
This mod is programmed in Java 21 for Minecraft Forge 1.21.

# Blocks

## Ores

### Alexandrite Ore

1. [Name](/src/main/resources/assets/firstmod/lang/en_us.json): Alexandrite Ore

2. [Drop(s)](/src/main/resources/data/firstmod/loot_table/blocks/alexandrite_ore.json):
   - Will drop 1 Raw Alexandrite
     
3. Required Tool(s):
   - [Pickaxe](/src/main/resources/data/minecraft/tags/mineable/pickaxe.json) level [stone](/src/main/resources/data/minecraft/tags/needs_stone_tool.json) or higher

4. Crafting Recipe:
   - N/A
  
5. Apart of Recipe(s):
   - N/A

6. Use:
   - N/A

7. Description:
   - This ore drops a guaranteed 1 Raw Alexandrite when broken with a stone pickaxe or better-level pickaxe. This block will also drop between 2 to 4 exp when broken. Raw Alexandrite from this block can be used in other recipes.

> [!NOTE]
> Code for the [Alexandrite Ore](/src/main/java/net/joshua/firstmod/block/ModBlocks.java)
>``` java
> public static final RegistryObject<Block> ALEXANDRITE_ORE = registerBlock("alexandrite_ore",
>            () -> new DropExperienceBlock(UniformInt.of(2,4), BlockBehaviour.Properties.of()
>                   .strength(4f).requiresCorrectToolForDrops()));
>```

### Deepslate Alexandrite Ore

1. [Name](/src/main/resources/assets/firstmod/lang/en_us.json): Deepslate Alexandrite Ore

2. [Drop(s)](/src/main/resources/data/firstmod/loot_table/blocks/alexandrite_ore.json):
   - Will drop 2 to 5 Raw Alexandrite
     
3. Required Tool(s):
   - [Pickaxe](/src/main/resources/data/minecraft/tags/mineable/pickaxe.json) level [diamond](/src/main/resources/data/minecraft/tags/needs_diamond_tool.json) or higher

4. Crafting Recipe:
   - N/A
  
5. Apart of Recipe(s):
   - N/A

6. Use:
   - N/A

7. Description:
   - This ore drops 2 to 5 Raw Alexandrite when broken with a diamond pickaxe or better-level pickaxe. This block will also drop between 3 to 6 exp when broken. Raw Alexandrite from this block can be used in other recipes.

> [!NOTE]
> Code for the [Deepslate Alexandrite Ore](/src/main/java/net/joshua/firstmod/block/ModBlocks.java)
>``` java
> public static final RegistryObject<Block> DEEPSLATE_ALEXANDRITE_ORE = registerBlock("deepslate_alexandrite_ore",
>           () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of()
>                   .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
>```

### Alexandrite Block

1. [Name](/src/main/resources/assets/firstmod/lang/en_us.json): Alexandrite Block

2. [Drop(s)](/src/main/resources/data/firstmod/loot_table/blocks/alexandrite_block.json):
   - Will drop itself
     
3. Required Tool(s):
   - [Pickaxe](/src/main/resources/data/minecraft/tags/mineable/pickaxe.json) level [iron](/src/main/resources/data/minecraft/tags/needs_iron_tool.json) or higher

4. [Crafting Recipe](/src/main/resources/data/firstmod/recipe/alexandrite/alexandrite_block_from_alexandrite.json):
   - 3x3 crafting grid full of [Alexandrite]()
  
5. Apart of Recipe(s):
   - N/A

6. Use:
   - N/A

7. Description:
   - This ore drops 2 to 5 Raw Alexandrite when broken with a diamond pickaxe or better-level pickaxe. This block will also drop between 3 to 6 exp when broken. Raw Alexandrite from this block can be used in other recipes.

> [!NOTE]
> Code for the [Alexandrite Block](/src/main/java/net/joshua/firstmod/block/ModBlocks.java)
>``` java
> public static final RegistryObject<Block> ALEXANDRITE_BLOCK = registerBlock("alexandrite_block",
>           () -> new Block(BlockBehaviour.Properties.of()
>                   .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
>```
