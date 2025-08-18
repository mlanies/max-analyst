package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k23 {
    public static final k23 c = new k23();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, j23 j23Var, eg7 eg7Var, Class cls) {
        eg7 eg7Var2 = (eg7) map.get(j23Var);
        if (eg7Var2 == null || eg7Var == eg7Var2) {
            if (eg7Var2 == null) {
                map.put(j23Var, eg7Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + j23Var.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + eg7Var2 + ", new value " + eg7Var);
    }

    public final i23 a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            i23 i23VarA = (i23) map2.get(superclass);
            if (i23VarA == null) {
                i23VarA = a(superclass, null);
            }
            map.putAll(i23VarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            i23 i23VarA2 = (i23) map2.get(cls2);
            if (i23VarA2 == null) {
                i23VarA2 = a(cls2, null);
            }
            for (Map.Entry entry : i23VarA2.b.entrySet()) {
                b(map, (j23) entry.getKey(), (eg7) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            p3a p3aVar = (p3a) method.getAnnotation(p3a.class);
            if (p3aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!eh7.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                eg7 eg7VarValue = p3aVar.value();
                if (parameterTypes.length > 1) {
                    if (!eg7.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eg7VarValue != eg7.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new j23(i, method), eg7VarValue, cls);
                z = true;
            }
        }
        i23 i23Var = new i23(map);
        map2.put(cls, i23Var);
        this.b.put(cls, Boolean.valueOf(z));
        return i23Var;
    }
}
