package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class cdc implements AutoCloseable {
    public final ey1 X;
    public final AtomicBoolean a;
    public final adc b;
    public final long c;
    public final hi5 o;

    public cdc(adc adcVar, long j, hi5 hi5Var, boolean z) {
        ey1 ey1Var;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a = atomicBoolean;
        if (Build.VERSION.SDK_INT >= 30) {
            ey1Var = new ey1(9, new h43());
        } else {
            ey1Var = new ey1(9, new rq9());
        }
        this.X = ey1Var;
        this.b = adcVar;
        this.c = j;
        this.o = hi5Var;
        if (z) {
            atomicBoolean.set(true);
        } else {
            ((i43) ey1Var.b).b("stop");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        o(0, null);
    }

    public final void finalize() throws Throwable {
        try {
            ((i43) this.X.b).a();
            o(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }

    public final void m() {
        if (this.a.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        adc adcVar = this.b;
        synchronized (adcVar.h) {
            try {
                if (!adc.p(this, adcVar.o) && !adc.p(this, adcVar.n)) {
                    Objects.toString(this.o);
                    return;
                }
                int iOrdinal = adcVar.k.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        adcVar.B(zcc.c);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            adcVar.B(zcc.Y);
                            adcVar.e.execute(new scc(adcVar, adcVar.n, 0));
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Called pause() from invalid state: " + adcVar.k);
            } finally {
            }
        }
    }

    public final void n() {
        if (this.a.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        adc adcVar = this.b;
        synchronized (adcVar.h) {
            try {
                if (!adc.p(this, adcVar.o) && !adc.p(this, adcVar.n)) {
                    Objects.toString(this.o);
                    return;
                }
                int iOrdinal = adcVar.k.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 5) {
                        adcVar.B(zcc.X);
                        adcVar.e.execute(new scc(adcVar, adcVar.n, 1));
                    } else if (iOrdinal == 2) {
                        adcVar.B(zcc.b);
                    } else if (iOrdinal != 3) {
                    }
                    return;
                }
                throw new IllegalStateException("Called resume() from invalid state: " + adcVar.k);
            } finally {
            }
        }
    }

    public final void o(final int i, final RuntimeException runtimeException) {
        ((i43) this.X.b).close();
        if (this.a.getAndSet(true)) {
            return;
        }
        final adc adcVar = this.b;
        synchronized (adcVar.h) {
            try {
                if (!adc.p(this, adcVar.o) && !adc.p(this, adcVar.n)) {
                    Objects.toString(this.o);
                    return;
                }
                nb0 nb0Var = null;
                switch (adcVar.k.ordinal()) {
                    case 0:
                    case 3:
                        throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                    case 1:
                    case 2:
                        c54.p(null, adc.p(this, adcVar.o));
                        nb0 nb0Var2 = adcVar.o;
                        adcVar.o = null;
                        adcVar.y();
                        nb0Var = nb0Var2;
                        break;
                    case 4:
                    case 5:
                        adcVar.B(zcc.Z);
                        final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                        final nb0 nb0Var3 = adcVar.n;
                        adcVar.e.execute(new Runnable() { // from class: tcc
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                adcVar.F(nb0Var3, micros, i, (Exception) runtimeException);
                            }
                        });
                        break;
                    case 6:
                    case 7:
                        c54.p(null, adc.p(this, adcVar.n));
                        break;
                }
                if (nb0Var != null) {
                    adcVar.j(nb0Var, 8, new RuntimeException("Recording was stopped before any data could be produced.", runtimeException));
                }
            } finally {
            }
        }
    }
}
