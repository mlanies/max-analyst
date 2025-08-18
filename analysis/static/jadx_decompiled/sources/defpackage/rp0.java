package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;

/* loaded from: classes2.dex */
public final class rp0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public rp0(sp0 sp0Var, Context context, boolean z) {
        this.a = 0;
        this.c = sp0Var;
        this.o = context;
        this.b = z;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                sp0 sp0Var = (sp0) this.c;
                if (sp0Var.c == null) {
                    sp0Var.c = (this.b || Build.VERSION.SDK_INT < 31) ? new bme((Context) this.o) : new aea(1);
                }
                sp0Var.b(sp0Var.b);
                break;
            default:
                if (!this.b) {
                    gmf gmfVar = (gmf) this.o;
                    if (gmfVar.Y != null) {
                        this.b = true;
                        gmf gmfVar2 = (gmf) ((qje) this.c).b;
                        gmfVar2.b = true;
                        gmfVar2.b();
                        view.removeOnAttachStateChangeListener(this);
                        gmfVar.Y = null;
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                sp0 sp0Var = (sp0) this.c;
                sp0Var.b(false);
                sp0Var.f = false;
                Bitmap bitmap = sp0Var.g;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                sp0Var.g = null;
                sp0Var.h = null;
                op0 op0Var = sp0Var.c;
                if (op0Var != null) {
                    op0Var.b();
                }
                sp0Var.c = null;
                break;
        }
    }

    public rp0(gmf gmfVar, qje qjeVar) {
        this.a = 1;
        this.o = gmfVar;
        this.c = qjeVar;
        this.b = false;
    }
}
