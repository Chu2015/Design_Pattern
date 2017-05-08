package behavior.chainOfResponsibility;

public class ProjectManager extends Handler{

	@Override
	public String handlerFeeRequest(String user, double fee) {
		String str ="";
		if(fee<500){
			if(user.equals("美女")){
				str="项目经理批准"+user+"的"+fee+"元费用申请";
			}else{
				str="项目经理不批准"+user+"的"+fee+"元费用申请";
			}
		}else{
			if(this.getSuccessor()!=null)
			return this.getSuccessor().handlerFeeRequest(user, fee);
		}
		return str;
	}

}
