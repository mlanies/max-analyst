package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.eh7;
import defpackage.gh7;
import defpackage.jo7;
import defpackage.mx5;
import defpackage.p9g;
import defpackage.vw4;
import defpackage.x07;
import defpackage.xw4;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements x07 {
    @Override // defpackage.x07
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.x07
    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object objG;
        mx5 mx5Var = new mx5(new p9g(context, 1));
        mx5Var.g = 1;
        vw4.c(mx5Var);
        jo7 jo7VarI = jo7.i(context);
        jo7VarI.getClass();
        synchronized (jo7.s0) {
            try {
                objG = ((HashMap) jo7VarI.a).get(ProcessLifecycleInitializer.class);
                if (objG == null) {
                    objG = jo7VarI.g(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gh7 gh7VarQ = ((eh7) objG).Q();
        gh7VarQ.a(new xw4(this, gh7VarQ));
    }
}
