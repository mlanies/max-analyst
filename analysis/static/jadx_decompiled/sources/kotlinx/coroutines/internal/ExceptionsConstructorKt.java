package kotlinx.coroutines.internal;

import defpackage.a42;
import defpackage.fx3;
import defpackage.kpa;
import defpackage.m56;
import defpackage.nec;
import defpackage.njc;
import defpackage.tpa;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0082\u0010¢\u0006\u0004\b\u0013\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018*(\b\u0002\u0010\u0019\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u001a"}, d2 = {"", "E", "exception", "tryCopyException", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "createConstructor", "(Ljava/lang/Class;)Lm56;", "block", "safeCtor", "(Lm56;)Lm56;", "", "defaultValue", "fieldsCountOrDefault", "(Ljava/lang/Class;I)I", "accumulator", "fieldsCount", "throwableFields", "I", "Lkotlinx/coroutines/internal/CtorCache;", "ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class ExceptionsConstructorKt {
    private static final CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);

    static {
        CtorCache ctorCache2;
        try {
            ctorCache2 = FastServiceLoaderKt.getANDROID_DETECTED() ? WeakMapCtorCache.INSTANCE : ClassValueCtorCache.INSTANCE;
        } catch (Throwable unused) {
            ctorCache2 = WeakMapCtorCache.INSTANCE;
        }
        ctorCache = ctorCache2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> m56 createConstructor(Class<E> cls) throws SecurityException {
        Object next;
        m56 m56Var;
        kpa kpaVar;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new m56() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // defpackage.m56
            public final Void invoke(Throwable th) {
                return null;
            }
        };
        if (throwableFields != fieldsCountOrDefault(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i = 0;
        while (true) {
            next = null;
            if (i >= length) {
                break;
            }
            final Constructor<?> constructor = constructors[i];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                final int i2 = 3;
                kpaVar = new kpa(safeCtor(new m56() { // from class: r45
                    @Override // defpackage.m56
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        Constructor constructor2 = constructor;
                        Throwable th = (Throwable) obj;
                        switch (i3) {
                            case 0:
                                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor2, th);
                            case 1:
                                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor2, th);
                            case 2:
                                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor2, th);
                            default:
                                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor2, th);
                        }
                    }
                }), 0);
            } else if (length2 == 1) {
                Class<?> cls2 = parameterTypes[0];
                if (tpa.f(cls2, String.class)) {
                    final int i3 = 1;
                    kpaVar = new kpa(safeCtor(new m56() { // from class: r45
                        @Override // defpackage.m56
                        public final Object invoke(Object obj) {
                            int i32 = i3;
                            Constructor constructor2 = constructor;
                            Throwable th = (Throwable) obj;
                            switch (i32) {
                                case 0:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor2, th);
                                case 1:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor2, th);
                                case 2:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor2, th);
                                default:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor2, th);
                            }
                        }
                    }), 2);
                } else if (tpa.f(cls2, Throwable.class)) {
                    final int i4 = 2;
                    kpaVar = new kpa(safeCtor(new m56() { // from class: r45
                        @Override // defpackage.m56
                        public final Object invoke(Object obj) {
                            int i32 = i4;
                            Constructor constructor2 = constructor;
                            Throwable th = (Throwable) obj;
                            switch (i32) {
                                case 0:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor2, th);
                                case 1:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor2, th);
                                case 2:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor2, th);
                                default:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor2, th);
                            }
                        }
                    }), 1);
                } else {
                    kpaVar = new kpa(null, -1);
                }
            } else if (length2 != 2) {
                kpaVar = new kpa(null, -1);
            } else if (tpa.f(parameterTypes[0], String.class) && tpa.f(parameterTypes[1], Throwable.class)) {
                final int i5 = 0;
                kpaVar = new kpa(safeCtor(new m56() { // from class: r45
                    @Override // defpackage.m56
                    public final Object invoke(Object obj) {
                        int i32 = i5;
                        Constructor constructor2 = constructor;
                        Throwable th = (Throwable) obj;
                        switch (i32) {
                            case 0:
                                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor2, th);
                            case 1:
                                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor2, th);
                            case 2:
                                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor2, th);
                            default:
                                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor2, th);
                        }
                    }
                }), 3);
            } else {
                kpaVar = new kpa(null, -1);
            }
            arrayList.add(kpaVar);
            i++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((kpa) next).b).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((kpa) next2).b).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        }
        kpa kpaVar2 = (kpa) next;
        return (kpaVar2 == null || (m56Var = (m56) kpaVar2.a) == null) ? exceptionsConstructorKt$createConstructor$nullResult$1 : m56Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$1(Constructor constructor, Throwable th) {
        return (Throwable) constructor.newInstance(th.getMessage(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$3(Constructor constructor, Throwable th) {
        Throwable th2 = (Throwable) constructor.newInstance(th.getMessage());
        th2.initCause(th);
        return th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$4(Constructor constructor, Throwable th) {
        return (Throwable) constructor.newInstance(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$6(Constructor constructor, Throwable th) {
        Throwable th2 = (Throwable) constructor.newInstance(null);
        th2.initCause(th);
        return th2;
    }

    private static final int fieldsCount(Class<?> cls, int i) {
        do {
            int length = cls.getDeclaredFields().length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (!Modifier.isStatic(r0[i3].getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    public static /* synthetic */ int fieldsCount$default(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return fieldsCount(cls, i);
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i) {
        Object njcVar;
        nec.a(cls);
        try {
            njcVar = Integer.valueOf(fieldsCount$default(cls, 0, 1, null));
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Object objValueOf = Integer.valueOf(i);
        if (njcVar instanceof njc) {
            njcVar = objValueOf;
        }
        return ((Number) njcVar).intValue();
    }

    private static final m56 safeCtor(m56 m56Var) {
        return new a42(2, m56Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable safeCtor$lambda$9(m56 m56Var, Throwable th) {
        Object njcVar;
        try {
            Throwable th2 = (Throwable) m56Var.invoke(th);
            boolean zF = tpa.f(th.getMessage(), th2.getMessage());
            njcVar = th2;
            if (!zF) {
                boolean zF2 = tpa.f(th2.getMessage(), th.toString());
                njcVar = th2;
                if (!zF2) {
                    njcVar = null;
                }
            }
        } catch (Throwable th3) {
            njcVar = new njc(th3);
        }
        return (Throwable) (njcVar instanceof njc ? null : njcVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E e) {
        Object njcVar;
        if (!(e instanceof fx3)) {
            return (E) ctorCache.get(e.getClass()).invoke(e);
        }
        try {
            njcVar = ((fx3) e).a();
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            njcVar = null;
        }
        return (E) njcVar;
    }
}
