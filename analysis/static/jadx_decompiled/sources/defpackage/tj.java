package defpackage;

import android.graphics.Picture;
import android.text.BoringLayout;
import android.util.ArraySet;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class tj implements Supplier {
    public final /* synthetic */ int a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new Picture();
            case 1:
                return new BoringLayout.Metrics();
            default:
                return new ArraySet();
        }
    }
}
