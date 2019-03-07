import javax.swing.*;
import java.awt.*;

public class layout extends JFrame
{
    layout(String font)
    {
        String str="AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz`~1!2@3#4$5%6^7&8*9(0)_=+[{]}|;:<>/";
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        JLabel eng;
        JLabel guj;
        JLabel sep;
        
        for(int i=0;i<str.length();i++)
        {
            eng=new JLabel("{\' "+str.charAt(i)+" \'}->");
            guj=new JLabel("\' "+str.charAt(i)+" \'");           
            sep=new JLabel("  ||  ");
            if(font=="guj")
            {
                guj.setFont(new getfont().getone2(Font.BOLD,38f));            
            }else if(font=="hindi")
            {
                guj.setFont(new getfont().getone3(Font.BOLD,30f));            
            }
            eng.setFont(new Font("Arial",Font.PLAIN,25));
            sep.setFont(new Font("Arial",Font.PLAIN,25));
            
            this.add(eng);
            this.add(guj); 
            this.add(sep);
        }                     
    }    
}
