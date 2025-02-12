package cn.sunjian.io_vote;
/**
 * java.io练习：
 * 
 * 	功能描述：
 * 		有一个班采用民主投票方法推选班长，班长候选人共4位，每个人姓名及代号分别为：
 * 		张三1，李四2，王五3，赵六4。
 * 		程序操作员将每张选票上所填的代号（1/2/3/4）循环输入电脑，输入数字0结束输入，然后将所有候选人的得票情况显示出来，并显示最终当选者的信息。
 * 
 * Comparable比较器
 * Arrays类
 * 对象数组
 * 	
 * 	具体要求：
 * 		1.要求用面向对象方法，编写学生类Student，将候选人姓名、代号和票数保存到类Student中，并实现相应的getxxx和setxxx方法。
 * 		2.输入数据之前，显示出各位候选人的代号及姓名：（提示：建立一个候选人类型数组）。
 * 		3.循环执行接收键盘输入的班长候选人代号，直到输入的数字为0，结束选票的输入工作。
 * 		4.在接收每次输入的选票后要求验证该选票是否有效，即：如果输入的数不是0,1,2,3,4这五个数字之一，或者输入一串字母，应显示出错误提示信息：此选票无效，请输入正确的候选人代号！并继续等待输入。
 * 		5.输入结束后显示所有候选人的得票情况，如下所示;
 * 		6.输出最终当选者的相关信息，如下所示。
 * 		
 * 	因为程序中要使用对象数组的排序方式，所以在Student类里需要实现Comparable接口，并覆写compareTo()方法，指定排序规则。
 * 
 * @author sunjian
 *
 */
public class TestVote {

	public static void main(String[] args) {
		new Operate();
	}

}
