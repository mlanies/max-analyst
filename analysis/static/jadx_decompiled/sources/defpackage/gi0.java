package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class gi0 implements Continuation, ux3, Serializable {
    public final Continuation a;

    public gi0(Continuation continuation) {
        this.a = continuation;
    }

    @Override // defpackage.ux3
    public ux3 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof ux3) {
            return (ux3) continuation;
        }
        return null;
    }

    @Override // defpackage.ux3
    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        u44 u44Var = (u44) getClass().getAnnotation(u44.class);
        String str = null;
        if (u44Var == null) {
            return null;
        }
        int iV = u44Var.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? u44Var.l()[iIntValue] : -1;
        bkb bkbVar = br7.o;
        bkb bkbVar2 = br7.c;
        if (bkbVar == null) {
            try {
                bkb bkbVar3 = new bkb(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                br7.o = bkbVar3;
                bkbVar = bkbVar3;
            } catch (Exception unused2) {
                br7.o = bkbVar2;
                bkbVar = bkbVar2;
            }
        }
        if (bkbVar != bkbVar2) {
            Method method = (Method) bkbVar.a;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = (Method) bkbVar.b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = (Method) bkbVar.c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = u44Var.c();
        } else {
            strC = str + '/' + u44Var.c();
        }
        return new StackTraceElement(strC, u44Var.m(), u44Var.f(), i);
    }

    public Continuation n(Object obj, Continuation continuation) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public abstract Object o(Object obj);

    public void p() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        while (true) {
            gi0 gi0Var = this;
            Continuation continuation = gi0Var.a;
            try {
                obj = gi0Var.o(obj);
                if (obj == tx3.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new njc(th);
            }
            gi0Var.p();
            if (!(continuation instanceof gi0)) {
                continuation.resumeWith(obj);
                return;
            }
            this = continuation;
        }
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
