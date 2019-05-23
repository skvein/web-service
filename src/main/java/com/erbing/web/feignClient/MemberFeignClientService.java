package com.erbing.web.feignClient;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "erbing-member-service")
public interface MemberFeignClientService {
}
