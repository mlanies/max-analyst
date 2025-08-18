package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.gte;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class x {
    protected w a;
    boolean b = false;

    public interface c {
        void a();

        void a(String str);
    }

    public w a(Context context) {
        if (this.b) {
            return this.a;
        }
        p0 p0VarA = p0.a(context);
        String strH = p0VarA.h();
        if (!TextUtils.isEmpty(strH)) {
            y0.a("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + strH);
        }
        if (b.a) {
            b.a(context, new a(p0VarA));
            this.b = true;
            return this.a;
        }
        y0.a("FirebaseAppInstanceIdProvider: firebase analytics is not available, use cached value '" + strH + "'");
        w wVar = new w(strH);
        this.a = wVar;
        return wVar;
    }

    public class a implements c {
        final /* synthetic */ p0 a;

        public a(p0 p0Var) {
            this.a = p0Var;
        }

        @Override // com.my.tracker.obfuscated.x.c
        public void a(String str) {
            x.this.a = new w(str);
            this.a.j(str);
            y0.a("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + x.this.a.a);
        }

        @Override // com.my.tracker.obfuscated.x.c
        public void a() {
            y0.a("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");
        }
    }

    public static final class b {
        public static final boolean a;

        static {
            boolean zEquals;
            try {
                zEquals = FirebaseAnalytics.class.equals(Class.forName("com.google.firebase.analytics.FirebaseAnalytics"));
            } catch (Throwable th) {
                if (th instanceof NoClassDefFoundError) {
                    y0.a("FirebaseHelper: FirebaseAnalytics is not found");
                } else {
                    y0.a("FirebaseHelper: error occurred while working with FirebaseAnalytics", th);
                }
                zEquals = false;
            }
            a = zEquals;
        }

        public static void a(Context context, c cVar) {
            Executor executorA = h.a();
            if (executorA == null) {
                y0.b("FirebaseHelper: background executor is not found");
                cVar.a();
                return;
            }
            try {
                y0.a("FirebaseHelper: retrieving firebase app instance id");
                FirebaseAnalytics.getInstance(context).getAppInstanceId().b(executorA, new gte(25, cVar));
            } catch (Throwable th) {
                y0.a("FirebaseHelper: retrieving firebase app instance id error", th);
                cVar.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, Task task) {
            if (task.g() && task.h()) {
                cVar.a((String) task.f());
            } else {
                cVar.a();
            }
        }
    }
}
