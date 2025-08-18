package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class gm implements hsc {
    public final /* synthetic */ int a;
    public final Object b;

    public gm(mm mmVar) {
        this.a = 1;
        this.b = new LinkedHashSet();
        mmVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.hsc
    public final Bundle a() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                ((im) this.b).V().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.b));
                return bundle2;
        }
    }

    public gm(im imVar) {
        this.a = 0;
        this.b = imVar;
    }
}
