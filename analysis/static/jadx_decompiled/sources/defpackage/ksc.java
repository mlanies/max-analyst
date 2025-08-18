package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ksc {
    public static final List a = y53.M(Application.class, csc.class);
    public static final List b = Collections.singletonList(csc.class);

    public static final Constructor a(Class cls, List list) throws SecurityException {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List listM0 = ys.m0(constructor.getParameterTypes());
            if (list.equals(listM0)) {
                return constructor;
            }
            if (list.size() == listM0.size() && listM0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final qnf b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (qnf) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
