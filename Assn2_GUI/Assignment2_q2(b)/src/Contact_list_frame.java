import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JApplet;
import java.awt.Rectangle;
import java.awt.Dimension;

public class Contact_list_frame extends JApplet implements Serializable {
	
	ArrayList<relative_info> relList=new ArrayList<relative_info>(50);
	ArrayList<Professional_info> profList=new ArrayList<Professional_info>(50);
	ArrayList<Personal_info> personalList=new ArrayList<Personal_info>(50);
	ArrayList<Casual_info> casualList=new ArrayList<Casual_info>(50);
	private JPanel contentPane;
	private JTextField textFieldNameRelative;
	private JTextField textFieldMobileRelative;
	private JTextField textFieldEmailRelative;
	private JTextField textFieldDOBRelative;
	private JTextField textFieldDateofLastRelative;
	private JTextField textFieldProfessionalName;
	private JTextField textFieldProfessionalMobile;
	private JTextField textFieldProfessionalEmail;
	private JTextField textFieldProfessionalInterest;
	private JTextField textFieldPersonalName;
	private JTextField textFieldPersonalMobile;
	private JTextField textFieldPersonalEmail;
	private JTextField textFieldPersonalDateofAcq;
	private JTextField textFieldPersonalContextofacq;
	private JTextField textFieldPersonalSpecificEvents;
	private JTextField textFieldCausalName;
	private JTextField textFieldCasualMobile;
	private JTextField textFieldCasualEmail;
	private JTextField textFieldCasualWhen;
	private JTextField textFieldCasualWhere;
	private JTextField textFieldCasualCircumstances;
	private String[] comboBoxtemp=new String[10];
	private JLabel lblName_1;
	private JTextField textFieldDelete;
	private JTextField textField;
	private Panel DisplaySearched_panel;
	public Button button_3;
	public Button button_4;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Contact_list_frame() {
		setMinimumSize(new Dimension(450, 350));
		setPreferredSize(new Dimension(450, 350));
		setBounds(new Rectangle(100, 100, 450, 350));
		comboBoxtemp[0]="Relativees";
		comboBoxtemp[1]="Professional Friends";
		comboBoxtemp[2]="Personal Friends";
		comboBoxtemp[3]="Casual Friends";
		this.setSize(new Dimension(430,451));
		//setTitle("Contact List");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(new CardLayout(0, 0));

		
		Panel Main_panel = new Panel();
		contentPane.add(Main_panel, "name_1116502289578770");
		Main_panel.setLayout(null);
		Panel Create_panel = new Panel();
		contentPane.add(Create_panel, "name_1117039757548842");
		Create_panel.setLayout(null);
		
		Panel AddRelative_panel = new Panel();
		contentPane.add(AddRelative_panel, "name_1117683396003657");
		AddRelative_panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(44, 11, 88, 31);
		AddRelative_panel.add(lblName);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMobileNo.setBounds(44, 53, 88, 31);
		AddRelative_panel.add(lblMobileNo);
		
		JLabel lblEmail = new JLabel("Email address");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(44, 95, 123, 31);
		AddRelative_panel.add(lblEmail);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDateOfBirth.setBounds(44, 137, 123, 31);
		AddRelative_panel.add(lblDateOfBirth);
		
		JLabel lblDateOfLast = new JLabel("Date of Last Meeting");
		lblDateOfLast.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDateOfLast.setBounds(44, 179, 142, 31);
		AddRelative_panel.add(lblDateOfLast);
		
		textFieldNameRelative = new JTextField();
		textFieldNameRelative.setBounds(189, 18, 187, 20);
		AddRelative_panel.add(textFieldNameRelative);
		textFieldNameRelative.setColumns(10);
		
		textFieldMobileRelative = new JTextField();
		textFieldMobileRelative.setColumns(10);
		textFieldMobileRelative.setBounds(189, 60, 187, 20);
		AddRelative_panel.add(textFieldMobileRelative);
		
		textFieldEmailRelative = new JTextField();
		textFieldEmailRelative.setColumns(10);
		textFieldEmailRelative.setBounds(189, 102, 187, 20);
		AddRelative_panel.add(textFieldEmailRelative);
		
		textFieldDOBRelative = new JTextField();
		textFieldDOBRelative.setColumns(10);
		textFieldDOBRelative.setBounds(189, 144, 187, 20);
		AddRelative_panel.add(textFieldDOBRelative);
		
		textFieldDateofLastRelative = new JTextField();
		textFieldDateofLastRelative.setColumns(10);
		textFieldDateofLastRelative.setBounds(189, 186, 187, 20);
		AddRelative_panel.add(textFieldDateofLastRelative);
		
		JButton btnSaveRelative = new JButton("Save");
		btnSaveRelative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				relative_info relObj=new relative_info();
				relObj.setName(textFieldNameRelative.getText());
				relObj.setMobile(textFieldMobileRelative.getText());
				relObj.setEmail(textFieldEmailRelative.getText());
				relObj.setDOB(textFieldDOBRelative.getText());
				relObj.setDate_of_lastmeet(textFieldDateofLastRelative.getText());
				relList.add(relObj);
				AddRelative_panel.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		btnSaveRelative.setBounds(142, 229, 156, 23);
		AddRelative_panel.add(btnSaveRelative);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddRelative_panel.setVisible(false);
				Create_panel.setVisible(true);
			}
		});
		btnBack_1.setBounds(170, 274, 89, 23);
		AddRelative_panel.add(btnBack_1);
		
		Panel AddProfessional_panel = new Panel();
		contentPane.add(AddProfessional_panel, "name_1118610121051317");
		AddProfessional_panel.setLayout(null);
		
		JLabel label = new JLabel("Name");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(56, 11, 88, 31);
		AddProfessional_panel.add(label);
		
		JLabel lblMobileNo_1 = new JLabel("Mobile No.");
		lblMobileNo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMobileNo_1.setBounds(56, 53, 88, 31);
		AddProfessional_panel.add(lblMobileNo_1);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmailAddress.setBounds(56, 95, 108, 31);
		AddProfessional_panel.add(lblEmailAddress);
		
		JLabel lblCommonProfessionalInterests = new JLabel("Common Professional Interests:");
		lblCommonProfessionalInterests.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCommonProfessionalInterests.setBounds(56, 137, 228, 31);
		AddProfessional_panel.add(lblCommonProfessionalInterests);
		
		textFieldProfessionalName = new JTextField();
		textFieldProfessionalName.setBounds(164, 18, 186, 20);
		AddProfessional_panel.add(textFieldProfessionalName);
		textFieldProfessionalName.setColumns(10);
		
		textFieldProfessionalMobile = new JTextField();
		textFieldProfessionalMobile.setColumns(10);
		textFieldProfessionalMobile.setBounds(164, 60, 186, 20);
		AddProfessional_panel.add(textFieldProfessionalMobile);
		
		textFieldProfessionalEmail = new JTextField();
		textFieldProfessionalEmail.setColumns(10);
		textFieldProfessionalEmail.setBounds(164, 102, 186, 20);
		AddProfessional_panel.add(textFieldProfessionalEmail);
		
		textFieldProfessionalInterest = new JTextField();
		textFieldProfessionalInterest.setColumns(10);
		textFieldProfessionalInterest.setBounds(164, 165, 186, 20);
		AddProfessional_panel.add(textFieldProfessionalInterest);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Professional_info profObj=new Professional_info();
				profObj.setName(textFieldProfessionalName.getText());
				profObj.setMobile(textFieldProfessionalMobile.getText());
				profObj.setEmail(textFieldProfessionalEmail.getText());
				if(textFieldProfessionalInterest.getText().length()<=100){
					profObj.setCommon_interest(textFieldProfessionalInterest.getText());
				}
				else profObj.setCommon_interest(textFieldProfessionalInterest.getText().substring(0, Math.min(textFieldProfessionalInterest.getText().length(), 100)));
				profList.add(profObj);
				AddProfessional_panel.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		btnNewButton.setBounds(164, 217, 165, 23);
		AddProfessional_panel.add(btnNewButton);
		
		JButton btnBack_2 = new JButton("Back");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddProfessional_panel.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		btnBack_2.setBounds(195, 269, 89, 23);
		AddProfessional_panel.add(btnBack_2);
		
		Panel AddPersonal_panel = new Panel();
		contentPane.add(AddPersonal_panel, "name_1119057441686288");
		AddPersonal_panel.setLayout(null);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(10, 12, 88, 31);
		AddPersonal_panel.add(label_1);
		
		JLabel lblMobile = new JLabel("Mobile No.");
		lblMobile.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMobile.setBounds(10, 53, 88, 31);
		AddPersonal_panel.add(lblMobile);
		
		JLabel lblEmailAddress_1 = new JLabel("Email Address");
		lblEmailAddress_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmailAddress_1.setBounds(10, 95, 109, 31);
		AddPersonal_panel.add(lblEmailAddress_1);
		
		JLabel label_2 = new JLabel("Date on which acquainted");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(10, 135, 196, 31);
		AddPersonal_panel.add(label_2);
		
		JLabel lblContext = new JLabel("Context in which acquainted");
		lblContext.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContext.setBounds(10, 177, 205, 31);
		AddPersonal_panel.add(lblContext);
		
		JLabel lblSpecificEvents = new JLabel("Specific Events");
		lblSpecificEvents.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSpecificEvents.setBounds(10, 212, 205, 31);
		AddPersonal_panel.add(lblSpecificEvents);
		
		Button button_2 = new Button("Save");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Personal_info personalObj=new Personal_info();
				personalObj.setName(textFieldPersonalName.getText());
				personalObj.setMobile(textFieldPersonalMobile.getText());
				personalObj.setEmail(textFieldPersonalEmail.getText());
				personalObj.setDate_of_acquainted(textFieldPersonalDateofAcq.getText());
				if(textFieldPersonalContextofacq.getText().length()<=100){
					personalObj.setContext(textFieldPersonalContextofacq.getText());
				}
				else{
					personalObj.setContext(textFieldPersonalContextofacq.getText().substring(0, Math.min(textFieldPersonalContextofacq.getText().length(), 100)));
				}
				
				if(textFieldPersonalSpecificEvents.getText().length()<=100){
					personalObj.setSpecific_events(textFieldPersonalSpecificEvents.getText());
				}
				else{
					personalObj.setSpecific_events(textFieldPersonalSpecificEvents.getText().substring(0, Math.min(textFieldPersonalSpecificEvents.getText().length(), 100)));
				}
				personalList.add(personalObj);
				AddPersonal_panel.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		button_2.setBounds(179, 254, 127, 31);
		AddPersonal_panel.add(button_2);
		
		textFieldPersonalName = new JTextField();
		textFieldPersonalName.setBounds(120, 19, 274, 20);
		AddPersonal_panel.add(textFieldPersonalName);
		textFieldPersonalName.setColumns(10);
		
		textFieldPersonalMobile = new JTextField();
		textFieldPersonalMobile.setColumns(10);
		textFieldPersonalMobile.setBounds(120, 60, 274, 20);
		AddPersonal_panel.add(textFieldPersonalMobile);
		
		textFieldPersonalEmail = new JTextField();
		textFieldPersonalEmail.setColumns(10);
		textFieldPersonalEmail.setBounds(120, 102, 274, 20);
		AddPersonal_panel.add(textFieldPersonalEmail);
		
		textFieldPersonalDateofAcq = new JTextField();
		textFieldPersonalDateofAcq.setColumns(10);
		textFieldPersonalDateofAcq.setBounds(197, 142, 196, 20);
		AddPersonal_panel.add(textFieldPersonalDateofAcq);
		
		textFieldPersonalContextofacq = new JTextField();
		textFieldPersonalContextofacq.setColumns(10);
		textFieldPersonalContextofacq.setBounds(210, 184, 184, 20);
		AddPersonal_panel.add(textFieldPersonalContextofacq);
		
		textFieldPersonalSpecificEvents = new JTextField();
		textFieldPersonalSpecificEvents.setColumns(10);
		textFieldPersonalSpecificEvents.setBounds(120, 219, 274, 20);
		AddPersonal_panel.add(textFieldPersonalSpecificEvents);
		
		JButton btnBack_3 = new JButton("Back");
		btnBack_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddPersonal_panel.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		btnBack_3.setBounds(197, 303, 89, 23);
		AddPersonal_panel.add(btnBack_3);
		
		Panel AddCasual_panel = new Panel();
		contentPane.add(AddCasual_panel, "name_1120322593228043");
		AddCasual_panel.setLayout(null);
		
		JLabel label_3 = new JLabel("Name");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setBounds(69, 11, 88, 31);
		AddCasual_panel.add(label_3);
		
		textFieldCausalName = new JTextField();
		textFieldCausalName.setColumns(10);
		textFieldCausalName.setBounds(184, 18, 186, 20);
		AddCasual_panel.add(textFieldCausalName);
		
		JLabel lblMobileNo_2 = new JLabel("Mobile no.");
		lblMobileNo_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMobileNo_2.setBounds(69, 53, 88, 31);
		AddCasual_panel.add(lblMobileNo_2);
		
		textFieldCasualMobile = new JTextField();
		textFieldCasualMobile.setColumns(10);
		textFieldCasualMobile.setBounds(184, 60, 186, 20);
		AddCasual_panel.add(textFieldCasualMobile);
		
		JLabel lblEmail_1 = new JLabel("Email Address");
		lblEmail_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail_1.setBounds(69, 95, 105, 31);
		AddCasual_panel.add(lblEmail_1);
		
		textFieldCasualEmail = new JTextField();
		textFieldCasualEmail.setColumns(10);
		textFieldCasualEmail.setBounds(184, 102, 186, 20);
		AddCasual_panel.add(textFieldCasualEmail);
		
		JLabel lblWhenAndWhere = new JLabel("When ");
		lblWhenAndWhere.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWhenAndWhere.setBounds(69, 137, 105, 31);
		AddCasual_panel.add(lblWhenAndWhere);
		
		textFieldCasualWhen = new JTextField();
		textFieldCasualWhen.setColumns(10);
		textFieldCasualWhen.setBounds(184, 144, 186, 20);
		AddCasual_panel.add(textFieldCasualWhen);
		
		JLabel lblWhere = new JLabel("Where");
		lblWhere.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWhere.setBounds(69, 179, 105, 31);
		AddCasual_panel.add(lblWhere);
		
		textFieldCasualWhere = new JTextField();
		textFieldCasualWhere.setColumns(10);
		textFieldCasualWhere.setBounds(184, 186, 186, 20);
		AddCasual_panel.add(textFieldCasualWhere);
		
		JLabel lblCircumstances = new JLabel("Circumstances");
		lblCircumstances.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCircumstances.setBounds(69, 221, 105, 31);
		AddCasual_panel.add(lblCircumstances);
		
		textFieldCasualCircumstances = new JTextField();
		textFieldCasualCircumstances.setColumns(10);
		textFieldCasualCircumstances.setBounds(184, 228, 186, 20);
		AddCasual_panel.add(textFieldCasualCircumstances);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Casual_info casualObj=new Casual_info();
				casualObj.setName(textFieldCausalName.getText());
				casualObj.setMobile(textFieldCasualMobile.getText());
				casualObj.setEmail(textFieldCasualEmail.getText());
				casualObj.setWhen(textFieldCasualWhen.getText());
				if(textFieldCasualWhere.getText().length()<=100)casualObj.setWhere(textFieldCasualWhere.getText());
				else{
					casualObj.setWhere(textFieldCasualWhere.getText().substring(0, Math.min(textFieldCasualWhere.getText().length(), 100)));
				}
				if(textFieldCasualCircumstances.getText().length()<=100){
					casualObj.setCircumstances(textFieldCasualCircumstances.getText());
				}
				else{
					casualObj.setCircumstances(textFieldCasualCircumstances.getText().substring(0, Math.min(textFieldCasualCircumstances.getText().length(), 100)));
				}
				casualList.add(casualObj);
				AddCasual_panel.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		btnSave.setBounds(158, 273, 150, 23);
		AddCasual_panel.add(btnSave);
		
		JButton btnBack_4 = new JButton("Back");
		btnBack_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddCasual_panel.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		btnBack_4.setBounds(188, 307, 89, 23);
		AddCasual_panel.add(btnBack_4);
		
		
		JButton btnSetRelatives = new JButton("Relatives");
		btnSetRelatives.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Create_panel.setVisible(false);
				//setTitle("Relatives");
				AddRelative_panel.setVisible(true);
			}
		});
		btnSetRelatives.setBounds(84, 88, 293, 23);
		Create_panel.add(btnSetRelatives);
		
		JButton btnSetProfessionalFriends = new JButton("Professional Friends");
		btnSetProfessionalFriends.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Create_panel.setVisible(false);
				//setTitle("Professional Friends");
				AddProfessional_panel.setVisible(true);
			}
		});
		btnSetProfessionalFriends.setBounds(84, 131, 293, 23);
		Create_panel.add(btnSetProfessionalFriends);
		
		JButton btnSetPersonalFriends = new JButton("Personal Friends");
		btnSetPersonalFriends.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Create_panel.setVisible(false);
			//	setTitle("Personal Friends");
				AddPersonal_panel.setVisible(true);
			}
		});
		btnSetPersonalFriends.setBounds(84, 174, 293, 23);
		Create_panel.add(btnSetPersonalFriends);
		
		JButton btnSetCasualFriends = new JButton("Casual Friends");
		btnSetCasualFriends.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Create_panel.setVisible(false);
				//setTitle("Casual Friends");
				AddCasual_panel.setVisible(true);
			}
		});
		btnSetCasualFriends.setBounds(84, 217, 293, 23);
		Create_panel.add(btnSetCasualFriends);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Create_panel.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		btnBack.setBounds(184, 272, 89, 23);
		Create_panel.add(btnBack);
		
		Panel Delete_panel = new Panel();
		contentPane.add(Delete_panel, "name_1141387518609430");
		Delete_panel.setLayout(null);
		
		JLabel lblEnterTheName = new JLabel("ENTER THE NAME OF ACQUAINTANCES");
		lblEnterTheName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterTheName.setBounds(66, 26, 358, 41);
		Delete_panel.add(lblEnterTheName);
		
		textFieldDelete = new JTextField();
		textFieldDelete.setBounds(76, 74, 265, 26);
		Delete_panel.add(textFieldDelete);
		textFieldDelete.setColumns(10);
		
		JLabel labelDel=new JLabel();
		labelDel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelDel.setBounds(75, 145, 350, 95);
		Delete_panel.add(labelDel);
		
		JButton btnDelete_1 = new JButton("DELETE");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String temp;
				int i;
				temp=textFieldDelete.getText();
				for(i=0;i<relList.size();i++){
					if(temp.equals(relList.get(i).getName())){
						relList.remove(i);
						labelDel.setText("This Person was your Relative,Deleted Successfully");
						break;
					}
				}
				for(i=0;i<profList.size();i++){
					if(temp.equals(profList.get(i).getName())){
						profList.remove(i);
						labelDel.setText("This Person was your Professional Friend,Deleted Successfully");
						break;
					}
				}
				for(i=0;i<personalList.size();i++){
					if(temp.equals(personalList.get(i).getName())){
						personalList.remove(i);
						labelDel.setText("This Person was your Personal Friend,Deleted Successfully");
						break;
					}
				}
				for(i=0;i<casualList.size();i++){
					if(temp.equals(casualList.get(i).getName())){
						casualList.remove(i);
						labelDel.setText("This Person was your Casual Friend,Deleted Successfully");
						break;
					}
				}
				
			}
		});
		btnDelete_1.setBounds(159, 128, 89, 23);
		Delete_panel.add(btnDelete_1);
		
		JButton btnBack_5 = new JButton("Back");
		btnBack_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Delete_panel.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		btnBack_5.setBounds(169, 319, 89, 23);
		Delete_panel.add(btnBack_5);
		
		
		
		
	
		
		
		
		Button btnCreate = new Button("Create Acquaintances");
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setBounds(117, 35, 168, 22);
		btnCreate.setBackground(Color.BLACK);
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldNameRelative.setText("");
				textFieldMobileRelative.setText("");
				textFieldEmailRelative.setText("");
				textFieldNameRelative.setText("");
				textFieldDOBRelative.setText("");
				textFieldDateofLastRelative.setText("");
				textFieldProfessionalName.setText("");
				textFieldProfessionalMobile.setText("");
				textFieldProfessionalEmail.setText("");
				textFieldProfessionalName.setText("");
				textFieldProfessionalInterest.setText("");
				textFieldPersonalName.setText("");
				textFieldPersonalMobile.setText("");
				textFieldPersonalEmail.setText("");
				textFieldPersonalDateofAcq.setText("");
				textFieldPersonalContextofacq.setText("");
				textFieldPersonalSpecificEvents.setText("");
				textFieldCausalName.setText("");
				textFieldCasualMobile.setText("");
				textFieldCasualEmail.setText("");
				textFieldProfessionalName.setText("");
				textFieldCasualWhen.setText("");
				textFieldCasualWhere.setText("");
				textFieldCasualCircumstances.setText("");
				Main_panel.setVisible(false);
				Create_panel.setVisible(true);
				//setTitle("Select Type");
			}
		});
		Main_panel.setLayout(null);
		Main_panel.add(btnCreate);
		
		Button btnDelete = new Button("Delete Acquaintances");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldDelete.setText("");
				labelDel.setText("");
				Main_panel.setVisible(false);
				Delete_panel.setVisible(true);
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBounds(117, 70, 168, 22);
		btnDelete.setBackground(Color.BLACK);
		Main_panel.add(btnDelete);
		
		Button btnDisplay = new Button("Display all Acquaintances");
		btnDisplay.setForeground(Color.WHITE);
		btnDisplay.setBackground(Color.BLACK);
		btnDisplay.setBounds(117, 105, 168, 22);
		
		Panel Displayall_panel = new Panel();
		contentPane.add(Displayall_panel, "name_1139319483754968");
		Displayall_panel.setLayout(null);
		
		
		

		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Displayall_panel.removeAll();

				lblName_1 = new JLabel("NAME");
				lblName_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblName_1.setBounds(56, 11, 117, 24);
				Displayall_panel.add(lblName_1);
				
				JLabel lblType = new JLabel("TYPE");
				lblType.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblType.setBounds(265, 11, 117, 24);
				Displayall_panel.add(lblType);

				JButton btnBack_6 = new JButton("Back");
				btnBack_6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Displayall_panel.setVisible(false);
						Main_panel.setVisible(true);
					}
				});
				btnBack_6.setBounds(159, 319, 89, 23);
				Displayall_panel.add(btnBack_6);
				int i,j;
				j=19;
				for(i=0;i<relList.size();i++){
					JLabel label=new JLabel(relList.get(i).getName());
					JLabel label1=new JLabel("Relative");
					label.setFont(new Font("Tahoma", Font.PLAIN, 14));
					label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
					label1.setBounds(265, j, 350, 95);
					label.setBounds(75, j, 350, 95);
					Displayall_panel.add(label);
					Displayall_panel.add(label1);
					j+=20;
				}
				for(i=0;i<profList.size();i++){
					JLabel label=new JLabel(profList.get(i).getName());
					JLabel label1=new JLabel("Professional Friend");
					label.setFont(new Font("Tahoma", Font.PLAIN, 14));
					label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
					label1.setBounds(265, j, 350, 95);
					label.setBounds(75, j, 350, 95);
					Displayall_panel.add(label);
					Displayall_panel.add(label1);
					j+=20;
				}
				for(i=0;i<personalList.size();i++){
					JLabel label=new JLabel(personalList.get(i).getName());
					JLabel label1=new JLabel("Personal Friend");
					label.setFont(new Font("Tahoma", Font.PLAIN, 14));
					label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
					label1.setBounds(265, j, 350, 95);
					label.setBounds(75, j, 350, 95);
					Displayall_panel.add(label);
					Displayall_panel.add(label1);
					j+=20;
				}
				for(i=0;i<casualList.size();i++){
					JLabel label=new JLabel(casualList.get(i).getName());
					JLabel label1=new JLabel("Casual Friend");
					label.setFont(new Font("Tahoma", Font.PLAIN, 14));
					label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
					label1.setBounds(265, j, 350, 95);
					label.setBounds(75, j, 350, 95);
					Displayall_panel.add(label);
					Displayall_panel.add(label1);
					j+=20;
				}
				
				Displayall_panel.setVisible(true);
				Main_panel.setVisible(false);
				
			}
		});
		Main_panel.add(btnDisplay);
		
		Panel Search_panel = new Panel();
		contentPane.add(Search_panel, "name_1143676271715136");
		Search_panel.setLayout(null);
		
		JLabel lblEnterTheName_1 = new JLabel("ENTER THE NAME OF ACQUAINTANCE");
		lblEnterTheName_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterTheName_1.setBounds(66, 21, 358, 41);
		Search_panel.add(lblEnterTheName_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(76, 73, 265, 26);
		Search_panel.add(textField);
		
		Button button_1 = new Button("Search Acquaintance");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				Main_panel.setVisible(false);
				Search_panel.setVisible(true);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(117, 140, 168, 22);
		Main_panel.add(button_1);
		
		button_3 = new Button("Save Data to a file");
		
		//button_3.setActionCommand("");
		button_3.setForeground(Color.WHITE);
		button_3.setBackground(Color.BLACK);
		button_3.setBounds(117, 175, 168, 22);
		Main_panel.add(button_3);
		
		button_4 = new Button("Read Data from saved file");
		button_4.setForeground(Color.WHITE);
		button_4.setBackground(Color.BLACK);
		button_4.setActionCommand("");
		button_4.setBounds(117, 210, 168, 22);
		Main_panel.add(button_4);
		
		
		
		DisplaySearched_panel = new Panel();
		contentPane.add(DisplaySearched_panel, "name_1144044684131031");
		DisplaySearched_panel.setLayout(null);
		
		JButton btnBack_7 = new JButton("Back");
		btnBack_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DisplaySearched_panel.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		btnBack_7.setBounds(164, 319, 89, 23);
		DisplaySearched_panel.add(btnBack_7);
		
		Panel DisplaySearchedProf = new Panel();
		contentPane.add(DisplaySearchedProf, "name_1177417065767833");
		DisplaySearchedProf.setLayout(null);
		
		JButton btnBack_8 = new JButton("Back");
		btnBack_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DisplaySearchedProf.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		btnBack_8.setBounds(160, 319, 89, 23);
		DisplaySearchedProf.add(btnBack_8);
		
		
		Panel DisplaySearchedPersonal = new Panel();
		contentPane.add(DisplaySearchedPersonal, "name_1177984405860236");
		DisplaySearchedPersonal.setLayout(null);
		
		JButton btnBack_9 = new JButton("Back");
		btnBack_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DisplaySearchedPersonal.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		btnBack_9.setBounds(169, 319, 89, 23);
		DisplaySearchedPersonal.add(btnBack_9);
		
		Panel DisplaySearchedCasual = new Panel();
		contentPane.add(DisplaySearchedCasual, "name_1178107081100717");
		DisplaySearchedCasual.setLayout(null);
		
		JButton btnBack_10 = new JButton("Back");
		btnBack_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DisplaySearchedCasual.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		btnBack_10.setBounds(178, 330, 89, 23);
		DisplaySearchedCasual.add(btnBack_10);
		
		JLabel lblName1 = new JLabel("Name");
		lblName1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName1.setBounds(44, 11, 88, 31);
		DisplaySearched_panel.add(lblName1);
		
		JLabel lblMobileNo1 = new JLabel("Mobile No.");
		lblMobileNo1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMobileNo1.setBounds(44, 53, 88, 31);
		DisplaySearched_panel.add(lblMobileNo1);
		
		JLabel lblEmail1 = new JLabel("Email address");
		lblEmail1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail1.setBounds(44, 95, 123, 31);
		DisplaySearched_panel.add(lblEmail1);
		
		JLabel lblDateOfBirth1 = new JLabel("Date of Birth");
		lblDateOfBirth1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDateOfBirth1.setBounds(44, 137, 123, 31);
		DisplaySearched_panel.add(lblDateOfBirth1);
		
		JLabel lblDateOfLast1 = new JLabel("Date of Last Meeting");
		lblDateOfLast1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDateOfLast1.setBounds(44, 179, 142, 31);
		DisplaySearched_panel.add(lblDateOfLast1);
		
		JTextField textFieldNameRelative1 = new JTextField();
		textFieldNameRelative1.setBounds(189, 18, 187, 20);
		
		textFieldNameRelative1.setEditable(false);
		DisplaySearched_panel.add(textFieldNameRelative1);
		textFieldNameRelative.setColumns(10);
		
		JTextField textFieldMobileRelative1 = new JTextField();
		textFieldMobileRelative1.setColumns(10);
		textFieldMobileRelative1.setBounds(189, 60, 187, 20);
		
		textFieldMobileRelative1.setEditable(false);
		DisplaySearched_panel.add(textFieldMobileRelative1);
		
		JTextField textFieldEmailRelative1 = new JTextField();
		textFieldEmailRelative1.setColumns(10);
		textFieldEmailRelative1.setBounds(189, 102, 187, 20);
		
		textFieldEmailRelative1.setEditable(false);
		DisplaySearched_panel.add(textFieldEmailRelative1);
		
		JTextField textFieldDOBRelative1 = new JTextField();
		textFieldDOBRelative1.setColumns(10);
		textFieldDOBRelative1.setBounds(189, 144, 187, 20);
		
		textFieldDOBRelative1.setEditable(false);
		DisplaySearched_panel.add(textFieldDOBRelative1);
		
		JTextField textFieldDateofLastRelative1 = new JTextField();
		textFieldDateofLastRelative1.setColumns(10);
		textFieldDateofLastRelative1.setBounds(189, 186, 187, 20);
		
		textFieldDateofLastRelative1.setEditable(false);
		DisplaySearched_panel.add(textFieldDateofLastRelative1);
		
		JLabel label2 = new JLabel("Name");
		label2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label2.setBounds(56, 11, 88, 31);
		DisplaySearchedProf.add(label2);
		
		JLabel lblMobileNo_12 = new JLabel("Mobile No.");
		lblMobileNo_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMobileNo_12.setBounds(56, 53, 88, 31);
		DisplaySearchedProf.add(lblMobileNo_12);
		
		JLabel lblEmailAddress2 = new JLabel("Email Address");
		lblEmailAddress2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmailAddress2.setBounds(56, 95, 108, 31);
		DisplaySearchedProf.add(lblEmailAddress2);
		
		JLabel lblCommonProfessionalInterests2= new JLabel("Common Professional Interests:");
		lblCommonProfessionalInterests2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCommonProfessionalInterests2.setBounds(56, 137, 228, 31);
		DisplaySearchedProf.add(lblCommonProfessionalInterests2);
		
		JTextField textFieldProfessionalName2 = new JTextField();
		textFieldProfessionalName2.setBounds(164, 18, 186, 20);
		
		textFieldProfessionalName2.setEditable(false);
		textFieldProfessionalName2.setColumns(10);
		DisplaySearchedProf.add(textFieldProfessionalName2);
		
		JTextField textFieldProfessionalMobile2 = new JTextField();
		textFieldProfessionalMobile2.setColumns(10);
		textFieldProfessionalMobile2.setBounds(164, 60, 186, 20);
		
		textFieldProfessionalMobile2.setEditable(false);
		DisplaySearchedProf.add(textFieldProfessionalMobile2);
		
		JTextField textFieldProfessionalEmail2 = new JTextField();
		textFieldProfessionalEmail2.setColumns(10);
		textFieldProfessionalEmail2.setBounds(164, 102, 186, 20);
		
		textFieldProfessionalEmail2.setEditable(false);
		DisplaySearchedProf.add(textFieldProfessionalEmail2);
		
		JTextField textFieldProfessionalInterest2 = new JTextField();
		textFieldProfessionalInterest2.setColumns(10);
		textFieldProfessionalInterest2.setBounds(164, 165, 186, 20);
		
		textFieldProfessionalInterest2.setEditable(false);
		DisplaySearchedProf.add(textFieldProfessionalInterest2);
		
		JLabel label_11 = new JLabel("Name");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_11.setBounds(10, 12, 88, 31);
		DisplaySearchedPersonal.add(label_11);
		
		JLabel lblMobile1 = new JLabel("Mobile No.");
		lblMobile1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMobile1.setBounds(10, 53, 88, 31);
		DisplaySearchedPersonal.add(lblMobile1);
		
		JLabel lblEmailAddress_11 = new JLabel("Email Address");
		lblEmailAddress_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmailAddress_11.setBounds(10, 95, 109, 31);
		DisplaySearchedPersonal.add(lblEmailAddress_11);
		
		JLabel label_21 = new JLabel("Date on which acquainted");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_21.setBounds(10, 135, 196, 31);
		DisplaySearchedPersonal.add(label_21);
		
		JLabel lblContext1 = new JLabel("Context in which acquainted");
		lblContext1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContext1.setBounds(10, 177, 205, 31);
		DisplaySearchedPersonal.add(lblContext1);
		
		JLabel lblSpecificEvents1 = new JLabel("Specific Events");
		lblSpecificEvents1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSpecificEvents1.setBounds(10, 212, 205, 31);
		DisplaySearchedPersonal.add(lblSpecificEvents1);
		
		JTextField textFieldPersonalName = new JTextField();
		textFieldPersonalName.setBounds(120, 19, 274, 20);
		
		textFieldPersonalName.setEditable(false);
		DisplaySearchedPersonal.add(textFieldPersonalName);
		textFieldPersonalName.setColumns(10);
		
		JTextField textFieldPersonalMobile = new JTextField();
		textFieldPersonalMobile.setColumns(10);
		textFieldPersonalMobile.setBounds(120, 60, 274, 20);
		textFieldPersonalMobile.setEditable(false);
		DisplaySearchedPersonal.add(textFieldPersonalMobile);
		
		JTextField textFieldPersonalEmail = new JTextField();
		textFieldPersonalEmail.setColumns(10);
		textFieldPersonalEmail.setBounds(120, 102, 274, 20);
		
		textFieldPersonalEmail.setEditable(false);
		DisplaySearchedPersonal.add(textFieldPersonalEmail);
		
		JTextField textFieldPersonalDateofAcq = new JTextField();
		textFieldPersonalDateofAcq.setColumns(10);
		textFieldPersonalDateofAcq.setBounds(197, 142, 196, 20);
		
		textFieldPersonalDateofAcq.setEditable(false);
		DisplaySearchedPersonal.add(textFieldPersonalDateofAcq);
		
		JTextField textFieldPersonalContextofacq = new JTextField();
		textFieldPersonalContextofacq.setColumns(10);
		textFieldPersonalContextofacq.setBounds(210, 184, 184, 20);
		
		textFieldPersonalContextofacq.setEditable(false);
		DisplaySearchedPersonal.add(textFieldPersonalContextofacq);
		
		JTextField textFieldPersonalSpecificEvents = new JTextField();
		textFieldPersonalSpecificEvents.setColumns(10);
		textFieldPersonalSpecificEvents.setBounds(120, 219, 274, 20);
		
		textFieldPersonalSpecificEvents.setEditable(false);
		DisplaySearchedPersonal.add(textFieldPersonalSpecificEvents);
		
		JLabel label_31 = new JLabel("Name");
		label_31.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_31.setBounds(69, 11, 88, 31);
		DisplaySearchedCasual.add(label_31);
		
		JTextField textFieldCausalName = new JTextField();
		textFieldCausalName.setColumns(10);
		textFieldCausalName.setBounds(184, 18, 186, 20);
		
		textFieldCausalName.setEditable(false);
		DisplaySearchedCasual.add(textFieldCausalName);
		
		JLabel lblMobileNo_21 = new JLabel("Mobile no.");
		lblMobileNo_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMobileNo_21.setBounds(69, 53, 88, 31);
		DisplaySearchedCasual.add(lblMobileNo_21);
		
		JTextField textFieldCasualMobile1 = new JTextField();
		textFieldCasualMobile1.setColumns(10);
		textFieldCasualMobile1.setBounds(184, 60, 186, 20);
		
		textFieldCasualMobile1.setEditable(false);
		DisplaySearchedCasual.add(textFieldCasualMobile1);
		
		JLabel lblEmail_11 = new JLabel("Email Address");
		lblEmail_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail_11.setBounds(69, 95, 105, 31);
		DisplaySearchedCasual.add(lblEmail_11);
		
		JTextField textFieldCasualEmail = new JTextField();
		textFieldCasualEmail.setColumns(10);
		textFieldCasualEmail.setBounds(184, 102, 186, 20);
		
		textFieldCasualEmail.setEditable(false);
		DisplaySearchedCasual.add(textFieldCasualEmail);
		
		JLabel lblWhenAndWhere1 = new JLabel("When ");
		lblWhenAndWhere1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWhenAndWhere1.setBounds(69, 137, 105, 31);
		DisplaySearchedCasual.add(lblWhenAndWhere1);
		
		JTextField textFieldCasualWhen = new JTextField();
		textFieldCasualWhen.setColumns(10);
		textFieldCasualWhen.setBounds(184, 144, 186, 20);
		
		textFieldCasualWhen.setEditable(false);
		
		DisplaySearchedCasual.add(textFieldCasualWhen);
		
		JLabel lblWhere1 = new JLabel("Where");
		lblWhere1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWhere1.setBounds(69, 179, 105, 31);
		DisplaySearchedCasual.add(lblWhere1);
		
		JTextField textFieldCasualWhere = new JTextField();
		textFieldCasualWhere.setColumns(10);
		textFieldCasualWhere.setBounds(184, 186, 186, 20);
		
		textFieldCasualWhere.setEditable(false);
		DisplaySearchedCasual.add(textFieldCasualWhere);
		
		JLabel lblCircumstances1 = new JLabel("Circumstances");
		lblCircumstances1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCircumstances1.setBounds(69, 221, 105, 31);
		DisplaySearchedCasual.add(lblCircumstances1);
		
		JTextField textFieldCasualCircumstances = new JTextField();
		textFieldCasualCircumstances.setColumns(10);
		textFieldCasualCircumstances.setBounds(184, 228, 186, 20);
		
		textFieldCasualCircumstances.setEditable(false);
		DisplaySearchedCasual.add(textFieldCasualCircumstances);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i;
				String temp;
				temp=textField.getText();
				for(i=0;i<relList.size();i++){
					if(temp.equals(relList.get(i).getName())){
						textFieldNameRelative1.setText(relList.get(i).getName());
						textFieldMobileRelative1.setText(relList.get(i).getMobile());
						textFieldEmailRelative1.setText(relList.get(i).getEmail());
						textFieldDOBRelative1.setText(relList.get(i).getDOB());
						textFieldDateofLastRelative1.setText(relList.get(i).getDate_of_lastmeet());
						
						Search_panel.setVisible(false);
						DisplaySearched_panel.setVisible(true);
						break;
					}
				}
				for(i=0;i<profList.size();i++){
					if(temp.equals(profList.get(i).getName())){
						textFieldProfessionalName2.setText(profList.get(i).getName());
						textFieldProfessionalMobile2.setText(profList.get(i).getMobile());
						textFieldProfessionalEmail2.setText(profList.get(i).getEmail());
						textFieldProfessionalInterest2.setText(profList.get(i).getCommon_interest());
						Search_panel.setVisible(false);
						DisplaySearchedProf.setVisible(true);
						break;
					}
				}
				for(i=0;i<personalList.size();i++){
					if(temp.equals(personalList.get(i).getName())){
						textFieldPersonalName.setText(personalList.get(i).getName());
						textFieldPersonalMobile.setText(personalList.get(i).getMobile());
						textFieldPersonalEmail.setText(personalList.get(i).getEmail());
						textFieldPersonalDateofAcq.setText(personalList.get(i).getDate_of_acquainted());
						textFieldPersonalContextofacq.setText(personalList.get(i).getContext());
						textFieldPersonalSpecificEvents.setText(personalList.get(i).getSpecific_events());
						Search_panel.setVisible(false);
						DisplaySearchedPersonal.setVisible(true);
						break;
					}
				}
				for(i=0;i<casualList.size();i++){
					textFieldCausalName.setText(casualList.get(i).getName());
					textFieldCasualMobile1.setText(casualList.get(i).getMobile());
					textFieldCasualEmail.setText(casualList.get(i).getEmail());
					textFieldCasualWhen.setText(casualList.get(i).getWhen());
					textFieldCasualWhere.setText(casualList.get(i).getWhere());
					textFieldCasualCircumstances.setText(casualList.get(i).getCircumstances());
					
					Search_panel.setVisible(false);
					DisplaySearchedCasual.setVisible(true);
				}
				
			}
		});
		btnSearch.setBounds(157, 131, 89, 23);
		Search_panel.add(btnSearch);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Search_panel.setVisible(false);
				Main_panel.setVisible(true);
			}
		});
		button.setBounds(157, 305, 89, 23);
		Search_panel.add(button);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public ArrayList<relative_info> getRelList() {
		return relList;
	}

	public void setRelList(ArrayList<relative_info> relList) {
		this.relList = relList;
	}

	public ArrayList<Professional_info> getProfList() {
		return profList;
	}

	public void setProfList(ArrayList<Professional_info> profList) {
		this.profList = profList;
	}

	public ArrayList<Personal_info> getPersonalList() {
		return personalList;
	}

	public void setPersonalList(ArrayList<Personal_info> personalList) {
		this.personalList = personalList;
	}

	public ArrayList<Casual_info> getCasualList() {
		return casualList;
	}

	public void setCasualList(ArrayList<Casual_info> casualList) {
		this.casualList = casualList;
	}
}
