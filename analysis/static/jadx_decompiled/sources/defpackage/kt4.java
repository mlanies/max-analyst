package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public enum kt4 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);

    public final TimeUnit a;

    kt4(TimeUnit timeUnit) {
        this.a = timeUnit;
    }
}
