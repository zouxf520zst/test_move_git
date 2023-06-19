package nacosconfig.lock;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:zouxf
 * @date 2023/3/23 17:26
 */
@Service
public class RedissonTest {
    @Autowired
    private RedissonClient redissonClient;

    public void lock() {
        RLock lock = this.redissonClient.getLock("lock");
        lock.lock();
    }
}
