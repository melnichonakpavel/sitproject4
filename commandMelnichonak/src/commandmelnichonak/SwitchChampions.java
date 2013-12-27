/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmelnichonak;

/**
 *
 * @author Acer
 */
class SwitchChampions {
    private Command up;
    private Command down;

    public SwitchChampions(Command up, Command downd) {
        this.up = up;
        this.down = downd;
    }

    public void win1(){
        up.doIt();
    }
     public void win2(){
        down.doIt();
    }
}
