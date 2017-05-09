package structure.composite;

import java.util.Iterator;
import java.util.Vector;

public class Client { 
    public static String indentChar = "\t";       //�ļ���������ַ� 

    public static void main(String args[]) { 
        new Client().test(); 
    } 

    /** 
     * �ͻ��˲��Է��� 
     */ 
    public void test() { 
        //�����ļ����ļ��� 
        Folder root = new Folder("����"); 

        Folder b1_1 = new Folder("1_֦1"); 
        Folder b1_2 = new Folder("1_֦2"); 
        Folder b1_3 = new Folder("1_֦3"); 
        File l1_1 = new File("1_Ҷ1"); 
        File l1_2 = new File("1_Ҷ2"); 
        File l1_3 = new File("1_Ҷ3"); 

        //b1_2�µ��ļ����ļ��� 
        Folder b2_1 = new Folder("2_֦1"); 
        Folder b2_2 = new Folder("2_֦2"); 
        File l2_1 = new File("2_Ҷ1"); 

        //�������Ĳ�ι�ϵ���򵥲��ԣ�û���ظ���ӵĿ��ƣ� 
        root.add(b1_1); 
        root.add(b1_2); 
        root.add(l1_1); 
        root.add(l1_2); 

        b1_2.add(b2_1); 
        b1_2.add(b2_2); 
        b1_2.add(l2_1); 
        root.add(l1_3); 
        root.add(b1_3); 
        //����̨��ӡ���Ĳ�� 
        outTree(root); 
    } 

    public void outTree(Folder folder) { 
        System.out.println(folder.getName()); 
        iterateTree(folder); 
    } 

    /** 
     * �����ļ��У������ļ��� 
     * 
     * @param folder 
     */ 
    public void iterateTree(Folder folder) { 
        Vector<IFile> clist = folder.getAllComponent(); 
        //todo:����֮ǰ���Զ�clist����������Щ�������ص� 
        for (Iterator<IFile> it = clist.iterator(); it.hasNext();) { 
            IFile em = it.next(); 
            if (em instanceof Folder) { 
                Folder cm = (Folder) em; 
                System.out.println(getIndents(em.getDeep()) + cm.getName()); 
                iterateTree(cm); //���ļ���Folder������
            } else { 
                System.out.println(getIndents(em.getDeep()) + ((File) em).getName()); 
            } 
        } 
    } 

    /** 
     * �ļ���������ַ� 
     * 
     * @param x �����ַ���� 
     * @return �����ַ� 
     */ 
    public static String getIndents(int x) { 
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < x; i++) { 
            sb.append(indentChar); 
        } 
        return sb.toString(); 
    } 
}