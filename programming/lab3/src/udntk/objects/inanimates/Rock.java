package prod.udntk.objects.inanimates;

import prod.stuff.exceptions.MassiveObjException;
import prod.udntk.enums.Color;
import prod.udntk.enums.GroundLocation;

public final class Rock extends MoonObject {
    public Rock(String name, GroundLocation location, Color dye){
        super.setName(name);
        super.setLocation(location);
        super.setDye(dye);
    }
    public void shine(){
        System.out.println(this.getName() + " блестит " + this.getDye().getType());
    }

    @Override
    public void move() throws MassiveObjException {
        throw new MassiveObjException("Невозможно передвинуть");
    }

    @Override
    public void move(GroundLocation location) throws MassiveObjException{
        throw new MassiveObjException("Невозможно передвинуть");
    }
}
