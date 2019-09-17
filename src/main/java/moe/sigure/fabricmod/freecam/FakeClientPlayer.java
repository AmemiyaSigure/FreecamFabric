package moe.sigure.fabricmod.freecam;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Arm;
import net.minecraft.world.World;

public class FakeClientPlayer extends LivingEntity {
    public FakeClientPlayer(EntityType<? extends LivingEntity> entityType_1, World world_1) {
        super(entityType_1, world_1);
    }

    @Override
    public Iterable<ItemStack> getArmorItems() {
        return null;
    }

    @Override
    public ItemStack getEquippedStack(EquipmentSlot var1) {
        return new ItemStack(Items.AIR);
    }

    @Override
    public void setEquippedStack(EquipmentSlot var1, ItemStack var2) {

    }

    @Override
    public Arm getMainArm() {
        return Arm.RIGHT;
    }
}
