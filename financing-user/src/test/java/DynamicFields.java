import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Optional;

public class DynamicFields {
    private Object[][] fields;
    public DynamicFields(int inittialSize){
        fields = new Object[inittialSize][2];
        for (int i=0;i<inittialSize;i++){
            fields[i]=new Object[]{null,null};
        }
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Object[] objects:fields){
            stringBuilder.append(objects[0]);
            stringBuilder.append(";");
            stringBuilder.append(objects[1]);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    private int hasField(String id){
        for(int i=0;i<fields.length;i++){
            if(id.equals(fields[i][0])){
                return i;
            }
        }
        return -1;
    }
    private int makeField(String id){
        for(int i=0;i<fields.length;i++){
            if(null == fields[i][0]){
                fields[i][0] = id;
                return i;
            }
        }
        return -1;
    }

    public Object setFields(String id,Object value) {
        if(value == null){

        }
        int fieldNum = hasField(id);
        if(-1==fieldNum){
            fieldNum = makeField(id);
        }
        Object result =null;
        try{
            result =1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    static class testInvocation implements InvocationHandler{

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return Optional.ofNullable(1).orElse(2);
        }
    }

    public static void main(String[] args){
        DynamicFields df = new DynamicFields(3);
        System.out.println(df);
        df.setFields("d","A value for d");
        System.out.println(df);
        System.out.println(Proxy.isProxyClass( DynamicFields.class ));

    }
}
