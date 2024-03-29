/*
 * 琶推廃 牌鯉

走窒 砺戚鷺 (走窒杯域澗 +尻至戚壱 恥衝 舛至獣拭澗 -稽域至.)

端滴酵什 /劾促/ 紫遂鎧蝕 / 走窒榎衝 /歳嫌
==================================
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
====================================
       紫遂鎧蝕恥衝   煽舌馬奄獄動(植漆督析稽)

呪脊 砺戚鷺 (+ 尻至)	
端滴酵什 /劾促/ 呪脊鎧蝕/榎衝 /歳嫌
==================================
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
けけけけけけけけけけけけけけけけけけ
====================================
		呪脊恥衝     煽舌馬奄獄動(植漆)
 */
package jpj.client.record;

import javax.swing.*;
import javax.swing.table.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import jpj.client.calendar.JPJCalendarMain;
import jpj.data.JPJCalendarData;
import jpj.data.JPJMainData;
import jpj.data.JPJRecordData;

public class JPJSaveList extends JFrame{
	JPJCalendarMain main;
	
	
	
	
	
	
	Calendar cal;
	String[] header = {"識澱","No.","劾促","紫遂鎧蝕","呪脊/走窒榎衝","歳嫌","呪脊/走窒"};
	
	JButton saveB,delB , addRowB,modiB,delrowB;
	public JTable table;
	JScrollPane sp;
	JCheckBox[] box;
	public JLabel totalClb,totalSlb;
	public JPJTableModel model;
	int i =0;
	
	int totalC=0, totalS=0,tagprice; 
	String tag, pmNtag;
	
	public JComboBox CorS ,Cat;
	 
	String sorc, cate;
	 
	public String date ="";
	
	
	
	public void setForm() {	
		model = new JPJTableModel(header,0);
		table = new JTable(model);
		sp = new JScrollPane(table);
		sp.setBackground(Color.gray);
					
		
		saveB = new JButton("煽舌馬奄");
		/////////////////////////////
		saveB.setEnabled(false);
		////////////////////////////
		delB= new JButton("識澱肢薦");
		////////////////////
		delB.setToolTipText("引暗 煽舌 奄系掻拭 肢薦馬壱 粛精 牌鯉税 端滴酵什研 識澱馬壱 適遣背爽室推.");
		///////////////////////
		addRowB = new JButton("匝 蓄亜");
		modiB = new JButton("呪舛馬奄");
		delrowB = new JButton("匝 肢薦");
		//////////////////
		delrowB.setToolTipText("薄仙 奄系 掻昔 1鯵税 楳聖 肢薦背 掃艦陥. (端滴酵什 識澱馬走 原室推.)");
		/////////////////
		totalClb = new JLabel("恥 走窒 榎衝 : " + Integer.toString(totalC) + "  据",JLabel.LEFT);
		totalSlb = new JLabel("恥 呪脊 榎衝 : " + Integer.toString(totalS) + "  据   /   ",JLabel.LEFT);
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(totalSlb);
		p1.add(totalClb);
		p1.add(addRowB);
		p1.add(delrowB);
		p1.add(modiB);
		p1.add(delB);
		p1.add(saveB);
		
		
		
		
		this.add(sp);
		this.add(p1,"South");
		
		table.setAutoCreateRowSorter(true);
		this.setBounds(300, 300, 800, 405);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
	}
	public JPJSaveList(JPJCalendarMain m) {
		super("走窒奄系採");
		main =m;
		setForm();
		setEvt();			
	}//default const


	/*public String setDate(){
		cal = Calendar.getInstance();
		String year = Integer.toString( cal.get(Calendar.YEAR) ).trim();
		String month = Integer.toString( cal.get(Calendar.MONTH)+1 ).trim();
		String date = Integer.toString( cal.get(Calendar.DATE) ).trim();
		return year +"-" + month + "-" + date;
	}*/
	
