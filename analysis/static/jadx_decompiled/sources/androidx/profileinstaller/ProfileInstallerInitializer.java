package androidx.profileinstaller;

import android.content.Context;
import defpackage.do9;
import defpackage.jhb;
import defpackage.qx7;
import defpackage.x07;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements x07 {
    @Override // defpackage.x07
    public final List a() {
        return Collections.emptyList();
    }

    @Override // defpackage.x07
    public final Object b(Context context) {
        jhb.a(new do9(this, 21, context.getApplicationContext()));
        return new qx7(15);
    }
}
