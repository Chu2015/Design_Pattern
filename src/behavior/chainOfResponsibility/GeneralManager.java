package behavior.chainOfResponsibility;

public class GeneralManager extends Handler{

	@Override
	public String handlerFeeRequest(String user, double fee) {
		String str ="";
		if(fee>=1000){
			if(user.equals("��Ů")){
				str="�ܾ�����׼"+user+"��"+fee+"Ԫ��������";
			}else{
				str="�ܾ�����׼"+user+"��"+fee+"Ԫ��������";
			}
		}else{
			if(this.getSuccessor()!=null)
			return this.getSuccessor().handlerFeeRequest(user, fee);
		}
		return str;
	}

}
