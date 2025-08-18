package defpackage;

/* loaded from: classes.dex */
public final class oec {
    public static String a(n66 n66Var) {
        String string = n66Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
