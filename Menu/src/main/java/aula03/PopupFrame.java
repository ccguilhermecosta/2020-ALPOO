package aula03;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.ButtonGroup;

/**
 *
 * @author guilherme
 */

public class PopupFrame extends JFrame{
    
    private JRadioButtonMenuItem items[]; //Armazena itens para cores
    private final Color colorValues[] = 
    {Color.BLUE, Color.YELLOW, Color.RED};
    
    private JPopupMenu popupMenu; //Permite ao usuário selecionar cores
    
    //Construtor
    public PopupFrame(){
        super("Using JPopupMenus");
        
        ItemHandler handler = new ItemHandler();
        String colors[] = {"Blue", "Yellow", "Red"};
        
        ButtonGroup colorGroup = new ButtonGroup(); //Gerencia itens de cores
        popupMenu = new JPopupMenu(); //Cria menu Popup
        items = new JRadioButtonMenuItem[3];
        
        for (int count = 0; count < items.length; count++) {
            
            items[count] = new JRadioButtonMenuItem(colors[count]);
            popupMenu.add(items[count]);
            colorGroup.add(items[count]);
            items[count].addActionListener(handler);
        } //Fim do for
        
        setBackground(Color.WHITE);
        
        addMouseListener(
        new MouseAdapter(){
            public void mousePressed(MouseEvent event){
                checkForTriggerEvent(event);
            }
            
            public void mouseReleased(MouseEvent event){
                checkForTriggerEvent(event);
            }
            
            private void checkForTriggerEvent(MouseEvent event)
            {
                if (event.isPopupTrigger())
                popupMenu.show(event.getComponent(), event.getX(), event.getY());
                    
                }//Fim do metodo checkForTrigger
        }//Fim da chamado anonima
        ); //Fim da chamada para addMouseListener
   }//Fim do construtor

private class ItemHandler implements ActionListener{

//Processa seleções de item do menu
public void actionPerformed(ActionEvent event){
//Determina qual item foi selecionado
for (int i = 0; i < items.length; i++) {
    if (event.getSource() == items[i]) {
        getContentPane().setBackground(colorValues[i]);
        return;
    } //Fim do if
  } //Fim do for
} //Fim do actionPerformed
} //Fim da Classe Interna
} //Fim da Classe PopupFrame

