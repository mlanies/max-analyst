package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mk4 implements Executor {
    public static final mk4 a;
    public static final /* synthetic */ mk4[] b;

    static {
        mk4 mk4Var = new mk4("INSTANCE", 0);
        a = mk4Var;
        b = new mk4[]{mk4Var};
    }

    public static mk4 valueOf(String str) {
        return (mk4) Enum.valueOf(mk4.class, str);
    }

    public static mk4[] values() {
        return (mk4[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
