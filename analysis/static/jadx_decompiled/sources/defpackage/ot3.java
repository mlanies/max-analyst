package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ot3 {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
