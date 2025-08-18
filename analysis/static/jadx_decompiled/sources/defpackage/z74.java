package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class z74 {
    public final /* synthetic */ int a;
    public Exception b;
    public long c;

    public final void a(Exception exc) throws Exception {
        switch (this.a) {
            case 0:
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.b == null) {
                    this.b = exc;
                    this.c = 100 + jElapsedRealtime;
                }
                if (jElapsedRealtime >= this.c) {
                    Exception exc2 = this.b;
                    if (exc2 != exc) {
                        exc2.addSuppressed(exc);
                    }
                    Exception exc3 = this.b;
                    this.b = null;
                    throw exc3;
                }
                return;
            default:
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (this.b == null) {
                    this.b = exc;
                    this.c = 100 + jElapsedRealtime2;
                }
                if (jElapsedRealtime2 >= this.c) {
                    Exception exc4 = this.b;
                    if (exc4 != exc) {
                        exc4.addSuppressed(exc);
                    }
                    Exception exc5 = this.b;
                    this.b = null;
                    throw exc5;
                }
                return;
        }
    }
}
