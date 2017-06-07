package agg.samples;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;
import java.io.DataOutputStream;
import java.net.Socket;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.TimeUnit;





//import java.util.Base64;
import sun.misc.BASE64Encoder;

import javax.net.ssl.HttpsURLConnection;

import java.io.*;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.Clock;
import com.codahale.metrics.Counter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.Metered;
import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.ScheduledReporter;
import com.codahale.metrics.Snapshot;
import com.codahale.metrics.Timer;
import com.codahale.metrics.graphite.Graphite;
import com.codahale.metrics.graphite.GraphiteSender;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.ExportMetricWriter;
import org.springframework.boot.actuate.metrics.statsd.StatsdMetricWriter;
import org.springframework.boot.actuate.metrics.writer.MetricWriter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.codec.Base64;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.graphite.Graphite;
import com.codahale.metrics.graphite.GraphiteReporter;
import com.codahale.metrics.graphite.GraphiteSender;
import com.netflix.hystrix.contrib.codahalemetricspublisher.HystrixCodaHaleMetricsPublisher;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import com.netflix.hystrix.strategy.HystrixPlugins;
import com.netflix.hystrix.strategy.metrics.HystrixMetricsPublisher;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableTurbine
public class MonitorApplication {
	

	

    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
    }
	/*
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new HystrixMetricsStreamServlet(), "/hystrix.stream");
    }
    
    @Bean
    HystrixMetricsPublisher hystrixMetricsPublisher(MetricRegistry metricRegistry) {
        HystrixCodaHaleMetricsPublisher publisher = new HystrixCodaHaleMetricsPublisher(metricRegistry);
        HystrixPlugins.getInstance().registerMetricsPublisher(publisher);
        return publisher;
    }
    
    @Bean
    public GraphiteReporter graphiteReporter(MetricRegistry metricRegistry) {
    	
        final GraphiteReporter reporter = GraphiteReporter
                .forRegistry(metricRegistry)
                .build(graphite());
        reporter.start(1, TimeUnit.SECONDS);
        return reporter;
    }
     
   
    @Bean
    GraphiteSender graphite() {
        return new Graphite(new InetSocketAddress("13.76.98.121", 2003));
 
    }*/
    



    
   

    /* -------------------  statsd  -------------------*/
    
   /* @Value("${spring.application.name:application}.${random.value:0000}")
    private String prefix = "metrics";

    @Bean
    @ExportMetricWriter
    MetricWriter metricWriter() {
        return new StatsdMetricWriter(prefix, "localhost", 8125);
    }*/
    
    /* -------------------  statsd  -------------------*/
}
