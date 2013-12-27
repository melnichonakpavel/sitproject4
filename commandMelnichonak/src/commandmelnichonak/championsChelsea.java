/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmelnichonak;

/**
 *
 * @author Acer
 */
class championsChelsea implements Command {

 private Winner winObj;

    public championsChelsea(Winner winObj) {
        this.winObj = winObj;
    }
 
    @Override
    public void doIt() {
       winObj.Chelsea();
    }
}
