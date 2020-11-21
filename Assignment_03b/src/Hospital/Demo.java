package Hospital;
import Basic.*;
import javax.swing.JOptionPane;
public class Demo 
{
		public static void main(String args[]) 
		{
			Doctor doc[]=new Doctor[20];
			Patient pat[]=new Patient[80];
			int choice=0;
			String pName,pAddress,dName,dDepartment,dSpecialization;
			long pCNIC,pPhone,dCNIC,dPhone;
			int pAge,ward,room,bed,fee;
			char pGender,dGender;
			String date,time;
			String temp;
			int flag=0;
			int dIndex=0,pIndex=0;
			int option;
			do
			{
				String ch=JOptionPane.showInputDialog("1-	Add New Record\n"
						+ "2-	List of Docotrs\r\n"
						+ "3-	List of Indoor Patient\r\n"
						+ "4-	List of Outdoor Patients\r\n"
						+ "5-	Search a doctor by name or department\r\n"
						+ "6-	Appointments on a certain day\r\n"
						+ "7-	Appointments of a certain docotrs\r\n"
						+ "8-	Change date and time of Appointment\r\n"
						+ "9-	Exit.\r\n"
						+ "Enter choice:");
				choice=Integer.parseInt(ch);
				switch(choice)
				{
				case 1:
					do
					{
						temp=JOptionPane.showInputDialog("1. Add new Doctor\n"
								+ "2. Add Indoor Patient\n"
								+ "3. Add Outdoor Patient\n"
								+ "4. Back to main menu\n"
								+ "Enter choice:");
						option=Integer.parseInt(temp);
						switch(option)
						{
						case 1:
							dName=JOptionPane.showInputDialog("Enter Doctor Name: ");
							temp=JOptionPane.showInputDialog("Enter Doctor CNIC: ");
							dCNIC=Long.parseLong(temp);
							temp=JOptionPane.showInputDialog("Enter Doctor Phone: ");
							dPhone=Long.parseLong(temp);
							temp=JOptionPane.showInputDialog("Enter Doctor Gender: ");
							dGender=temp.charAt(0);
							dSpecialization=JOptionPane.showInputDialog("Enter Doctor Specialization: ");
							dDepartment=JOptionPane.showInputDialog("Enter Doctor department: ");
							doc[dIndex]=new Doctor(dName,dDepartment,dSpecialization,dCNIC,dPhone,dGender);
							dIndex++;
							break;
						case 2:
							pName=JOptionPane.showInputDialog("Enter Patient Name: ");
							temp=JOptionPane.showInputDialog("Enter Patient CNIC: ");
							pCNIC=Long.parseLong(temp);
							temp=JOptionPane.showInputDialog("Enter Patient Phone:");
							pPhone=Long.parseLong(temp);
							temp=JOptionPane.showInputDialog("Enter Patient Gender: ");
							pGender=temp.charAt(0);
							temp=JOptionPane.showInputDialog("Enter Ptient Age: ");
							pAge=Integer.parseInt(temp);
							pAddress=JOptionPane.showInputDialog("Enter Patient Address:");
							temp=JOptionPane.showInputDialog("Enter Patient Ward no: ");
							ward=Integer.parseInt(temp);
							temp=JOptionPane.showInputDialog("Enter Patient Room no: ");
							room=Integer.parseInt(temp);
							temp=JOptionPane.showInputDialog("Enter Patient Bed no: ");
							bed=Integer.parseInt(temp);
							temp=JOptionPane.showInputDialog("Enter Patient Fee: ");
							fee=Integer.parseInt(temp);
							date=JOptionPane.showInputDialog("Enter date (dd/mm/yy): ");
							dName=JOptionPane.showInputDialog("Enter Doctor Name: ");
							flag=0;
							for(int i=0;i<dIndex;i++) 
							{
								if(dName.compareTo(doc[i].getName())==0)
								{
									pat[pIndex]=new IndoorPatient(pName,pAddress,pCNIC,pPhone,pAge,pGender,ward,bed,room,fee,date,doc[i]);
									pIndex++;
									flag=1;
								}
							}
							break;
						case 3:
							pName=JOptionPane.showInputDialog("Enter Patient Name: ");
							temp=JOptionPane.showInputDialog("Enter Patient CNIC: ");
							pCNIC=Long.parseLong(temp);
							temp=JOptionPane.showInputDialog("Enter Patient Phone:");
							pPhone=Long.parseLong(temp);
							temp=JOptionPane.showInputDialog("Enter Patient Gender: ");
							pGender=temp.charAt(0);
							temp=JOptionPane.showInputDialog("Enter Ptient Age: ");
							pAge=Integer.parseInt(temp);
							pAddress=JOptionPane.showInputDialog("Enter Patient Address:");
							temp=JOptionPane.showInputDialog("Enter Patient Fee: ");
							fee=Integer.parseInt(temp);
							date=JOptionPane.showInputDialog("Enter date (dd/mm/yy): ");
							time=JOptionPane.showInputDialog("Enter time: ");
							dName=JOptionPane.showInputDialog("Enter Doctor Name: ");
							flag=0;
							for(int i=0;i<dIndex && flag==0;i++) 
							{
								if(dName.compareTo(doc[i].getName())==0)
								{
									pat[pIndex]=new OutdoorPateint(pName,pAddress,pCNIC,pPhone,pAge,pGender,fee,date,time,doc[i]);
									pIndex++;
									flag=1;
								}
							}
							break;
						case 4:
							break;
							default:
								JOptionPane.showMessageDialog(null, "Wrong choice");
						}
					}while(option!=4);				
					break;
				case 2:
					for(int i=0;i<dIndex;i++)
					{
						JOptionPane.showMessageDialog(null, doc[i]);
					}
					break;
				case 3:
					for(int i=0;i<pIndex;i++)
					{
						if(pat[i] instanceof IndoorPatient)
						{
							JOptionPane.showMessageDialog(null, pat[i].toString());
						}
					}
					break;
				case 4:
					for(int i=0;i<pIndex;i++)
					{
						if(pat[i] instanceof OutdoorPateint)
						{
							JOptionPane.showMessageDialog(null, pat[i].toString());
						}
					}
					break;
				case 5:
					temp=JOptionPane.showInputDialog(null, "1. Find By Name\n"
							+ "2. Find by Department\n"
							+ "3. Back to main menu\n"
							+ "Enter choice:");
					option=Integer.parseInt(temp);
					flag=0;
					if(option==1)
					{
						dName=JOptionPane.showInputDialog("Enter Doctor Name: ");
						for(int i=0;i<dIndex && flag==0;i++)
						{
							if(dName.compareTo(doc[i].getName())==0)
							{
								JOptionPane.showMessageDialog(null, doc[i]);
								flag=1;
							}
						}
					}
					else if(option==2)
					{
						dDepartment=JOptionPane.showInputDialog("Enter Doctor department: ");
						for(int i=0;i<dIndex && flag==0;i++)
						{
							if(dDepartment.compareTo(doc[i].getDepartment())==0)
							{
								JOptionPane.showMessageDialog(null, doc[i]);
								flag=1;
							}
						}
					}
					break;
				case 6:
					temp=JOptionPane.showInputDialog("Enter Appointment Day (dd/mm/yy)");
					Date d=new Date(temp);
					for(int i=0;i<pIndex;i++)
					{
						if(pat[i] instanceof OutdoorPateint)
						{
							if(d.getDay()==pat[i].getDate().getDay())
							{
								JOptionPane.showMessageDialog(null, pat[i].toString());
							}
						}
					}
					break;
				case 7:
					flag=0;
					dName=JOptionPane.showInputDialog("Enter Doctor Name: ");
					for(int i=0;i<pIndex && flag==0;i++)
					{
						if(pat[i] instanceof OutdoorPateint)
						{
							if(dName.compareTo(pat[i].getDoctor().getName())==0)
							{
								JOptionPane.showMessageDialog(null, pat[i]);
								flag=1;
							}
						}	
					}
					break;
				case 8:
					int check;
					pName=JOptionPane.showInputDialog("Enter Patient Name: ");
					for(int i=0;i<pIndex;i++)
					{
						if(pat[i]instanceof OutdoorPateint)
						{
							if(pName.compareTo(pat[i].getName())==0)
							{
									temp=JOptionPane.showInputDialog("Enter Appointment Day (dd/mm/yy)");
									Date da1=new Date(temp);
									pat[i].setDate(da1);
					
									temp=JOptionPane.showInputDialog("Enter Appointment Time: ");
									Time ta1=new Time(temp);
									pat[i].setTime(ta1);
								JOptionPane.showMessageDialog(null, "Change Successfully");
							}
						}
					}
					break;
				case 9:
					int quit = JOptionPane.showConfirmDialog(null,
					        "Are you sure you want to quit?",
					        "Confirm Quit", JOptionPane.YES_NO_CANCEL_OPTION);
					if (quit == JOptionPane.YES_OPTION) System.exit(0);
					break;
				default:
						JOptionPane.showMessageDialog(null, "Wrong choice");
				}
			}while(choice!=9);
		}
}
