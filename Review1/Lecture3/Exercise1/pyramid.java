package Exercise1;

import javax.swing.text.Highlighter.Highlight;

public class pyramid{
    public void drawPyramid(int height){
        for(int i = 1; i <= height; i++){
            // spaces
            for(int j = 0; j < height - i; j++)
                System.out.print(' ');
            
            // stars
            for(int k = 1; k <= 2*i-1; k++)
                System.out.print('*');
                
            System.out.print('\n');
        }
        
    }
}