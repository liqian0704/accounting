package CustomerUser;

/**
 * Created by yp-tc-2646 on 18/6/5.
 */
public class CUDemoCompute implements CuDemoInterface {

    @Override
    public String computeAdd(float a, float b) {
        float result;
        String message="计算成功";

        result=a+b;

        return message+":结果为:"+result;
    }

    @Override
    public String sub(float a, float b) {
        float result;
        String message="计算成功";

        result=a-b;

        return message+":结果为:"+result;
    }

    @Override
    public String muli(float a, float b) {
        float result;
        String message="计算成功";

        result=a*b;

        return message+":结果为:"+result;
    }

    @Override
    public String division(float a, float b) {
        float result;
        String message="计算成功";

        if(b==0){
           // System.out.println("除数不能为0");
            message="error";
            return message;
        }else {

            result=a/b;

            return message+":结果为:"+result;
        }


    }
}
