![█_First_Minecraft_Mod_█](https://github.com/user-attachments/assets/f4a31a7c-0166-4949-9c34-0da7c62917a2)

# Overview
This is an example first mod with a LOT of different items such as blocks, items, custom inventory groups, etc.
This mod is programmed in Java 21 for Minecraft Forge 1.21.

# Blocks

## Ores

### Alexandrite Ore

1. [Name](/src/main/resources/assets/firstmod/lang/en_us.json): Alexandrite Ore
```json
"block.firstmod.alexandrite_ore": "Alexandrite Ore"
```

2. [Drop(s)](/src/main/resources/data/firstmod/loot_table/blocks/alexandrite_ore.json):
   - 100% chance to drop Alexandrite
     
3. Required tool(s):
   - [Pickaxe](/src/main/resources/data/minecraft/tags/mineable/pickaxe.json) level [stone](/src/main/resources/data/minecraft/tags/needs_stone_tool.json) or higher

4. Description:
   - This ore drops a guaranteed 1 Raw Alexandrite when broken with a stone pickaxe ore better-level pickaxe. This block will also drop between 2 to 4 exp when broken. Raw Alexandrite from this block can be used in other recipes.

> [!NOTE]
> Code for the [Alexandrite Ore](/src/main/java/net/joshua/firstmod/block/ModBlocks.java)
>``` java
> public static final RegistryObject<Block> ALEXANDRITE_ORE = registerBlock("alexandrite_ore",
>            () -> new DropExperienceBlock(UniformInt.of(2,4), BlockBehaviour.Properties.of()
>                   .strength(4f).requiresCorrectToolForDrops()));
>```
