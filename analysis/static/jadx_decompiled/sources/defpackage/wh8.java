package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class wh8 extends vh8 {
    @Override // defpackage.th8
    public final void a(vi8 vi8Var) {
    }

    @Override // defpackage.vh8
    public final MediaSession b(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }
}
