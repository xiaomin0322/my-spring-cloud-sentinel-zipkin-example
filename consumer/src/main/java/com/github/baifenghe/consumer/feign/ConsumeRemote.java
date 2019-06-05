package com.github.baifenghe.consumer.feign;

import java.util.concurrent.TimeUnit;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

import feign.Request;
import feign.Retryer;

/**
 * @author bfh
 * @since 1.0.0
 */
@FeignClient(name = "discovery-provider", url = "http://127.0.0.1:18082", fallback = ConsumeRemote.EchoServiceFallback.class, configuration = ConsumeRemote.FeignConfiguration.class)
public interface ConsumeRemote {

	/**
	 * Sentinel会给该方法加个资源名称
	 * @return
	 */
	@RequestMapping("/provider/echo")
	String echo();

	class FeignConfiguration {
		@Bean
		public EchoServiceFallback echoServiceFallback() {
			return new EchoServiceFallback();
		}

		/**
		 * hystrix 超时时间
		 */
		static int hystrixTimeOut = 1000;
		/**
		 * 请求超时时间
		 */
		static int requestTimeOut = 1000;

		@Bean
		public Request.Options options() {
			return new Request.Options(requestTimeOut, requestTimeOut);
		}

		@Bean
		Retryer feignRetryer() {
			// 最多访问一次
			return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 1);
		}
	}

	class EchoServiceFallback implements ConsumeRemote {
		@Override
		public String echo() {
			System.out.println("EchoServiceFallback=========================");
			return "echo fallback";
		}
	}

}
