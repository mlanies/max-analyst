package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class eie {
    public static final String b = a14.O("SystemJobInfoConverter");
    public final ComponentName a;

    public eie(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
