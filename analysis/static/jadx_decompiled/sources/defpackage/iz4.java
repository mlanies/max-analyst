package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class iz4 implements tqb {
    public static final iz4 a;
    public static final /* synthetic */ iz4[] b;

    static {
        iz4 iz4Var = new iz4("INSTANCE", 0);
        a = iz4Var;
        b = new iz4[]{iz4Var, new iz4("NEVER", 1)};
    }

    public static void a(f2a f2aVar) {
        f2aVar.c(a);
        f2aVar.b();
    }

    public static void b(Throwable th, f2a f2aVar) {
        f2aVar.c(a);
        f2aVar.onError(th);
    }

    public static void c(Throwable th, erd erdVar) {
        erdVar.c(a);
        erdVar.onError(th);
    }

    public static iz4 valueOf(String str) {
        return (iz4) Enum.valueOf(iz4.class, str);
    }

    public static iz4[] values() {
        return (iz4[]) b.clone();
    }

    @Override // defpackage.dqd
    public final void clear() {
    }

    @Override // defpackage.zl4
    public final void g() {
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this == a;
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        return 2;
    }

    @Override // defpackage.dqd
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.dqd
    public final Object poll() {
        return null;
    }
}
