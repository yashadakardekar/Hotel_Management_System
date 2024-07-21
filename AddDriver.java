package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AddDriver extends JFrame implements ActionListener{
    
    JButton add,cancel;
    JTextField tfname,tfage, tfcompany, tfmodel, tflocation;
    JComboBox gendercombo, availabelcombo;
    
    public AddDriver(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Drivers");
        heading.setFont(new Font("Tahoma", Font.BOLD, 18));
        heading.setBounds(150, 10, 200, 20);
        add(heading);
        
        JLabel lbroomno = new JLabel("Name");
        lbroomno.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbroomno.setBounds(60, 70, 120, 30);
        add(lbroomno);
        
        tfname = new JTextField();
        tfname.setBounds(200, 70, 150, 30);
        add(tfname);
        
        JLabel lbage = new JLabel("Age");
        lbage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbage.setBounds(60, 110, 120, 30);
        add(lbage);
        
        tfage = new JTextField();
        tfage.setBounds(200, 110, 150, 30);
        add(tfage);
        
        JLabel lbclean = new JLabel("Gender");
        lbclean.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbclean.setBounds(60, 150, 120, 30);
        add(lbclean);
        
        String ageOptions[] = {"Male", "Female"};
        gendercombo = new JComboBox(ageOptions);
        gendercombo.setBounds(200, 150, 150, 30);
        gendercombo.setBackground(Color.WHITE);
        add(gendercombo);
        
        JLabel lbcar = new JLabel("Car Company");
        lbcar.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbcar.setBounds(60, 190, 120, 30);
        add(lbcar);
        
        tfcompany = new JTextField();
        tfcompany.setBounds(200, 190, 150, 30);
        add(tfcompany);
        
        JLabel lbmodel = new JLabel("Car Model");
        lbmodel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbmodel.setBounds(60, 230, 120, 30);
        add(lbmodel);
        
        tfmodel = new JTextField();
        tfmodel.setBounds(200, 230, 150, 30);
        add(tfmodel);
        
        JLabel lbavailabel = new JLabel("Available");
        lbavailabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbavailabel.setBounds(60, 270, 120, 30);
        add(lbavailabel);
        
        String driverOptions[] = {"Availabel", "Busy"};
        availabelcombo = new JComboBox(driverOptions);
        availabelcombo.setBounds(200, 270, 150, 30);
        availabelcombo.setBackground(Color.WHITE);
        add(availabelcombo);
        
        JLabel lblocation = new JLabel("Location");
        lblocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblocation.setBounds(60, 310, 120, 30);
        add(lblocation);
        
        tflocation = new JTextField();
        tflocation.setBounds(200, 310, 150, 30);
        add(tflocation);
        
        add = new JButton("Add Driver");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(60, 370, 130, 30);
        add.addActionListener((ActionListener) this);
        add(add);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(220, 370, 130, 30);
        cancel.addActionListener((ActionListener) this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 30, 500, 300);
        add(image);
        
        
        setBounds(300,200,980,470);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            String name = tfname.getText();
            String age = tfage.getText();
            String gender = (String) gendercombo.getSelectedItem();
            String company = tfcompany.getText();
            String brand = tfmodel.getText();
            String availabel = (String) availabelcombo.getSelectedItem();
            String location = tflocation.getText();
            
            try{
                Conn conn = new Conn();
                String str = "insert into driver values('"+name+"', '"+age+"', '"+gender+"', '"+company+"', '"+brand+"', '"+availabel+"', '"+location+"')";
                
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null, "New Driver Added Successfully");
                
                setVisible(false);
                
            }catch(Exception ae){
                ae.printStackTrace();
            }
            
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new AddDriver();
    }
}