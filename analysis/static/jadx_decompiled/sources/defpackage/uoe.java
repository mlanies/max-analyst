package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class uoe extends ote {
    public final /* synthetic */ TextPaint X;
    public final /* synthetic */ ote Y;
    public final /* synthetic */ voe Z;
    public final /* synthetic */ Context o;

    public uoe(voe voeVar, Context context, TextPaint textPaint, ote oteVar) {
        super(18);
        this.Z = voeVar;
        this.o = context;
        this.X = textPaint;
        this.Y = oteVar;
    }

    @Override // defpackage.ote
    public final void J(int i) {
        this.Y.J(i);
    }

    @Override // defpackage.ote
    public final void K(Typeface typeface, boolean z) {
        this.Z.g(this.o, this.X, typeface);
        this.Y.K(typeface, z);
    }
}
