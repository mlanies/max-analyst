package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w27 extends q42 {
    public final View c;
    public int d;
    public int e;
    public final int[] f;

    public w27(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // defpackage.q42
    public final void b(k6g k6gVar) {
        this.c.setTranslationY(0.0f);
    }

    @Override // defpackage.q42
    public final void c(k6g k6gVar) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }

    @Override // defpackage.q42
    public final x6g d(x6g x6gVar, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((k6g) it.next()).a.c() & 8) != 0) {
                this.c.setTranslationY(og.c(this.e, r0.a.b(), 0));
                break;
            }
        }
        return x6gVar;
    }

    @Override // defpackage.q42
    public final l7b e(k6g k6gVar, l7b l7bVar) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY(i);
        return l7bVar;
    }
}
