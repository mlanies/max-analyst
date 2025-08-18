package defpackage;

/* loaded from: classes2.dex */
public final class f44 {
    public static final f44 f = new f44(false, false, vv7.a, false, null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final je5 d;
    public final gi9 e;

    public f44(boolean z, boolean z2, gi9 gi9Var, boolean z3, je5 je5Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = je5Var;
        gi9 gi9Var2 = new gi9(gi9Var.d);
        gi9Var2.b(gi9Var);
        this.e = gi9Var2;
    }

    public final String toString() {
        return "DispatchParams(retry=" + this.a + ", skipDebounce=" + this.b + ", allChats=" + this.c + ", serverChats=" + this.e + ", notification=" + this.d + ")";
    }
}
