package structure.composite;

public class File implements IFile { 
    private String name;    //�ļ����� 
    private int deep;       //�㼶��� 

    public File(String name) { 
        this.name = name; 
    } 

    //�����Լ���ʵ�� 
    public IFile getComposite() { 
        return this; 
    } 

    //ĳ����ҵ���� 
    public void sampleOperation() { 
        System.out.println("ִ����ĳ����ҵ������"); 
    } 

    public String getName() { 
        return name; 
    } 

    public void setName(String name) { 
        this.name = name; 
    } 

    public int getDeep() { 
        return deep; 
    } 

    public void setDeep(int deep) { 
        this.deep = deep; 
    } 
}