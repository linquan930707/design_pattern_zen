package factoryModel.lazyFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 一个类被消费完毕后，不马上释放，等待再次利用
 * Map容纳所要创建的对象，有直接返回，没有创建放到map内下次使用
 * 应用场景：扩展新增最大容量，jdbc线程池链接设置最大容量就是内存中最大实例数量
 */
public class LazyFactory {
    private static final Map<String,Product> prMap = new HashMap<String,Product>();
    public static synchronized  Product getProduct(String type){
        Product product = null;
        if(prMap.containsKey(type)){
            product= prMap.get(type);
        }else{
            if(type.equals("product1")){
                product= new ConcreateProduct1();
                prMap.put("product1",product);
            }else{
                product = new ConcreateProduct2();
                prMap.put("product2",product);
            }
        }
        return product;
    }

}
