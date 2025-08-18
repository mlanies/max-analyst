package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s4f implements Executor {
    public static final s4f a;
    public static final Handler b;
    public static final /* synthetic */ s4f[] c;

    static {
        s4f s4fVar = new s4f("INSTANCE", 0);
        a = s4fVar;
        c = new s4f[]{s4fVar};
        b = new Handler(Looper.getMainLooper());
    }

    public static s4f valueOf(String str) {
        return (s4f) Enum.valueOf(s4f.class, str);
    }

    public static s4f[] values() {
        return (s4f[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
