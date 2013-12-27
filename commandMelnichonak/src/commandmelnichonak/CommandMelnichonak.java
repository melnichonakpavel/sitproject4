/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmelnichonak;

/**
 *
 * @author Acer
 */
public class CommandMelnichonak {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Winner winObj=new Winner();
        Command Chelsea=new championsChelsea(winObj);
        Command Arsenal=new championsArsenal(winObj);
        
        SwitchChampions s=new SwitchChampions(Chelsea,Arsenal);
        
        s.win1();
        s.win2();
    }
}
