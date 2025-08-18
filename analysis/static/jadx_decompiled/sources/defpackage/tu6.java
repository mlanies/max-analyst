package defpackage;

/* loaded from: classes.dex */
public interface tu6 extends t7c {
    public static final aa0 z = new aa0(Integer.TYPE, null, "camerax.core.imageInput.inputFormat");
    public static final aa0 A = new aa0(eu4.class, null, "camerax.core.imageInput.inputDynamicRange");

    default int getInputFormat() {
        return ((Integer) h(z)).intValue();
    }

    default eu4 u() {
        eu4 eu4Var = (eu4) f(A, eu4.c);
        eu4Var.getClass();
        return eu4Var;
    }
}
