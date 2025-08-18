package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a14;
import defpackage.dy7;
import defpackage.ed3;
import defpackage.ee4;
import defpackage.f46;
import defpackage.fm9;
import defpackage.j47;
import defpackage.jpc;
import defpackage.khe;
import defpackage.kpa;
import defpackage.krc;
import defpackage.lqf;
import defpackage.q5;
import defpackage.s08;
import defpackage.sme;
import defpackage.wmd;
import defpackage.xxb;
import defpackage.y7g;
import defpackage.y8a;
import defpackage.yyb;
import defpackage.zp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/SaveToGalleryDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SaveToGalleryDialog extends FrgDlgBase {
    public static final SaveToGalleryDialog n1(String str, boolean z) {
        SaveToGalleryDialog saveToGalleryDialog = new SaveToGalleryDialog();
        saveToGalleryDialog.X0(dy7.g(new kpa("ru.ok.tamtam.extra.EXTRA_URL", str), new kpa("ru.ok.tamtam.extra.EXTRA_GIF", Boolean.valueOf(z))));
        return saveToGalleryDialog;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog h1() {
        sme smeVarR;
        if (wmd.l(b0())) {
            p1();
        } else {
            wmd.D(this, wmd.s(), 157);
        }
        LayoutInflater layoutInflaterR0 = this.Z0;
        if (layoutInflaterR0 == null) {
            layoutInflaterR0 = R0();
        }
        View viewInflate = layoutInflaterR0.inflate(yyb.dialog_progress_with_text, (ViewGroup) null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(xxb.dialog_progress__text);
        appCompatTextView.setText(h0(jpc.u2));
        if (appCompatTextView.isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context = appCompatTextView.getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context);
        }
        appCompatTextView.setTextColor(smeVarR.F);
        return new s08(U0()).f(viewInflate).a();
    }

    @Override // ru.ok.messages.views.dialogs.FrgDlgBase
    public final void m1(int i, String[] strArr, int[] iArr) {
        if (i != 157) {
            return;
        }
        q5 q5Var = (b0() == null || b0().isFinishing()) ? null : (q5) b0();
        if (q5Var == null || !wmd.N(q5Var, null, strArr, iArr, wmd.s(), jpc.g2, jpc.f2)) {
            e1();
        } else {
            p1();
        }
    }

    public final void o1(boolean z) {
        ed3 ed3Var;
        zp zpVar;
        y7g y7gVar = this.E1;
        if (y7gVar != null && (ed3Var = (ed3) y7gVar.b) != null && (zpVar = (zp) ((y8a) ed3Var).getAccessor().c(zp.class)) != null && ((lqf) zpVar).c()) {
            a14.N(0, U0(), h0(z ? jpc.w2 : jpc.v2));
        }
        e1();
    }

    public final void p1() {
        String string = T0().getString("ru.ok.tamtam.extra.EXTRA_URL");
        if (string == null) {
            o1(false);
        } else {
            j47.T(f46.J(this), null, null, new krc(this, string, T0().getBoolean("ru.ok.tamtam.extra.EXTRA_GIF"), null), 3);
        }
    }
}
