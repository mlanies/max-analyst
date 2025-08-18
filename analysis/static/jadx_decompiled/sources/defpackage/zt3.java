package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zt3 extends LinearLayout implements wme {
    public static final /* synthetic */ bc7[] o;
    public static final int s0;
    public final float a;
    public final ArrayList b;
    public final yj c;

    static {
        oi9 oi9Var = new oi9(zt3.class, "customTheme", "getCustomTheme()Lru/ok/tamtam/themes/TamTheme;");
        nec.a.getClass();
        o = new bc7[]{oi9Var};
        tu0.G(24 * fk4.d().getDisplayMetrics().density);
        s0 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt3(Context context) {
        sme smeVarR;
        super(context, null);
        int i = 9;
        this.a = getContext().getResources().getDimension(ntb.bottom_sheet_corner_radius);
        this.b = new ArrayList();
        this.c = new yj(6, this);
        setOrientation(1);
        if (isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context2 = getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context2);
        }
        z(smeVarR);
        addOnAttachStateChangeListener(new o50(11, this));
        setClipChildren(true);
        setClipToPadding(true);
        setClipToOutline(true);
        setOutlineProvider(new e62(this, 3));
        if (isInEditMode()) {
            int i2 = 12;
            a(y53.M(new st3(new eqe(c2c.tt_sms_invite_text), Integer.valueOf(bvb.btn_radio_off_mtrl), new zf3(i), i2), new st3(new eqe(c2c.tt_sms_invite_text), Integer.valueOf(R.drawable.ic_menu_save), new zf3(i), i2)), null);
        }
    }

    private final sme getCurrentTheme() {
        sme customTheme = getCustomTheme();
        if (customTheme != null) {
            return customTheme;
        }
        if (isInEditMode()) {
            return ee4.e0;
        }
        Context context = getContext();
        khe kheVar = sme.a0;
        return fm9.R(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List r12, defpackage.a66 r13) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt3.a(java.util.List, a66):void");
    }

    public final ArrayList<kpa> getActions() {
        return this.b;
    }

    public final sme getCustomTheme() {
        bc7 bc7Var = o[0];
        return (sme) this.c.b;
    }

    public final void setCustomTheme(sme smeVar) {
        this.c.o1(this, o[0], smeVar);
    }

    @Override // defpackage.wme
    public final void z(sme smeVar) {
        int iIntValue;
        int iIntValue2;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            kpa kpaVar = (kpa) it.next();
            st3 st3Var = (st3) kpaVar.a;
            View view = (View) kpaVar.b;
            if (st3Var instanceof st3) {
                view.setBackground(hm9.L(getCurrentTheme().m, getCurrentTheme().i));
                AppCompatTextView appCompatTextView = (AppCompatTextView) view;
                Drawable drawable = (Drawable) ys.f0(0, appCompatTextView.getCompoundDrawables());
                if (drawable != null) {
                    sme currentTheme = getCurrentTheme();
                    rme rmeVar = st3Var.c;
                    if (rmeVar != null) {
                        Integer num = (Integer) ((Map) currentTheme.f.T.getValue()).get(rmeVar);
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        }
                        ngg.G(drawable, iIntValue2);
                    } else {
                        currentTheme.getClass();
                    }
                    iIntValue2 = Integer.valueOf(getCurrentTheme().w).intValue();
                    ngg.G(drawable, iIntValue2);
                }
                sme currentTheme2 = getCurrentTheme();
                rme rmeVar2 = st3Var.d;
                if (rmeVar2 != null) {
                    Integer num2 = (Integer) ((Map) currentTheme2.f.T.getValue()).get(rmeVar2);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    }
                    appCompatTextView.setTextColor(iIntValue);
                } else {
                    currentTheme2.getClass();
                }
                iIntValue = Integer.valueOf(getCurrentTheme().F).intValue();
                appCompatTextView.setTextColor(iIntValue);
            }
        }
    }
}
