package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class qaf {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static qaf d;
    public final mq9 a;

    public qaf(mq9 mq9Var) {
        this.a = mq9Var;
    }

    public final boolean a(hb0 hb0Var) {
        if (TextUtils.isEmpty(hb0Var.c)) {
            return true;
        }
        long j = hb0Var.f + hb0Var.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
