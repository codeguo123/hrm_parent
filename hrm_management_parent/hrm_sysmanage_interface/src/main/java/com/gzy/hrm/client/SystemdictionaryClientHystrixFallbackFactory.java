package com.gzy.hrm.client;

import com.gzy.hrm.domain.Systemdictionary;
import com.gzy.hrm.query.SystemdictionaryQuery;
import com.gzy.hrm.util.AjaxResult;
import com.gzy.hrm.util.PageList;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yaohuaipeng
 * @date 2018/10/8-16:18
 */
@Component
public class SystemdictionaryClientHystrixFallbackFactory implements FallbackFactory<SystemdictionaryClient> {

    @Override
    public SystemdictionaryClient create(Throwable throwable) {
        return new SystemdictionaryClient() {
            @Override
            public AjaxResult save(Systemdictionary systemdictionary) {
                return null;
            }

            @Override
            public AjaxResult delete(Integer id) {
                return null;
            }

            @Override
            public Systemdictionary get(Long id) {
                return null;
            }

            @Override
            public List<Systemdictionary> list() {
                return null;
            }

            @Override
            public PageList<Systemdictionary> json(SystemdictionaryQuery query) {
                return null;
            }
        };
    }
}
