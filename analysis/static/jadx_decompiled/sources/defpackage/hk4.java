package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class hk4 implements ct0 {
    public static final /* synthetic */ bc7[] c = {new hob(hk4.class, "cleanerGetter", "getCleanerGetter()Ljava/lang/reflect/Method;", 0), zr6.e(nec.a, hk4.class, "cleanMethod", "getCleanMethod()Ljava/lang/reflect/Method;", 0)};
    public final e54 a;
    public final e54 b;

    public hk4() {
        int i = 3;
        this.a = new e54(new qk2(i, "sun.nio.ch.DirectBuffer"), "cleaner");
        this.b = new e54(new qk2(i, "sun.misc.Cleaner"), "clean");
    }

    @Override // defpackage.ct0
    public final ByteBuffer a(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    @Override // defpackage.ct0
    public final void b(ByteBuffer byteBuffer) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        bc7[] bc7VarArr = c;
        Method method = (Method) this.a.T0(this, bc7VarArr[0]);
        if (method == null || (objInvoke = method.invoke(byteBuffer, null)) == null) {
            return;
        }
        Method method2 = (Method) this.b.T0(this, bc7VarArr[1]);
        if (method2 != null) {
            method2.invoke(objInvoke, null);
        }
    }
}
