package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class hoa extends EdgeEffect {
    public kwd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ioa c;
    public final /* synthetic */ RecyclerView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoa(int i, ioa ioaVar, RecyclerView recyclerView, Context context) {
        super(context);
        this.b = i;
        this.c = ioaVar;
        this.d = recyclerView;
    }

    public final kwd a() {
        kwd kwdVar = new kwd(this.d, kwd.q);
        lwd lwdVar = new lwd();
        lwdVar.i = 0.0f;
        lwdVar.a(1.0f);
        lwdVar.b(200.0f);
        kwdVar.m = lwdVar;
        return kwdVar;
    }

    public final void b(float f) {
        int i = this.b == 3 ? -1 : 1;
        float f2 = i * r1.a * f * this.c.b;
        RecyclerView recyclerView = this.d;
        recyclerView.setTranslationY(recyclerView.getTranslationY() + f2);
        kwd kwdVar = this.a;
        if (kwdVar != null) {
            kwdVar.b();
        }
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        return false;
    }

    @Override // android.widget.EdgeEffect
    public final boolean isFinished() {
        kwd kwdVar = this.a;
        return kwdVar == null || !kwdVar.f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        super.onAbsorb(i);
        float f = (this.b == 3 ? -1 : 1) * i * this.c.c;
        kwd kwdVar = this.a;
        if (kwdVar != null) {
            kwdVar.b();
        }
        kwd kwdVarA = a();
        kwdVarA.a = f;
        kwdVarA.g();
        this.a = kwdVarA;
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        super.onPull(f);
        b(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        if (this.d.getTranslationY() == 0.0f) {
            return;
        }
        kwd kwdVarA = a();
        kwdVarA.g();
        this.a = kwdVarA;
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        b(f);
    }
}
