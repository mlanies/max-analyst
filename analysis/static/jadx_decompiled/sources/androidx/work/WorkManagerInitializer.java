package androidx.work;

import android.content.Context;
import defpackage.a14;
import defpackage.ho9;
import defpackage.me3;
import defpackage.s7g;
import defpackage.x07;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements x07 {
    public static final String a = a14.O("WrkMgrInitializer");

    @Override // defpackage.x07
    public final List a() {
        return Collections.emptyList();
    }

    @Override // defpackage.x07
    public final Object b(Context context) {
        a14.u().n(a, "Initializing WorkManager with default configuration.");
        s7g.e(context, new me3(new ho9()));
        return s7g.d(context);
    }
}
