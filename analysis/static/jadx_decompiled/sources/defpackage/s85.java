package defpackage;

import androidx.work.WorkRequest;

/* loaded from: classes2.dex */
public final class s85 {
    public final long a;
    public final long b;
    public final float c;
    public final float d;

    public s85(int i, long j, float f) {
        j = (i & 1) != 0 ? 500L : j;
        f = (i & 4) != 0 ? 1.5f : f;
        this.a = j;
        this.b = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.c = f;
        this.d = 0.2f;
        if (j < 1) {
            throw new IllegalArgumentException("Interval is invalid. Must be greater than 1.".toString());
        }
        if (WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS < j) {
            throw new IllegalArgumentException("maxInterval is invalid. Must be greater or equal than Interval.".toString());
        }
        if (f < 1.0d) {
            throw new IllegalArgumentException("Multiplier is invalid. Must be greater than 1.0.".toString());
        }
        double d = 0.2f;
        if (d < 0.0d || 1.0d <= d) {
            throw new IllegalArgumentException("Range is invalid. Must be greater or equal 0.0 and lower than 1.0.".toString());
        }
    }
}
