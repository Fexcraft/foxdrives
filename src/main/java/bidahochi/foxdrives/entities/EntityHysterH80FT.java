package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.models.ModelHysterH80FT;
import fexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;


public class EntityHysterH80FT extends EntityCar {

    public static List<float[]> passpos = Arrays.asList(new float[]{ 0.0f, 0.5f, 0.0f });

    public EntityHysterH80FT(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }
    public EntityHysterH80FT(World p_i1685_1_) {
        super(p_i1685_1_);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelHysterH80FT();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/hyster_h80ft", "textures/hyster_h80ft2"};
    }

    /**
     * Returns the movement speed in blocks per tick. entity horse uses 0.1f
     */
    @Override
    public float getMoveSpeed() {
        return 15f;
    }

    /**
     * Returns the acceleration speed in meters per second.
     * NOTE: this method is a placeholder and is not yet implemented.
     */
    @Override
    public float getAccelSpeed() {
        return 1;
    }

    /**
     * Returns the rider/passengers offset from the center of the entity, in blocks.
     */
    public List<float[]> getPassengerOffsets(){
        return passpos;
    }

    /**
     * Returns the amount to scale the player, MC default is 1, TC default is 0.65f
     */
    @Override
    public float getRiderScale() {
        return 0.65f;
    }

    @Override
    public boolean rearSteer(){
        return true;
    }

}
