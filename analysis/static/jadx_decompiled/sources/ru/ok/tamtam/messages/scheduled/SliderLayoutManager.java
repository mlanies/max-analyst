package ru.ok.tamtam.messages.scheduled;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import defpackage.ee4;
import defpackage.fm9;
import defpackage.g34;
import defpackage.i37;
import defpackage.khe;
import defpackage.kyb;
import defpackage.li6;
import defpackage.ltb;
import defpackage.ote;
import defpackage.pag;
import defpackage.sme;
import defpackage.vdc;
import defpackage.wsd;
import defpackage.zdc;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/messages/scheduled/SliderLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "wsd", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SliderLayoutManager extends LinearLayoutManager {
    public final wsd E;
    public RecyclerView F;
    public final int G;
    public final float H;
    public final float I;
    public final int J;
    public final g34 K;

    public SliderLayoutManager(Context context, wsd wsdVar) throws Resources.NotFoundException {
        this.E = wsdVar;
        this.G = context.getResources().getInteger(kyb.picker_min_distance);
        int i = ltb.picker_scale_factor;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        this.H = typedValue.getFloat();
        int i2 = ltb.picker_min_scale_factor;
        TypedValue typedValue2 = new TypedValue();
        context.getResources().getValue(i2, typedValue2, true);
        this.I = typedValue2.getFloat();
        this.J = context.getResources().getDimensionPixelSize(ltb.date_picker_selection_rect_offset) * 2;
        this.K = new g34(0);
        o1(1);
    }

    @Override // androidx.recyclerview.widget.a
    public final void W(RecyclerView recyclerView) {
        this.F = recyclerView;
        this.K.a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void j0(vdc vdcVar, zdc zdcVar) {
        super.j0(vdcVar, zdcVar);
        t1();
    }

    @Override // androidx.recyclerview.widget.a
    public final void n0(int i) {
        int iS;
        RecyclerView recyclerView = this.F;
        if (recyclerView != null && i == 0) {
            int height = recyclerView.getHeight();
            int height2 = recyclerView.getHeight() / 2;
            Iterator it = ote.Y(0, recyclerView.getChildCount()).iterator();
            int i2 = -1;
            while (((i37) it).c) {
                int iA = ((i37) it).a();
                View childAt = recyclerView.getChildAt(iA);
                int iAbs = Math.abs((((a.z(childAt) - a.F(childAt)) / 2) + a.F(childAt)) - height2);
                if (iA != recyclerView.getChildCount() - 1) {
                    if (iAbs < height) {
                        iS = RecyclerView.S(childAt);
                        i2 = iS;
                        height = iAbs;
                    }
                } else if (iAbs <= height) {
                    iS = RecyclerView.S(childAt);
                    i2 = iS;
                    height = iAbs;
                }
            }
            wsd wsdVar = this.E;
            if (wsdVar != null) {
                wsdVar.a(i2);
            }
        }
    }

    public final void t1() {
        sme smeVarR;
        RecyclerView recyclerView = this.F;
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context = recyclerView.getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context);
        }
        float f = (this.J * 1.05f) / 2.0f;
        float f2 = this.o / 2;
        float f3 = f2 - f;
        float f4 = f + f2;
        HashSet hashSet = new HashSet();
        Iterator it = ote.Y(0, w()).iterator();
        while (((i37) it).c) {
            View viewV = v(((i37) it).a());
            AppCompatTextView appCompatTextView = viewV instanceof AppCompatTextView ? (AppCompatTextView) viewV : null;
            if (appCompatTextView != null) {
                float height = (appCompatTextView.getHeight() / 2.0f) + appCompatTextView.getY();
                if (!hashSet.contains(appCompatTextView.getText()) && appCompatTextView.getTop() >= f3 && appCompatTextView.getBottom() <= f4) {
                    hashSet.add(appCompatTextView.getText());
                    pag.F(appCompatTextView, li6.CLOCK_TICK);
                }
                boolean z = Math.abs(height - f2) <= ((float) this.G);
                float fSqrt = z ? 1.0f : 1 - (((float) Math.sqrt(r9 / this.o)) * this.H);
                float f5 = this.I;
                if (fSqrt < f5) {
                    fSqrt = f5;
                }
                appCompatTextView.setScaleX(fSqrt);
                appCompatTextView.setScaleY(fSqrt);
                appCompatTextView.setTextColor(z ? smeVarR.F : smeVarR.M);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int z0(int i, vdc vdcVar, zdc zdcVar) {
        if (this.p != 1) {
            return 0;
        }
        int iZ0 = super.z0(i, vdcVar, zdcVar);
        if (iZ0 != 0) {
            t1();
        }
        return iZ0;
    }
}
