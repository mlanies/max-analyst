package defpackage;

import java.util.LinkedHashSet;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 sz7, still in use, count: 1, list:
  (r10v0 sz7) from 0x009d: FILLED_NEW_ARRAY (r10v0 sz7), (r11v0 sz7), (r12v0 sz7), (r15v0 sz7) A[WRAPPED] elemType: sz7
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class sz7 {
    /* JADX INFO: Fake field, exist only in values array */
    EF10(zxb.markdown_original, jpc.D0),
    /* JADX INFO: Fake field, exist only in values array */
    EF11(zxb.markdown_heading, jpc.A0),
    /* JADX INFO: Fake field, exist only in values array */
    EF12(zxb.markdown_bold, jpc.y0),
    /* JADX INFO: Fake field, exist only in values array */
    EF15(zxb.markdown_code, jpc.z0),
    /* JADX INFO: Fake field, exist only in values array */
    EF13(zxb.markdown_italic, jpc.B0),
    /* JADX INFO: Fake field, exist only in values array */
    EF14(zxb.markdown_underline, jpc.G0),
    /* JADX INFO: Fake field, exist only in values array */
    EF9(zxb.markdown_mono, jpc.C0),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(zxb.markdown_strikethrough, jpc.F0),
    /* JADX INFO: Fake field, exist only in values array */
    EF7(zxb.markdown_link, jpc.x0),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(zxb.markdown_regular, jpc.E0);

    public static final LinkedHashSet X;
    public static final nd2 c;
    public static final LinkedHashSet o;
    public final int a;
    public final int b;

    static {
        sz7 sz7Var = EF11;
        sz7 sz7Var2 = EF12;
        sz7 sz7Var3 = EF15;
        c = new nd2(13);
        o = bcd.X(sz7Var, sz7Var, sz7Var2, sz7Var3);
        X = bcd.X(sz7Var, sz7Var2, sz7Var, sz7Var, sz7Var, sz7Var, sz7Var3, sz7Var, sz7Var);
    }

    public sz7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static sz7 valueOf(String str) {
        return (sz7) Enum.valueOf(sz7.class, str);
    }

    public static sz7[] values() {
        return (sz7[]) Y.clone();
    }
}
