package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final /* synthetic */ class kpf extends p66 implements k56 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpf(vpf vpfVar, View view, ViewTreeObserver viewTreeObserver) {
        super(0, 0, j47.class, viewTreeObserver, "dispose", "attach$dispose(Landroid/view/ViewTreeObserver;Lone/me/sdk/contextmenu/helper/ViewWatcher$attach$listener$1;Landroid/view/View;)V");
        this.c = vpfVar;
        this.b = view;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                mpf.a((ViewTreeObserver.OnGlobalLayoutListener) this.receiver, (ViewTreeObserver) this.c, (ViewGroup) this.b);
                break;
            default:
                cd6.a((vpf) this.c, this.b, (ViewTreeObserver) this.receiver);
                break;
        }
        return e5f.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpf(ViewTreeObserver viewTreeObserver, ViewGroup viewGroup, lpf lpfVar) {
        super(0, 0, j47.class, lpfVar, "dispose", "doOnGlobalLayout$dispose(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver;Landroid/view/View;)V");
        this.c = viewTreeObserver;
        this.b = viewGroup;
    }
}
