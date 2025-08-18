package defpackage;

import android.content.Context;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class nb0 implements AutoCloseable {
    public final AtomicReference X;
    public final AtomicBoolean Y;
    public final cd6 Z;
    public final ey1 a;
    public final AtomicBoolean b;
    public final AtomicReference c;
    public final AtomicReference o;
    public final hi5 s0;
    public final Executor t0;
    public final tj3 u0;
    public final boolean v0;
    public final boolean w0;
    public final long x0;

    public nb0(hi5 hi5Var, Executor executor, tj3 tj3Var, boolean z, boolean z2, long j) {
        ey1 ey1Var;
        if (Build.VERSION.SDK_INT >= 30) {
            ey1Var = new ey1(9, new h43());
        } else {
            ey1Var = new ey1(9, new rq9());
        }
        this.a = ey1Var;
        this.b = new AtomicBoolean(false);
        this.c = new AtomicReference(null);
        this.o = new AtomicReference(null);
        this.X = new AtomicReference(new al9(20));
        this.Y = new AtomicBoolean(false);
        this.Z = new cd6(Boolean.FALSE);
        if (hi5Var == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.s0 = hi5Var;
        this.t0 = executor;
        this.u0 = tj3Var;
        this.v0 = z;
        this.w0 = z2;
        this.x0 = j;
    }

    public final void a(Uri uri) {
        if (this.b.get()) {
            d((tj3) this.X.getAndSet(null), uri);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a(Uri.EMPTY);
    }

    public final void d(tj3 tj3Var, Uri uri) {
        if (tj3Var != null) {
            ((i43) this.a.b).close();
            tj3Var.accept(uri);
        } else {
            throw new AssertionError("Recording " + this + " has already been finalized");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nb0)) {
            return false;
        }
        nb0 nb0Var = (nb0) obj;
        if (this.s0.equals(nb0Var.s0)) {
            Executor executor = nb0Var.t0;
            Executor executor2 = this.t0;
            if (executor2 != null ? executor2.equals(executor) : executor == null) {
                tj3 tj3Var = nb0Var.u0;
                tj3 tj3Var2 = this.u0;
                if (tj3Var2 != null ? tj3Var2.equals(tj3Var) : tj3Var == null) {
                    if (this.v0 == nb0Var.v0 && this.w0 == nb0Var.w0 && this.x0 == nb0Var.x0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void finalize() throws Throwable {
        try {
            ((i43) this.a.b).a();
            tj3 tj3Var = (tj3) this.X.getAndSet(null);
            if (tj3Var != null) {
                d(tj3Var, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(Context context) {
        if (this.b.getAndSet(true)) {
            throw new AssertionError("Recording " + this + " has already been initialized");
        }
        ((i43) this.a.b).b("finalizeRecording");
        this.c.set(new vcc(this.s0));
        if (this.v0) {
            int i = Build.VERSION.SDK_INT;
            AtomicReference atomicReference = this.o;
            if (i >= 31) {
                atomicReference.set(new wcc(this, context));
            } else {
                atomicReference.set(new xcc(this));
            }
        }
    }

    public final int hashCode() {
        int iHashCode = (this.s0.b.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.t0;
        int iHashCode2 = (iHashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        tj3 tj3Var = this.u0;
        int iHashCode3 = (((iHashCode2 ^ (tj3Var != null ? tj3Var.hashCode() : 0)) * 1000003) ^ (this.v0 ? 1231 : 1237)) * 1000003;
        int i = this.w0 ? 1231 : 1237;
        long j = this.x0;
        return ((int) ((j >>> 32) ^ j)) ^ ((iHashCode3 ^ i) * 1000003);
    }

    public final MediaMuxer m(int i, cy1 cy1Var) throws IOException {
        if (!this.b.get()) {
            throw new AssertionError("Recording " + this + " has not been initialized");
        }
        vcc vccVar = (vcc) this.c.getAndSet(null);
        if (vccVar == null) {
            throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
        }
        try {
            return vccVar.a(i, cy1Var);
        } catch (RuntimeException e) {
            throw new IOException("Failed to create MediaMuxer by " + e, e);
        }
    }

    public final void n(xkf xkfVar) {
        int i;
        hi5 hi5Var = xkfVar.a;
        hi5 hi5Var2 = this.s0;
        if (!Objects.equals(hi5Var, hi5Var2)) {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + hi5Var + ", Expected: " + hi5Var2 + "]");
        }
        "Sending VideoRecordEvent ".concat(xkfVar.getClass().getSimpleName());
        boolean z = xkfVar instanceof skf;
        if (z && (i = ((skf) xkfVar).b) != 0) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown(");
                    sb.append(i);
                    sb.append(")");
                    break;
            }
        }
        boolean z2 = xkfVar instanceof vkf;
        cd6 cd6Var = this.Z;
        if (z2 || (xkfVar instanceof ukf)) {
            cd6Var.v(Boolean.TRUE);
        } else if ((xkfVar instanceof tkf) || z) {
            cd6Var.v(Boolean.FALSE);
        }
        Executor executor = this.t0;
        if (executor == null || this.u0 == null) {
            return;
        }
        try {
            executor.execute(new do9(this, 28, xkfVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.s0);
        sb.append(", getCallbackExecutor=");
        sb.append(this.t0);
        sb.append(", getEventListener=");
        sb.append(this.u0);
        sb.append(", hasAudioEnabled=");
        sb.append(this.v0);
        sb.append(", isPersistent=");
        sb.append(this.w0);
        sb.append(", getRecordingId=");
        return zr6.k(sb, this.x0, "}");
    }
}
