package defpackage;

/* loaded from: classes.dex */
public abstract class nec {
    public static final oec a;

    static {
        oec oecVar = null;
        try {
            oecVar = (oec) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (oecVar == null) {
            oecVar = new oec();
        }
        a = oecVar;
    }

    public static h23 a(Class cls) {
        a.getClass();
        return new h23(cls);
    }
}
