/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmelnichonak;

/**
 *
 * @author Acer
 */
class championsArsenal implements Command {


    private Winner winObj;

    

    public championsArsenal(Winner winObj) {
        this.winObj=winObj;
    }
    
    @Override
    public void doIt() {
       winObj.Arsenal();
    }
}
