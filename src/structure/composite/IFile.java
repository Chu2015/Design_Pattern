package structure.composite;

public interface IFile { 
	    //�����Լ���ʵ�� 
	    IFile getComposite(); 

	    //ĳ����ҵ���� 
	    void sampleOperation(); 

	    //��ȡ��� 
	    int getDeep(); 

	    //������� 
	    void setDeep(int x); 
}

