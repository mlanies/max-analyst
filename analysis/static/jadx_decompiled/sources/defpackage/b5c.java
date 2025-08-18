package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* loaded from: classes.dex */
public final class b5c extends ChipGroup implements kre {
    public final LinkedHashMap A0;
    public final je7 B0;
    public a5c z0;

    public b5c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0 = new LinkedHashMap();
        this.B0 = tu0.r(3, new xda(context, 20));
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setChipSpacingVertical(tu0.G(10 * fk4.d().getDisplayMetrics().density));
        setSingleLine(false);
        setSingleSelection(false);
        setPaddingRelative(0, 0, 0, tu0.G(8 * fk4.d().getDisplayMetrics().density));
    }

    private final ContextThemeWrapper getMaterialThemeWrapper() {
        return (ContextThemeWrapper) this.B0.getValue();
    }

    private final void setChipStyle(Chip chip) {
        boolean zIsChecked = chip.isChecked();
        pq9 pq9Var = qp4.u0;
        if (zIsChecked) {
            chip.setChipBackgroundColor(ColorStateList.valueOf(pq9Var.j(chip).b().a.f));
            chip.setTextColor(pq9Var.j(chip).getText().a);
        } else {
            chip.setChipBackgroundColor(ColorStateList.valueOf(pq9Var.j(chip).b().m));
            chip.setTextColor(pq9Var.j(chip).getText().e);
        }
    }

    public final void a(final int i, String str) {
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.A0;
        if (linkedHashMap.containsKey(numValueOf)) {
            return;
        }
        final Chip chip = new Chip(getMaterialThemeWrapper(), null);
        chip.setId(Integer.hashCode(i));
        chip.setText(str);
        chip.setLayoutParams(new o03(-2, -2));
        chip.setTextAlignment(4);
        i4f.l.a(chip.getPaint(), chip.getResources().getDisplayMetrics(), du4.b);
        chip.setClickable(true);
        chip.setCheckable(true);
        chip.setChecked(false);
        chip.setCheckedIcon(null);
        chip.setEnsureMinTouchTargetSize(false);
        b(chip, chip.isChecked(), i);
        chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: z4c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.b(chip, z, i);
            }
        });
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((Chip) ((Map.Entry) it.next()).getValue()).setChecked(false);
        }
        linkedHashMap.put(Integer.valueOf(i), chip);
        addView(chip);
    }

    public final void b(Chip chip, boolean z, int i) {
        if (z) {
            a5c a5cVar = this.z0;
            if (a5cVar != null) {
                lh1 lh1VarB0 = ((CallRateBottomSheet) a5cVar).B0();
                q0e q0eVar = lh1VarB0.Z;
                bi9 bi9Var = ((jh1) q0eVar.getValue()).b;
                bi9 bi9Var2 = new bi9();
                bi9Var2.b(bi9Var);
                bi9Var2.a(i);
                q0eVar.m(null, jh1.a((jh1) q0eVar.getValue(), null, bi9Var2, null, 5));
                y4c.b.getClass();
                if (qq9.l(i) == y4c.x0) {
                    pnf.o(lh1VarB0.z0, gh1.a);
                    lh1VarB0.s0.m(null, new eqe(b8a.m0));
                }
            }
        } else {
            a5c a5cVar2 = this.z0;
            if (a5cVar2 != null) {
                q0e q0eVar2 = ((CallRateBottomSheet) a5cVar2).B0().Z;
                bi9 bi9Var3 = ((jh1) q0eVar2.getValue()).b;
                bi9 bi9Var4 = new bi9();
                bi9Var4.b(bi9Var3);
                bi9Var4.h(i);
                q0eVar2.m(null, jh1.a((jh1) q0eVar2.getValue(), null, bi9Var4, null, 5));
            }
            chip.setOnTouchListener(null);
        }
        setChipStyle(chip);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A0.clear();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        Iterator it = this.A0.entrySet().iterator();
        while (it.hasNext()) {
            setChipStyle((Chip) ((Map.Entry) it.next()).getValue());
        }
    }

    public final void setListener(a5c a5cVar) {
        this.z0 = a5cVar;
    }
}
