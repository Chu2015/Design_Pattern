package behavior.chainOfResponsibility;

public class DepartManager extends Handler{

	@Override
	public String handlerFeeRequest(String user, double fee) {
		String str ="";
		if(fee<1000){
			if(user.equals("��Ů")){
				str="���ž�����׼"+user+"��"+fee+"Ԫ��������";
			}else{
				str="���ž�����׼"+user+"��"+fee+"Ԫ��������";
			}
		}else{
			if(this.getSuccessor()!=null)
			return this.getSuccessor().handlerFeeRequest(user, fee);
		}
		return str;
	}

}
