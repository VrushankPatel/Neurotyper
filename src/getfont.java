
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class getfont 
{
    public Font getone(float a)
    {
        try
        {
            return Font.createFont(Font.TRUETYPE_FONT,getfont.class.getClassLoader().getResourceAsStream("Technodrome.ttf")).deriveFont(a);
        }
        catch(Exception e)
        {
            return new Font("Arial",0,(int)a);
        }

    }    
    
    public Font getone(int aa,float a)
    {
        try
        {
            return Font.createFont(Font.TRUETYPE_FONT,getfont.class.getClassLoader().getResourceAsStream("Technodrome.ttf")).deriveFont(aa,a);
        }
        catch(Exception e)
        {
            return new Font("Arial",0,(int)a);
        }

    }
    public Font getone2(int aa,float a)
    {
        try
        {
            //return Font.createFont(Font.TRUETYPE_FONT,new BufferedInputStream(new FileInputStream("G-SARAL4.TTF"))).deriveFont(aa,a-6);
            return Font.createFont(Font.TRUETYPE_FONT,getfont.class.getClassLoader().getResourceAsStream("G-SARAL4.TTF")).deriveFont(aa,a-6);
            //Thread.currentThread().getContextClassLoader().getResourceAsStream("/G-SARAL4.TTF")
        }
        catch(Exception e)
        {
            return new Font("Arial",0,(int)a);
        }

    }
    public Font getone3(int aa,float a)
    {
        try
        {
            //return Font.createFont(Font.TRUETYPE_FONT,new BufferedInputStream(new FileInputStream("H-SARAL4.TTF"))).deriveFont(aa,a-8);
            return Font.createFont(Font.TRUETYPE_FONT,getfont.class.getClassLoader().getResourceAsStream("H-SARAL4.TTF")).deriveFont(aa,a-6);
            //Thread.currentThread().getContextClassLoader().getResourceAsStream("/G-SARAL4.TTF")
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return new Font("Arial",0,(int)a);
        }

    }
    public String md5(String get)
    {
        try
        {                
            MessageDigest m=MessageDigest.getInstance("MD5");
            m.update(get.getBytes(),0,get.length());
            //System.out.println("MD5: "+new BigInteger(1,m.digest()).toString(16));
            return new BigInteger(1,m.digest()).toString(16);
        }
        catch(Exception e)
        {
            return null;
        }
    }    
}
