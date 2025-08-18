package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pyc {
    public static final pyc a;
    public static final pyc b;
    public static final pyc c;
    public static final /* synthetic */ pyc[] o;

    static {
        pyc pycVar = new pyc("hash", 0);
        a = pycVar;
        pyc pycVar2 = new pyc("app-update-type", 1);
        b = pycVar2;
        pyc pycVar3 = new pyc("has-phone", 2);
        pyc pycVar4 = new pyc("esia-verify-botId", 3);
        c = pycVar4;
        o = new pyc[]{pycVar, pycVar2, pycVar3, pycVar4};
    }

    public static pyc valueOf(String str) {
        return (pyc) Enum.valueOf(pyc.class, str);
    }

    public static pyc[] values() {
        return (pyc[]) o.clone();
    }
}
