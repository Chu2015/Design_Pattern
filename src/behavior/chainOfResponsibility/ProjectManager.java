package behavior.chainOfResponsibility;

public class ProjectManager extends Handler{

	@Override
	public String handlerFeeRequest(String user, double fee) {
		String str ="";
		if(fee<500){
			if(user.equals("��Ů")){
				str="��Ŀ������׼"+user+"��"+fee+"Ԫ��������";
			}else{
				str="��Ŀ������׼"+user+"��"+fee+"Ԫ��������";
			}
		}else{
			if(this.getSuccessor()!=null)
			return this.getSuccessor().handlerFeeRequest(user, fee);
		}
		return str;
	}

}
