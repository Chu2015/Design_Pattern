package behavior.chainOfResponsibility;

public class GeneralManager extends Handler{

	@Override
	public String handlerFeeRequest(String user, double fee) {
		String str ="";
		if(fee>=1000){
			if(user.equals("美女")){
				str="总经理批准"+user+"的"+fee+"元费用申请";
			}else{
				str="总经理不批准"+user+"的"+fee+"元费用申请";
			}
		}else{
			if(this.getSuccessor()!=null)
			return this.getSuccessor().handlerFeeRequest(user, fee);
		}
		return str;
	}

}
