package openmodularturrets.blocks.turretbases;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import openmodularturrets.reference.ModInfo;
import openmodularturrets.blocks.BlockNames;
import openmodularturrets.handler.ConfigHandler;
import openmodularturrets.tileentity.turretbase.TurretBaseTierThreeTileEntity;

public class BlockTurretBaseTierThree extends BlockAbstractTurretBase {

    public final int MaxCharge = ConfigHandler.getBaseTierThreeMaxCharge();
    public final int MaxIO = ConfigHandler.getBaseTierThreeMaxIo();

    public BlockTurretBaseTierThree() {
        super();

        this.setBlockName(BlockNames.unlocalisedTurretBaseTierThree);
        this.setBlockTextureName(ModInfo.ID + ":turretBaseTierThree");
    }

    @Override
    public void registerBlockIcons(IIconRegister p_149651_1_) {
        super.registerBlockIcons(p_149651_1_);

        blockIcon = p_149651_1_.registerIcon(ModInfo.ID.toLowerCase() + ":turretBaseTierThree");
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
	    return new TurretBaseTierThreeTileEntity(this.MaxCharge, this.MaxIO);
    }
}
