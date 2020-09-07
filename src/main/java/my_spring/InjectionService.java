package my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectionService {

    private static final ObjectFactory factory = ObjectFactory.getInstance();

    @SneakyThrows
    public static void injectValues(IRobot robot) {
        Class<?> robotClass = IRobot.class;
        Field[] fields = robotClass.getDeclaredFields();
        for (Field field : fields) {
            InjectByType annotation = field.getAnnotation(InjectByType.class);
            if (annotation != null) {
                field.setAccessible(true);
                field.set(robot, factory.createObject(field.getType()));
            }
        }
    }
}
