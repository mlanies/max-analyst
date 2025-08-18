package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b05 implements vqb {
    public static final b05 a;
    public static final /* synthetic */ b05[] b;

    static {
        b05 b05Var = new b05("INSTANCE", 0);
        a = b05Var;
        b = new b05[]{b05Var};
    }

    public static void a(vae vaeVar) {
        vaeVar.f(a);
        vaeVar.b();
    }

    public static void b(Throwable th, vae vaeVar) {
        vaeVar.f(a);
        vaeVar.onError(th);
    }

    public static b05 valueOf(String str) {
        return (b05) Enum.valueOf(b05.class, str);
    }

    public static b05[] values() {
        return (b05[]) b.clone();
    }

    @Override // defpackage.xae
    public final void cancel() {
    }

    @Override // defpackage.dqd
    public final void clear() {
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.xae
    public final void j(long j) {
        zae.d(j);
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

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}
