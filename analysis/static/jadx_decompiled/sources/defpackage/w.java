package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: classes.dex */
public final class w implements xof {
    public int a;
    public boolean b;
    public Object c;

    @Override // defpackage.xof
    public void a() {
        this.b = true;
    }

    @Override // defpackage.xof
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.b = false;
    }

    @Override // defpackage.xof
    public void c() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.t0 = null;
        super/*android.view.View*/.setVisibility(this.a);
    }
}
