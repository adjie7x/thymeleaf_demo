package com.mitrais.thymeleaf_demo.config;

import com.mitrais.thymeleaf_demo.formatter.NameFormatter;
import com.mitrais.thymeleaf_demo.utils.ArrayUtil;
import nz.net.ultraq.thymeleaf.LayoutDialect;
import nz.net.ultraq.thymeleaf.decorators.strategies.GroupingStrategy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import org.thymeleaf.spring5.ISpringTemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;

import java.util.Locale;

@Configuration
@EnableWebMvc
@ComponentScan({"com.mitrais.thymeleaf_demo"})
public class WebMVCConfig {


//    private ApplicationContext applicationContext;
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) {
//        this.applicationContext = applicationContext;
//    }
//
//    /* ******************************************************************* */
//    /*  GENERAL CONFIGURATION ARTIFACTS                                    */
//    /*  Static Resources, i18n Messages, Formatters (Conversion Service)   */
//    /* ******************************************************************* */
//
//    /*
//     *  Dispatcher configuration for serving static resources
//     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**", "/css/**")
//                .addResourceLocations("/resources/","/css/");
////              or  .addResourceLocations("/WEB-INF/resources/", "/WEB-INF/css/");
//
//        registry.addResourceHandler("/images/**")
//                .addResourceLocations("/images/");
//    }
//
//    // 1. CREATE TEMPLATE RESOLVER
//
//    // Template Resolver for HTML
//    private ITemplateResolver htmlTemplateResolver(){
//        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
//        resolver.setApplicationContext(applicationContext);
//        resolver.setPrefix("/WEB-INF/views/");
//        resolver.setSuffix(".html");
//        resolver.setCacheable(false);
//        resolver.setTemplateMode(TemplateMode.HTML);
//
//        return resolver;
//    }
//
//    // Template Resolver for Javascript
//    private ITemplateResolver javascriptTemplateResolver(){
//        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
//        resolver.setApplicationContext(applicationContext);
//        resolver.setPrefix("/WEB-INF/js/");
//        resolver.setCacheable(false);
//        resolver.setTemplateMode(TemplateMode.JAVASCRIPT);
//
//        return resolver;
//    }
//
//    // Template Resolver for Text
//    private ITemplateResolver plainTemplateResolver(){
//        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
//        resolver.setApplicationContext(applicationContext);
//        resolver.setPrefix("/WEB-INF/txt/");
//        resolver.setCacheable(false);
//        resolver.setTemplateMode(TemplateMode.TEXT);
//
//        return resolver;
//    }
//
//
//    // 2. CREATE MESSAGE RESOLVER
//    @Bean
//    @Description("Spring Message Resolver")
//    public ResourceBundleMessageSource messageSource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasename("messages");
//        return messageSource;
//    }
//
//
//    // 3. CREATE TEMPLATE ENGINE RESOLVER
//    private ISpringTemplateEngine templateEngine(ITemplateResolver templateResolver) {
//        SpringTemplateEngine engine = new SpringTemplateEngine();
//        engine.addDialect(new LayoutDialect(new GroupingStrategy()));
//        engine.addDialect(new Java8TimeDialect());
//        engine.setTemplateResolver(templateResolver);
//        engine.setTemplateEngineMessageSource(messageSource());
//        return engine;
//    }
//
//
//    // 4. CREATE VIEW RESOLVER
//    // View Resolver HTML
//    @Bean
//    public ViewResolver htmlViewResolver() {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine(htmlTemplateResolver()));
//        resolver.setContentType("text/html");
//        resolver.setCharacterEncoding("UTF-8");
//        resolver.setViewNames(ArrayUtil.array("*.html"));
//        return resolver;
//    }
//
//    // View Resolver JAVASCRIPT
//    @Bean
//    public ViewResolver javascriptViewResolver() {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine(javascriptTemplateResolver()));
//        resolver.setContentType("application/javascript");
//        resolver.setCharacterEncoding("UTF-8");
//        resolver.setViewNames(ArrayUtil.array("*.js"));
//        return resolver;
//    }
//
//    // View Resolver TEXT
//    @Bean
//    public ViewResolver plainViewResolver() {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine(plainTemplateResolver()));
//        resolver.setContentType("text/plain");
//        resolver.setCharacterEncoding("UTF-8");
//        resolver.setViewNames(ArrayUtil.array("*.txt"));
//        return resolver;
//    }
//
//
//    @Bean
//    public LocaleResolver localeResolver() {
//        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//        localeResolver.setDefaultLocale(new Locale("en"));
//        return localeResolver;
//    }
//
//    @Bean
//    public LocaleChangeInterceptor localeChangeInterceptor() {
//        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
//        localeChangeInterceptor.setParamName("lang");
//        return localeChangeInterceptor;
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(localeChangeInterceptor());
//    }
//
//    @Override
//    @Description("Custom Conversion Service")
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addFormatter(new NameFormatter());
//    }
}
