package defpackage;

import android.app.SharedElementCallback;
import android.graphics.Rect;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* loaded from: classes2.dex */
public final class z5 extends SharedElementCallback {
    public final /* synthetic */ Rect a;
    public final /* synthetic */ ActLocalMedias b;

    public z5(ActLocalMedias actLocalMedias, Rect rect) {
        this.b = actLocalMedias;
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

    @Override // android.app.SharedElementCallback
    public final void onRejectSharedElements(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.b.c1.postDelayed(new b(4, this), 100L);
    }
}
