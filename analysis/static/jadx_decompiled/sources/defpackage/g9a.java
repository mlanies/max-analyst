package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ScrollView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class g9a extends ChipGroup implements kre {
    public final Rect A0;
    public final Rect B0;
    public final EditText C0;
    public final LinkedHashMap D0;
    public final fi9 E0;
    public final je7 F0;
    public final je7 G0;
    public e9a z0;

    public g9a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0 = new Rect();
        this.B0 = new Rect();
        EditText editText = new EditText(context);
        editText.setMinHeight(tu0.G(32 * fk4.d().getDisplayMetrics().density));
        i4f.n.a(editText.getPaint(), editText.getResources().getDisplayMetrics(), du4.b);
        pq9 pq9Var = qp4.u0;
        editText.setTextColor(pq9Var.j(editText).getText().e);
        editText.setHintTextColor(pq9Var.j(editText).getText().i);
        editText.setBackgroundColor(0);
        editText.setFallbackLineSpacing(false);
        editText.setGravity(16);
        o03 o03Var = new o03(-2, -2);
        editText.setGravity(16);
        float f = 4;
        editText.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(6 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        editText.setLayoutParams(o03Var);
        editText.setMaxLines(1);
        this.C0 = editText;
        this.D0 = new LinkedHashMap();
        this.E0 = new fi9();
        this.F0 = tu0.r(3, new hy4(context, 29));
        this.G0 = tu0.r(3, new yf3(context, 25, this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setChipSpacing(tu0.G(f * fk4.d().getDisplayMetrics().density));
        setSingleLine(false);
        setSingleSelection(true);
        addView(editText);
        float f2 = 12;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(0 * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(8 * fk4.d().getDisplayMetrics().density));
        editText.setKeyListener(new f9a(this));
        d();
    }

    private final EnhancedVectorDrawable getCancelChipDrawable() {
        return (EnhancedVectorDrawable) this.G0.getValue();
    }

    private final ContextThemeWrapper getMaterialThemeWrapper() {
        return (ContextThemeWrapper) this.F0.getValue();
    }

    private final void setChipStyle(Chip chip) {
        boolean zIsChecked = chip.isChecked();
        pq9 pq9Var = qp4.u0;
        if (!zIsChecked) {
            chip.setChipBackgroundColor(ColorStateList.valueOf(pq9Var.j(chip).b().m));
            chip.setTextColor(pq9Var.j(chip).getText().e);
        } else {
            chip.setChipBackgroundColor(ColorStateList.valueOf(pq9Var.j(chip).b().a.m));
            pq9Var.j(chip).getText();
            chip.setTextColor(-1);
        }
    }

    public final void a(final long j, final long j2, final CharSequence charSequence, String str, final String str2) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.D0;
        if (linkedHashMap.containsKey(lValueOf)) {
            return;
        }
        final Chip chip = new Chip(getMaterialThemeWrapper(), null);
        chip.setId(Long.hashCode(j));
        chip.setText(str);
        i4f.n.a(chip.getPaint(), chip.getResources().getDisplayMetrics(), du4.b);
        chip.setClickable(true);
        chip.setCheckable(true);
        chip.setChecked(false);
        chip.setCheckedIcon(null);
        chip.setFallbackLineSpacing(false);
        chip.setEnsureMinTouchTargetSize(false);
        b(chip, chip.isChecked(), j, j2, charSequence, str2);
        chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: c9a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.b(chip, z, j, j2, charSequence, str2);
            }
        });
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((Chip) ((Map.Entry) it.next()).getValue()).setChecked(false);
        }
        linkedHashMap.put(Long.valueOf(j), chip);
        addView(chip, getChildCount() - 1);
        d();
        e9a e9aVar = this.z0;
        if (e9aVar != null) {
            ViewParent parent = ((g9a) ((ph4) e9aVar).b).getParent();
            ScrollView scrollView = parent instanceof ScrollView ? (ScrollView) parent : null;
            if (scrollView != null) {
                scrollView.post(new b(1, scrollView));
            }
        }
    }

    public final void b(final Chip chip, boolean z, final long j, long j2, CharSequence charSequence, String str) {
        if (z) {
            chip.setChipIcon(getCancelChipDrawable());
            chip.setOnTouchListener(new rf1(chip, 3, new k56() { // from class: d9a
                @Override // defpackage.k56
                public final Object invoke() {
                    g9a g9aVar = this.a;
                    e9a e9aVar = g9aVar.z0;
                    if (e9aVar != null) {
                        ((AbstractPickerScreen) ((ph4) e9aVar).a).v0().q(j, null);
                    }
                    g9aVar.removeView(chip);
                    return e5f.a;
                }
            }));
        } else {
            fi9 fi9Var = this.E0;
            Object objD = fi9Var.d(j2);
            if (objD == null) {
                objD = new g5a(getContext());
                fi9Var.g(j2, objD);
            }
            g5a g5aVar = (g5a) objD;
            g5aVar.b(oag.a(charSequence, Long.valueOf(j2)), str);
            chip.setChipIcon(g5aVar);
            chip.setOnTouchListener(null);
        }
        setChipStyle(chip);
    }

    public final void c(long j) {
        LinkedHashMap linkedHashMap = this.D0;
        Chip chip = (Chip) linkedHashMap.get(Long.valueOf(j));
        if (chip == null) {
            return;
        }
        linkedHashMap.remove(Long.valueOf(j));
        removeView(chip);
        d();
    }

    public final void d() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new qq0(7, this));
            return;
        }
        EditText editText = getEditText();
        Rect rect = this.A0;
        editText.getHitRect(rect);
        Rect rect2 = this.B0;
        rect2.set(rect);
        rect2.left = rect2.right;
        rect2.right = getRight();
    }

    public final e9a getCallback() {
        return this.z0;
    }

    public final EditText getEditText() {
        return this.C0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.E0.a();
        this.D0.clear();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        EnhancedVectorDrawable enhancedVectorDrawable;
        EditText editText = this.C0;
        editText.setTextColor(fkaVar.getText().e);
        editText.setHintTextColor(fkaVar.getText().i);
        Iterator it = this.D0.entrySet().iterator();
        while (it.hasNext()) {
            setChipStyle((Chip) ((Map.Entry) it.next()).getValue());
        }
        je7 je7Var = this.G0;
        if (!je7Var.a()) {
            je7Var = null;
        }
        if (je7Var == null || (enhancedVectorDrawable = (EnhancedVectorDrawable) je7Var.getValue()) == null) {
            return;
        }
        c54.Z(enhancedVectorDrawable, "circle_background", -1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.B0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        Rect rect = this.A0;
        motionEvent.setLocation(rect.right, rect.bottom / 2.0f);
        return this.C0.dispatchTouchEvent(motionEvent);
    }

    public final void setCallback(e9a e9aVar) {
        this.z0 = e9aVar;
    }
}
