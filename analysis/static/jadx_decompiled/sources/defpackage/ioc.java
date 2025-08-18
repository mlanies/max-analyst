package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ioc {
    public final /* synthetic */ int a;
    public final hoc b;
    public moc c;
    public tj4 d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;

    public ioc(hoc hocVar) {
        this.a = 0;
        this.c = null;
        this.d = null;
        this.e = TimeUnit.MILLISECONDS.toMillis(200L);
        this.f = TimeUnit.SECONDS.toMillis(4L);
        this.g = 2.0f;
        this.h = 0.1f;
        this.b = hocVar;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "RtcCommandConfig{command=" + this.b + ", sentListener=null, successListener=" + this.c + ", errorListener=" + this.d + ", maxRetryCount=0, minRetryTimeoutMs=" + this.e + ", maxRetryTimeoutMs=" + this.f + ", retryBackoffFactor=" + this.g + ", retryBackoffJitter=" + this.h + '}';
            default:
                return super.toString();
        }
    }

    public ioc(ioc iocVar) {
        this.a = 1;
        hoc hocVar = iocVar.b;
        if (hocVar != null) {
            long j = iocVar.e;
            if (j >= 0) {
                long j2 = iocVar.f;
                if (j2 >= 0) {
                    float f = iocVar.g;
                    if (f >= 0.0f) {
                        float f2 = iocVar.h;
                        if (f2 >= 0.0f) {
                            this.b = hocVar;
                            this.c = iocVar.c;
                            this.d = iocVar.d;
                            this.e = j;
                            this.f = j2;
                            this.g = f;
                            this.h = f2;
                            return;
                        }
                        throw new IllegalArgumentException("Illegal 'retryBackoffJitter' value: " + f2);
                    }
                    throw new IllegalArgumentException("Illegal 'retryBackoffFactor' value: " + f);
                }
                throw new IllegalArgumentException(ey8.h(j2, "Illegal 'maxRetryTimeoutMs' value: "));
            }
            throw new IllegalArgumentException(ey8.h(j, "Illegal 'minRetryTimeoutMs' value: "));
        }
        throw new IllegalArgumentException("Illegal 'command' value: null");
    }
}
