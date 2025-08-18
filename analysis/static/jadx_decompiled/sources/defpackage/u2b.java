package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class u2b {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (tpa.f(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (tpa.f(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !tpa.f(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
