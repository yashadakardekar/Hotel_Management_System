package hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener{
    
    JButton newCustomer, rooms, departments, allEmployee, managerInfo, customer, update, roomStatus, pickup,checkout,logout;
    
    Reception(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        newCustomer = new JButton("New Customer Form");
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.setBounds(10,30, 200, 30);
        newCustomer.addActionListener((ActionListener)this);
        add(newCustomer);
        
        rooms = new JButton("Rooms");
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.setBounds(10,70, 200, 30);
        rooms.addActionListener((ActionListener)this);
        add(rooms);
        
        departments = new JButton("Departments");
        departments.setBackground(Color.BLACK);
        departments.setForeground(Color.WHITE);
        departments.setBounds(10,110, 200, 30);
        departments.addActionListener((ActionListener) this);
        add(departments);
        
        allEmployee = new JButton("All Employee");
        allEmployee.setBackground(Color.BLACK);
        allEmployee.setForeground(Color.WHITE);
        allEmployee.setBounds(10,150, 200, 30);
        allEmployee.addActionListener((ActionListener)this);
        add(allEmployee);
        
        customer = new JButton("Customer Info");
        customer.setBackground(Color.BLACK);
        customer.setForeground(Color.WHITE);
        customer.setBounds(10,190, 200, 30);
        customer.addActionListener((ActionListener)this);
        add(customer);
        
        managerInfo = new JButton("Manager Info");
        managerInfo.setBackground(Color.BLACK);
        managerInfo.setForeground(Color.WHITE);
        managerInfo.setBounds(10,230, 200, 30);
        managerInfo.addActionListener((ActionListener)this);
        add(managerInfo);
        
        checkout = new JButton("Checkout");
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        checkout.setBounds(10,270, 200, 30);
        checkout.addActionListener((ActionListener)this);
        add(checkout);
        
        update= new JButton("Update Status");
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setBounds(10,310, 200, 30);
        update.addActionListener((ActionListener)this);
        add(update);
        
        roomStatus = new JButton("Update Room Status");
        roomStatus.setBackground(Color.BLACK);
        roomStatus.setForeground(Color.WHITE);
        roomStatus.setBounds(10,350, 200, 30);
        roomStatus.addActionListener((ActionListener)this);
        add(roomStatus);
        
        pickup = new JButton("Pickup Service");
        pickup.setBackground(Color.BLACK);
        pickup.setForeground(Color.WHITE);
        pickup.setBounds(10,390, 200, 30);
        pickup.addActionListener((ActionListener)this);
        add(pickup);
        
        JButton searchRoom = new JButton("Search Room");
        searchRoom.setBackground(Color.BLACK);
        searchRoom.setForeground(Color.WHITE);
        searchRoom.setBounds(10,430, 200, 30);
        add(searchRoom);
        
        logout = new JButton("Logout");
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setBounds(10,470, 200, 30);
        logout.addActionListener((ActionListener)this);
        add(logout);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250, 30, 500, 470);
        add(image);
        
        setBounds(350, 200, 800, 570);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == newCustomer){
            setVisible(false);
            new AddCustomer();
        }else if(ae.getSource() == rooms){
            setVisible(false);
            new Room();
        }else if(ae.getSource() == departments){
            setVisible(false);
            new Department();
        }else if(ae.getSource() == allEmployee){
            setVisible(false);
            new EmployeeInfo();
        }else if(ae.getSource() == managerInfo){
            setVisible(false);
            new ManagerInfo();
        }else if(ae.getSource() == customer){
            setVisible(false);
            new CustomerInfo();
        }else if(ae.getSource() == update){
            setVisible(false);
            new UpdateCheck();
        }else if(ae.getSource() == roomStatus){
            setVisible(false);
            new UpdateRoom();
        }else if(ae.getSource() == pickup){
            setVisible(false);
            new Pickup();
        }else if(ae.getSource() == checkout){
            setVisible(false);
            new Checkout();
        }else if(ae.getSource() == logout){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Reception();
    }
}
