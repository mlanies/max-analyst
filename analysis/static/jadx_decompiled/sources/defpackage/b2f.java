package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b2f implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public w1f a;
    public ViewGroup b;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ce A[EDGE_INSN: B:132:0x01ce->B:88:0x01ce BREAK  A[LOOP:1: B:19:0x0087->B:87:0x01c8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f4  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2f.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = c2f.c;
        ViewGroup viewGroup2 = this.b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) c2f.c().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((w1f) it.next()).F(viewGroup2);
            }
        }
        this.a.j(true);
    }
}
