package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lk4 implements Executor {
    public static final lk4 a;
    public static final /* synthetic */ lk4[] b;

    static {
        lk4 lk4Var = new lk4("INSTANCE", 0);
        a = lk4Var;
        b = new lk4[]{lk4Var};
    }

    public static lk4 valueOf(String str) {
        return (lk4) Enum.valueOf(lk4.class, str);
    }

    public static lk4[] values() {
        return (lk4[]) b.clone();
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
