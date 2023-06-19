package nacosconfig.config.controller;

import nacosconfig.config.controller.Service.ProxyTestService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * @author:zouxf
 * @date 2023/1/3 16:05
 */
@RestController
@RequestMapping("/config")
@Scope(value = "prototype")
//@RefreshScope
public class ConfigController {
//    @Value("${config.config}")
//    private String config;
//
//    @GetMapping("/config")
//    @ResponseBody
//    public String getConfig(){
//        return config;
//    }

//    属性注入
//    @Autowired
//    @Qualifier("test")
//    ITest test3;

//    setter方法注入
//    @Autowired
//    @Bean
//    public void test3(@Qualifier("test") ITest test2){
//        this.test3 = test2;
//    }

//    构造方法注入
//    public ConfigController(@Qualifier("test") ITest test3){
//        this.test3 = test3;
//    }

//    @Autowired
//    JedisPool jedisPool;

//    @RequestMapping(value = "test",method = RequestMethod.GET)
//    public String test(){
////        test3.eat();
//        Jedis jedis = jedisPool.getResource();
//        try {
////            jedis.set("test","520","nx","ex",20);
////            jedis.set("test2","520","nx","ex",20);
////            String script ="if redis.call('setnx','test','999')==0 then redis.call('set','1314','520') return 1 else return 0 end";
////            Object eval = jedis.eval(script);
//            ScanParams scanParams = new ScanParams();
//            scanParams.match("test*").count(10);
//
//            ScanResult<String> scan = jedis.scan("0", scanParams);
//            List<String> result = scan.getResult();
//            for (String s : result) {
//                System.out.println(s);
//            }
//            String age = jedis.hget("user:100", "age");
//            Map<String, String> stringStringMap = jedis.hgetAll("user:100");
//            Set<String> strings = stringStringMap.keySet();
//            for (String key : strings) {
//                String value = stringStringMap.get(key);
//                System.out.println("key:"+key+"-----value:"+value);
//            }
//
//            Set<String> zadd = jedis.zrangeByScore("zadd", 90, 150);
//            Set<Tuple> zadd1 = jedis.zrangeWithScores("zadd", 0, -1);
//            for (String zaddvalue : zadd) {
//                System.out.println("zadd-------value:"+zaddvalue);
//            }
//            for (Tuple tuple : zadd1) {
//                System.out.println("score:"+tuple.getScore()+"----value:"+tuple.getElement());
//            }
////            jedis.subscribe();
////            System.out.println(eval.toString());
//        }catch (Exception e){
//
//        }finally {
//            if (jedis !=null)
//                jedis.close();
//        }
//        return "123";
//    }

    @Resource
    ProxyTestService proxyTestService;
    @GetMapping("test2")
    public String test2(Integer ency){
        System.out.println(ency);
//        proxyTestService.hello();
        return "1234";
    }
}
