import com.me.delegate.Professor;

/**
 * @author OuyangJie
 * @Date 2018/10/22 19:58
 * @Description:
 */
public class Official {
    public static void main(String[] args) {
        System.out.println("有一个政府网站要做，找个教授来");
        Professor professor = new Professor();
        System.out.println("教授把活分给学生做");
        professor.work("前端");
        professor.work("后台");
    }
}
