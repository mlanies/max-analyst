package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class uxe {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final jjf b;
    public final bwf c;
    public final FirebaseMessaging d;
    public final ScheduledExecutorService f;
    public final sxe h;
    public final us e = new us(0);
    public boolean g = false;

    public uxe(FirebaseMessaging firebaseMessaging, jjf jjfVar, sxe sxeVar, bwf bwfVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = jjfVar;
        this.h = sxeVar;
        this.c = bwfVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(ukg ukgVar) throws IOException {
        try {
            j1e.c(ukgVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        bwf bwfVar = this.c;
        bwfVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(bwfVar.g(bwfVar.n(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        bwf bwfVar = this.c;
        bwfVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(bwfVar.g(bwfVar.n(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uxe.e():boolean");
    }

    public final void f(long j2) {
        this.f.schedule(new wxe(this, this.a, this.b, Math.min(Math.max(30L, 2 * j2), i)), j2, TimeUnit.SECONDS);
        d(true);
    }
}
