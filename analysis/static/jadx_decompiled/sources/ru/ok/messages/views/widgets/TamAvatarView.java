package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import defpackage.ee4;
import defpackage.fm9;
import defpackage.hpc;
import defpackage.jyc;
import defpackage.la6;
import defpackage.ma6;
import defpackage.ngg;
import defpackage.np8;
import defpackage.p7b;
import defpackage.pd0;
import defpackage.sd0;
import defpackage.sme;
import defpackage.sq4;
import defpackage.u7b;
import defpackage.wme;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/widgets/TamAvatarView;", "Lsd0;", "", "Lwme;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TamAvatarView extends sd0 implements wme {
    public sme y0;

    public TamAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (!isInEditMode()) {
            setLayerType(2, null);
            la6 la6VarA = new ma6(getContext().getResources()).a();
            getContext();
            sq4 sq4Var = new sq4(la6VarA);
            this.a = sq4Var;
            sq4Var.e().setCallback(this);
            jyc jycVarD = np8.D(context);
            this.o = jycVarD.o();
            this.t0 = (pd0) jycVarD.getAccessor().c(pd0.class);
            this.u0 = ((p7b) jycVarD.q()).a;
            this.s0 = jycVarD.f();
            this.v0 = (u7b) jycVarD.getAccessor().c(u7b.class);
        }
        sme smeVar = (sme) sme.d0.a.getValue();
        this.y0 = smeVar == null ? ee4.e0 : smeVar;
        this.y0 = fm9.R(context);
    }

    @Override // defpackage.sd0
    public final void c(Drawable drawable) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(hpc.c);
            if (drawableFindDrawableByLayerId != null) {
                ngg.G(drawableFindDrawableByLayerId, this.y0.m);
            }
            Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(hpc.b);
            if (drawableFindDrawableByLayerId2 != null) {
                ngg.G(drawableFindDrawableByLayerId2, this.y0.k);
            }
        }
    }

    @Override // defpackage.wme
    public final void z(sme smeVar) {
        this.y0 = smeVar;
        c(this.b);
    }
}
