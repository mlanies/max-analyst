package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class tm1 {
    public static final uv7 a;

    static {
        long millis = TimeUnit.SECONDS.toMillis(5L);
        a = new uv7(millis - 2000, millis + 4000);
    }
}
