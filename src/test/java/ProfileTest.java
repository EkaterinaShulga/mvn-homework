import org.junit.Test;
import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertFalse;

public class ProfileTest {
    @Test
    public void testBeansNotCreatedInDebugProfile() {
        // 1. Устанавливаем профиль debug
        System.setProperty("spring.profiles.active", "debug");
        // 2. Создаём Spring-контекст
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext()) {

            context.register(BeanConfigurerSupport.class);
            context.refresh();
            // 3. Проверяем, что бинов НЕТ
            boolean hasAppStatistics = context.containsBean("appStatisticsBean");
            boolean hasJmxExporter = context.containsBean("jmxExporter");

            System.out.println("=== С ПРОФИЛЕМ DEBUG ===");
            System.out.println("appStatisticsBean: " + (hasAppStatistics ? "✅ ЕСТЬ" : "❌ НЕТ"));
            System.out.println("jmxExporter: " + (hasJmxExporter ? "✅ ЕСТЬ" : "❌ НЕТ"));

            assertFalse(hasAppStatistics);
            assertFalse(hasJmxExporter);
        }
    }
}
