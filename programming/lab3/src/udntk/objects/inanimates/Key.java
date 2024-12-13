package prod.udntk.objects.inanimates;

import prod.stuff.exceptions.NoKeyException;
import prod.udntk.enums.GroundLocation;
import prod.udntk.objects.PhysicalObject;

public class Key extends PhysicalObject {

    public Key(boolean exists){
        this.setName("Ключ");
        this.setExists(exists);
    }

    private boolean exists;

    @Override
    public void move() throws NoKeyException{
        if (exists) {
        System.out.println("пропал");
        this.setExists(false);
        }
        else{
            throw new NoKeyException("");
        }
    }

    @Override
    public void move(GroundLocation location) throws NoKeyException{
        if (exists) {
            System.out.printf(this.getName() + "Провалился в %s\n", location.getType());
            this.setExists(false);
        } else {
            throw new NoKeyException("");
        }
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
}