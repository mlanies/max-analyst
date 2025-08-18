package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jnb implements zo4 {
    public final Executor a;
    public final a34 b;
    public final ow0 c;
    public final ix0 d;
    public yo4 e;
    public volatile inb f;
    public volatile boolean g;

    public jnb(tb8 tb8Var, mw0 mw0Var, Executor executor) {
        executor.getClass();
        this.a = executor;
        ib8 ib8Var = tb8Var.b;
        ib8Var.getClass();
        Map mapEmptyMap = Collections.emptyMap();
        Uri uri = ib8Var.a;
        fm9.m(uri, "The uri must be set.");
        a34 a34Var = new a34(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, ib8Var.f, 4, null);
        this.b = a34Var;
        ow0 ow0VarC = mw0Var.c();
        this.c = ow0VarC;
        this.d = new ix0(ow0VarC, a34Var, null, new yt8(22, this));
    }

    @Override // defpackage.zo4
    public final void a(yo4 yo4Var) {
        this.e = yo4Var;
        boolean z = false;
        while (!z) {
            try {
                if (this.g) {
                    break;
                }
                this.f = new inb(this);
                this.a.execute(this.f);
                try {
                    this.f.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i = oaf.a;
                        throw cause;
                    }
                }
            } finally {
                inb inbVar = this.f;
                inbVar.getClass();
                inbVar.a();
            }
        }
    }

    @Override // defpackage.zo4
    public final void cancel() {
        this.g = true;
        inb inbVar = this.f;
        if (inbVar != null) {
            inbVar.cancel(true);
        }
    }

    @Override // defpackage.zo4
    public final void remove() {
        ow0 ow0Var = this.c;
        ((spd) ow0Var.a).l(ow0Var.X.e(this.b));
    }
}
