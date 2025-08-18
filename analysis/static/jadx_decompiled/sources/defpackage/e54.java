package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e54 implements q7c {
    public static final Object X = new Object();
    public final k56 a;
    public final String b;
    public final Class[] c;
    public volatile Object o;

    public e54(k56 k56Var, String str, Class... clsArr) {
        this.a = k56Var;
        this.b = str;
        this.c = clsArr;
        this.o = X;
    }

    @Override // defpackage.q7c
    public final Object T0(Object obj, bc7 bc7Var) throws NoSuchMethodException, SecurityException {
        Method declaredMethod;
        if (this.o == X) {
            try {
                Class cls = (Class) this.a.invoke();
                String str = this.b;
                Class[] clsArr = this.c;
                declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
                declaredMethod = null;
            }
            this.o = declaredMethod;
        }
        return (Method) this.o;
    }

    public /* synthetic */ e54(qk2 qk2Var, String str) {
        this(qk2Var, str, new Class[0]);
    }
}
