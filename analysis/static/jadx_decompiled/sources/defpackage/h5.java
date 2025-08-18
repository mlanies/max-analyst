package defpackage;

import android.app.SharedElementCallback;
import android.graphics.Rect;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h5 extends SharedElementCallback {
    public final /* synthetic */ Rect a;

    public h5(Rect rect) {
        this.a = rect;
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(List list, Map map) {
        Rect rect;
        if (map == null || (rect = this.a) == null) {
            return;
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            j47.s(rect, (View) it.next());
        }
    }
}
