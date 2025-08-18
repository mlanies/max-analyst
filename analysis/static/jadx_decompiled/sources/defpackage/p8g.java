package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class p8g {
    public static final String a = a14.O("WorkerFactory");

    public abstract gm7 a(Context context, String str, WorkerParameters workerParameters);

    public final gm7 b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = a;
        gm7 gm7VarA = a(context, str, workerParameters);
        if (gm7VarA == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(gm7.class);
            } catch (Throwable th) {
                a14.u().r(str2, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    gm7VarA = (gm7) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    a14.u().r(str2, "Could not instantiate " + str, th2);
                }
            }
        }
        if (gm7VarA == null || !gm7VarA.isUsed()) {
            return gm7VarA;
        }
        throw new IllegalStateException(k7d.j("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
