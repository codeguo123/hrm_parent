/*
package com.gzy.hrm.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;


@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {

    public List<SwaggerResource> get() {
        List resources = new ArrayList <SwaggerResource>();
        resources.add(swaggerResource("系统管理", "/services/sysmanage/v2/api-docs", "2.0"));
        resources.add(swaggerResource("用户管理 ", "/services/sysmanage/v2/api-docs", "2.0"));
        resources.add(swaggerResource("系统管理2", "/services/sysmanage/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
*/
