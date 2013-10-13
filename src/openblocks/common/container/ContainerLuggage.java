package openblocks.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import openblocks.common.entity.EntityLuggage;

public class ContainerLuggage extends ContainerInventory<IInventory> {

	public final EntityLuggage luggage;

	public ContainerLuggage(IInventory playerInventory, EntityLuggage luggage) {
		super(playerInventory, luggage.getInventory());
		this.luggage = luggage;
		addInventoryGrid(8, 18, 9);
		addPlayerInventorySlots(luggage.isSpecial()? 139 : 85);
	}

	@Override
	public void onServerButtonClicked(EntityPlayer player, int buttonId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClientButtonClicked(int buttonId) {
		// TODO Auto-generated method stub

	}

}
