package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nk4 implements Executor {
    public static final nk4 a;
    public static final /* synthetic */ nk4[] b;

    static {
        nk4 nk4Var = new nk4("INSTANCE", 0);
        a = nk4Var;
        b = new nk4[]{nk4Var};
    }

    public static nk4 valueOf(String str) {
        return (nk4) Enum.valueOf(nk4.class, str);
    }

    public static nk4[] values() {
        return (nk4[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