	public void setEvt(){
		BtnEvt evt = new BtnEvt();//saveB,delB , addRowB;
		saveB.addActionListener(evt);
		delB.addActionListener(evt);
		addRowB.addActionListener(evt);
		modiB.addActionListener(evt);
		delrowB.addActionListener(evt);
		this.addWindowListener(new CloseWindow());
	}

	
	/*
	 * 室戚崎軒什闘 確葵 端滴 敗呪
	 */
	public void saveListNullCheck(){
		for(int i=0; i <model.getRowCount();i++){
			for(int j=0;j<model.getColumnCount();j++){
				
				if(j==1){//no 町軍精 鳶什.
					j++;
				}
				if(j==3){
					try {
						
					} catch (Exception e) {
						break;
					}
				}
				try {
					if(model.getValueAt(i, j).toString()== null || model.getValueAt(i, j).toString().length()==0){
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(main.savelistF, "牌鯉拭 舛左研 脊径背爽室推 .");
					return;
				}
				
			}
		}
		
	}
	
	
	public void saveProc(){ //植漆 督析煽舌精 析舘 汽戚斗今戚什拭 煽舌馬澗依採斗 失因馬檎 馬切.
		saveListNullCheck();
		JPJMainData data = new JPJMainData();
		JPJRecordData rdata = new JPJRecordData();
		
		//歳嫌楕拭 "呪脊/殿益" 号縦生稽 脊径馬切.
		//什巴鹸聖 戚遂背辞 呪脊 走窒 歳嫌牌鯉聖 姥歳馬切.
		//煽舌馬奄 獄動聖 刊牽檎 廃 匝梢 石嬢浬陥.
		int row = model.getRowCount();
		int col = model.getColumnCount();
		int chk=0;
		//int Sno=1;//壱政腰硲 亜走壱赤聖暗.
		//廃匝梢 煽舌拝 壕伸
		ArrayList<Object> arr = new ArrayList<Object>();
		//廃匝聖 煽舌拝 1託 壕伸
		totalC = 0;
		totalS = 0;
		
		for(i=0;i< row;i++){ // 析舘 食君匝 石嬢醤馬糠稽. 
			
			Object [] info = new Object[col]; //増嬢隔聖�� 壕伸稽隔製. 
			for(int j=0;j<col;j++){
				if(model.getValueAt(i, 4) != null){
					//走窒榎衝戚 脊径鞠醸聖凶幻 汽戚斗研 隔澗陥.
					if(j==0){
						boolean tem = (boolean) model.getValueAt(i, 0);
						if(tem){
							chk=1;//端滴鞠醸生檎 1
						}
						else if(!tem){
							chk=0;// 照鞠醸生檎 0
						}
					}
					if(j==2){//劾促研 増嬢隔嬢層陥.
						//model.setValueAt(setDate(), i, 1); 
					}					
					//if(j==3){
						//益掘覗拭 紫遂馬奄是廃 汽戚斗研 嗣奄是背辞 紫遂鎧蝕税 努什闘研 嗣澗陥.
					//	tag =  model.getValueAt(row, 2).toString();
					//}					
					if(j ==5){//歳嫌
						cate = CorS.getSelectedItem().toString().trim();
					}
					if(j==6){//呪脊 走窒 姥歳.
//						sorc = Cat.getSelectedItem().toString().trim();
						sorc = (String)model.getValueAt(i, 6);
						int temp = (int)model.getValueAt(i, 4);//廃匝税 榎衝採歳
						if(sorc.equals("呪脊")){//榎衝採歳税 呪脊走窒聖 姥歳廃陥.
							totalS += temp;
						}
						else if(sorc.equals("走窒")){
							totalC +=temp;
						}					
					}
					
					info[j]=model.getValueAt(i, j);
					//廃匝梢 石嬢辞 廃匝税 汽戚斗研 rowdata拭 煽舌廃依戚陥.
					//紫穿拭 走窒 砺戚鷺聖 幻級嬢砧嬢醤廃陥.  什砺戚闘胡闘 紫遂背醤廃陥. 辞獄拭 推短戚琶推.
					//煽舌拝凶 呪舛吉 紫牌戚 赤聖呪 赤生艦 古腰 湛匝採斗 魁匝猿走 伊紫馬壱 煽舌廃陥.
					//走窒衝聖 杯至馬食 恥衝 虞婚拭 妊獣背層陥.(是拭 識情喫)
				}//if(榎衝戚 奄脊鞠醸聖凶幻 拙疑敗)
				else{//走窒榎衝戚 脊径鞠走 省紹生糠稽
					return;
				}//else
			}//for
			//info[1] = Sno++; //1採斗 級嬢娃陥.
			arr.add(i, info); //arraylist拭 廃匝梢 煽舌吉陥.
		}//for
		rdata.totalS  = totalS;
		rdata.totalC = totalC;
		rdata.SaveInfo = arr;
		
		data.protocol =1114;
		data.recordData = rdata;
		
		data.isSuccess = "Y";
		try{
			this.main.oout.writeObject(data);
		}
		catch(Exception e){
			data.isSuccess = "N";
			e.printStackTrace();
		}
	}//saveProc()
	
		
	public void addRowProc(){
		//刊研凶原陥 乞季砺戚鷺拭 朔匝聖 廃匝梢 蓄亜廃陥.
		Object[] empty = new Object[model.getColumnCount()];
		// 災 什什 昔 什
		
		
		
		empty[0] = false;
		empty[2] = date;
			
		String[] kind = {"縦紫", "嘘搭","室榎","壱舛走窒","庚鉢/食亜","煽逐","奄展"};
        CorS = new JComboBox(kind);
        TableColumn column = table.getColumnModel().getColumn(5);
        column.setCellEditor(new DefaultCellEditor(CorS));
        
        String[] cate = {"呪脊", "走窒"};
        Cat = new JComboBox(cate);
        
        TableColumn column2 = table.getColumnModel().getColumn(6);
        column2.setCellEditor(new DefaultCellEditor(Cat));
		
		model.addRow(empty);
		///////////////////////////////////////////
		saveB.setEnabled(true);
		////////////////////////////////////////////
		 
	        
	}
		
		
	public void deleteProc() {
			try {
				
				JPJMainData mData = new JPJMainData();
				
				mData.protocol =1117;
				boolean temp =false;
				JPJRecordData rData= new JPJRecordData();
				
				for(int i =0; i <model.getRowCount();i++){
					
					temp = (boolean)table.getValueAt(i, 0);//端滴酵什
					
					if(temp){ //端滴鞠醸生檎 
						//鉢檎聖 走随形檎 戚依亀 護匝戚 識澱鞠醸澗走 煽舌背却 琶推亜 赤陥.
//						int Srow = table.getSelectedRow();
						//戚耕 乞窮 匝聖 宜壱赤生艦 端滴吉闇 i腰属 戚陥. 
						//識澱吉匝税 no 亀 煽舌廃陥.			
						rData.no = (int) table.getValueAt(i, 1); 
						rData.SaveInfo.add(rData.no);//辞獄拭辞掌
						//端滴亜true戚壱 益 no研 石聖凶 益 row研 亜閃紳陥.
						rData.SelectedRow.add(i); //軒獣崎拭辞掌
						//匝戚 嬢巨匝昔走 煽舌獣佃兜聖 琶推亜 赤嬢. 戚闇 端滴酵什 戚坤闘拭辞 坦軒.
					}//if
				}//for
				rData.date = this.date;
				
				mData.recordData = rData;
				
				try {
					main.oout.writeObject(mData);
				} catch (Exception e) {
						e.printStackTrace();
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(main.savelistF, "肢薦拝 楳聖 識澱背爽室推.");
			}
			
		
	}
	
		
	public void modiProc(){
		//呪舛 拝 匝 聖 硝焼鎧壱
		int row = table.getSelectedRow();
		if(row == -1) {
			return;
		}
		//匝税 舛左研 石壱. 劾促澗 壱舛績. 
		int no = (int)model.getValueAt(row, 1); //s_no			1
		String log = (String)model.getValueAt(row, 3);//s_log	2
		int cost = (int)model.getValueAt(row, 4);//s_cost		3
		String cate = (String)model.getValueAt(row, 5);//s_cate	4
		String kind = (String)model.getValueAt(row, 6);//s_kind	5
		//益 鎧遂聖 益企稽 気嬢 床壱.
		table.setValueAt(no, row,1);
		table.setValueAt(log, row, 3);
		table.setValueAt(cost, row, 4);
		table.setValueAt(cate, row, 5);
		table.setValueAt(kind, row, 6);
		//煽舌廃 鎧遂聖 辞獄拭 硝形爽嬢 汽戚斗亀 穣汽戚闘 獣轍陥.
		JPJMainData mData = new JPJMainData();
		JPJRecordData rData = new JPJRecordData();
		rData.no = no;
		rData.log = log;
		rData.cost = cost;
		rData.category = cate;
		rData.kind = kind;
		
		mData.recordData = rData;
		mData.protocol = 1116;
		
		try {
			main.oout.writeObject(mData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/////////////////////////////////
	public void delrowB(){
		int row =table.getSelectedRow();
		if(!(boolean)model.getValueAt(row, 0)){
			 
			 if(model.getValueAt(row, 1)==null){
				model.removeRow(row);
				return;
			}
		}
			
	}
	//////////////////////////////////
	class BtnEvt implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton target = (JButton) arg0.getSource();
			
			if(target == saveB){
				saveProc();
			}
			else if(target == delB){
				deleteProc();
			}
			else if(target == addRowB){
				addRowProc();
			}
			else if (target == modiB){
				modiProc();
			}
			else if (target == delrowB){
				delrowB();
			}
		}
	
	}//戚坤闘 適掘什

	
	class CloseWindow extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e){
			main.clearCalendar();
			main.getCalInfo();
			JPJSaveList.this.dispose();
		}
		
	}//制亀酔 適稽臓
}//main class





